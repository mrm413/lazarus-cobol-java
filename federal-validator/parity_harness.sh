#!/bin/bash
# ============================================================================
# Lazarus COBOL-to-Java — Federal Parity Harness
# Proves transpiled Java output matches GnuCOBOL federal test reference
# line-by-line. Each test compiles Java, runs it, compares to golden output.
# Torsova LLC
# ============================================================================

set -uo pipefail

GOLDEN_DIR="/validator/golden-outputs"
GEN_DIR="/validator/generated"
RUNTIME_JAR="/validator/lazarus-runtime.jar"
BUILD_DIR="/validator/parity-build"

GRN='\033[0;32m'
RED='\033[0;31m'
YEL='\033[0;33m'
CYN='\033[0;36m'
BLD='\033[1m'
DIM='\033[2m'
RST='\033[0m'

PASS=0
FAIL=0
COMPILE_FAIL=0
TOTAL=0
FAILURES=""

declare -A CAT_PASS
declare -A CAT_TOTAL

get_category() {
    echo "$1" | sed 's/^Run\([A-Za-z]*\)[0-9].*/\1/'
}

mkdir -p "$BUILD_DIR"

echo ""
echo -e "${BLD}╔══════════════════════════════════════════════════════════════════════╗${RST}"
echo -e "${BLD}║                                                                      ║${RST}"
echo -e "${BLD}║   Lazarus COBOL-to-Java — Federal Parity Proof                       ║${RST}"
echo -e "${BLD}║   Transpiled output vs GnuCOBOL federal test reference               ║${RST}"
echo -e "${BLD}║   Torsova LLC                                                        ║${RST}"
echo -e "${BLD}║                                                                      ║${RST}"
echo -e "${BLD}╚══════════════════════════════════════════════════════════════════════╝${RST}"
echo ""
echo -e "${DIM}Each test: compile transpiled Java -> run -> compare output to GnuCOBOL"
echo -e "reference line-by-line. Every line must match exactly.${RST}"
echo ""

