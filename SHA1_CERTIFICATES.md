# SHA-1 Certificate Fingerprints for Earnings App

**Package Name**: `com.ykapps.earnings`  
**Generated**: 2026-03-13

---

## 🔑 Debug Keystore SHA-1

```
SHA1: 69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1
```

### Full Debug Certificate Info

```
Alias name: androiddebugkey
SHA1: 69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1
MD5: (run keytool to get MD5)
```

---

## 🔐 Release Keystore SHA-1

**Status**: Not yet generated

To generate a release keystore and get its SHA-1:

```bash
# 1. Generate Release Keystore
keytool -genkey -v -keystore earnings-release.keystore -alias earnings -keyalg RSA -keysize 2048 -validity 10000

# 2. Get SHA-1 from Release Keystore
keytool -list -v -keystore earnings-release.keystore -alias earnings
```

---

## 📋 All Certificate Hashes

| Type | SHA-1 Hash | Status |
|------|------------|--------|
| **Debug** | `69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1` | ✅ Ready |
| **Release** | *(Generate when creating release build)* | ⏳ Pending |

---

## 🔧 How to Get SHA-1 Hashes

### Method 1: Using keytool (Linux/Mac/Windows)

```bash
# Debug Keystore (Linux/Mac)
keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android

# Debug Keystore (Windows)
keytool -list -v -keystore "%USERPROFILE%\.android\debug.keystore" -alias androiddebugkey -storepass android -keypass android

# Release Keystore
keytool -list -v -keystore /path/to/your/keystore.jks -alias your-alias-name
```

### Method 2: Using Gradle (Android Studio)

```bash
# For Debug build
./gradlew signingReport

# For Release build (configure signing first in build.gradle.kts)
./gradlew signingReport
```

### Method 3: Android Studio

1. Open Android Studio
2. Right-click on `app` in Project panel
3. Select **Open Module Settings** (or press F4)
4. Go to **Build Variants**
5. Click **Signing Config** tab
6. View certificate information

---

## 📝 SHA-256 Hash (Also Required for Some Services)

```bash
# Get SHA-256 along with SHA-1
keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android | grep -i "sha256:"
```

---

## ⚠️ Important Notes

1. **Debug vs Release**: Debug and release keystores have DIFFERENT SHA-1 hashes
2. **Register Both**: Register BOTH debug and release SHA-1 in Firebase
3. **Google Play Signing**: If using Google Play App Signing, register the Play Store's SHA-1
4. **Keep Keystore Safe**: Never lose your release keystore - you can't update your app without it

---

## 🔗 Services Requiring SHA-1

| Service | Requires SHA-1? |
|---------|-----------------|
| Firebase Authentication (Phone) | ✅ Yes |
| Firebase Dynamic Links | ✅ Yes |
| Google Sign-In | ✅ Yes |
| Firebase App Check (Play Integrity) | ✅ Yes |
| Google Maps SDK | ✅ Yes |
| AdMob (some features) | ✅ Yes |

---

**Last Updated**: 2026-03-13  
**Debug SHA-1**: `69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1`
