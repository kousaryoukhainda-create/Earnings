# libapp.so Analysis Complete

## Analysis Summary

**File Analyzed**: `app/src/main/jniLibs/arm64-v8a/libapp.so`  
**Size**: 9.6 MB  
**Architecture**: ARM64 (AArch64)  
**Framework**: Flutter (Dart AOT compiled)

---

## Files Created

| File | Lines | Description |
|------|-------|-------------|
| `libapp_analysis/all_strings.txt` | 49,956 | All extracted strings |
| `libapp_analysis/api_endpoints.txt` | 42 | API endpoints |
| `libapp_analysis/urls.txt` | 25 | URLs |
| `libapp_analysis/auth_strings.txt` | 763 | Auth-related strings |
| `libapp_analysis/firebase_strings.txt` | 502 | Firebase-related |
| `libapp_analysis/potential_secrets.txt` | 582 | Potential keys/secrets |

---

## API Endpoints (42 total)

### Authentication
- `/api/login`
- `/api/register`
- `/api/email-login`
- `/api/email-login-confirm`
- `/api/profile/logout`
- `/api/profile/tokens`

### User Profile
- `/api/profile`
- `/api/profile/delete`
- `/api/profile/client/update`
- `/api/profile/email/update`
- `/api/profile/email/verify`
- `/api/profile/attribution`
- `/api/profile/logins/`

### Mining & Earnings
- `/api/mining-contracts`
- `/api/profile/free-mining-contract`
- `/api/profile/rewarded-mining-contract`
- `/api/profile/daily-reward`
- `/api/profile/leaderboard`

### Withdrawals
- `/api/profile/wallet/withdrawals/direct`
- `/api/profile/wallet/withdrawals/request`
- `/api/profile/wallet/withdrawals/client_failure`
- `/api/profile/wallet/nfts/withdraw/`
- `/api/withdraw-networks`

### Subscriptions
- `/api/profile/subscriptions/validate`
- `/api/profile/subscriptions/cancel/`
- `/api/profile/subscriptions/reactivate/`

### Other
- `/api/assets/`
- `/api/is-online`
- `/api/settings`
- `/api/translations/`
- `/api/remotelog`

---

## External Services

### Firebase Integration
- Firebase Authentication
- Firebase Analytics
- Firebase Crashlytics
- Firebase Cloud Messaging
- Firebase Remote Config
- Firebase Performance Monitoring
- Firebase App Check
- Firebase UI Auth

### Payment/Withdrawal Networks
| Network | ID | Fee | Min | Max |
|---------|----|-----|-----|-----|
| Lightning | `ln` | 5 | 10 | 4000 |
| Bitcoin | `btc` | 6250 | 12500 | ∞ |
| BSC (BEP-20) | `bnb` | 1506 | 3012 | ∞ |

### BSC Contract
```
https://bscscan.com/address/0xc346ef0bcaeada20485696f370a376b5df2fdd35
```

---

## Key URLs

| URL | Purpose |
|-----|---------|
| `https://cloudminecrypto.com` | Main website |
| `https://cloudminecrypto.com/tg/` | Telegram |
| `https://zbd.gg` | ZBD Wallet (Lightning) |
| `https://bitcoin.org/en/choose-your-wallet` | Bitcoin wallets |
| `https://metamask.io/` | MetaMask wallet |

---

## Dart Packages Identified

```
package:crypto_stuff/login_response.g.dart
package:crypto_stuff/login_details.g.dart
package:firebase_ui_auth/
package:firebase_auth_platform_interface/
package:shared_preferences_android/
package:in_app_purchase_android/
package:url_launcher_android/
```

---

## Ghidra Setup (Manual)

Due to network tool issues in this environment, download Ghidra manually:

### 1. Download Ghidra
On a working machine or using browser:
```
https://github.com/NationalSecurityAgency/ghidra/releases/download/GHIDRA_11.3.2-build/ghidra_11.3.2_PUBLIC_20240918.zip
```

### 2. Extract
```bash
unzip ghidra_11.3.2_PUBLIC_20240918.zip -d /opt/
```

### 3. Run
```bash
cd /opt/ghidra_11.3.2_PUBLIC
./ghidraRun
```

### 4. Import libapp.so
1. **File → New Project** → Non-Shared Project
2. **File → Import File** → Select `libapp.so`
3. Language: **ARM → AARCH64 → Little Endian**
4. Click **Analyze** with default options

### 5. Navigate Code
- **Symbol Tree**: Browse functions
- **Search → For Strings** (Ctrl+Shift+F): Find API endpoints
- **Decompiler window**: View pseudo-C code

---

## Radare2 Quick Commands

```bash
# Open libapp.so
r2 /storage/internal_new/project/Earnings/app/src/main/jniLibs/arm64-v8a/libapp.so

# Inside r2:
aaa              # Analyze all
iz               # List strings
iz~login         # Search for "login"
is               # List symbols
afl            # List functions
pdf @ sym.func # Decompile function
```

---

## Search Examples

```bash
# Search auth strings
grep -i "auth\|login\|token" libapp_analysis/all_strings.txt

# Search API endpoints
grep "/api/" libapp_analysis/all_strings.txt

# Search for URLs
grep -E "https?://" libapp_analysis/all_strings.txt

# Search potential secrets
cat libapp_analysis/potential_secrets.txt
```

---

## Next Steps

1. **Review extracted strings** in `libapp_analysis/` folder
2. **Install Ghidra** for deep code analysis
3. **Search for specific patterns** using grep
4. **Analyze authentication flow** via `/api/login` endpoints
5. **Check withdrawal logic** in `/api/profile/wallet/` endpoints

---

## Scripts Available

| Script | Purpose |
|--------|---------|
| `analyze_libapp.sh` | Run full string extraction |
| `check_steps.py` | Existing project script |
| `parse_logs.py` | Log parsing |

---

**Report Generated**: 2026-03-14  
**Tool**: Radare2 + strings + grep
