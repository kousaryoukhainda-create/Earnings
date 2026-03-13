# 🔑 SHA-1 Quick Reference

## Current Debug SHA-1 Hash

```
69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1
```

---

## 📋 Quick Registration Steps

1. **Open Firebase Console**
   - https://console.firebase.google.com/project/crypto-cloud-mining-cbeff/settings/general/android:com.ykapps.earnings

2. **Add Fingerprint**
   - Scroll to "SHA certificate fingerprints"
   - Click "Add fingerprint"

3. **Paste SHA-1**
   ```
   69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1
   ```

4. **Save**

---

## 🛠️ Extract SHA-1 Commands

### Linux/Mac
```bash
./get_sha1.sh
```

### Windows
```cmd
get_sha1.bat
```

### Manual (Linux/Mac)
```bash
keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
```

### Manual (Windows)
```cmd
keytool -list -v -keystore "%USERPROFILE%\.android\debug.keystore" -alias androiddebugkey -storepass android -keypass android
```

### Via Gradle
```bash
./gradlew signingReport
```

---

## 📁 Related Files

| File | Purpose |
|------|---------|
| `SHA1_CERTIFICATES.md` | Complete SHA-1 documentation |
| `FIREBASE_SHA1_REGISTRATION_PROCEDURE.md` | Step-by-step Firebase guide |
| `get_sha1.sh` | Linux/Mac extraction script |
| `get_sha1.bat` | Windows extraction script |
| `app/google-services.json` | Firebase configuration |

---

## ✅ Verification

After registration, test with:
```bash
adb logcat | grep -i firebase
```

Expected: `FirebaseApp initialized`

---

**Package**: `com.ykapps.earnings`  
**Project**: `crypto-cloud-mining-cbeff`
