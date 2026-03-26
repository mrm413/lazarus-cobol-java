#!/bin/bash
# Compile all 1,323 generated Java programs and verify 100% success
set -e

echo "=== Lazarus COBOL-to-Java Compile Verification ==="
echo ""

# Clean
rm -rf target/classes
mkdir -p target/classes

# Compile runtime
echo "Compiling runtime..."
javac -d target/classes src/main/java/com/lazarus/cobol/*.java
javac -cp target/classes -d target/classes src/main/java/com/lazarus/cobol/jcl/batch/*.java 2>/dev/null
echo "  Runtime: OK"

# Compile all generated programs
echo "Compiling 1,323 generated programs..."
PASS=0
FAIL=0
for f in src/main/java/com/lazarus/cobol/generated/*.java; do
    if javac -cp target/classes -d target/classes "$f" 2>/dev/null; then
        PASS=$((PASS + 1))
    else
        FAIL=$((FAIL + 1))
        echo "  FAIL: $f"
    fi
done

TOTAL=$((PASS + FAIL))
PCT=$(echo "scale=1; $PASS * 100 / $TOTAL" | bc)

echo ""
echo "=== Results ==="
echo "  Compiled: $PASS / $TOTAL ($PCT%)"
if [ "$FAIL" -eq 0 ]; then
    echo "  Status: ALL PROGRAMS COMPILE SUCCESSFULLY"
else
    echo "  Failures: $FAIL"
fi
