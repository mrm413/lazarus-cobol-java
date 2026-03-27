#!/bin/bash
# Lazarus Behavioral Parity Harness
# Compiles + runs each Java program, compares stdout against golden COBOL output.
# Generates HTML report proving COBOL X = Java X.
#
# Usage: ./parity_harness.sh [--filter=pattern]

set -uo pipefail

GREEN='\033[0;32m'
RED='\033[0;31m'
YELLOW='\033[1;33m'
CYAN='\033[0;36m'
NC='\033[0m'

RUNTIME_JAR="/validator/lazarus-runtime.jar"
GEN_DIR="/validator/generated"
COBOL_DIR="/validator/cobol-source"
BUILD_DIR="/validator/parity-build"
GOLDEN_DIR="/validator/golden-outputs"
REPORT_HTML="/validator/parity-report.html"
REPORT_JSON="/validator/parity-report.json"

FILTER=""
TIMEOUT=10

for arg in "$@"; do
    case "$arg" in
        --filter=*) FILTER="${arg#--filter=}" ;;
    esac
done

mkdir -p "$BUILD_DIR" "$GOLDEN_DIR"

PASS=0
FAIL=0
SKIP=0
TOTAL=0
HTML_ROWS=""
JSON_PROGRAMS=""

echo -e "${CYAN}=== Lazarus Behavioral Parity Harness ===${NC}"
echo ""

