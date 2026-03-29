#!/bin/bash
# Assembles the Docker build context by copying runtime, generated, and COBOL source
# into this directory. Run this BEFORE 'docker build' or 'make build'.

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"

GREEN='\033[0;32m'
CYAN='\033[0;36m'
NC='\033[0m'

echo -e "${CYAN}Assembling Docker build context...${NC}"

# Copy runtime library source
echo -e "  Copying runtime library..."
rm -rf "$SCRIPT_DIR/runtime"
mkdir -p "$SCRIPT_DIR/runtime/com/lazarus/cobol/cics"
mkdir -p "$SCRIPT_DIR/runtime/com/lazarus/cobol/jcl/batch"

cp "$REPO_ROOT/src/main/java/com/lazarus/cobol/"*.java \
   "$SCRIPT_DIR/runtime/com/lazarus/cobol/"

cp "$REPO_ROOT/src/main/java/com/lazarus/cobol/cics/"*.java \
   "$SCRIPT_DIR/runtime/com/lazarus/cobol/cics/"

cp "$REPO_ROOT/src/main/java/com/lazarus/cobol/jcl/batch/"*.java \
   "$SCRIPT_DIR/runtime/com/lazarus/cobol/jcl/batch/"

RUNTIME_COUNT=$(find "$SCRIPT_DIR/runtime" -name "*.java" | wc -l)
echo -e "  ${GREEN}$RUNTIME_COUNT runtime files${NC}"

# Copy generated Java output
echo -e "  Copying generated Java output..."
rm -rf "$SCRIPT_DIR/generated"
mkdir -p "$SCRIPT_DIR/generated"
cp "$REPO_ROOT/src/main/java/com/lazarus/cobol/generated/"*.java \
   "$SCRIPT_DIR/generated/"

GEN_COUNT=$(ls "$SCRIPT_DIR/generated/"*.java | wc -l)
echo -e "  ${GREEN}$GEN_COUNT generated files${NC}"

# Copy COBOL source for comparison
# Set COBOL_SOURCE_DIR to point at your local COBOL corpus, e.g.:
#   export COBOL_SOURCE_DIR=/path/to/cobol-corpus
echo -e "  Copying COBOL source files..."
rm -rf "$SCRIPT_DIR/cobol-source"
mkdir -p "$SCRIPT_DIR/cobol-source"

COBOL_SRC="${COBOL_SOURCE_DIR:-}"

if [[ -n "$COBOL_SRC" ]]; then
    # GnuCOBOL test files
    if [[ -d "$COBOL_SRC/gnucobol_tests" ]]; then
        cp "$COBOL_SRC/gnucobol_tests/"*.cob "$SCRIPT_DIR/cobol-source/" 2>/dev/null || true
        cp "$COBOL_SRC/gnucobol_tests/"*.cbl "$SCRIPT_DIR/cobol-source/" 2>/dev/null || true
    fi

    # CardDemo COBOL source
    if [[ -d "$COBOL_SRC/showcase_input/carddemo" ]]; then
        cp "$COBOL_SRC/showcase_input/carddemo/"*.cob "$SCRIPT_DIR/cobol-source/" 2>/dev/null || true
        cp "$COBOL_SRC/showcase_input/carddemo/"*.cbl "$SCRIPT_DIR/cobol-source/" 2>/dev/null || true
        cp "$COBOL_SRC/showcase_input/carddemo/"*.CBL "$SCRIPT_DIR/cobol-source/" 2>/dev/null || true
    fi

    # CMS Medicare COBOL source
    if [[ -d "$COBOL_SRC/showcase_input/medicare" ]]; then
        cp "$COBOL_SRC/showcase_input/medicare/"*.cob "$SCRIPT_DIR/cobol-source/" 2>/dev/null || true
        cp "$COBOL_SRC/showcase_input/medicare/"*.cbl "$SCRIPT_DIR/cobol-source/" 2>/dev/null || true
        cp "$COBOL_SRC/showcase_input/medicare/"*.CBL "$SCRIPT_DIR/cobol-source/" 2>/dev/null || true
    fi
else
    echo -e "  ${CYAN}(Set COBOL_SOURCE_DIR to include COBOL source for comparison)${NC}"
fi

COBOL_COUNT=$(ls "$SCRIPT_DIR/cobol-source/" 2>/dev/null | wc -l)
echo -e "  ${GREEN}$COBOL_COUNT COBOL source files${NC}"

# Golden outputs are committed to the repo — no need to copy
GOLDEN_COUNT=$(ls "$SCRIPT_DIR/golden-outputs/"*.expected 2>/dev/null | wc -l)
echo -e "  ${GREEN}$GOLDEN_COUNT golden parity reference outputs (committed)${NC}"

echo ""
echo -e "${GREEN}Build context ready.${NC} Run: docker build -t lazarus-java-validator ."
echo -e "Or: make build"
