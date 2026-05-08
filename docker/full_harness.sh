#!/bin/bash
# ============================================================================
# Lazarus COBOL-to-Java — Full Chain Harness.
#
# Reproduces the entire validation chain inside the container:
#   1. Compile each cobol-source/*.cob with cobc.
#   2. Run the resulting binary, capture stdout (regenerates the "golden").
#   3. Compile the matching generated/*.java program.
#   4. Run it, capture stdout.
#   5. Diff (1)+(2) against (3)+(4).
#
# This is slower than the default --parity mode (which trusts the bundled
# golden captures) but proves the entire chain end-to-end without relying
# on any prebaked artifact.
# ============================================================================

set -uo pipefail

GEN_DIR="/validator/generated"
COBOL_DIR="/validator/cobol-source"
RUNTIME_JAR="/validator/lazarus-runtime.jar"
BUILD_DIR="/validator/full-build"
WORK_DIR="/tmp/full-work"

GRN='\033[0;32m'
RED='\033[0;31m'
RST='\033[0m'

PASS=0
FAIL=0
COBOL_FAIL=0
JAVA_FAIL=0
TOTAL=0
FAILED_TESTS=""

mkdir -p "${BUILD_DIR}" "${WORK_DIR}"

normalize_stream() {
    awk '{ sub(/[[:space:]]+$/, ""); print }' | \
        awk 'BEGIN{n=0} { lines[n++]=$0 } END{ while (n>0 && lines[n-1]=="") n--; for (i=0;i<n;i++) print lines[i] }'
}

camel_to_snake() {
    # CamelCase Java class name -> snake_case test base name (best effort).
    # Used to map RunFundamental000DisplayLiterals back to the cobol-source
    # filename when both are present.
    echo "$1" | sed -E 's/([a-z0-9])([A-Z])/\1_\2/g' | tr '[:upper:]' '[:lower:]'
}

echo "Running full-chain validation..."
echo

START_TIME=$(date +%s)

for cob_file in "${COBOL_DIR}"/*.cob; do
    [ -f "${cob_file}" ] || continue
    TOTAL=$((TOTAL+1))
    base_cob=$(basename "${cob_file}" .cob)
    cd "${WORK_DIR}"
    cp "${cob_file}" prog.cob

    # Compile + run COBOL.
    if ! cobc -x -o prog prog.cob 2>/tmp/cobc.err; then
        COBOL_FAIL=$((COBOL_FAIL+1))
        continue
    fi
    cobol_out=$(./prog 2>/dev/null | normalize_stream)

    # Find matching Java class.
    java_file=""
    for candidate in "${GEN_DIR}"/*.java; do
        java_base=$(basename "${candidate}" .java)
        java_snake=$(camel_to_snake "${java_base}")
        if [[ "${java_snake}" == "${base_cob}" || "${java_snake}_" == "${base_cob}_"* ]]; then
            java_file="${candidate}"
            break
        fi
    done
    if [ -z "${java_file}" ]; then
        FAIL=$((FAIL+1))
        FAILED_TESTS+="  ${base_cob}  (no Java match)\n"
        continue
    fi
    java_base=$(basename "${java_file}" .java)

    # Compile + run Java.
    if ! javac -cp "${RUNTIME_JAR}" -d "${BUILD_DIR}" "${java_file}" 2>/tmp/javac.err; then
        JAVA_FAIL=$((JAVA_FAIL+1))
        FAIL=$((FAIL+1))
        FAILED_TESTS+="  ${base_cob}  (Java compile)\n"
        continue
    fi
    java_out=$(java -cp "${RUNTIME_JAR}:${BUILD_DIR}" "com.lazarus.cobol.generated.${java_base}" 2>/dev/null | normalize_stream)

    if [ "${cobol_out}" = "${java_out}" ]; then
        PASS=$((PASS+1))
    else
        FAIL=$((FAIL+1))
        FAILED_TESTS+="  ${base_cob}\n"
    fi

    # Reset the working directory between tests.
    rm -f prog prog.cob
done

END_TIME=$(date +%s)
ELAPSED=$((END_TIME - START_TIME))

echo
echo "════════════════════════════════════════════════════════════════════"
echo
if [ "${FAIL}" -eq 0 ]; then
    echo -e "  ${GRN}PASS: ${PASS} / ${TOTAL}${RST}    FAIL: ${FAIL}    (${ELAPSED}s)"
    echo
    echo -e "  ${GRN}Full chain verified: cobc output == java output for every test.${RST}"
else
    echo -e "  PASS: ${PASS}    ${RED}FAIL: ${FAIL}${RST}    Total: ${TOTAL}    (${ELAPSED}s)"
    [ "${COBOL_FAIL}" -gt 0 ] && echo "  cobc compile failures: ${COBOL_FAIL}"
    [ "${JAVA_FAIL}" -gt 0 ] && echo "  javac compile failures: ${JAVA_FAIL}"
    echo
    echo "Failed tests:"
    printf "%b" "${FAILED_TESTS}" | head -40
fi
echo
echo "════════════════════════════════════════════════════════════════════"

[ "${FAIL}" -eq 0 ] && exit 0 || exit 1
