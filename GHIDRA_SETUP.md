# libcrypto.so Fix Applied ✓

## Problem
Network tools (curl, wget, python3) were failing with:
```
undefined symbol: __sF
```

## Root Cause
The IDE's libcrypto symlink was pointing to a broken path inside an APK:
```
/data/user/0/com.m4coding.ide/files/support/libcrypto.so.1.1
  -> /data/app/~~gb_B3_jpOuRy40rZ_SDE4w==/com.m4coding.ide-3s-VYaVgEYRlJcM6a4oSMw==/lib/arm64/lib_libcrypto.so.1.1.so
```

## Solution Applied
Fixed the symlink to point to the system library:
```bash
rm /data/user/0/com.m4coding.ide/files/support/libcrypto.so.1.1
ln -s /usr/lib/aarch64-linux-gnu/libcrypto.so.1.1 /data/user/0/com.m4coding.ide/files/support/libcrypto.so.1.1
```

## Verification
```
✓ curl 7.58.0 - Working
✓ wget 1.19.4 - Working  
✓ python3 3.6.9 - Working
```

---

# Ghidra Installation Guide

## Option A: Manual Download (Recommended for slow connections)

### 1. Download Ghidra
On a PC or using a browser, download:
```
https://github.com/NationalSecurityAgency/ghidra/releases/download/Ghidra_11.3.1_build/ghidra_11.3.1_PUBLIC_20250219.zip
```

**File size**: ~425 MB

### 2. Transfer to device
```bash
# Copy the downloaded zip to your device
# Then extract:
unzip ghidra_11.3.1_PUBLIC_20250219.zip -d /opt/
```

### 3. Run Ghidra
```bash
cd /opt/ghidra_11.3.1_PUBLIC
./ghidraRun
```

---

## Option B: Command Line Download (Slow connection)

```bash
# Start download in background (will take ~2 hours on current connection)
cd /tmp
curl -L -o ghidra.zip "https://github.com/NationalSecurityAgency/ghidra/releases/download/Ghidra_11.3.1_build/ghidra_11.3.1_PUBLIC_20250219.zip" &

# Monitor progress
watch -n 10 'ls -lh /tmp/ghidra.zip'

# Once complete, extract
unzip /tmp/ghidra.zip -d /opt/
cd /opt/ghidra_11.3.1_PUBLIC
./ghidraRun
```

---

## Option C: Use Radare2 (CLI Alternative)

Radare2 is already installed. Quick analysis:

```bash
# Open libapp.so
r2 /storage/internal_new/project/Earnings/app/src/main/jniLibs/arm64-v8a/libapp.so

# Inside r2:
aaa              # Analyze all (wait for completion)
iz               # List all strings
iz~login         # Search for "login" in strings
is               # List symbols
afl              # List functions
pdf @ 0xADDRESS  # Disassemble function at address
```

---

## Ghidra Analysis Steps (Once Installed)

### 1. Create Project
1. Launch Ghidra: `./ghidraRun`
2. **File → New Project** → Non-Shared Project
3. Name: `CloudMineCrypto_Analysis`

### 2. Import libapp.so
1. **File → Import File**
2. Select: `/storage/internal_new/project/Earnings/app/src/main/jniLibs/arm64-v8a/libapp.so`
3. Format: **ELF** (auto-detected)
4. Language: **ARM → AARCH64 → Little Endian**
5. Click **OK**

### 3. Analyze
1. Double-click imported file
2. Click **Analyze** button (or Analysis → Auto Analyze)
3. Keep default options, click **Analyze**
4. Wait 5-15 minutes for 9.6MB file

### 4. Navigate Code
- **Symbol Tree** (left panel): Browse functions
- **Decompiler** (right panel): View pseudo-C code
- **Search → For Strings** (Ctrl+Shift+F): Find API endpoints

### 5. Search Patterns
```
/api/login
FirebaseAuth
SharedPreferences
token
credential
```

---

## Alternative: Online Analysis Tools

If Ghidra installation is not feasible:

1. **Ghidra Online**: https://ghidra-sre.org/
2. **Binary Ninja Cloud**: https://binary.ninja/cloud/
3. **IDA Free**: https://hex-rays.com/ida-free/

---

## Current Analysis Status

| Tool | Status |
|------|--------|
| libcrypto fix | ✓ Complete |
| String extraction | ✓ Complete (49,956 strings) |
| API endpoint discovery | ✓ Complete (42 endpoints) |
| Radare2 | ✓ Installed |
| Ghidra | ⏳ Download pending (425MB) |

---

## Files Available

```
/storage/internal_new/project/Earnings/
├── LIBAPP_ANALYSIS.md              # Initial analysis
├── LIBAPP_ANALYSIS_COMPLETE.md     # Full report
├── libapp_analysis/
│   ├── all_strings.txt             # All strings
│   ├── api_endpoints.txt           # 42 API endpoints
│   ├── auth_strings.txt            # Auth-related strings
│   ├── firebase_strings.txt        # Firebase integration
│   ├── potential_secrets.txt       # Potential keys/secrets
│   └── urls.txt                    # External URLs
└── analyze_libapp.sh               # Re-run analysis script
```

---

## Quick Search Commands

```bash
# Search for specific terms
grep -i "search_term" libapp_analysis/all_strings.txt

# Find API calls
grep "/api/" libapp_analysis/api_endpoints.txt

# Find auth flow
grep -E "login|register|token" libapp_analysis/auth_strings.txt

# Check for hardcoded secrets
cat libapp_analysis/potential_secrets.txt
```

---

**Next Steps**: 
1. Download Ghidra manually (Option A) for best experience
2. Or use Radare2 CLI for basic analysis
3. Review extracted strings in `libapp_analysis/` folder
