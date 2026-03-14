# Debug APK Crash Fix Guide

## Problem Summary

The debug APK is crashing at startup due to **missing native libraries** and **incomplete source code**.

---

## Root Causes Identified

### 1. **Missing Native Libraries (Critical)**
The original APK (`Earnings_v1.0.0.apk`) does **not contain native libraries**:
- ❌ `libflutter.so` (Flutter engine)
- ❌ `libapp.so` (Compiled Dart code)
- ❌ ABI-specific libraries (`armeabi-v7a`, `arm64-v8a`, etc.)

**Evidence:**
```bash
unzip -l Earnings_v1.0.0.apk | grep "\.so"
# Returns: (empty)
```

This indicates the APK was either:
- Built as an **Android App Bundle (AAB)** with split native libraries
- Extracted from a **split APK** configuration
- **Stripped** of native libraries during decompilation

### 2. **Missing Decompiled Java Sources**
The project documentation claims 13,692 Java files, but the `app/src/main/java/` directory is **empty** (except for the MainActivity stub).

**Required:** The decompiled Java sources need to be extracted and copied to `app/src/main/java/`.

### 3. **Flutter Engine Not Initialized**
The MainActivity class needs to extend `FlutterActivity` to properly initialize the Flutter engine.

---

## Solution Steps

### Step 1: ✅ Configure Android SDK (COMPLETED)

Created `local.properties`:
```properties
sdk.dir=/usr/lib/android-sdk
```

### Step 2: ✅ Create MainActivity Stub (COMPLETED)

Created: `app/src/main/java/crypto/bitcoin/ethereum/litecoin/cloud/mining/eth/btc/ltc/hash/pool/cloud_mining/MainActivity.java`

```java
package crypto.bitcoin.ethereum.litecoin.cloud.mining.eth.btc.ltc.hash.pool.cloud_mining;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {
}
```

### Step 3: ⚠️ Extract Native Libraries (REQUIRED)

You need to obtain the native libraries from one of these sources:

#### Option A: Extract from Original APK (if available)
If you have the **full APK** or **AAB** with native libraries:

```bash
# If you have the AAB file
unzip -l your-app.aab
# Extract base.apk and split APKs

# If you have a complete APK with libs
unzip complete-apk.apk "lib/**"
# Copy lib/ directory to app/src/main/jniLibs/
```

#### Option B: Download Flutter Prebuilt Libraries
Add Flutter engine libraries manually:

1. Download Flutter engine for your target ABI:
   - https://github.com/flutter/engine/releases
   
2. Extract and copy to:
   ```
   app/src/main/jniLibs/
   ├── arm64-v8a/
   │   ├── libflutter.so
   │   └── libapp.so
   ├── armeabi-v7a/
   │   ├── libflutter.so
   │   └── libapp.so
   ├── x86/
   │   └── ...
   └── x86_64/
       └── ...
   ```

#### Option C: Rebuild from Flutter Source (Recommended)
If you have access to the **original Flutter source code**:

```bash
cd flutter_project
flutter build apk --debug
# or
flutter build appbundle
```

### Step 4: ⚠️ Extract Decompiled Java Sources (REQUIRED)

Use a decompiler to extract Java sources from the APK:

```bash
# Using JADX (recommended)
jadx -d app/src/main/java Earnings_v1.0.0.apk

# Or using APKTool
apktool d Earnings_v1.0.0.apk -o decompiled_output
```

**Note:** The decompiled code will be obfuscated and may require manual fixes.

### Step 5: ⚠️ Configure API Keys (REQUIRED)

Update `secrets.properties` with actual API keys:

```properties
# AppLovin MAX
appLovinSdkKey=YOUR_ACTUAL_KEY

# AppsFlyer
appsFlyerDevKey=YOUR_ACTUAL_KEY

# Singular
singularAppId=YOUR_ACTUAL_ID
singularAppKey=YOUR_ACTUAL_KEY
```

### Step 6: Build Debug APK

```bash
cd /storage/internal_new/project/Earnings
./gradlew clean assembleDebug
```

The APK will be generated at:
```
app/build/outputs/apk/debug/app-debug.apk
```

---

## Verification Steps

After building, verify the APK contains native libraries:

```bash
unzip -l app/build/outputs/apk/debug/app-debug.apk | grep "\.so"
```

Expected output:
```
lib/arm64-v8a/libflutter.so
lib/arm64-v8a/libapp.so
lib/armeabi-v7a/libflutter.so
lib/armeabi-v7a/libapp.so
...
```

---

## Install and Test

```bash
# Install on device/emulator
adb install -r app/build/outputs/apk/debug/app-debug.apk

# Run and capture logs
adb logcat | grep -i "com.ykapps.earnings"
```

---

## Common Crash Causes & Fixes

### Crash: `java.lang.UnsatisfiedLinkError`
**Cause:** Missing native libraries  
**Fix:** Add `libflutter.so` and `libapp.so` to `jniLibs/`

### Crash: `java.lang.ClassNotFoundException`
**Cause:** MainActivity not found  
**Fix:** Ensure MainActivity.java exists in correct package

### Crash: `java.lang.RuntimeException: Unable to start activity`
**Cause:** Flutter engine not initialized  
**Fix:** MainActivity must extend `FlutterActivity`

### Crash: `FirebaseApp initialization failure`
**Cause:** Missing google-services.json  
**Fix:** Ensure `app/google-services.json` exists

---

## Alternative: Use Original APK

If rebuilding is not possible, you can:

1. **Use the original APK directly** (if it works)
2. **Extract and repackage** with proper signatures:
   ```bash
   # Sign the APK
   apksigner sign --ks your-keystore.jks --out signed.apk original.apk
   ```

---

## Next Steps

1. **Obtain native libraries** from original Flutter build or AAB
2. **Extract Java sources** using JADX or similar tool
3. **Configure API keys** in `secrets.properties`
4. **Build and test** the debug APK
5. **Capture crash logs** using `adb logcat`

---

## Contact Information

For further assistance, provide:
- Full crash log from `adb logcat`
- Build output from Gradle
- List of missing native libraries

---

**Last Updated:** 2026-03-14  
**Status:** Partial Fix Applied (SDK configured, MainActivity created)  
**Remaining:** Native libraries and Java sources needed