# Phase 1: Capture golden COBOL outputs (if not already cached)
COBOL_COUNT=$(ls "$COBOL_DIR"/*.cob "$COBOL_DIR"/*.cbl 2>/dev/null | wc -l)
GOLDEN_COUNT=$(ls "$GOLDEN_DIR"/*.expected 2>/dev/null | wc -l)

if [[ "$GOLDEN_COUNT" -lt 10 ]] && [[ "$COBOL_COUNT" -gt 0 ]]; then
    echo -e "${CYAN}Phase 1: Capturing COBOL golden outputs...${NC}"
    for cobfile in "$COBOL_DIR"/*.cob "$COBOL_DIR"/*.cbl; do
        [[ -f "$cobfile" ]] || continue
        bn=$(basename "$cobfile" | sed 's/\.[^.]*$//')
        outbin="$BUILD_DIR/${bn}_cobol"
        if cobc -x -o "$outbin" "$cobfile" 2>/dev/null; then
            timeout "$TIMEOUT" "$outbin" > "$GOLDEN_DIR/${bn}.expected" 2>/dev/null || true
        fi
    done
    GOLDEN_COUNT=$(ls "$GOLDEN_DIR"/*.expected 2>/dev/null | wc -l)
    echo -e "  Captured ${GREEN}${GOLDEN_COUNT}${NC} golden outputs"
    echo ""
fi

# Build name mapping: COBOL filename → Java class name
# run_fundamental_000_DISPLAY_literals → RunFundamental000DisplayLiterals
cobol_to_java_class() {
    echo "$1" | sed 's/\.[^.]*$//' | sed 's/[-_]\([a-zA-Z0-9]\)/\u\1/g' | sed 's/^\([a-z]\)/\u\1/'
}

echo -e "${CYAN}Phase 2: Running Java programs and comparing output...${NC}"
echo ""

for jfile in "$GEN_DIR"/*.java; do
    [[ -f "$jfile" ]] || continue
    bn=$(basename "$jfile" .java)

    # Apply filter
    if [[ -n "$FILTER" ]]; then
        if ! echo "$bn" | grep -qi "$FILTER"; then
            continue
        fi
    fi

    TOTAL=$((TOTAL + 1))

    # Find matching golden output
    # Try multiple naming conventions
    GOLDEN_FILE=""
    bn_lower=$(echo "$bn" | tr '[:upper:]' '[:lower:]')
    for gfile in "$GOLDEN_DIR"/*.expected; do
        [[ -f "$gfile" ]] || continue
        gbn=$(basename "$gfile" .expected)
        gbn_lower=$(echo "$gbn" | tr '[:upper:]' '[:lower:]')
        java_class=$(cobol_to_java_class "$gbn")
        java_class_lower=$(echo "$java_class" | tr '[:upper:]' '[:lower:]')
        if [[ "$java_class_lower" == "$bn_lower" ]] || [[ "$gbn_lower" == "$bn_lower" ]]; then
            GOLDEN_FILE="$gfile"
            break
        fi
    done

    if [[ -z "$GOLDEN_FILE" ]]; then
        SKIP=$((SKIP + 1))
        HTML_ROWS+="<tr class=\"skip\"><td>${bn}</td><td colspan=\"3\" class=\"skip-msg\">No golden COBOL output available</td></tr>\n"
        JSON_PROGRAMS+="{\"program\":\"${bn}\",\"passed\":null,\"skipped\":true},"
        continue
    fi

    # Compile Java
    if ! javac -cp "$RUNTIME_JAR" -d "$BUILD_DIR" "$jfile" 2>/dev/null; then
        FAIL=$((FAIL + 1))
        HTML_ROWS+="<tr class=\"fail\"><td><span class=\"badge fail\">FAIL</span> ${bn}</td><td>compile error</td><td>-</td><td>-</td></tr>\n"
        JSON_PROGRAMS+="{\"program\":\"${bn}\",\"passed\":false,\"reason\":\"compile\"},"
        continue
    fi

    # Run Java
    JAVA_OUT=$(timeout "$TIMEOUT" java -cp "$RUNTIME_JAR:$BUILD_DIR" "com.lazarus.cobol.generated.${bn}" 2>/dev/null || true)
    COBOL_OUT=$(cat "$GOLDEN_FILE")

    # Normalize: trim trailing whitespace per line, remove trailing blank lines
    JAVA_NORM=$(echo "$JAVA_OUT" | sed 's/[[:space:]]*$//' | sed -e :a -e '/^[[:space:]]*$/{ $d; N; ba; }')
    COBOL_NORM=$(echo "$COBOL_OUT" | sed 's/[[:space:]]*$//' | sed -e :a -e '/^[[:space:]]*$/{ $d; N; ba; }')

    if [[ "$JAVA_NORM" == "$COBOL_NORM" ]]; then
        PASS=$((PASS + 1))
        JAVA_LINES=$(echo "$JAVA_NORM" | wc -l)
        echo -e "  ${GREEN}PASS${NC}  ${bn}  (${JAVA_LINES} lines match)"
        HTML_ROWS+="<tr class=\"pass\"><td><span class=\"badge pass\">PASS</span> ${bn}</td><td>${JAVA_LINES}/${JAVA_LINES}</td><td>golden</td><td>match</td></tr>\n"
        JSON_PROGRAMS+="{\"program\":\"${bn}\",\"passed\":true,\"lines\":${JAVA_LINES}},"
    else
        FAIL=$((FAIL + 1))
        # Generate diff snippet for HTML
        DIFF_HTML=""
        DIFF_LINES=$(diff <(echo "$COBOL_NORM") <(echo "$JAVA_NORM") | head -30 || true)
        if [[ -n "$DIFF_LINES" ]]; then
            ESCAPED=$(echo "$DIFF_LINES" | sed 's/&/\&amp;/g; s/</\&lt;/g; s/>/\&gt;/g')
            DIFF_HTML="<tr><td colspan=\"4\"><pre class=\"diff\">${ESCAPED}</pre></td></tr>"
        fi
        echo -e "  ${RED}FAIL${NC}  ${bn}"
        HTML_ROWS+="<tr class=\"fail\"><td><span class=\"badge fail\">FAIL</span> ${bn}</td><td>differs</td><td>golden</td><td>mismatch</td></tr>\n${DIFF_HTML}\n"
        JSON_PROGRAMS+="{\"program\":\"${bn}\",\"passed\":false,\"reason\":\"output_mismatch\"},"
    fi

    # Progress
    if [[ $((TOTAL % 50)) -eq 0 ]]; then
        echo -e "  ${CYAN}... ${TOTAL} programs tested${NC}"
    fi
done

# Calculate pass rate
TESTED=$((PASS + FAIL))
if [[ $TESTED -gt 0 ]]; then
    RATE=$(echo "scale=1; $PASS * 100 / $TESTED" | bc 2>/dev/null || echo "N/A")
else
    RATE="0.0"
fi

echo ""
echo -e "${CYAN}══════════════════════════════════════════════════════════════${NC}"
echo -e "  Total: ${CYAN}${TOTAL}${NC}  Pass: ${GREEN}${PASS}${NC}  Fail: ${RED}${FAIL}${NC}  Skip: ${YELLOW}${SKIP}${NC}  Rate: ${GREEN}${RATE}%${NC}"
echo -e "${CYAN}══════════════════════════════════════════════════════════════${NC}"

# Generate HTML report
BAR_COLOR="#3fb950"
[[ $FAIL -gt 0 ]] && BAR_COLOR="#f85149"
[[ $FAIL -gt 0 ]] && [[ $PASS -gt 0 ]] && BAR_COLOR="#d29922"

cat > "$REPORT_HTML" << HTMLEOF
<!DOCTYPE html>
<html lang="en"><head><meta charset="utf-8">
<title>Lazarus Behavioral Parity Report</title>
<style>
*{margin:0;padding:0;box-sizing:border-box}
body{font-family:monospace;background:#0d1117;color:#c9d1d9;padding:24px}
h1{color:#58a6ff;font-size:20px;margin-bottom:4px}
h2{color:#8b949e;font-size:13px;font-weight:normal;margin-bottom:20px}
.summary{display:flex;gap:24px;margin-bottom:24px;background:#161b22;padding:16px;border-radius:8px;align-items:center}
.stat{text-align:center}
.stat .n{font-size:32px;font-weight:bold}
.stat .l{font-size:10px;text-transform:uppercase;color:#8b949e}
.stat .n.p{color:#3fb950} .stat .n.f{color:#f85149} .stat .n.s{color:#d29922} .stat .n.t{color:#58a6ff}
.bar{flex:1;height:8px;background:#21262d;border-radius:4px;overflow:hidden}
.fill{height:100%;background:${BAR_COLOR};width:${RATE}%}
.pct{color:#8b949e;font-size:14px}
table{width:100%;border-collapse:collapse}
th{background:#161b22;padding:8px 12px;text-align:left;font-size:11px;text-transform:uppercase;color:#8b949e;border-bottom:1px solid #30363d}
td{padding:8px 12px;border-bottom:1px solid #21262d;font-size:13px}
tr.pass td{border-left:3px solid #3fb950}
tr.fail td{border-left:3px solid #f85149}
tr.skip td{border-left:3px solid #d29922;color:#8b949e}
.badge{font-size:10px;padding:2px 6px;border-radius:3px;font-weight:bold;color:#fff}
.badge.pass{background:#238636} .badge.fail{background:#da3633}
.skip-msg{font-style:italic;font-size:12px}
pre.diff{background:#161b22;padding:8px;font-size:11px;color:#f85149;white-space:pre-wrap;margin:4px 0}
footer{margin-top:24px;color:#484f58;font-size:11px}
</style></head><body>
<h1>Lazarus Behavioral Parity Report</h1>
<h2>COBOL Program Output vs Transpiled Java Output | Generated: $(date -u '+%Y-%m-%d %H:%M:%S UTC')</h2>
<div class="summary">
<div class="stat"><div class="n t">${TOTAL}</div><div class="l">Total</div></div>
<div class="stat"><div class="n p">${PASS}</div><div class="l">Pass</div></div>
<div class="stat"><div class="n f">${FAIL}</div><div class="l">Fail</div></div>
<div class="stat"><div class="n s">${SKIP}</div><div class="l">Skip</div></div>
<div class="bar"><div class="fill"></div></div>
<div class="pct">${RATE}%</div>
</div>
<table>
<thead><tr><th>Program</th><th>Lines</th><th>COBOL Source</th><th>Result</th></tr></thead>
<tbody>
$(echo -e "$HTML_ROWS")
</tbody>
</table>
<footer>Torsova LLC — Behavioral Parity Harness</footer>
</body></html>
HTMLEOF

# Generate JSON report
JSON_PROGRAMS="${JSON_PROGRAMS%,}"  # Remove trailing comma
cat > "$REPORT_JSON" << JSONEOF
{
  "timestamp": "$(date -u '+%Y-%m-%dT%H:%M:%SZ')",
  "summary": {
    "total": ${TOTAL},
    "pass": ${PASS},
    "fail": ${FAIL},
    "skip": ${SKIP},
    "passRate": ${RATE}
  },
  "programs": [${JSON_PROGRAMS}]
}
JSONEOF

echo ""
echo -e "Reports written to:"
echo -e "  HTML: ${CYAN}${REPORT_HTML}${NC}"
echo -e "  JSON: ${CYAN}${REPORT_JSON}${NC}"

[[ $FAIL -eq 0 ]]
