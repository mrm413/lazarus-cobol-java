# Checkpoint: GnuCOBOL Test Suite Regeneration — 2026-03-26

## Status: COMPLETE

## Results
- **Total programs**: 1,320 (1,224 GnuCOBOL + 44 CardDemo + 55 CMS Medicare)
- **Compile rate**: 100.0% (1,320 / 1,320)
- **Empty para_main**: 0 (was 83.7% before fix)

## Fixes Applied

### 1. Format Detection Overhaul
- **Problem**: Single-line check misidentified COBOL source format, causing `*` column-7 comments to leak through as code
- **Fix**: Multi-line voting system scanning 30 lines. Strong signals (col-7 `*`, `/`, `-`) get 3x weight vs weak signals (col-7 space). If only weak fixed signals exist and free-format signals present, returns FREE.

### 2. FILLER Field Handling
- **Problem**: Field collection and emission both skipped FILLER fields entirely
- **Fix**: Removed skip guards. FILLER leaf fields with PIC clauses now emit proper Java declarations with unique `filler_N` names.

### 3. FILLER Counter Drift
- **Problem**: Declaration pass and reference pass produced mismatched `_filler_NNN` names
- **Fix**: Post-processing pass scans for undeclared `_filler_NNN` references and inserts fallback `CobolString` declarations.

### 4. DfsortProgram Conditional Import
- **Problem**: All 1,224 files imported `DfsortProgram` unconditionally, causing compilation failures
- **Fix**: Import now conditional on SORT/MERGE verb usage.

### 5. Expanded CobolIntrinsics Runtime
- **Added**: `sign()`, `exp()`, `exp10()`, `fraction_part()`, `locale_time_from_seconds()`, `module_date()`, `module_formatted_date()`, `module_time()`, `monetary_decimal_point()`, `monetary_thousands_separator()`, `numeric_decimal_point()`, `numeric_thousands_separator()`, `currency_symbol()`
- **Added overloads**: `min(BigDecimal...)`, `min(double...)`, `max(BigDecimal...)`, `max(double...)`, `length(String)`, `length(CobolString)`, `combined_datetime(Object, Object)`, `numval_c(Object, Object)`

### 6. Class Naming
- Filename-based CamelCase for GnuCOBOL (avoids PROGRAM-ID collision — 1,162 of 1,224 share "prog")
- PROGRAM-ID-based for CardDemo and CMS Medicare
- Hyphen splitting: `COMP-4` → `Comp4`, `packed-decimal` → `PackedDecimal`

## Files Modified
- Transpiler engine: format detection rewrite, FILLER handling, filler counter, SORT import
- `CobolIntrinsics.java` — 20+ new methods
- `README.md` — updated counts and changelog
- `verify.sh` — updated count
- `pom.xml` — updated description

## Verification
- Zero `.ts` files in public repo
- Zero external tool references in output
- All 1,320 Java files compile with `javac`
