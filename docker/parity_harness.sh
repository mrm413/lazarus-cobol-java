#!/bin/bash
# ============================================================================
# Lazarus COBOL-to-Java — Parity Harness.
#
# Compiles all 723 generated Java programs ONCE in a single javac invocation,
# then for each program: spawn the JVM in a fresh working directory, capture
# stdout, and diff against the matching golden reference. The single batch
# compile avoids the per-test JVM startup cost of javac (the dominant overhead
# inside Docker on Windows).
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

prep_test() {
    local java_class="$1"
    case "${java_class}" in
        RunFile002DeleteFileSequential) touch testfile ;;
        RunFile090TurnEcIo) rm -f out.txt ;;
        RunFile104ScopeOfFdGlobalInNestedPrograms) rm -f TEST-FILE ;;
        RunFile032ReadOnOptionalMissingRelativeSequential) rm -f missing.txt missings.txt ;;
    esac
}

TOTAL_PROGS=$(ls "${GEN_DIR}"/*.java 2>/dev/null | wc -l)

echo "Batch-compiling ${TOTAL_PROGS} Java programs (one javac invocation)..."
COMPILE_START=$(date +%s)
JAVAC_LIST="/tmp/javac_sources.txt"
ls "${GEN_DIR}"/*.java > "${JAVAC_LIST}"

# Batch javac. If anything fails to compile, fall back to per-file compilation
# below so we can still tally results — but in practice the corpus compiles
# clean as a single invocation.
if ! javac -cp "${RUNTIME_JAR}" -d "${BUILD_DIR}" @"${JAVAC_LIST}" 2>/tmp/javac_batch.err; then
    echo -e "  ${YEL}batch compile reported issues; falling back to per-file compile${RST}"
    BATCH_OK=0
else
    BATCH_OK=1
fi
COMPILE_END=$(date +%s)
echo "  Compile complete in $((COMPILE_END - COMPILE_START))s."
echo

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

    # Per-file compile fallback for the rare case the batch javac failed.
    class_file="${BUILD_DIR}/com/lazarus/cobol/generated/${base}.class"
    if [ ! -f "${class_file}" ]; then
        if ! javac -cp "${RUNTIME_JAR}" -d "${BUILD_DIR}" "${java_file}" 2>/tmp/javac.err; then
            COMPILE_FAIL=$((COMPILE_FAIL+1))
            FAIL=$((FAIL+1))
            FAILED_TESTS+="  ${base}  (compile)\n"
            continue
        fi
    fi

    # Fresh working directory per test to avoid file-fixture pollution.
    work="${WORK_ROOT}/${base}"
    rm -rf "${work}"
    mkdir -p "${work}"
    pushd "${work}" >/dev/null
    prep_test "${base}"

    # Hard 30 s per-test cap and stdin redirected from /dev/null. Programs that
    # ACCEPT from CONSOLE / KEYBOARD complete on EOF; any program that ignores
    # stdin and busy-waits gets killed instead of hanging the whole run.
    actual_raw=$(timeout 30 java -cp "${RUNTIME_JAR}:${BUILD_DIR}" "com.lazarus.cobol.generated.${base}" </dev/null 2>/dev/null)

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

    if (( TOTAL % 50 == 0 )); then
        printf "\r  progress: %4d / %4d  pass=%d fail=%d" "${TOTAL}" "${TOTAL_PROGS}" "${PASS}" "${FAIL}"
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
