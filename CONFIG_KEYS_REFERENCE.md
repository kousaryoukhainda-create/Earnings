# Configuration Keys Reference

**⚠️ SECURITY WARNING: Keep this file secure! Do not commit to public repositories!**

This document contains all API keys, IDs, and configuration values extracted from the original APK for future reference.

---

## Firebase Configuration

```json
{
  "project_info": {
    "project_number": "394499510306",
    "project_id": "crypto-cloud-mining-cbeff",
    "storage_bucket": "crypto-cloud-mining-cbeff.firebasestorage.app"
  },
  "client": {
    "client_info": {
      "mobilesdk_app_id": "1:394499510306:android:3f499ef4f4ad6226b77a7b",
      "android_client_info": {
        "package_name": "com.ykapps.earnings"
      }
    },
    "api_key": [
      {
        "current_key": "AIzaSyDTmdRy9WG27spKmpBKEObKzR9h5H6YC1c"
      }
    ]
  }
}
```

### Firebase Values
| Key | Value |
|-----|-------|
| `gcm_defaultSenderId` | `394499510306` |
| `google_app_id` | `1:394499510306:android:3f499ef4f4ad6226b77a7b` |
| `google_api_key` | `AIzaSyDTmdRy9WG27spKmpBKEObKzR9h5H6YC1c` |
| `google_crash_reporting_api_key` | `AIzaSyDTmdRy9WG27spKmpBKEObKzR9h5H6YC1c` |
| `google_storage_bucket` | `crypto-cloud-mining-cbeff.firebasestorage.app` |
| `project_id` | `crypto-cloud-mining-cbeff` |

---

## Google AdMob Configuration

| Key | Value |
|-----|-------|
| `APPLICATION_ID` | `ca-app-pub-7856478450372186~3504419750` |

---

## App Information

| Property | Value |
|----------|-------|
| **Package Name** | `com.ykapps.earnings` |
| **App Name** | `Earnings` |
| **Version Name** | `1.0.0` |
| **Version Code** | `10` |
| **Min SDK** | `21` |
| **Target SDK** | `35` |
| **Compile SDK** | `35` |

---

## Main Activity

```
crypto.bitcoin.ethereum.litecoin.cloud.mining.eth.btc.ltc.hash.pool.cloud_mining.MainActivity
```

### Deep Link
- **Scheme**: `cloudmining`
- **Host**: `app`

---

## Third-Party SDKs Detected

### Analytics & Attribution
- **Singular** (v12.9.1)
- **AppsFlyer**
- **Firebase Analytics**
- **Google Tag Manager**

### Ad Networks
- **Google AdMob**
- **AppLovin (MAX)**
- **Fyber (FairBid)**
- **DigitalTurbine**
- **Huawei Ads**

### Firebase Services
- Firebase Analytics
- Firebase Messaging (FCM)
- Firebase Auth
- Firebase Crashlytics
- Firebase Performance
- Firebase Remote Config
- Firebase Dynamic Links
- Firebase App Check

### Other Services
- **Google Play Billing** (v7.1.1)
- **Huawei HMS Core** (IAP, Base)
- **Google Integrity API**
- **reCAPTCHA**
- **Adjoe SDK** (Playtime)

---

## Huawei GRS Configuration

```json
{
  "grs_base_url": [
    "https://grs.dbankcloud.com",
    "https://grs.dbankcloud.cn",
    "https://grs.dbankcloud.asia",
    "https://grs.platform.dbankcloud.ru",
    "https://grs.dbankcloud.eu"
  ],
  "grs_query_endpoint_1.0": "/grs/1.0/%1$s/router",
  "grs_query_endpoint_2.0": "/grs/2.0/router",
  "grs_query_timeout": 2
}
```

---

## Flutter Assets

This is a **Flutter application** with the following assets:
- Custom fonts: Exo2, Montserrat, OpenSans, CustomIcons
- Crypto-related images and icons
- Country flags (all countries)
- Mining contract configurations

---

## Permissions Used

```xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
<uses-permission android:name="com.ykapps.earnings_com.google.android.gms.permission.AD_ID"/>
<uses-permission android:name="android.permission.WAKE_LOCK"/>
<uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED"/>
<uses-permission android:name="android.permission.PACKAGE_USAGE_STATS"/>
<uses-permission android:name="android.permission.POST_NOTIFICATIONS"/>
<uses-permission android:name="android.permission.VIBRATE"/>
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
<uses-permission android:name="android.permission.ACCESS_ADSERVICES_AD_ID"/>
<uses-permission android:name="android.permission.ACCESS_ADSERVICES_ATTRIBUTION"/>
<uses-permission android:name="android.permission.ACCESS_ADSERVICES_TOPICS"/>
<uses-permission android:name="android.permission.FOREGROUND_SERVICE"/>
<uses-permission android:name="com.android.vending.BILLING"/>
```

---

## Network Security

- **Cleartext Traffic**: Allowed (for development/testing)
- **Domains**: 127.0.0.1 (localhost allowed)

---

## Content Providers

| Authority | Purpose |
|-----------|---------|
| `com.ykapps.earnings.flutter.share_provider` | Flutter Share Plus |
| `com.ykapps.earnings.firebaseinitprovider` | Firebase Init |
| `com.ykapps.earnings.AGCInitializeProvider` | AGConnect Initialize |
| `com.ykapps.earnings.applovininitprovider` | AppLovin Init |
| `com.ykapps.earnings.mobileadsinitprovider` | Google Mobile Ads Init |

---

## Generated Files Needed

1. `app/google-services.json` - Firebase configuration
2. `app/agconnect-services.json` - Huawei AGConnect (if needed)
3. Local API keys for:
   - AppsFlyer
   - Singular
   - AdMob Ad Unit IDs (Interstitial, Banner, Rewarded, Native)
   - AppLovin SDK Key
   - Fyber App ID

---

**Last Updated**: 2026-03-13
**Source**: Earnings_v1.0.0.apk
