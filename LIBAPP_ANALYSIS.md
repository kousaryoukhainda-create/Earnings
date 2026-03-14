# libapp.so Analysis Report

**File**: `app/src/main/jniLibs/arm64-v8a/libapp.so`  
**Size**: 9.6 MB  
**Architecture**: ARM64 (AArch64)  
**Type**: ELF 64-bit shared object (Flutter AOT compiled Dart code)

---

## API Endpoints Discovered

### Authentication
| Endpoint | Method | Purpose |
|----------|--------|---------|
| `/api/login` | POST | User login |
| `/api/email-login` | POST | Email-based login |
| `/api/email-login-confirm` | POST | Confirm email login |
| `/api/register` | POST | User registration |
| `/api/profile/logout` | POST | Logout |
| `/api/profile/tokens` | GET | Get auth tokens |

### Profile/User Data
| Endpoint | Purpose |
|----------|---------|
| `/api/profile` | Get user profile |
| `/api/profile/client/update` | Update client info |
| `/api/profile/delete` | Delete account |
| `/api/profile/email/update` | Update email |
| `/api/profile/email/verify` | Verify email |
| `/api/profile/wallet/withdrawals/direct` | Direct withdrawal |
| `/api/profile/wallet/withdrawals/request` | Request withdrawal |

### Mining/Earnings
| Endpoint | Purpose |
|----------|---------|
| `/api/mining-contracts` | Get mining contracts |
| `/api/profile/free-mining-contract` | Free contract |
| `/api/profile/rewarded-mining-contract` | Rewarded contract |

### Other
| Endpoint | Purpose |
|----------|---------|
| `/api/assets/` | Get assets |
| `/api/is-online` | Connectivity check |
| `/api/onboarding-v3-data` | Onboarding data |
| `/api/settings` | App settings |
| `/api/translations/` | Localization |

---

## Firebase Services Used

| Service | Usage |
|---------|-------|
| `firebase_auth` | Authentication (login, tokens, multi-factor) |
| `firebase_analytics` | Analytics tracking |
| `firebase_crashlytics` | Crash reporting |
| `firebase_messaging` | Push notifications |
| `firebase_remote_config` | Remote configuration |
| `firebase_performance` | Performance monitoring |
| `firebase_app_check` | App integrity verification |
| `firebase_ui_auth` | Firebase UI for auth |

---

## Key Package References

```
package:crypto_stuff/login_response.g.dart
package:firebase_ui_auth/
package:firebase_auth_platform_interface/
package:shared_preferences_android/
package:in_app_purchase_android/
```

---

## External URLs

| URL | Purpose |
|-----|---------|
| `https://cloudminecrypto.com` | Main website |
| `https://cloudminecrypto.com/earn-bitcoin-by-watching-ads...` | Help: Ads |
| `https://cloudminecrypto.com/learn/how-to-start-bitcoin-mining` | Help: Mining |
| `https://cloudminecrypto.com/learn/how-to-withdraw-bitcoins` | Help: Withdrawal |
| `https://bscscan.com/address/0xc346ef0bcaeada20485696f370a376b5df2fdd35` | BSC Contract |
| `https://zbd.gg` | ZBD Wallet (Lightning) |

---

## Withdrawal Networks

| Network | ID | Fee | Min | Max |
|---------|----|-----|-----|-----|
| Lightning | `ln` | 5 | 10 | 4000 |
| Bitcoin | `btc` | 6250 | 12500 | null |
| BSC (BEP-20) | `bnb` | 1506 | 3012 | null |

---

## Next Steps for Deeper Analysis

### Option 1: Install Ghidra (GUI)
```bash
cd /tmp
wget https://github.com/NationalSecurityAgency/ghidra/releases/download/GHIDRA_11.3.2-build/ghidra_11.3.2_PUBLIC_20240918.zip
unzip ghidra_11.3.2_PUBLIC_20240918.zip -d /opt/
cd /opt/ghidra_11.3.2_PUBLIC && ./ghidraRun
```

### Option 2: Install Radare2 + r2dec (CLI)
```bash
sudo apt install radare2 r2dec -y
r2 /storage/internal_new/project/Earnings/app/src/main/jniLibs/arm64-v8a/libapp.so
# Inside r2:
aaa        # Analyze all
iz         # List strings
iz~login   # Search for "login"
pdf        # Print decompiled function
```

### Option 3: Use objdump for function listing
```bash
arm-linux-gnueabi-objdump -t libapp.so | grep -i func
```

---

## Strings Output

Full strings dump saved to: `libapp_strings.txt` (49,956 lines)

Search examples:
```bash
# Find auth-related strings
grep -i "auth\|login\|token" libapp_strings.txt

# Find URLs
grep -E "https?://" libapp_strings.txt

# Find API endpoints
grep "/api/" libapp_strings.txt
```
