# Split APK Files - Extraction Analysis

## Files You Mentioned

| File | What Can Be Extracted | Priority |
|------|----------------------|----------|
| `base.digests` | SHA-256 checksums, file list | 🟢 LOW |
| `base.dm` | Module dependencies, SDK requirements | 🟢 LOW |
| `split_config.arm64_v8a.apk` | **Native .so libraries**, ABI-specific resources | 🔴 HIGH |
| `split_config.arm64_v8a_src/` | Build config, ABI filters, Gradle snippets | 🟡 MEDIUM |
| `split_config.xhdpi.apk` | Screen density resources (images, drawables) | 🟢 LOW |
| `split_config.en.apk` | English language resources (strings, layouts) | 🟢 LOW |

---

## 1. base.digests

**What it is:** SHA-256 checksums of APK chunks from Android App Bundle

**Extractable:**
- Integrity verification hashes
- Complete file list of the bundle
- Which splits belong together

**Usefulness:** Verification only - not critical for rebuilding

---

## 2. base.dm (Dependency Manifest)

**What it is:** JSON/XML manifest describing module dependencies

**Extractable:**
- Module dependency graph
- Required vs optional splits
- SDK version requirements
- Feature module configurations

**Usefulness:** Reference for understanding app architecture

---

## 3. split_config.arm64_v8a.apk ⭐ MOST VALUABLE

**What it is:** Split APK containing arm64-v8a native libraries + configuration

**Extractable:**
```
✅ Native libraries (.so files):
   - libflutter.so (you already have)
   - libapp.so (you already have)
   - libprotect.so (possibly missing)
   - libapplovin-native-crash-reporter.so (possibly missing)
   - libd7d563.so (obfuscated SDK library)
   - Any other JNI libraries

✅ ABI-specific resources
✅ Configuration files for arm64-v8a
```

**Extraction Method:**
```bash
unzip split_config.arm64_v8a.apk -d extracted_split/
# Libraries will be in: extracted_split/lib/arm64-v8a/*.so
```

---

## 4. split_config.arm64_v8a_src/

**What it is:** Source directory for split configuration

**Extractable:**
```
✅ Build configuration (how splits were set up)
✅ Resource filters (which resources go to which split)
✅ ABI filters (supported architectures)
✅ Gradle configuration snippets
```

**Usefulness:** Helps replicate build configuration in your project

---

## 5. split_config.xhdpi.apk

**What it is:** Split APK containing screen density-specific resources for **xhdpi** (extra-high DPI) displays

**Extractable:**
```
✅ Drawable resources (drawable-xhdpi/)
   - App icons, images, backgrounds
   - UI element graphics
   
✅ Mipmap resources (mipmap-xhdpi/)
   - Launcher icons at xhdpi density
   
✅ Raw resources for xhdpi screens
```

**Usefulness:** 🟢 LOW - Your project already has `res/` folder with resources. Only useful if you're missing specific images/icons.

---

## 6. split_config.en.apk

**What it is:** Split APK containing **English language** resources

**Extractable:**
```
✅ String resources (values/strings.xml)
✅ Layout files with English text
✅ Menu resources
✅ Plurals and arrays in English
```

**Usefulness:** 🟢 LOW - Your project already has `res/values/` with English strings. Only useful if you need to recover original string resources.

---

## 7. lib/

**What it is:** Likely contains native libraries extracted from the APK

**Extractable:**
```
✅ arm64-v8a/*.so     → 64-bit ARM native libraries
✅ armeabi-v7a/*.so   → 32-bit ARM native libraries
✅ x86/*.so           → Intel x86 libraries
✅ x86_64/*.so        → Intel 64-bit libraries
```

**Usefulness:** 🔴 HIGH - May contain missing .so files like:
- libprotect.so
- libapplovin-native-crash-reporter.so
- libd7d563.so
- Other SDK native libraries

---

## 8. original/

**What it is:** Original extracted APK contents (this appears to be a decompiled/reconstructed APK folder)

