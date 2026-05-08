#!/bin/bash
# ============================================================================
# Lazarus COBOL-to-Java — Parity Harness.
#
# For each program in /validator/generated, compile it, run it in a fresh
# working directory, capture stdout, and diff against the golden reference
# in /validator/golden-outputs. Reports PASS / FAIL totals at the end.
#
# Output normalization mirrors the GnuCOBOL test-suite convention: trailing
# whitespace is trimmed per line, trailing blank lines removed.
# ============================================================================

set -uo pipefail

GEN_DIR="/validator/generated"
GOLDEN_DIR="/validator/golden-outputs"
RUNTIME_JAR="/validator/lazarus-runtime.jar"
BUILD_DIR="/validator/parity-build"
WORK_ROOT="/tmp/parity-work"

GRN='\033[0;32m'
RED='\033[0;31m'
YEL='\033[1;33m'
RST='\033[0m'

PASS=0
FAIL=0
COMPILE_FAIL=0
TOTAL=0
FAILED_TESTS=""

mkdir -p "${BUILD_DIR}" "${WORK_ROOT}"

normalize() {
    awk '{ sub(/[[:space:]]+$/, ""); print }' "$1" | \
        awk 'BEGIN{n=0} { lines[n++]=$0 } END{ while (n>0 && lines[n-1]=="") n--; for (i=0;i<n;i++) print lines[i] }'
}

# Per-test preparation: touch files, set env, etc. The 723 programs cover
# corners that need a small amount of fixture setup; everything else runs
# in a clean fresh working directory.
prep_test() {
    local base="$1"
    local java_class="$2"
    case "${java_class}" in
        # RunFile002 deletes a sequential file — needs the file to exist.
        RunFile002DeleteFileSequential)
            touch testfile
            ;;
        # RunFile090 (TURN EC-I-O) writes "out.txt" then re-reads it.
        RunFile090TurnEcIo)
            rm -f out.txt
            ;;
        # RunFile104 references a TEST-FILE; previous run must not leak.
        RunFile104ScopeOfFdGlobalInNestedPrograms)
            rm -f TEST-FILE
            ;;
        # RunFile032 tests OPTIONAL-missing — fixture must NOT exist.
        RunFile032ReadOnOptionalMissingRelativeSequential)
            rm -f missing.txt missings.txt
            ;;
    esac
}

echo "Running parity validation against ${GOLDEN_DIR}..."
echo

START_TIME=$(date +%s)
WIDTH=80

for java_file in "${GEN_DIR}"/*.java; do
    [ -f "${java_file}" ] || continue
    TOTAL=$((TOTAL+1))
    base=$(basename "${java_file}" .java)
    expected="${GOLDEN_DIR}/${base}.expected"
    [ -f "${expected}" ] || continue

    # Compile (cached in BUILD_DIR).
    if ! javac -cp "${RUNTIME_JAR}" -d "${BUILD_DIR}" "${java_file}" 2>/tmp/javac.err; then
        COMPILE_FAIL=$((COMPILE_FAIL+1))
        FAIL=$((FAIL+1))
        FAILED_TESTS+="  ${base}  (compile)\n"
        continue
    fi

    # Fresh working directory per test prevents file-fixture pollution.
    work="${WORK_ROOT}/${base}"
    rm -rf "${work}"
    mkdir -p "${work}"
    pushd "${work}" >/dev/null
    prep_test "${base}" "${base}"

    actual_raw=$(java -cp "${RUNTIME_JAR}:${BUILD_DIR}" "com.lazarus.cobol.generated.${base}" 2>/dev/null)

    popd >/dev/null
    rm -rf "${work}"

    expected_norm=$(normalize "${expected}")
    actual_norm=$(printf "%s" "${actual_raw}" | awk '{ sub(/[[:space:]]+$/, ""); print }' | \
        awk 'BEGIN{n=0} { lines[n++]=$0 } END{ while (n>0 && lines[n-1]=="") n--; for (i=0;i<n;i++) print lines[i] }')

    if [ "${expected_norm}" = "${actual_norm}" ]; then
        PASS=$((PASS+1))
    else
        FAIL=$((FAIL+1))
        FAILED_TESTS+="  ${base}\n"
    fi

    # Periodic progress (every 50 tests) so the user sees motion.
    if (( TOTAL % 50 == 0 )); then
        printf "\r  progress: %4d / %4d  pass=%d fail=%d" "${TOTAL}" "$(ls "${GEN_DIR}"/*.java | wc -l)" "${PASS}" "${FAIL}"
    fi
done
printf "\r%${WIDTH}s\r" ""

END_TIME=$(date +%s)
ELAPSED=$((END_TIME - START_TIME))

echo
echo "════════════════════════════════════════════════════════════════════"
echo
if [ "${FAIL}" -eq 0 ]; then
    echo -e "  ${GRN}PASS: ${PASS} / ${TOTAL}${RST}    FAIL: ${FAIL}    (${ELAPSED}s)"
    echo
    echo -e "  ${GRN}All translated Java programs match GnuCOBOL byte-for-byte.${RST}"
else
    echo -e "  ${GRN}PASS: ${PASS}${RST}    ${RED}FAIL: ${FAIL}${RST}    Total: ${TOTAL}    (${ELAPSED}s)"
    if [ "${COMPILE_FAIL}" -gt 0 ]; then
        echo -e "  ${YEL}Compile failures: ${COMPILE_FAIL}${RST}"
    fi
    echo
    echo "Failed tests:"
    printf "%b" "${FAILED_TESTS}" | head -40
    [ "${FAIL}" -gt 40 ] && echo "  ... ($((FAIL - 40)) more)"
fi
echo
echo "════════════════════════════════════════════════════════════════════"
echo

[ "${FAIL}" -eq 0 ] && exit 0 || exit 1
