#!/bin/bash
# Lazarus COBOL-to-Java Validator — One-Command Entry Point
# Usage: docker run lazarus-java-validator
#        docker run lazarus-java-validator --compile-only
#        docker run lazarus-java-validator --parity
#        docker run lazarus-java-validator --test run_fundamental_000

set -euo pipefail

GREEN='\033[0;32m'
YELLOW='\033[1;33m'
CYAN='\033[0;36m'
NC='\033[0m'

GOLDEN_COUNT=$(ls /validator/golden-outputs/*.expected 2>/dev/null | wc -l)
GEN_COUNT=$(ls /validator/generated/*.java 2>/dev/null | wc -l)
COBOL_COUNT=$(ls /validator/cobol-source/*.cob /validator/cobol-source/*.cbl 2>/dev/null | wc -l)

echo ""
echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════╗${NC}"
echo -e "${CYAN}║                                                                  ║${NC}"
echo -e "${CYAN}║    ${GREEN}Lazarus COBOL-to-Java Transpiler — Validation Suite${CYAN}          ║${NC}"
echo -e "${CYAN}║                                                                  ║${NC}"
echo -e "${CYAN}║    ${GEN_COUNT} COBOL programs transpiled to pure, compilable Java      ║${NC}"
echo -e "${CYAN}║    ${GOLDEN_COUNT} federal parity tests with golden COBOL reference        ║${NC}"
echo -e "${CYAN}║    Runtime: OpenJDK 21 | Reference: GnuCOBOL 3.2                ║${NC}"
echo -e "${CYAN}║                                                                  ║${NC}"
echo -e "${CYAN}║    Built by Torsova LLC — torsova.com                            ║${NC}"
echo -e "${CYAN}║                                                                  ║${NC}"
echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════╝${NC}"
echo ""

echo -e "${YELLOW}Environment:${NC}"
echo "  Java:     $(java -version 2>&1 | head -1)"
echo "  GnuCOBOL: $(cobc --version 2>&1 | head -1)"
echo "  Runtime:  $(du -h /validator/lazarus-runtime.jar | cut -f1) JAR"
echo "  Programs: ${GEN_COUNT} Java files"
echo "  Golden:   ${GOLDEN_COUNT} parity reference outputs"
echo "  COBOL:    ${COBOL_COUNT} source files"
echo ""

# Check if parity mode requested
if [[ "${1:-}" == "--parity" ]]; then
    shift
    exec /validator/parity_harness.sh "$@"
fi

exec /validator/test_runner.sh "$@"