**Contents you mentioned:**
```
✅ AndroidManifest.xml    → Decompiled manifest
✅ signature.data         → APK signature information
✅ stamp-cert-sha256      → Certificate SHA-256 hash
✅ META-INF/              → APK metadata and signatures
```

**Extractable:**
```
✅ AndroidManifest.xml
   - Package name: com.ykapps.earnings
   - All activities, services, receivers
   - Permissions
   - Intent filters (deep links)
   - Meta-data (API keys, Firebase config)

✅ META-INF/
   - MANIFEST.MF (file checksums)
   - CERT.SF (signature file)
   - CERT.RSA (certificate)
   - Verifies APK wasn't tampered

✅ signature.data / stamp-cert-sha256
   - Signing certificate info
   - Can verify which key signed the APK
```

**Usefulness:** 🔴 **HIGH** - This is the **most important folder** because:
- `AndroidManifest.xml` tells you the exact MainActivity class name
- May contain `classes.dex` (compiled Java/Dart code)
- Has original app signature info
- Shows all registered components

**What to check:**
```bash
# Look inside original/ folder for:
ls -la original/
# Check for classes.dex, classes2.dex, etc.
# Check META-INF/ contents
```

---

## 9. AndroidManifest.xml (Separate Copy)

**What it is:** Additional copy of the manifest (may be same as in original/)

**Usefulness:** 🟡 MEDIUM - Compare with project's manifest to verify components

---

## 10. META-INF/ (Separate Copy)

**What it is:** APK signature and metadata folder from Android App Bundle (AAB)

**Contents:**
```
✅ BNDLTOOL.RSA    → Signing certificate (RSA key)
✅ BNDLTOOL.SF     → Signature file (signed by bundletool)
✅ MANIFEST.MF     → Checksums of all APK files
```

**Notes:**
- `BNDLTOOL` prefix indicates this APK was built from an **Android App Bundle (AAB)**
- `bundletool` is Google's tool for building/splitting AABs
- This is the standard signing process for Play Store apps

**Usefulness:** 🟢 LOW - Only needed for:
- Verifying APK was signed by Google Play
- Confirming APK integrity
- Not needed for rebuilding app

---

## 11. signature.data

**What it is:** Binary signature data from APK

**Usefulness:** 🟢 LOW - Reference only

---

## 12. stamp-cert-sha256

**What it is:** SHA-256 hash of signing certificate

**Usefulness:** 🟢 LOW - Can verify which key signed the APK

---

## 13. .nomedia

**What it is:** Empty flag file to prevent media scanner from indexing folder

**Usefulness:** ⚫ IGNORE - Not needed for rebuilding app

---

## Summary: Priority Ranking

| Priority | File/Folder | Extractable | Usefulness |
|----------|-------------|-------------|------------|
| 🔴 HIGH | `original/` | **MainActivity**, classes.dex, manifest | **May contain entry point** |
| 🔴 HIGH | `lib/` | Native .so libraries | **Critical for app to run** |
| 🔴 HIGH | `split_config.arm64_v8a.apk` | Native .so libraries | **Critical for app to run** |
| 🟡 MEDIUM | `AndroidManifest.xml` | App manifest | Verify components |
| 🟡 MEDIUM | `split_config.arm64_v8a_src/` | Build config, ABI filters | Helps configure gradle |
| 🟢 LOW | `META-INF/` | BNDLTOOL signatures | AAB verification only |
| 🟢 LOW | `split_config.xhdpi.apk` | Density images/icons | Reference (res/ exists) |
| 🟢 LOW | `split_config.en.apk` | English strings | Reference (values/ exists) |
| 🟢 LOW | `signature.data` | Signature data | Reference only |
| 🟢 LOW | `stamp-cert-sha256` | Certificate hash | Reference only |
| 🟢 LOW | `base.dm` | Dependency info | Reference only |
| 🟢 LOW | `base.digests` | File checksums | Verification only |
| ⚫ IGNORE | `.nomedia` | Media scanner flag | Not needed |

