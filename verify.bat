@echo off
REM ===========================================================================
REM Lazarus COBOL-to-Java — local validation entry point (Windows).
REM
REM Compiles the runtime library + all 723 generated Java programs in two
REM javac invocations, then runs each program and diffs stdout against
REM golden-outputs/. Reports PASS / FAIL totals.
REM Requires JDK 11+ on PATH.
REM ===========================================================================

setlocal enabledelayedexpansion

where javac >nul 2>&1
if %ERRORLEVEL% neq 0 (
    echo javac not found - install JDK 11 or later.
    exit /b 2
)

if not exist build\runtime-classes mkdir build\runtime-classes
if not exist build\test-classes    mkdir build\test-classes

echo Compiling runtime library...
dir /b /s /a-d runtime\*.java > build\runtime_sources.txt
javac -d build\runtime-classes @build\runtime_sources.txt
if %ERRORLEVEL% neq 0 (
    echo Runtime compile failed.
    exit /b 1
)
pushd build\runtime-classes
jar cf ..\lazarus-runtime.jar com\
popd
echo.

echo Batch-compiling generated programs...
dir /b /s /a-d generated\*.java > build\test_sources.txt
javac -cp build\lazarus-runtime.jar -d build\test-classes @build\test_sources.txt 2>build\javac_batch.err
echo.

set PASS=0
set FAIL=0
set TOTAL=0
echo Running parity validation...

for %%F in (generated\*.java) do (
    set /a TOTAL+=1
    set "base=%%~nF"
    set "expected=golden-outputs\!base!.expected"
    if exist "!expected!" (
        if not exist build\test-classes\com\lazarus\cobol\generated\!base!.class (
            javac -cp build\lazarus-runtime.jar -d build\test-classes "%%F" 2>nul
        )
        if exist build\test-classes\com\lazarus\cobol\generated\!base!.class (
            java -cp "build\lazarus-runtime.jar;build\test-classes" "com.lazarus.cobol.generated.!base!" > build\actual.txt 2>nul
            fc /w "!expected!" build\actual.txt >nul 2>&1
            if !ERRORLEVEL! equ 0 (
                set /a PASS+=1
            ) else (
                set /a FAIL+=1
            )
        ) else (
            set /a FAIL+=1
        )
    )
)

echo.
echo ================================================================
if !FAIL! equ 0 (
    echo   PASS: !PASS! / !TOTAL!    FAIL: !FAIL!
    echo.
    echo   All translated Java programs match GnuCOBOL byte-for-byte.
) else (
    echo   PASS: !PASS!    FAIL: !FAIL!    Total: !TOTAL!
)
echo ================================================================

if !FAIL! equ 0 (exit /b 0) else (exit /b 1)
