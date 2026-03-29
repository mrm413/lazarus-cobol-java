# Lazarus COBOL-to-Java Transpiler — Federal Validation Suite

## What This Is

This Docker image contains **1,416 COBOL programs** transpiled to pure, compilable Java by the Lazarus transpiler engine. Every program compiles against OpenJDK 21 with zero errors.

**281 programs include full behavioral parity proof** — line-by-line output comparison against the GnuCOBOL 3.2 federal test suite reference.

**Source corpus:**
- 1,224 GnuCOBOL test suite programs (711 with Run* prefix from federal test suite)
- 44 AWS CardDemo (enterprise CICS)
- 55 CMS Medicare Pricers (government healthcare)
- 96 additional federal test programs (newly transpiled)

**What's included:**
- `runtime/` — Java runtime library source (the public API that transpiled programs call)
- `generated/` — 1,416 transpiled Java files
- `golden-outputs/` — 281 GnuCOBOL reference outputs for behavioral parity testing
- `cobol-source/` — Original COBOL source files for output comparison
- `test_runner.sh` — Compile validation harness (all 1,416 programs)
- `parity_harness.sh` — Federal parity proof (281 tests, side-by-side output)
- `FIXES_APPLIED.md` — Detailed description of every transpiler fix applied

**What's NOT included:**
- The transpiler engine itself (proprietary)
- The lexer, parser, or emitter source code

## Requirements

- Docker (any version supporting `docker build`)
- ~2 GB disk for the image (OpenJDK 21 + GnuCOBOL 3.2)

## Quick Start

```bash
# Run the federal parity proof (281 tests, side-by-side COBOL vs Java output)
make parity

# Or without make:
docker build -t lazarus-java-validator .
docker run --rm lazarus-java-validator --parity

# Compile-only check (all 1,416 programs, fastest)
make test
```

## Commands

| Command | Description |
|---------|-------------|
| `make build` | Build the Docker image |
| `make parity` | **Federal parity proof** — 281 tests with line-by-line COBOL vs Java comparison |
| `make test` | Compile all 1,416 programs (fastest) |
| `make run` | Compile + run + compare output against GnuCOBOL |
| `make single T=fundamental` | Run a single test by partial name |
| `make report` | Generate `validation-report.txt` with full results |
| `make clean` | Remove Docker image |

## Federal Parity Proof

The parity harness (`make parity`) is the definitive proof that the Lazarus transpiler produces **behaviorally correct** Java. For each of the 281 federal test programs:

1. Compiles the transpiled Java against the Lazarus runtime
2. Runs the Java program and captures stdout
3. Compares output line-by-line against the GnuCOBOL reference (golden output)
4. Shows side-by-side comparison with exact match verification

**Output format:**
```
TEST 003/281  RunExtensions000CallByContentBinaryAndLiteral        [Extensions]
  COBOL (GnuCOBOL reference)            Java (Lazarus transpiler)
  00001234                          00001234                          ✓
  00004660                          00004660                          ✓
  EXACT MATCH -- 2 line(s)    running: 3/3
```

**Category breakdown (all 100%):**

| Category | Tests | Description |
|----------|-------|-------------|
| Accept | 2 | ACCEPT FROM DATE/TIME |
| Extensions | 50 | Vendor extensions, bit ops, ENTRY, CALL BY VALUE |
| File | 34 | Sequential, indexed, relative file I/O |
| Functions | 38 | Intrinsic functions (math, string, date) |
| Fundamental | 59 | MOVE, DISPLAY, IF/EVALUATE, PERFORM, debugging |
| Initialize | 2 | INITIALIZE with REPLACING |
| Misc | 82 | Arithmetic, CALL, SORT, STRING/UNSTRING, recursive programs |
| Ml | 2 | XML/JSON DPC config |
| Refmod | 5 | Reference modification (static + dynamic) |
| Reportwriter | 3 | Report writer declaratives |
| Subscripts | 4 | SEARCH ALL, OCCURS DEPENDING ON |

## Compile-Only Validation

The compile harness (`make test`) validates that every transpiled Java file compiles cleanly:

```
Total programs:    1,416
Passed:            1,416
Failed:            0
Compile rate:      100.0%
```

## Fixes Applied

See `FIXES_APPLIED.md` for a detailed description of every transpiler improvement.

## Contact

Built by Torsova LLC — torsova.com