---

## Complete File List

You have these files/folders from the split APK extraction:

```
🔴 original/                      → COMPLETE APK CONTENTS (CHECK FIRST)
   ├── AndroidManifest.xml        → App manifest (MainActivity name here!)
   ├── META-INF/                  → BNDLTOOL signatures (AAB build)
   │   ├── BNDLTOOL.RSA           → Signing certificate
   │   ├── BNDLTOOL.SF            → Signature file
   │   └── MANIFEST.MF            → File checksums
   ├── signature.data             → Signature info
   └── stamp-cert-sha256          → Certificate hash

🔴 lib/                           → Native libraries (CRITICAL)
   └── arm64-v8a/                 → .so files

🔴 split_config.arm64_v8a.apk    → Native libraries (CRITICAL)

🟡 split_config.arm64_v8a_src/   → Build configuration (MEDIUM)

🟢 split_config.xhdpi.apk        → Density images (LOW)
🟢 split_config.en.apk           → English strings (LOW)
🟢 base.dm                       → Dependencies (LOW)
🟢 base.digests                  → Checksums (LOW)
⚫ .nomedia                       → Media scanner flag (IGNORE)
```

---

## Recommended Action Plan

### Step 1: Check `original/` folder contents 🔴 URGENT
```bash
# List all contents
ls -la original/

# Check for classes.dex (this contains the MainActivity!)
ls -la original/*.dex 2>/dev/null || echo "No .dex files found"

# Read AndroidManifest.xml to find MainActivity
grep -i "mainactivity" original/AndroidManifest.xml
```

### Step 2: Check `lib/` folder contents 🔴 URGENT
```bash
# List all native libraries
ls -la lib/
ls -la lib/arm64-v8a/ 2>/dev/null

# Compare with project's jniLibs
# Copy missing .so files to project
```

### Step 3: Extract from `original/AndroidManifest.xml`
```bash
# Find the exact MainActivity class name
grep -A5 "MainActivity" original/AndroidManifest.xml

# Get package name
grep "package=" original/AndroidManifest.xml
```

### Step 4: Compare and Copy
```bash
# Copy missing .so files from lib/arm64-v8a/ to:
# app/src/main/jniLibs/arm64-v8a/

# Update project's AndroidManifest.xml if components are missing
```

### Currently in Project:
```
app/src/main/jniLibs/arm64-v8a/
├── libflutter.so ✓
└── libapp.so ✓
```

### Potentially Missing (can get from split APK):
```
app/src/main/jniLibs/arm64-v8a/
├── libprotect.so ?
├── libapplovin-native-crash-reporter.so ?
├── libdatastore_shared_counter.so ✓ (in build intermediates)
├── libd7d563.so ?
└── Other SDK .so files ?
```

---

## Recommended Action

### Step 1: Extract from split_config.arm64_v8a.apk
```bash
mkdir -p /tmp/split_extract
unzip split_config.arm64_v8a.apk -d /tmp/split_extract/
ls -la /tmp/split_extract/lib/arm64-v8a/
```

### Step 2: Compare with existing .so files
```bash
# List what's in the split APK
# Compare with app/src/main/jniLibs/arm64-v8a/
# Copy missing .so files to project
```

### Step 3: Update project with missing libraries
```bash
# Copy any missing .so files to:
# app/src/main/jniLibs/arm64-v8a/
```

---

## What This Solves

If you provide these files, we can:

1. **Identify missing native libraries** - Compare split APK contents with project
2. **Get libprotect.so** - If it exists, extract it
3. **Get crash reporter libraries** - AppLovin and other SDK native libs
4. **Understand build configuration** - How splits were configured originally
5. **Fix potential runtime crashes** - Missing .so files cause crashes

---

## Next Step

**Please provide the path to these files** so I can:
1. Extract .so libraries from `split_config.arm64_v8a.apk`
2. Compare with your existing libraries
3. Copy missing ones to the project
4. Trigger a new GitHub build

**Where are these files located?**
