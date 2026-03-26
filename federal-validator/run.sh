#!/bin/bash
# Lazarus COBOL-to-Java Validator — One-Command Entry Point
# Usage: docker run lazarus-java-validator
#        docker run lazarus-java-validator --test run_fundamental_000
#        docker run lazarus-java-validator --compile-only
#        docker run lazarus-java-validator --report

set -euo pipefail

GREEN='\033[0;32m'
YELLOW='\033[1;33m'
CYAN='\033[0;36m'
NC='\033[0m'

echo ""
echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════╗${NC}"
echo -e "${CYAN}║                                                                  ║${NC}"
echo -e "${CYAN}║    ${GREEN}Lazarus COBOL-to-Java Transpiler — Validation Suite${CYAN}          ║${NC}"
echo -e "${CYAN}║                                                                  ║${NC}"
echo -e "${CYAN}║    1,320 COBOL programs transpiled to pure, compilable Java      ║${NC}"
echo -e "${CYAN}║    Runtime: OpenJDK 21 | Reference: GnuCOBOL 3.2                ║${NC}"
echo -e "${CYAN}║                                                                  ║${NC}"
echo -e "${CYAN}║    Built by Lazarus Systems — lazarus-systems.com                ║${NC}"
echo -e "${CYAN}║                                                                  ║${NC}"
echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════╝${NC}"
echo ""

echo -e "${YELLOW}Environment:${NC}"
echo "  Java:     $(java -version 2>&1 | head -1)"
echo "  GnuCOBOL: $(cobc --version 2>&1 | head -1)"
echo "  Runtime:  $(du -h /validator/lazarus-runtime.jar | cut -f1) JAR"
echo "  Programs: $(ls /validator/generated/*.java 2>/dev/null | wc -l) Java files"
echo "  COBOL:    $(ls /validator/cobol-source/*.cob /validator/cobol-source/*.cbl 2>/dev/null | wc -l) source files"
echo ""

exec /validator/test_runner.sh "$@"
