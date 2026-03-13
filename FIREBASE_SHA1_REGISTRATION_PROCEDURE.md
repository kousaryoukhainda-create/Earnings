# Firebase SHA-1 Registration Procedure

**Package**: `com.ykapps.earnings`  
**Firebase Project**: `crypto-cloud-mining-cbeff`

---

## 📋 Prerequisites

Before starting, ensure you have:

- ✅ Access to [Firebase Console](https://console.firebase.google.com/)
- ✅ SHA-1 hash from `SHA1_CERTIFICATES.md`
- ✅ Google account with Firebase project access

---

## 🚀 Step-by-Step Registration

### Step 1: Open Firebase Console

1. Go to [https://console.firebase.google.com/](https://console.firebase.google.com/)
2. Sign in with your Google account
3. Select project: **crypto-cloud-mining-cbeff**

```
┌─────────────────────────────────────────────────────────┐
│  Firebase Console                                       │
│  ┌──────────────────────────────────────────────────┐   │
│  │  Project: crypto-cloud-mining-cbeff              │   │
│  │                                                   │   │
│  │  [Analytics] [Crashlytics] [Performance] ...     │   │
│  └──────────────────────────────────────────────────┘   │
│                                                         │
│  ⚙️ Settings (gear icon) → Project settings             │
└─────────────────────────────────────────────────────────┘
```

---

### Step 2: Navigate to Project Settings

1. Click the **⚙️ Settings** icon (top-left, next to Project Overview)
2. Select **Project settings** from dropdown

```
┌─────────────────────────────────────────────────────────┐
│  ⚙️ Settings ▼                                          │
│     └─→ Project settings  ← CLICK HERE                  │
│     └─→ Usage and billing                               │
│     └─→ Permissions                                     │
│     └─→ Integrations                                   │
└─────────────────────────────────────────────────────────┘
```

---

### Step 3: Find Your Android App

1. Scroll down to **Your apps** section
2. Look for the Android app with package name: `com.ykapps.earnings`

```
┌─────────────────────────────────────────────────────────┐
│  Your apps                                              │
│  ┌─────────────────────────────────────────────────┐    │
│  │  📱 com.ykapps.earnings                         │    │
│  │     Earnings App                                │    │
│  │     App ID: 1:394499510306:android:3f499ef4...  │    │
│  │     [App settings]                              │    │
│  └─────────────────────────────────────────────────┘    │
└─────────────────────────────────────────────────────────┘
```

**If app is NOT listed:**
- Click **Add app** → **Android** icon
- Enter package name: `com.ykapps.earnings`
- Follow setup wizard
- Download new `google-services.json`

---

### Step 4: Open App Settings

1. Click on the app card for `com.ykapps.earnings`
2. OR click **[App settings]** button

```
┌─────────────────────────────────────────────────────────┐
│  App settings for com.ykapps.earnings                   │
│                                                         │
│  App name: Earnings                                     │
│  Package name: com.ykapps.earnings                      │
│  App ID: 1:394499510306:android:3f499ef4f4ad6226b77a7b │
│                                                         │
│  📥 Download google-services.json                       │
│                                                         │
│  ───────────────────────────────────────────────────    │
│  SHA certificate fingerprints                           │
│  ───────────────────────────────────────────────────    │
└─────────────────────────────────────────────────────────┘
```

---

### Step 5: Add SHA-1 Certificate

1. Scroll to **SHA certificate fingerprints** section
2. Click **Add fingerprint** button

```
┌─────────────────────────────────────────────────────────┐
│  SHA certificate fingerprints                           │
│                                                         │
│  Current fingerprints:                                  │
│  (none)  ← or existing hashes                           │
│                                                         │
│  [+ Add fingerprint]  ← CLICK HERE                      │
└─────────────────────────────────────────────────────────┘
```

---

### Step 6: Enter SHA-1 Hash

1. A dialog box will appear
2. Copy the SHA-1 hash from `SHA1_CERTIFICATES.md`:

```
Debug SHA-1: 69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1
```

3. Paste into the input field
4. Click **Save** or **Add**

```
┌─────────────────────────────────────────────────────────┐
│  Add SHA certificate fingerprint                        │
│                                                         │
│  SHA-1: [69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7... ] │
│                                                         │
│         [Cancel]  [Save]  ← CLICK SAVE                  │
└─────────────────────────────────────────────────────────┘
```

---

### Step 7: Verify Registration

After saving, you should see:

```
┌─────────────────────────────────────────────────────────┐
│  SHA certificate fingerprints                           │
│                                                         │
│  ✓ 69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1
│                                                         │
│  [+ Add fingerprint]                                    │
└─────────────────────────────────────────────────────────┘
```

---

## 🔐 Register Multiple SHA-1 Hashes

For production, register **ALL** of these:

| Type | When to Register | SHA-1 |
|------|------------------|-------|
| **Debug** | Now (development) | `69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1` |
| **Release** | Before release | Generate from release keystore |
| **Play Store** | After Play Store setup | Get from Play Console |

### How to Add Multiple:

1. Click **Add fingerprint** again
2. Enter next SHA-1 hash
3. Repeat for all hashes

---

## 🧪 Verify Firebase Connection

After registering SHA-1, test the connection:

### Method 1: Check Logcat

```bash
# Run app and filter Firebase logs
adb logcat | grep -i firebase
```

**Expected output:**
```
D/FirebaseApp: Default FirebaseApp initialized
I/FirebaseInitProvider: FirebaseInitProvider initialized
```

### Method 2: Test Phone Auth (if using)

1. Build and run app on device
2. Try phone authentication
3. Should receive SMS without errors

### Method 3: Firebase Console

1. Go to **Authentication** → **Users**
2. Sign in from app
3. User should appear in console

---

## ⚠️ Troubleshooting

### Error: "SHA-1 certificate is already registered"

**Solution**: The hash is already added. No action needed.

---

### Error: "Invalid SHA-1 format"

**Solution**: Ensure format is correct:
```
✓ Correct: 69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1
✗ Wrong:   69BCB91965F59FA2999583492DE7C2278F3C09A1 (no colons)
✗ Wrong:   69-BC-B9-19-65-F5-9F-A2-99-95-83-49-2D-E7-C2-27-8F-3C-09-A1 (hyphens)
```

---

### Error: "App not found in Firebase project"

**Solution**: 
1. Verify package name matches exactly: `com.ykapps.earnings`
2. Check `google-services.json` has correct package name
3. Re-download `google-services.json` from Firebase

---

### Error: "Firebase Authentication failed"

**Solution**:
1. Verify SHA-1 is registered
2. Wait 2-5 minutes for propagation
3. Clear app data and retry
4. Check Firebase Authentication is enabled

---

## 📊 Registration Checklist

- [ ] Open Firebase Console
- [ ] Select project: `crypto-cloud-mining-cbeff`
- [ ] Navigate to Project Settings
- [ ] Find app: `com.ykapps.earnings`
- [ ] Click Add fingerprint
- [ ] Enter Debug SHA-1: `69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1`
- [ ] Save fingerprint
- [ ] Verify in console
- [ ] (Later) Add Release SHA-1
- [ ] (Later) Add Play Store SHA-1
- [ ] Test app connection

---

## 🔗 Quick Links

| Resource | URL |
|----------|-----|
| Firebase Console | https://console.firebase.google.com/ |
| Firebase Project | https://console.firebase.google.com/project/crypto-cloud-mining-cbeff |
| SHA-1 Certificates | `SHA1_CERTIFICATES.md` (in project root) |
| google-services.json | `app/google-services.json` |

---

## 📞 Support

If you encounter issues:

1. Check [Firebase Documentation](https://firebase.google.com/docs/android/setup)
2. Review error logs in Logcat
3. Verify all configuration files match
4. Wait 5-10 minutes after SHA-1 registration

---

**Document Created**: 2026-03-13  
**Debug SHA-1**: `69:BC:B9:19:65:F5:9F:A2:99:95:83:49:2D:E7:C2:27:8F:3C:09:A1`  
**Firebase Project**: `crypto-cloud-mining-cbeff`
