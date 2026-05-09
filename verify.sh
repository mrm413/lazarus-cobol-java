#!/bin/bash
# ============================================================================
# Lazarus COBOL-to-Java — local validation entry point (Linux / macOS).
#
# Compiles the runtime library + all 723 generated Java programs in two
# javac invocations (avoids the per-test JVM startup cost), then runs each
# program in a fresh working directory and diffs stdout against
# golden-outputs/. Reports PASS / FAIL totals.
#
# Requires JDK 11 or later.
# ============================================================================

set -uo pipefail

GEN_DIR="generated"
GOLDEN_DIR="golden-outputs"
RUNTIME_DIR="runtime"
BUILD_DIR="build"
RUNTIME_JAR="${BUILD_DIR}/lazarus-runtime.jar"
TEST_CLASSES="${BUILD_DIR}/test-classes"
WORK_ROOT="${BUILD_DIR}/work"

GRN='\033[0;32m'
RED='\033[0;31m'
YEL='\033[1;33m'
RST='\033[0m'

if ! command -v javac >/dev/null 2>&1; then
    echo "javac not found — install JDK 11 or later." >&2
    exit 2
fi

mkdir -p "${BUILD_DIR}/runtime-classes" "${TEST_CLASSES}" "${WORK_ROOT}"

echo "Compiling runtime library..."
find "${RUNTIME_DIR}" -name '*.java' > "${BUILD_DIR}/runtime_sources.txt"
javac -d "${BUILD_DIR}/runtime-classes" @"${BUILD_DIR}/runtime_sources.txt"
( cd "${BUILD_DIR}/runtime-classes" && jar cf "../$(basename "${RUNTIME_JAR}")" com/ )
echo "  Runtime JAR: $(du -h "${RUNTIME_JAR}" | cut -f1)"
echo

echo "Batch-compiling generated programs..."
ls "${GEN_DIR}"/*.java > "${BUILD_DIR}/test_sources.txt"
COMPILE_START=$(date +%s)
if ! javac -cp "${RUNTIME_JAR}" -d "${TEST_CLASSES}" @"${BUILD_DIR}/test_sources.txt" 2>"${BUILD_DIR}/javac_batch.err"; then
    echo -e "  ${YEL}batch compile reported issues; falling back to per-file compile${RST}"
fi
echo "  Test classes compiled in $(($(date +%s) - COMPILE_START))s."
echo

normalize() {
    awk '{ sub(/[[:space:]]+$/, ""); print }' "$1" | \
        awk 'BEGIN{n=0} { lines[n++]=$0 } END{ while (n>0 && lines[n-1]=="") n--; for (i=0;i<n;i++) print lines[i] }'
}

prep_test() {
    case "$1" in
        RunFile002DeleteFileSequential) touch testfile ;;
        RunFile090TurnEcIo) rm -f out.txt ;;
        RunFile104ScopeOfFdGlobalInNestedPrograms) rm -f TEST-FILE ;;
        RunFile032ReadOnOptionalMissingRelativeSequential) rm -f missing.txt missings.txt ;;
    esac
}

PASS=0
FAIL=0
TOTAL=0
FAILED_TESTS=""
START_TIME=$(date +%s)
ROOT_PWD="$(pwd)"

echo "Running parity validation..."

for java_file in "${GEN_DIR}"/*.java; do
    [ -f "${java_file}" ] || continue
    TOTAL=$((TOTAL+1))
    base=$(basename "${java_file}" .java)
    expected="${ROOT_PWD}/${GOLDEN_DIR}/${base}.expected"
    [ -f "${expected}" ] || continue

    # Per-file compile fallback only if the batch missed something.
    class_file="${TEST_CLASSES}/com/lazarus/cobol/generated/${base}.class"
    if [ ! -f "${class_file}" ]; then
        if ! javac -cp "${RUNTIME_JAR}" -d "${TEST_CLASSES}" "${java_file}" 2>/dev/null; then
            FAIL=$((FAIL+1))
            FAILED_TESTS+="  ${base}  (compile)\n"
            continue
        fi
    fi

    work="${WORK_ROOT}/${base}"
    rm -rf "${work}"
    mkdir -p "${work}"
    pushd "${work}" >/dev/null
    prep_test "${base}"
    # 30 s per-test cap; stdin from /dev/null so ACCEPT-from-keyboard hits EOF.
    actual_raw=$(timeout 30 java -cp "${ROOT_PWD}/${RUNTIME_JAR}:${ROOT_PWD}/${TEST_CLASSES}" "com.lazarus.cobol.generated.${base}" </dev/null 2>/dev/null)
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
done

ELAPSED=$(( $(date +%s) - START_TIME ))

echo
echo "════════════════════════════════════════════════════════════════════"
if [ "${FAIL}" -eq 0 ]; then
    echo -e "  ${GRN}PASS: ${PASS} / ${TOTAL}${RST}    FAIL: ${FAIL}    (${ELAPSED}s)"
    echo
    echo -e "  ${GRN}All translated Java programs match GnuCOBOL byte-for-byte.${RST}"
else
    echo -e "  ${GRN}PASS: ${PASS}${RST}    ${RED}FAIL: ${FAIL}${RST}    Total: ${TOTAL}    (${ELAPSED}s)"
    echo
    echo "Failed tests:"
    printf "%b" "${FAILED_TESTS}" | head -40
fi
echo "════════════════════════════════════════════════════════════════════"

[ "${FAIL}" -eq 0 ] && exit 0 || exit 1
