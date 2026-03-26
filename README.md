# Lazarus COBOL-to-Java

**1,320 COBOL programs deterministically transpiled to pure, compilable Java.**

This repository contains the Java output of the Lazarus COBOL transpiler — a proprietary system that converts legacy COBOL source code into clean, standalone Java. Every program compiles. Every program runs.

## Numbers

| Metric | Value |
|--------|-------|
| Programs transpiled | **1,320** |
| Compile rate | **100.0%** (1,320 / 1,320) |
| Lines of generated Java | **129,000+** |
| Runtime library | **6 core classes + 13 CICS runtime classes + DFSORT** |
| CICS runtime tests | **155 passed** (core + VSAM + emitter + E2E) |
| Test categories covered | **79+** |
| External dependencies | **1** (H2 embedded database for CICS VSAM) |

## Production COBOL validation

The transpiler has been validated against real-world production COBOL, not just test suites:

| Source | Description | Programs | Compile Rate |
|--------|-------------|----------|--------------|
| **GnuCOBOL Test Suite** | 79 categories of COBOL language features | 1,224 | **100%** |
| **AWS CardDemo** | Enterprise CICS/VSAM card management application | 44 | **100%** |
| **CMS Medicare Pricers** | U.S. government healthcare pricing (ESRD, LTCH, SNF, Hospice, HH, IRF) | 55 | **100%** |
| **Total** | | **1,320** | **100%** |

**AWS CardDemo** is Amazon's reference enterprise mainframe application — a full CICS online transaction processing system with indexed file I/O, screen maps, and multi-program CALL chains. **CMS Medicare Pricers** are the actual COBOL programs used by the Centers for Medicare & Medicaid Services to calculate hospital reimbursement rates — production government code with decades of fiscal year logic, complex arithmetic, and nested CALL hierarchies.

## What's here

```
src/main/java/com/lazarus/cobol/
    CobolDisplay.java         # DISPLAY / ACCEPT verb runtime
    CobolFile.java            # File I/O (Sequential, Indexed, Relative)
    CobolIntrinsics.java      # 80+ intrinsic functions
    CobolProgram.java         # Base class for all transpiled programs
    CobolString.java          # Fixed-length COBOL string semantics
    FileStatus.java           # Standard file status codes
    generated/                # 1,320 transpiled Java programs
    cics/                     # Full CICS runtime (see below)

src/test/java/com/lazarus/cobol/cics/
    CicsRuntimeTest.java      # 67 core runtime tests
    CicsVsamTest.java         # 41 VSAM + transaction tests
    CicsEmitterTest.java      # 19 emitter integration tests
    CardDemoE2ETest.java      # 28 CardDemo end-to-end tests
```

## CICS Runtime

The transpiler handles CICS online transaction processing programs — the backbone of mainframe applications. The CICS runtime is a complete Java implementation:

| Component | Class | Description |
|-----------|-------|-------------|
| **Region** | `CicsRegion` | Top-level CICS container: program registry, transaction routing, resource pools |
| **Task** | `CicsTask` | Per-transaction context: EIB, COMMAREA, condition/abend handler stacks |
| **EIB** | `CicsEIB` | Execute Interface Block: DFHAID keys, RESP codes, date/time, task info |
| **Program Control** | `XctlException`, `ReturnException` | LINK, XCTL (transfer), RETURN, START (async) |
| **Screen I/O** | `CicsMap`, `CicsFieldAttr` | BMS map definitions, DFHBMSCA field attributes, SEND/RECEIVE MAP |
| **TSQ** | `CicsTSQueue` | Temporary Storage Queue: random access by item, sequential NEXT, rewrite |
| **TDQ** | `CicsTDQueue` | Transient Data Queue: trigger support, destructive dequeue |
| **VSAM** | `CicsVsamFile` | KSDS, RRDS, ESDS via H2 database: CRUD, browse, generic search, alternate indexes |
| **Transactions** | `CicsTransaction` | Logical Unit of Work: SYNCPOINT (commit), ROLLBACK via JDBC |
| **ABEND** | `AbendException`, `CicsCondition` | ABEND with dump, HANDLE ABEND (label/program/cancel), condition handling |

### CICS test results

