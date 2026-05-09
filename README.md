# Lazarus COBOL-to-Java

**723 COBOL programs translated to pure, compilable Java with full byte-for-byte behavioral parity against the GnuCOBOL reference compiler.**

Every program in this repository compiles. Every program runs. Every program produces output identical to GnuCOBOL line-by-line. The Docker image bundled with this repo proves it.

## Numbers

| Metric | Value |
|--------|-------|
| Programs translated | **723** |
| Compile rate | **100.0%** (723 / 723) |
| Behavioral parity vs. GnuCOBOL | **723 / 723** (100% match, line-by-line) |
| Categories covered | **30+** COBOL feature areas |
| Runtime library | **40+ classes** spanning DISPLAY, file I/O, intrinsics, screen, JCL, IMS, MQ, SQL, security, CICS |
| External dependencies | **0** (pure JDK 11+, no third-party jars) |

The 723 programs are drawn from the GnuCOBOL test suite — the reference test corpus that GnuCOBOL itself uses to validate compiler correctness — covering syntax forms across COBOL-85, COBOL-2002, COBOL-2014, plus IBM, MicroFocus, ACUCOBOL, HP, and OSVS dialect extensions.

## Proving it works (one command)

```bash
docker run --rm mrm413/lazarus-java-validator
```

That single command pulls the prebuilt image from [Docker Hub](https://hub.docker.com/r/mrm413/lazarus-java-validator) and runs the full parity suite. No clone, no build — just `docker run`. Completes in ~2 minutes on a recent laptop.

To build the image yourself from this repo instead of pulling it:

```bash
docker build -t lazarus-java-validator -f docker/Dockerfile .
docker run --rm lazarus-java-validator
```

(Run from the repo root. The Dockerfile lives in `docker/` but the build context is the project root so it can copy `runtime/`, `generated/`, `cobol-source/`, and `golden-outputs/` into the image.)

The image installs OpenJDK 21 and GnuCOBOL 3.2 on Ubuntu 22.04, compiles every Java program with `javac`, runs each one, captures stdout, and diffs the output against the golden reference captured from GnuCOBOL on the same input. A summary at the end reports `PASS: 723 / FAIL: 0`.

To reproduce the entire chain end-to-end (compile each COBOL source with cobc, capture its output, compile and run the Java equivalent, verify the two are identical):

```bash
docker run --rm lazarus-java-validator --full
```

## Layout

```
runtime/com/lazarus/cobol/    Java runtime library (semantics of COBOL verbs)
generated/                    723 translated Java programs
cobol-source/                 723 original COBOL sources (input fixtures)
golden-outputs/               723 golden stdout captures from GnuCOBOL 3.2
docker/                       Dockerfile + validation harness
verify.sh                     One-shot local validation entry point (Linux/macOS)
verify.bat                    Same, for Windows
```

## Examples

**DISPLAY with literals** — numeric types, signs, decimals:

```java
public class RunFundamental000DisplayLiterals extends CobolProgram {
    private void para_main() {
        CobolDisplay.display("abc");
        CobolDisplay.display(String.valueOf(123));
        CobolDisplay.display(String.valueOf(-12.3));
        CobolDisplay.display("0101");
    }

    public static void main(String[] args) {
        new RunFundamental000DisplayLiterals().run();
    }
}
```

**PERFORM VARYING** — direct mapping of COBOL control flow:

```java
private void para_main() {
    for (int _i0 = 0; _i0 < 2; _i0++) {
        CobolDisplay.displayNoAdvancing("X");
        for (int _i1 = 0; _i1 < 2; _i1++) {
            CobolDisplay.displayNoAdvancing("Y");
        }
    }
}
```

**PACKED-DECIMAL arithmetic** — `BigDecimal` with COBOL precision rules:

```java
private BigDecimal x = BigDecimal.ZERO;
private void para_main() {
    x = new BigDecimal("1");
    if (x.compareTo(new BigDecimal("1")) != 0) {
        CobolDisplay.display("01 <" + String.valueOf(x) + ">");
    }
    /* ... arithmetic ... */
}
```

## Local build (no Docker)

**Requires:** JDK 11 or later

```bash
bash verify.sh
```

Windows:
```
verify.bat
```

The script compiles `runtime/com/lazarus/cobol/**/*.java` into a JAR, then compiles each program in `generated/`, runs it, and diffs against the corresponding `golden-outputs/*.expected` file. The summary at the end is the same `PASS: 723 / FAIL: 0` line you get from the Docker image.

To run a single program:

```bash
javac -d build runtime/com/lazarus/cobol/**/*.java
javac -cp build -d build generated/RunFundamental000DisplayLiterals.java
java -cp build com.lazarus.cobol.generated.RunFundamental000DisplayLiterals
```

## Coverage

The 723 programs span 30+ categories of COBOL feature areas:

| Category | Description |
|----------|-------------|
| RunFundamental | MOVE, COMPUTE, IF/EVALUATE, expressions, GLOBAL, CONSTANT |
| RunFunctions | COBOL intrinsic functions: TRIM, NUMVAL, UPPER-CASE, LENGTH, date arithmetic, trigonometry, statistics |
| RunFile | Sequential, indexed, relative file I/O, FILE STATUS, DECLARATIVES, EC-I-O |
| RunMisc | STRING/UNSTRING, INSPECT, TRANSFORM, GO TO, PERFORM patterns |
| RunExtensions | GnuCOBOL extensions, system routines, CALL BY VALUE/CONTENT |
| RunRefmod | Reference modification (substring) semantics |
| RunSubscripts | OCCURS access, INDEXED BY, SET, BOUND/NOBOUND directives |
| RunReportwriter | Report Writer (RD/RW) program structure |
| RunReturncode | RETURN-CODE propagation across CALL chains |
| DataDisplay | DISPLAY usage arithmetic, sign overpunch |
| DataPacked | PACKED-DECIMAL (COMP-3) arithmetic |
| DataBinary | BINARY/COMP-4/COMP-5 arithmetic |
| DataPointer | POINTER, ADDRESS OF, NULL handling |
| RunInitialize | INITIALIZE with replacing rules |
| RunAccept | ACCEPT FROM DATE/TIME/COMMAND-LINE/ENVIRONMENT |
| RunMl | XML GENERATE / JSON GENERATE / XML PARSE |
| Configuration | cobc dialect / configuration directives |
| SynMisc | Syntax forms across COBOL dialects |
| SynDefinition | Data division syntax patterns |
| SynFile | File-control / FD syntax |
| SynFunctions | Intrinsic-function call syntax |
| SynCopy | COPY / REPLACE preprocessor directives |
| SynSubscripts | Subscript syntax forms |

## Runtime library

The runtime in `runtime/com/lazarus/cobol/` provides COBOL semantics in pure Java:

| Class | Purpose |
|-------|---------|
| `CobolString` | Fixed-length, space-padded strings with reference modification (`PIC X` / `PIC A`) |
| `CobolFile` | Sequential / indexed / relative file I/O with status codes, FILE STATUS binding, DECLARATIVES exception support, EC-I-O directive |
| `CobolDisplay` | `DISPLAY` / `ACCEPT` verb implementation (UPON SYSERR, NO ADVANCING, ANSI positioning, screen ACCEPT) |
| `CobolIntrinsics` | 80+ intrinsic functions: CURRENT-DATE, NUMVAL family, UPPER/LOWER-CASE, LENGTH, BYTE-LENGTH, ORD, CHAR, MOD, INTEGER-PART, sin/cos/tan, log/exp, statistics, HEX-OF / HEX-TO-CHAR, EXCEPTION-* |
| `CobolProgram` | Base class with CALL / CANCEL / ENTRY / GOBACK lifecycle, sub-program dispatch, exit/error procedure handlers |
| `CobolBigMath` | High-precision arithmetic helpers: rounding modes, scaled MULTIPLY/DIVIDE |
| `CobolNational` | NATIONAL (UTF-16) literal handling |
| `FileStatus` | Standard file status codes (`00`, `02`, `05`, `10`, `23`, `35`, `46`, ...) |
| `IndexedBackend` | INDEXED file backend with primary + alternate-key support |
| `vmg.MemoryGrid` | Flat byte-grid memory model for byte-level COBOL field access |
| `vmg.FieldDescriptor` | Field metadata: offset, size, USAGE, sign, scaling, P-factor |
| `vmg.BcdCodec` | Packed-decimal (BCD) read/write codec |
| `vmg.PicScaler` | PICTURE clause scaling: V, P, leading/trailing zeros, comma-decimal |
| `cics/*` | CICS runtime: CicsRegion, CicsTask, CicsEIB, CicsMap, CicsTSQueue, CicsTDQueue, CicsVsamFile, transaction control |
| `jcl/*` | JCL runtime: DD statements, IDCAMS, IEFBR14, GDG handling, DFSORT |
| `ims/*` | IMS DL/I runtime: PSB / PCB / DBD / SSA / GU/GHU/REPL paths |
| `mq/*` | IBM MQ verb runtime: MQGET / MQPUT / MQOPEN / MQCLOSE |
| `sql/*` | EXEC SQL host-variable plumbing |
| `screen/*` | SCREEN SECTION runtime: ANSI cursor positioning, attribute handling |
| `security/*` | RACF / Top Secret / ACF2 access-checking shims |
| `term/*` | Terminal / 3270 attention-key handling |
| `env/*` | Language Environment (LE) callable services, EBCDIC collation, checkpoint/restart, Report Writer |
| `file/*` | PDS member access |
| `devtools/*` | Test scaffolding helpers |

## Why this matters

COBOL keeps the world running — it processes payroll, claims, settlements, banking transactions, government benefits, and healthcare reimbursements at a scale measured in trillions of dollars annually. The shops that own that code are running out of programmers who can read it, and the platforms it runs on are increasingly expensive to maintain.

Modernization off the mainframe needs three things to work in production:

1. **Behavioral identity.** The Java has to do what the COBOL did, byte-for-byte. Not "close enough." Not "we'll write a regression test for it later." Identical output for identical input across the entire runtime surface — arithmetic precision, file I/O status codes, picture-clause edits, intrinsic functions, sign overpunch, padding rules, REDEFINES overlays, and every other place the IBM Enterprise COBOL Language Reference has more than one paragraph of fine print.

2. **Compilation guarantee.** It's worthless if 5% of the programs hit an emitter bug and never compile. The translator either works on every program in scope, or it doesn't ship.

3. **Reproducibility.** Anyone — auditor, regulator, customer — has to be able to verify the claim. That means a sealed Docker image, a single command, and a printed `PASS: N / FAIL: 0` at the end.

This repository delivers all three on the GnuCOBOL test suite. The Docker image is the proof.

## Why Rust is the better target

Java was the first target because the JVM is everywhere and the generated code is easy to read in code review. But for production COBOL modernization, Rust is the superior target language.

**Memory safety without garbage collection.** Java relies on the JVM's GC — unpredictable pauses, stop-the-world collections, per-object header overhead. Rust achieves the same memory safety at compile time through ownership and borrowing. Zero runtime cost. No GC pauses. No heap fragmentation.

**Null safety is not optional.** Java's `NullPointerException` is the billion-dollar mistake that keeps giving. Rust has no null. `Option<T>` forces you to handle absence at compile time. A Rust output target makes "field not initialized" a compile error, not a runtime crash.

**No JVM dependency.** The generated Java requires a JVM — 200+ MB of runtime, JIT warmup, class loading. Rust compiles to a single native binary. No interpreter. No classpath. A 2 MB executable that starts in milliseconds — closer to the performance profile mainframe COBOL was originally designed for.

**Thread safety by construction.** Java's thread safety model is "hope you remembered to synchronize." Data races are runtime bugs. Rust's borrow checker makes data races a compile-time error. If it compiles, it's thread-safe.

**Type system strength.** Rust's type system encodes ownership, lifetimes, Send/Sync traits, zero-cost enums with exhaustive pattern matching. For a deterministic translator, that's the difference between hoping for correctness and proving it.

**Performance where it counts.** A COBOL `PACKED-DECIMAL` field is 5 bytes on the mainframe; in Java it's a `BigDecimal` object consuming 80+ bytes of heap. Rust can represent the same packed decimal as a stack-allocated `[u8; 5]` — same memory layout, zero overhead. When you're processing 100 million records, that's measured in hours.

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

## Security audit

A static analysis scan was performed across the runtime library and all 723 generated programs. Results:

| Check | Result |
|-------|--------|
| Command injection (`Runtime.exec`, `ProcessBuilder`) | **0 findings** |
| Deserialization (`ObjectInputStream`, `readObject`) | **0 findings** |
| SQL injection | **N/A** — generated programs do not perform SQL |
| Reflection (`Class.forName`, `.invoke()`) | **Contained** — only used by `CALL` dispatch to look up class by COBOL `PROGRAM-ID` |
| Network access (`Socket`, `URLConnection`, `HttpClient`) | **0 findings** |
| Unsafe / JNI (`sun.misc.Unsafe`, `System.loadLibrary`) | **0 findings** |
| Weak cryptography (MD5, SHA-1, DES, ECB) | **0 findings** |
| Hardcoded secrets | **0 findings** |
| Path traversal | **Contained** — file paths are program constants set at translation time, not user input |

The code has a minimal attack surface: no network, no deserialization, no native code. All string operations are bounds-checked by the JVM. Arithmetic uses `BigDecimal`. File I/O is limited to `CobolFile` with paths set at translation time.

## License and attribution

This repository is licensed under the **Apache License, Version 2.0**. See [LICENSE](LICENSE) for the full text. See [NOTICE](NOTICE) for ownership and third-party attribution details.

In summary:

| Component | Owner | License |
|-----------|-------|---------|
| Runtime library | Torsova LLC | Apache 2.0 |
| Generated Java from GnuCOBOL tests | Torsova LLC | Apache 2.0 |
| Validation harness (Docker, scripts) | Torsova LLC | Apache 2.0 |
| COBOL source files (`cobol-source/`) | Free Software Foundation / GnuCOBOL contributors | GPL — reproduced unmodified as input fixtures |
| Golden outputs (`golden-outputs/`) | Captured from GnuCOBOL execution | Factual program output |

## About

Built by [Torsova LLC](https://torsova.com) — legacy code modernization, automated.
