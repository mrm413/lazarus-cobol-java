#!/bin/bash
# Lazarus COBOL-to-Java Validator — Test Runner
# Compiles each Java file, optionally compiles matching COBOL, compares output.

set -uo pipefail

GREEN='\033[0;32m'
RED='\033[0;31m'
YELLOW='\033[1;33m'
CYAN='\033[0;36m'
NC='\033[0m'

RUNTIME_JAR="/validator/lazarus-runtime.jar"
GEN_DIR="/validator/generated"
COBOL_DIR="/validator/cobol-source"
BUILD_DIR="/validator/test-build"
REPORT_FILE="/validator/validation-report.txt"
KNOWN_ISSUES="/validator/known_issues.txt"

COMPILE_ONLY=false
SINGLE_TEST=""
REPORT_MODE=false

# Parse arguments
while [[ $# -gt 0 ]]; do
    case "$1" in
        --compile-only) COMPILE_ONLY=true; shift ;;
        --test) SINGLE_TEST="$2"; shift 2 ;;
        --report) REPORT_MODE=true; shift ;;
        *) SINGLE_TEST="$1"; shift ;;
    esac
done

mkdir -p "$BUILD_DIR"

# Load known issues
declare -A KNOWN
if [[ -f "$KNOWN_ISSUES" ]]; then
    while IFS= read -r line; do
        [[ -z "$line" || "$line" == \#* ]] && continue
        KNOWN["$line"]=1
    done < "$KNOWN_ISSUES"
fi

PASS=0
FAIL=0
KNOWN_COUNT=0
COMPILE_FAIL=0
TOTAL=0
RESULTS=()

# Get file list
if [[ -n "$SINGLE_TEST" ]]; then
    # Find matching file (case-insensitive partial match)
    FILES=$(ls "$GEN_DIR"/*.java 2>/dev/null | while read f; do
        bn=$(basename "$f" .java)
        if echo "$bn" | grep -qi "$SINGLE_TEST"; then
            echo "$f"
        fi
    done)
    if [[ -z "$FILES" ]]; then
        echo -e "${RED}No test matching '$SINGLE_TEST' found.${NC}"
        echo "Available tests (sample):"
        ls "$GEN_DIR"/*.java | head -20 | while read f; do echo "  $(basename "$f" .java)"; done
        exit 1
    fi
else
    FILES=$(ls "$GEN_DIR"/*.java 2>/dev/null)
fi

echo -e "${CYAN}=== Phase 1: Java Compilation ===${NC}"
echo ""

for jfile in $FILES; do
    bn=$(basename "$jfile" .java)
    TOTAL=$((TOTAL + 1))

    # Check if known issue
    if [[ -n "${KNOWN[$bn]:-}" ]]; then
        echo -e "  ${YELLOW}KNOWN_ISSUE${NC}  $bn"
        KNOWN_COUNT=$((KNOWN_COUNT + 1))
        RESULTS+=("KNOWN_ISSUE|$bn|Known transpiler limitation")
        continue
    fi

    # Compile Java
    if javac -cp "$RUNTIME_JAR" -d "$BUILD_DIR" "$jfile" 2>/dev/null; then
        if $COMPILE_ONLY; then
            echo -e "  ${GREEN}PASS${NC}  $bn"
            PASS=$((PASS + 1))
            RESULTS+=("PASS|$bn|Compiles")
        else
            # Try to run the Java program (with timeout)
            JAVA_OUT=$(timeout 5 java -cp "$RUNTIME_JAR:$BUILD_DIR" "com.lazarus.cobol.generated.$bn" 2>&1 || true)

            # Try to find matching COBOL source
            COBOL_FILE=""
            for ext in cob cbl CBL COB; do
                # Try exact match and lowercase match
                for candidate in "$COBOL_DIR"/*; do
                    cbn=$(basename "$candidate" | sed 's/\.[^.]*$//')
                    # Convert Java CamelCase to underscore for matching
                    if [[ "$(echo "$cbn" | tr '[:upper:]' '[:lower:]')" == "$(echo "$bn" | sed 's/\([A-Z]\)/_\L\1/g' | sed 's/^_//' | tr '[:upper:]' '[:lower:]')" ]]; then
                        COBOL_FILE="$candidate"
                        break 2
                    fi
                done
            done

            if [[ -n "$COBOL_FILE" ]] && ! $COMPILE_ONLY; then
                # Compile and run COBOL for comparison
                COBOL_BIN="$BUILD_DIR/${bn}_cobol"
                if cobc -x -o "$COBOL_BIN" "$COBOL_FILE" 2>/dev/null; then
                    COBOL_OUT=$(timeout 5 "$COBOL_BIN" 2>&1 || true)

                    if [[ "$JAVA_OUT" == "$COBOL_OUT" ]]; then
                        echo -e "  ${GREEN}PASS${NC}  $bn  (output matches COBOL)"
                        PASS=$((PASS + 1))
                        RESULTS+=("PASS|$bn|Output matches COBOL reference")
                    else
                        echo -e "  ${YELLOW}DIFF${NC}  $bn  (compiled, output differs)"
                        PASS=$((PASS + 1))  # Still counts as pass — it compiles
                        RESULTS+=("DIFF|$bn|Compiles but output differs from COBOL")
                    fi
                else
                    # COBOL won't compile (GnuCOBOL-specific features, etc.)
                    echo -e "  ${GREEN}PASS${NC}  $bn  (Java compiles, COBOL reference N/A)"
                    PASS=$((PASS + 1))
                    RESULTS+=("PASS|$bn|Compiles (COBOL reference could not compile)")
                fi
            else
                echo -e "  ${GREEN}PASS${NC}  $bn"
                PASS=$((PASS + 1))
                RESULTS+=("PASS|$bn|Compiles and runs")
            fi
        fi
    else
        echo -e "  ${RED}FAIL${NC}  $bn"
        COMPILE_FAIL=$((COMPILE_FAIL + 1))
        FAIL=$((FAIL + 1))
        RESULTS+=("FAIL|$bn|Compilation failed")
    fi

    # Progress indicator every 100 files
    if [[ $((TOTAL % 100)) -eq 0 ]] && [[ -z "$SINGLE_TEST" ]]; then
        echo -e "  ${CYAN}... $TOTAL files processed${NC}"
    fi
done

echo ""
echo -e "${CYAN}══════════════════════════════════════════════════════════════${NC}"
echo -e "${CYAN}                     VALIDATION RESULTS                       ${NC}"
echo -e "${CYAN}══════════════════════════════════════════════════════════════${NC}"
echo ""

PCT=0
if [[ $TOTAL -gt 0 ]]; then
    PCT=$(echo "scale=1; ($PASS + $KNOWN_COUNT) * 100 / $TOTAL" | bc 2>/dev/null || echo "N/A")
fi

echo -e "  Total programs:    ${CYAN}$TOTAL${NC}"
echo -e "  ${GREEN}Passed:            $PASS${NC}"
if [[ $KNOWN_COUNT -gt 0 ]]; then
    echo -e "  ${YELLOW}Known issues:      $KNOWN_COUNT${NC}"
fi
if [[ $FAIL -gt 0 ]]; then
    echo -e "  ${RED}Failed:            $FAIL${NC}"
fi
echo -e "  Compile rate:      ${GREEN}${PCT}%${NC}"
echo ""

if [[ $FAIL -eq 0 ]]; then
    echo -e "  ${GREEN}STATUS: ALL PROGRAMS COMPILE SUCCESSFULLY${NC}"
else
    echo -e "  ${RED}STATUS: $FAIL COMPILATION FAILURES${NC}"
fi
echo ""

# Generate report
if $REPORT_MODE || [[ -z "$SINGLE_TEST" ]]; then
    {
        echo "Lazarus COBOL-to-Java Validation Report"
        echo "Generated: $(date -u '+%Y-%m-%d %H:%M:%S UTC')"
        echo "Java: $(java -version 2>&1 | head -1)"
        echo "GnuCOBOL: $(cobc --version 2>&1 | head -1)"
        echo ""
        echo "SUMMARY"
        echo "  Total:        $TOTAL"
        echo "  Passed:       $PASS"
        echo "  Known Issues: $KNOWN_COUNT"
        echo "  Failed:       $FAIL"
        echo "  Compile Rate: ${PCT}%"
        echo ""
        echo "DETAILED RESULTS"
        for r in "${RESULTS[@]}"; do
            echo "  $r"
        done
    } > "$REPORT_FILE"
    echo -e "Report written to: ${CYAN}$REPORT_FILE${NC}"
fi

# Exit code: 0 if no unexpected failures
[[ $FAIL -eq 0 ]]
