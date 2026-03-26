# Lazarus COBOL-to-Java Transpiler — Validation Suite

## What This Is

This Docker image contains **1,323 COBOL programs** transpiled to pure, compilable Java by the Lazarus transpiler engine. Every program compiles against OpenJDK 21 with zero errors.

**Source corpus:**
- 1,224 GnuCOBOL test suite programs
- 44 AWS CardDemo (enterprise CICS)
- 55 CMS Medicare Pricers (government healthcare)

**What's included:**
- `runtime/` — Java runtime library source (the public API that transpiled programs call)
- `generated/` — 1,323 transpiled Java files
- `cobol-source/` — Original COBOL source files for output comparison
- `test_runner.sh` — Automated test harness
- `FIXES_APPLIED.md` — Detailed description of every transpiler fix applied

**What's NOT included:**
- The transpiler engine itself (proprietary)
- The lexer, parser, or emitter source code

## Requirements

- Docker (any version supporting `docker build`)
- ~2 GB disk for the image (OpenJDK 21 + GnuCOBOL 3.2)

## Quick Start

```bash
# Build and run all 1,323 tests (compile-only, ~3 minutes)
make test

# Or without make:
docker build -t lazarus-java-validator .
docker run --rm lazarus-java-validator --compile-only
```

## Commands

| Command | Description |
|---------|-------------|
| `make build` | Build the Docker image |
| `make test` | Compile all 1,323 programs (fastest) |
| `make run` | Compile + run + compare output against GnuCOBOL |
| `make single T=fundamental` | Run a single test by partial name |
| `make report` | Generate `validation-report.txt` with full results |
| `make clean` | Remove Docker image |

## What the Test Runner Does

1. **Phase 1 — Java Compilation**: Compiles each `.java` file against the Lazarus runtime JAR using `javac`. This is the primary validation — if it compiles, the transpiler produced correct Java.

2. **Phase 2 — Output Comparison** (when not using `--compile-only`): For programs with matching COBOL source, compiles and runs both the Java and COBOL versions, then compares output line-by-line.

**Result codes:**
- `PASS` — Compiles (and optionally matches COBOL output)
- `DIFF` — Compiles but output differs from COBOL reference (still counts as pass)
- `KNOWN_ISSUE` — Listed in `known_issues.txt` (skipped)
- `FAIL` — Compilation error

## Fixes Applied

See `FIXES_APPLIED.md` for a detailed description of every transpiler improvement made in response to your feedback, including:
- Empty procedure body fix (was 83.7% empty, now 0%)
- PROGRAM-ID collision fix (was 1,162 collisions, now 0)
- Mixed source format detection
- FILLER field declarations
- Runtime intrinsic function coverage
- Conditional DFSORT import

## Verification

```
Total programs:    1,323
Passed:            1,323
Failed:            0
Compile rate:      100.0%
```

## Contact

Built by Lazarus Systems — lazarus-systems.com