| Suite | Tests | Description |
|-------|-------|-------------|
| Core Runtime | 67 | Region, Task, EIB, LINK/XCTL/RETURN, ABEND, TSQ, TDQ, Maps, Channels |
| VSAM + Transactions | 41 | KSDS CRUD/browse/generic/alt-index, RRDS, ESDS, SYNCPOINT, ROLLBACK |
| Emitter Integration | 19 | ThreadLocal task, generated program linkage, RESP capture |
| CardDemo End-to-End | 28 | Sign-on, menu, account view, transaction browse/update, XCTL chains, concurrent tasks |
| **Total** | **155** | **100% pass** |

The CardDemo E2E test simulates the [AWS CardDemo](https://github.com/aws-samples/aws-mainframe-modernization-carddemo) application flow: user sign-on with VSAM credential lookup, menu navigation via XCTL chains, account viewing with KSDS reads, transaction browsing with STARTBR/READNEXT, and transaction updates with REWRITE — all running against an H2 in-memory database.

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
# Compile everything (runtime + 1,320 programs)
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
- **CICS Runtime** — 13 classes providing full CICS online transaction processing (see CICS Runtime section above)

## Security audit

A static analysis scan was performed against all 129,000+ lines of Java in this repository. Results:

| Check | Result |
|-------|--------|
| Command injection (`Runtime.exec`, `ProcessBuilder`) | **0 findings** |
| Deserialization (`ObjectInputStream`, `readObject`) | **0 findings** |
| SQL injection (`Statement`, `PreparedStatement`, JDBC) | **Contained** — CICS VSAM uses parameterized H2 queries only |
| Reflection (`Class.forName`, `.invoke()`) | **0 findings** |
| Network access (`Socket`, `URLConnection`, `HttpClient`) | **0 findings** |
| Unsafe/JNI (`sun.misc.Unsafe`, `System.loadLibrary`) | **0 findings** |
| Weak cryptography (MD5, SHA-1, DES, ECB) | **0 findings** |
| Hardcoded secrets | **0 findings** |
| Path traversal | **Contained** — file paths are set by program constants, not user input |

The generated code has a minimal attack surface: no network, no deserialization, no reflection, no native code. All string operations are bounds-checked by the JVM. Arithmetic uses `BigDecimal` (no overflow). File I/O is limited to `CobolFile` with fixed paths set at transpile time. CICS VSAM file operations use H2 embedded database with parameterized queries — no SQL injection surface.

That said — **Java has inherent limitations** that no amount of clean code generation can fix.

## Why Rust is the better target

This repository proves the transpiler works. Java was the first target because the JVM is ubiquitous and the generated code is easy to read. But for production COBOL modernization, **Rust is the superior target language.** Here's why:

### Memory safety without garbage collection

Java achieves memory safety through the JVM garbage collector — which means unpredictable GC pauses, stop-the-world collections, and memory overhead from object headers and heap management. Every `new CobolString(40)` allocates on the heap, and the GC has to track it.

Rust achieves the same memory safety at **compile time** through ownership and borrowing. Zero runtime cost. No GC pauses. No heap fragmentation. A COBOL program with 500 string fields would have deterministic memory layout in Rust — allocated once, freed automatically when scope ends.

### Null safety is not optional

Java's `NullPointerException` is the billion-dollar mistake that keeps giving. Every `.trim()`, every `.toString()`, every field access in the generated code is a potential NPE at runtime. The JVM catches it — but only by crashing.

Rust has no null. `Option<T>` forces you to handle the absence of a value at compile time. A Rust transpilation target would make "field not initialized" a **compile error**, not a runtime crash.

### No JVM dependency

The generated Java requires a JVM to run. That's a 200+ MB runtime dependency, JIT warmup time, and class loading overhead. For COBOL programs that ran on bare metal for 40 years, wrapping them in a JVM is ironic.

Rust compiles to a **single native binary**. No runtime. No interpreter. No classpath. Deploy a 2 MB executable that starts in milliseconds — closer to the performance profile these programs were originally designed for.

### Thread safety by construction

COBOL programs are increasingly being parallelized in modernization efforts. Java's thread safety model is "hope you remembered to synchronize." Data races are runtime bugs that may or may not manifest.

Rust's borrow checker makes data races a **compile-time error**. If the code compiles, it's thread-safe. Period. For a transpiler targeting concurrent execution of COBOL batch jobs, this is not a nice-to-have — it's essential.

### Type system strength

Java's type system allows:
- Implicit boxing/unboxing that hides performance costs
- Type erasure in generics that loses information
- Unchecked casts that crash at runtime
- Mutable shared state with no compiler enforcement

Rust's type system encodes:
- Ownership (who can read/write a value)
- Lifetimes (how long a reference is valid)
- Send/Sync traits (what can cross thread boundaries)
- Zero-cost enums with pattern matching (exhaustive by default)

For a deterministic transpiler, Rust's type system lets you **prove correctness** rather than hope for it.

### Performance where it counts

COBOL runs the world's batch processing — payroll, claims, settlements. These jobs process millions of records. Java's per-object overhead (16-byte headers, heap allocation, GC pressure) adds up. A COBOL `PACKED-DECIMAL` field is 5 bytes on the mainframe; in Java it's a `BigDecimal` object consuming 80+ bytes of heap.

Rust can represent that same packed decimal as a stack-allocated `[u8; 5]` — same 5 bytes, same memory layout, zero overhead. When you're processing 100 million records, that difference is measured in hours.

### The bottom line

| | Java | Rust |
|---|------|------|
| Memory safety | GC at runtime | Ownership at compile time |
| Null safety | `NullPointerException` | `Option<T>` — no null exists |
| Runtime dependency | JVM (200+ MB) | None (native binary) |
| Thread safety | Manual synchronization | Borrow checker enforced |
| Startup time | Seconds (class loading + JIT) | Milliseconds |
| Per-object overhead | 16-byte header + heap | Zero (stack or inline) |
| Data race detection | Runtime (maybe) | Compile time (always) |
| Binary size | JAR + JVM | Single 2-5 MB executable |

Java proves the concept. Rust is the production answer.

The Lazarus transpiler architecture is target-agnostic — the same parser and AST feed different code emitters. A Rust emitter would produce `CobolString` as a fixed-size `[u8; N]`, `PACKED-DECIMAL` as a stack-allocated BCD type, and `PERFORM VARYING` as zero-cost iterators. Same 1,320 programs. Same compilation rate. But with the safety guarantees and performance characteristics that production COBOL modernization demands.

## Changelog

**2026-03-26** — GnuCOBOL test suite regenerated with transpiler improvements:
- Fixed numeric paragraph name handling (`0000-MAIN-LOGIC`, `1000-INIT`, etc.) — standard mainframe naming convention now fully supported
- Fixed mixed-format source detection: multi-line voting system differentiates fixed-format files with column-7 comment indicators from free-format files with keywords at column 1
- Fixed FILLER field handling — anonymous COBOL data items now emit proper Java declarations with unique names
- Fixed `_filler_NNN` counter drift between declaration and reference passes via post-processing reconciliation
- Expanded `CobolIntrinsics` runtime: added `SIGN`, `EXP`, `EXP10`, `FRACTION-PART`, `LOCALE-TIME-FROM-SECONDS`, `MODULE-DATE`, `MODULE-TIME`, `CURRENCY-SYMBOL`, `MONETARY-DECIMAL-POINT`, `NUMERIC-DECIMAL-POINT`, and other missing intrinsic functions with proper overloads
- Added DFSORT runtime class for SORT/MERGE verb support (conditional import — only included when program uses SORT verbs)
- All 1,224 GnuCOBOL test programs now have fully populated procedure bodies — zero empty methods
- Unique class naming per source file eliminates PROGRAM-ID collisions in the test suite
- 100% compile rate maintained across all 1,320 programs

## License and attribution

This repository is licensed under the **Apache License, Version 2.0**. See [LICENSE](LICENSE) for the full text.

The [NOTICE](NOTICE) file contains complete ownership and attribution details. In summary:

| Component | Owner | License |
|-----------|-------|---------|
| Transpiler (not included) | Lazarus Systems | Proprietary |
| Runtime library + CICS runtime | Lazarus Systems | Apache 2.0 |
| Generated Java from GnuCOBOL tests | Lazarus Systems | Apache 2.0 |
| Generated Java from AWS CardDemo | Derivative of Amazon.com, Inc. | Apache 2.0 |
| Generated Java from CMS Medicare | Lazarus Systems | Apache 2.0 (source is U.S. Gov public domain) |
| H2 Database (dependency) | H2 Group | MPL 2.0 / EPL 1.0 |

The **transpiler** that produced the generated Java is proprietary software owned by Lazarus Systems. It is not included in this repository. What you see here is the **output** — the runtime library and 1,320 compiled Java programs.

## About

Built by [Lazarus Systems](https://lazarus-systems.com) — legacy code modernization, automated.
