# Lazarus COBOL-to-Java

**1,224 COBOL programs deterministically transpiled to pure, compilable Java.**

This repository contains the Java output of the Lazarus COBOL transpiler — a proprietary system that converts legacy COBOL source code into clean, standalone Java. Every program compiles. Every program runs.

## Numbers

| Metric | Value |
|--------|-------|
| Programs transpiled | **1,224** |
| Compile rate | **100.0%** (1,224 / 1,224) |
| Lines of generated Java | **119,144** |
| Runtime library | **6 classes, 916 lines** |
| Test categories covered | **79** |
| External dependencies | **0** (pure Java, JDK 11+) |

## What's here

```
src/main/java/com/lazarus/cobol/
    CobolDisplay.java         # DISPLAY / ACCEPT verb runtime
    CobolFile.java            # File I/O (Sequential, Indexed, Relative)
    CobolIntrinsics.java      # 80+ intrinsic functions
    CobolProgram.java         # Base class for all transpiled programs
    CobolString.java          # Fixed-length COBOL string semantics
    FileStatus.java           # Standard file status codes
    generated/                # 1,224 transpiled Java programs
```

## Examples

**COBOL DISPLAY with literals** — numeric types, signs, decimals, hex/boolean:

```java
public class RunFundamental000DisplayLiterals extends CobolProgram {
    private void para_main() {
        CobolDisplay.display("abc");
        CobolDisplay.display(String.valueOf(123));
        CobolDisplay.display(String.valueOf(-12.3));
        CobolDisplay.display(String.valueOf(0.123));
        CobolDisplay.display("0101");
        CobolDisplay.display("EC");
        System.exit(0);
    }

    public static void main(String[] args) {
        new RunFundamental000DisplayLiterals().run();
    }
}
```

**Nested PERFORM loops** — direct mapping of COBOL control flow:

```java
public class RunMisc057NestedPerform extends CobolProgram {
    private void para_main() {
        for (int _i0 = 0; _i0 < 2; _i0++) {
            CobolDisplay.displayNoAdvancing("X");
            for (int _i1 = 0; _i1 < 2; _i1++) {
                CobolDisplay.displayNoAdvancing("Y");
            }
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        new RunMisc057NestedPerform().run();
    }
}
```

**PACKED-DECIMAL arithmetic** — BigDecimal precision, fence-post validation:

```java
public class DataPacked006PackedDecimalArithmetic extends CobolProgram {
    private static final String fence = "ABBAAB";
    private CobolString fence_a = new CobolString(3);
    private BigDecimal x = BigDecimal.ZERO;
    private BigDecimal y = BigDecimal.ZERO;
    private BigDecimal z = BigDecimal.ZERO;

    private void para_main() {
        x = new BigDecimal(String.valueOf(1).trim());
        if (x.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("01 <" + String.valueOf(x) + ">");
        }
        if (!String.valueOf(fence_a).equals(String.valueOf(fence))) {
            fence_a.set(String.valueOf(fence));
            CobolDisplay.display("broken FENCE-A");
        }
        // ... 150+ lines of arithmetic validation
    }
}
```

## Build & verify

**Requires:** JDK 11 or later

```bash
# Compile everything (runtime + 1,224 programs)
bash verify.sh

# Or with Maven
mvn compile
```

**Windows:**
```
verify.bat
```

**Run any program directly:**
```bash
javac -d out src/main/java/com/lazarus/cobol/*.java
javac -cp out -d out src/main/java/com/lazarus/cobol/generated/RunFundamental000DisplayLiterals.java
java -cp out com.lazarus.cobol.generated.RunFundamental000DisplayLiterals
```

## Coverage

Programs span 79 categories of COBOL functionality:

| Category | Count | Description |
|----------|-------|-------------|
| RunMisc | 138 | Control flow, STRING/UNSTRING, INSPECT, TRANSFORM |
| SynMisc | 139 | Syntax validation across COBOL dialects |
| RunFunctions | 126 | All COBOL intrinsic functions |
| RunFundamental | 96 | MOVE, COMPUTE, IF/EVALUATE, expressions |
| RunFile | 89 | Sequential, indexed, relative file I/O |
| RunExtensions | 87 | GnuCOBOL extensions, system routines |
| RunManualScreen | 58 | SCREEN SECTION programs |
| SynDefinition | 56 | Data division syntax patterns |
| SynFile | 44 | File control syntax |
| Listings | 30 | COPY, REPLACE, listing directives |
| RunReportwriter | 27 | Report Writer (RD/RW) programs |
| DataPacked | 21 | PACKED-DECIMAL (COMP-3) arithmetic |
| DataBinary | 11 | BINARY/COMP-4/COMP-5 arithmetic |
| DataDisplay | 9 | DISPLAY usage arithmetic |
| ...and 65 more | | |

## Runtime library

The runtime provides COBOL semantics in pure Java:

- **CobolString** — Fixed-length, space-padded strings with reference modification (`PIC X`/`PIC A`)
- **CobolFile** — Sequential/Indexed/Relative file I/O with status codes
- **CobolIntrinsics** — 80+ intrinsic functions: `CURRENT-DATE`, `NUMVAL`, `UPPER-CASE`, `LENGTH`, `TRIM`, trigonometry, statistics, date arithmetic, and more
- **CobolDisplay** — `DISPLAY` and `ACCEPT` verb implementation
- **CobolProgram** — Base class with `CALL` support and lifecycle management
- **FileStatus** — Standard COBOL file status codes (`00`, `10`, `23`, `35`, etc.)

## About

Built by [Lazarus Systems](https://lazarus-systems.com) — legacy code modernization, automated.

---

*All 1,224 programs are deterministically transpiled from the [GnuCOBOL](https://gnucobol.sourceforge.io/) test suite, covering the full breadth of COBOL language features.*
