# Earnings - Android Application

A Flutter-based Android application for crypto cloud mining rewards.

> **⚠️ IMPORTANT**: This project was reconstructed from a decompiled APK. The source code is obfuscated and may not compile without modifications.

---

## 📋 Project Information

| Property | Value |
|----------|-------|
| **Package** | `com.ykapps.earnings` |
| **Version** | 1.0.0 (10) |
| **Min SDK** | 21 |
| **Target SDK** | 35 |
| **Compile SDK** | 35 |
| **Framework** | Flutter |

---

## 🚀 Quick Start

### Prerequisites

- **Android Studio** Hedgehog (2023.1.1) or newer
- **JDK** 17 or newer
- **Android SDK** with API 35
- **Flutter SDK** (optional, for Flutter-specific features)

### Setup Steps

1. **Clone/Download** this repository

2. **Configure SDK Location**
   ```bash
   # Copy the template and configure your SDK path
   cp local.properties.template local.properties
   # Edit local.properties with your SDK path
   ```

3. **Configure API Keys** (see [API Keys Configuration](#api-keys-configuration))

4. **Build the Project**
   ```bash
   # Debug build
   ./gradlew assembleDebug
   
   # Release build
   ./gradlew assembleRelease
   ```

5. **Open in Android Studio**
   - File → Open → Select this project directory
   - Wait for Gradle sync to complete

---

## 🔑 API Keys Configuration

### Required Keys

Create a file `secrets.properties` in the root directory with the following:

```properties
# AdMob (Already configured in AndroidManifest.xml)
# Application ID: ca-app-pub-7856478450372186~3504419750

# AppLovin MAX
appLovinSdkKey=YOUR_APPLOVIN_SDK_KEY

# AppsFlyer
appsFlyerDevKey=YOUR_APPSFLYER_DEV_KEY

# Singular
singularAppId=YOUR_SINGULAR_APP_ID
singularAppKey=YOUR_SINGULAR_APP_KEY
```

### Firebase Configuration

The `google-services.json` is already included with the original configuration:
- **Project ID**: `crypto-cloud-mining-cbeff`
- **App ID**: `1:394499510306:android:3f499ef4f4ad6226b77a7b`
- **API Key**: `AIzaSyDTmdRy9WG27spKmpBKEObKzR9h5H6YC1c`

### Huawei AGConnect

If you need Huawei services, download `agconnect-services.json` from:
[Huawei AGConnect Console](https://developer.huawei.com/consumer/en/agconnect/)

---

## 📁 Project Structure

```
Earnings/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/               # Decompiled source code
│   │       ├── assets/             # Flutter assets
│   │       ├── res/                # Android resources
│   │       └── AndroidManifest.xml
│   ├── build.gradle.kts
│   ├── proguard-rules.pro
│   └── google-services.json
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties
├── build.gradle.kts                # Root build configuration
├── settings.gradle.kts             # Project settings
├── gradle.properties               # Gradle properties
├── local.properties.template       # SDK location template
├── CONFIG_KEYS_REFERENCE.md        # All extracted keys reference
└── README.md                       # This file
```

---

## 🔧 Build Variants

### Debug
- Minification: Disabled
- Debuggable: Enabled
- ProGuard: Disabled

### Release
- Minification: Enabled
- ProGuard: Enabled
- Resource shrinking: Enabled

---

## 📦 Dependencies

### Major SDKs
- **Google Play Services** (Ads, Auth, Location, etc.)
- **Firebase** (Analytics, Messaging, Crashlytics, etc.)
- **AppLovin MAX** (Ad mediation)
- **Fyber FairBid** (Ad mediation)
- **DigitalTurbine** (App discovery)
- **AppsFlyer** (Attribution)
- **Singular** (Attribution & deep linking)
- **Huawei HMS Core** (IAP, Base, Ads)

See `app/build.gradle.kts` for complete dependency list.

---

## ⚠️ Known Issues

1. **Obfuscated Code**: Most class names are obfuscated (e.g., `defpackage`, `C1519hI`)
2. **Missing Flutter Source**: Only compiled Flutter assets are available
3. **API Keys**: Some third-party API keys need to be obtained separately
4. **ProGuard Rules**: May need adjustment for your specific build

---

## 🛠️ Development Notes

### Flutter Integration
This is a Flutter application embedded in Android. The main activity is:
```
crypto.bitcoin.ethereum.litecoin.cloud.mining.eth.btc.ltc.hash.pool.cloud_mining.MainActivity
```

### Deep Linking
The app supports deep linking:
- **Scheme**: `cloudmining`
- **Host**: `app`

### Permissions
Key permissions used:
- `INTERNET` - Network access
- `ACCESS_NETWORK_STATE` - Network state
- `POST_NOTIFICATIONS` - Notifications (Android 13+)
- `BILLING` - In-app purchases
- `AD_ID` - Advertising ID

---

## 📄 License

This project is for **educational and research purposes only**.

⚠️ **Disclaimer**: 
- Do not use this code for commercial purposes without proper authorization
- Respect original app copyrights and licenses
- API keys belong to their respective owners

---

## 📞 Support

For issues related to:
- **Build errors**: Check Gradle configuration and SDK versions
- **Runtime errors**: Check API keys and permissions
- **Flutter issues**: Ensure Flutter SDK is properly installed

---

## 📝 Version History

| Version | Code | Date | Notes |
|---------|------|------|-------|
| 1.0.0 | 10 | 2025-07-02 | Decompiled from Earnings_v1.0.0.apk |

---

**Last Updated**: 2026-03-13
