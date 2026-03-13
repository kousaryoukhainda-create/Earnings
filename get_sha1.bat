@echo off
REM SHA-1 Hash Extraction Script for Earnings App (Windows)
REM Usage: get_sha1.bat

echo ========================================
echo   SHA-1 Certificate Hash Extractor
echo   Package: com.ykapps.earnings
echo ========================================
echo.

REM Debug Keystore
echo [DEBUG KEYSTORE]
echo ----------------------------------------

set DEBUG_KEYSTORE=%USERPROFILE%\.android\debug.keystore

if exist "%DEBUG_KEYSTORE%" (
    echo Extracting SHA-1 from: %DEBUG_KEYSTORE%
    echo.
    
    for /f "tokens=2" %%i in ('keytool -list -v -keystore "%DEBUG_KEYSTORE%" -alias androiddebugkey -storepass android -keypass android 2^>nul ^| findstr /i "SHA1:"') do set DEBUG_SHA1=%%i
    
    echo SHA1: %DEBUG_SHA1%
    echo.
    echo Copy this to Firebase Console:
    echo   https://console.firebase.google.com/project/crypto-cloud-mining-cbeff/settings/general/android:com.ykapps.earnings
) else (
    echo Debug keystore not found at: %DEBUG_KEYSTORE%
    echo Run Android Studio to generate it first.
)

echo.
echo ========================================
echo.

REM Release Keystore
echo [RELEASE KEYSTORE]
echo ----------------------------------------

if exist "earnings-release.keystore" (
    echo Found: earnings-release.keystore
    echo.
    echo Enter keystore password:
    set /p KEYSTORE_PASS=
    echo.
    echo Enter alias name:
    set /p ALIAS_NAME=
    echo.
    
    for /f "tokens=2" %%i in ('keytool -list -v -keystore earnings-release.keystore -alias %ALIAS_NAME% -storepass %KEYSTORE_PASS% 2^>nul ^| findstr /i "SHA1:"') do set RELEASE_SHA1=%%i
    
    echo SHA1: %RELEASE_SHA1%
) else (
    echo No release keystore found in project directory
    echo.
    echo To create a release keystore, run:
    echo   keytool -genkey -v -keystore earnings-release.keystore -alias earnings -keyalg RSA -keysize 2048 -validity 10000
)

echo.
echo ========================================
echo.
echo Done!
echo.
echo Next steps:
echo   1. Copy SHA-1 hash^(es^) above
echo   2. Open Firebase Console
echo   3. Go to Project Settings -^> Your apps -^> com.ykapps.earnings
echo   4. Click 'Add fingerprint'
echo   5. Paste SHA-1 and save
echo.
echo For detailed instructions, see:
echo   FIREBASE_SHA1_REGISTRATION_PROCEDURE.md
echo.
pause