TOTAL_GOLDEN=$(ls "$GOLDEN_DIR"/*.expected 2>/dev/null | wc -l)

for gfile in "$GOLDEN_DIR"/*.expected; do
    [ -f "$gfile" ] || continue
    TOTAL=$((TOTAL + 1))

    bn=$(basename "$gfile" .expected)
    jfile="${GEN_DIR}/${bn}.java"
    classname="com.lazarus.cobol.generated.${bn}"
    category=$(get_category "$bn")

    CAT_TOTAL[$category]=$(( ${CAT_TOTAL[$category]:-0} + 1 ))

    echo -e "${BLD}────────────────────────────────────────────────────────────────────${RST}"
    printf "${CYN}TEST %03d/${TOTAL_GOLDEN}${RST}  %-52s ${DIM}[%s]${RST}\n" "$TOTAL" "$bn" "$category"

    if [ ! -f "$jfile" ]; then
        COMPILE_FAIL=$((COMPILE_FAIL + 1))
        FAILURES="${FAILURES}\n  MISSING: ${bn}"
        echo -e "  ${RED}NO JAVA FILE${RST}"
        echo ""
        continue
    fi

    # Clean previous test classes to prevent cross-contamination
    rm -rf "${BUILD_DIR}/com/lazarus/cobol/generated/"*.class 2>/dev/null || true

    if ! javac -cp "$RUNTIME_JAR" -d "$BUILD_DIR" "$jfile" 2>/dev/null; then
        COMPILE_FAIL=$((COMPILE_FAIL + 1))
        FAILURES="${FAILURES}\n  COMPILE_FAIL: ${bn}"
        echo -e "  ${RED}COMPILE FAILED${RST}"
        echo ""
        continue
    fi

    actual=$(timeout 10 java -cp "$RUNTIME_JAR:$BUILD_DIR" "$classname" 2>/dev/null || true)

    expected=$(cat "$gfile" | tr -d '\r' | sed 's/[[:space:]]*$//' | sed -e :a -e '/^\n*$/{$d;N;ba;}')
    actual=$(echo "$actual" | tr -d '\r' | sed 's/[[:space:]]*$//' | sed -e :a -e '/^\n*$/{$d;N;ba;}')

    if [ -z "$expected" ]; then exp_lines=0; else exp_lines=$(echo "$expected" | wc -l); fi
    if [ -z "$actual" ]; then act_lines=0; else act_lines=$(echo "$actual" | wc -l); fi

    if [ "$expected" = "$actual" ]; then
        PASS=$((PASS + 1))
        CAT_PASS[$category]=$(( ${CAT_PASS[$category]:-0} + 1 ))

        echo -e "  ${DIM}COBOL (GnuCOBOL reference)${RST}            ${DIM}Java (Lazarus transpiler)${RST}"

        if [ "$exp_lines" -eq 0 ]; then
            echo -e "  ${DIM}(empty output)${RST}                        ${DIM}(empty output)${RST}              ${GRN}✓${RST}"
        elif [ "$exp_lines" -le 8 ]; then
            line_num=0
            while IFS= read -r eline; do
                line_num=$((line_num + 1))
                aline=$(echo "$actual" | sed -n "${line_num}p")
                edisp=$(printf "%-34.34s" "$eline")
                adisp=$(printf "%-34.34s" "$aline")
                echo -e "  ${edisp}${adisp}${GRN}✓${RST}"
            done <<< "$expected"
        else
            line_num=0
            while IFS= read -r eline; do
                line_num=$((line_num + 1))
                if [ "$line_num" -le 3 ]; then
                    aline=$(echo "$actual" | sed -n "${line_num}p")
                    edisp=$(printf "%-34.34s" "$eline")
                    adisp=$(printf "%-34.34s" "$aline")
                    echo -e "  ${edisp}${adisp}${GRN}✓${RST}"
                fi
            done <<< "$expected"
            hidden=$((exp_lines - 5))
            if [ "$hidden" -gt 0 ]; then
                echo -e "  ${DIM}  ... $hidden more matching lines ...${RST}"
            fi
            for tail_n in 1 0; do
                ln=$((exp_lines - tail_n))
                eline=$(echo "$expected" | sed -n "${ln}p")
                aline=$(echo "$actual" | sed -n "${ln}p")
                edisp=$(printf "%-34.34s" "$eline")
                adisp=$(printf "%-34.34s" "$aline")
                echo -e "  ${edisp}${adisp}${GRN}✓${RST}"
            done
        fi

        echo -e "  ${GRN}EXACT MATCH${RST} -- ${exp_lines} line(s)    ${DIM}running: ${PASS}/${TOTAL}${RST}"
    else
        FAIL=$((FAIL + 1))
        FAILURES="${FAILURES}\n  FAIL: ${bn}"

        echo -e "  ${RED}MISMATCH${RST} -- expected ${exp_lines} lines, got ${act_lines}"
        echo -e "  ${RED}--- expected (COBOL) ---${RST}"
        echo "$expected" | head -5 | while IFS= read -r line; do echo "    $line"; done
        if [ "$exp_lines" -gt 5 ]; then echo -e "    ${DIM}... ($((exp_lines - 5)) more)${RST}"; fi
        echo -e "  ${RED}--- actual (Java) ---${RST}"
        echo "$actual" | head -5 | while IFS= read -r line; do echo "    $line"; done
        if [ "$act_lines" -gt 5 ]; then echo -e "    ${DIM}... ($((act_lines - 5)) more)${RST}"; fi
    fi

    echo ""
done

# Category summary
echo -e "${BLD}════════════════════════════════════════════════════════════════════════${RST}"
echo -e "${BLD}  CATEGORY BREAKDOWN${RST}"
echo -e "${BLD}════════════════════════════════════════════════════════════════════════${RST}"
echo ""
printf "  ${BLD}%-20s %8s %8s %8s${RST}\n" "Category" "Tests" "Passed" "Rate"
printf "  %-20s %8s %8s %8s\n" "--------------------" "--------" "--------" "--------"

for cat in $(echo "${!CAT_TOTAL[@]}" | tr ' ' '\n' | sort); do
    ct=${CAT_TOTAL[$cat]}
    cp=${CAT_PASS[$cat]:-0}
    if [ "$ct" -gt 0 ]; then
        rate=$(echo "scale=1; $cp * 100 / $ct" | bc)
    else
        rate="0.0"
    fi
    if [ "$cp" -eq "$ct" ]; then color=$GRN; else color=$RED; fi
    printf "  %-20s %8d %8d ${color}%7s%%${RST}\n" "$cat" "$ct" "$cp" "$rate"
done

echo ""
echo -e "${BLD}════════════════════════════════════════════════════════════════════════${RST}"
echo -e "${BLD}  FINAL RESULTS${RST}"
echo -e "${BLD}════════════════════════════════════════════════════════════════════════${RST}"
echo ""
echo -e "  Total tests:        ${BLD}${TOTAL}${RST}"
echo -e "  Passed:             ${GRN}${BLD}${PASS}${RST}"
echo -e "  Failed:             ${FAIL}"
echo -e "  Compile failures:   ${COMPILE_FAIL}"
echo ""

if [ $TOTAL -gt 0 ]; then
    RATE=$(echo "scale=1; $PASS * 100 / $TOTAL" | bc)
    echo -e "  Parity rate:        ${BLD}${RATE}%${RST}"
fi

echo ""

if [ $FAIL -gt 0 ] || [ $COMPILE_FAIL -gt 0 ]; then
    echo -e "  ${RED}Failures:${RST}"
    echo -e "$FAILURES"
    echo ""
    echo -e "${RED}${BLD}  SUITE FAILED${RST}"
    exit 1
else
    echo -e "${GRN}${BLD}╔══════════════════════════════════════════════════════════════════════╗${RST}"
    echo -e "${GRN}${BLD}║                                                                      ║${RST}"
    echo -e "${GRN}${BLD}║   ALL ${TOTAL} TESTS PASSED -- 100% PARITY WITH GNUCOBOL REFERENCE     ║${RST}"
    echo -e "${GRN}${BLD}║                                                                      ║${RST}"
    echo -e "${GRN}${BLD}║   Every line of transpiled Java output matches the GnuCOBOL federal  ║${RST}"
    echo -e "${GRN}${BLD}║   test suite reference output exactly.                               ║${RST}"
    echo -e "${GRN}${BLD}║                                                                      ║${RST}"
    echo -e "${GRN}${BLD}╚══════════════════════════════════════════════════════════════════════╝${RST}"
    exit 0
fi
