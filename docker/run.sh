#!/bin/bash
# ============================================================================
# Lazarus COBOL-to-Java Validator — entry point.
#
# Default mode (no args) runs the parity harness: compile each Java program,
# run it, diff its stdout against the golden reference captured from
# GnuCOBOL on the same input. Reports PASS / FAIL counts.
#
# Use --full to additionally re-run cobc against each cobol-source/*.cob
# at validation time (instead of trusting the pre-captured golden) so the
# entire chain is reproduced inside the container.
# ============================================================================

set -uo pipefail

GRN='\033[0;32m'
CYN='\033[0;36m'
NC='\033[0m'

GEN_COUNT=$(ls /validator/generated/*.java 2>/dev/null | wc -l)
GOLDEN_COUNT=$(ls /validator/golden-outputs/*.expected 2>/dev/null | wc -l)
COBOL_COUNT=$(ls /validator/cobol-source/*.cob /validator/cobol-source/*.cbl 2>/dev/null | wc -l)

echo
echo -e "${CYN}╔══════════════════════════════════════════════════════════════════╗${NC}"
echo -e "${CYN}║                                                                  ║${NC}"
echo -e "${CYN}║    ${GRN}Lazarus COBOL-to-Java — Behavioral Parity Suite${CYN}              ║${NC}"
echo -e "${CYN}║                                                                  ║${NC}"
echo -e "${CYN}║    ${GEN_COUNT} COBOL programs translated to compilable Java             ║${NC}"
echo -e "${CYN}║    ${GOLDEN_COUNT} golden references captured from GnuCOBOL 3.2           ║${NC}"
echo -e "${CYN}║    Runtime: OpenJDK 21 | Reference: GnuCOBOL 3.2                ║${NC}"
echo -e "${CYN}║                                                                  ║${NC}"
echo -e "${CYN}║    Built by Torsova LLC — torsova.com                            ║${NC}"
echo -e "${CYN}║                                                                  ║${NC}"
echo -e "${CYN}╚══════════════════════════════════════════════════════════════════╝${NC}"
echo

echo "Environment:"
echo "  Java:      $(java -version 2>&1 | head -1)"
echo "  GnuCOBOL:  $(cobc --version 2>&1 | head -1)"
echo "  Runtime:   $(du -h /validator/lazarus-runtime.jar | cut -f1) JAR"
echo "  Programs:  ${GEN_COUNT} Java files"
echo "  Goldens:   ${GOLDEN_COUNT} reference outputs"
echo "  COBOL src: ${COBOL_COUNT} input fixtures"
echo

if [[ "${1:-}" == "--full" ]]; then
    shift
    exec /validator/full_harness.sh "$@"
fi

exec /validator/parity_harness.sh "$@"
