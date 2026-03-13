package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
/* loaded from: classes2.dex */
public class PackageManagerHelper {
    private final PackageManager a;

    /* loaded from: classes2.dex */
    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED,
        SPOOF
    }

    public PackageManagerHelper(Context context) {
        this.a = context.getPackageManager();
    }

    private byte[] a(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (AndroidException e) {
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e.getMessage());
        } catch (RuntimeException e2) {
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.", e2);
        }
        HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.");
        return new byte[0];
    }

    public String getApplicationName(String str) {
        try {
            return this.a.getApplicationLabel(this.a.getApplicationInfo(str, UserVerificationMethods.USER_VERIFY_PATTERN)).toString();
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.e("PackageManagerHelper", "Failed to get application name for " + str);
            return null;
        }
    }

    public long getPackageFirstInstallTime(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, UserVerificationMethods.USER_VERIFY_PATTERN);
            if (packageInfo == null) {
                return 0L;
            }
            return packageInfo.firstInstallTime;
        } catch (AndroidException | RuntimeException unused) {
            return 0L;
        }
    }

    public String getPackageSignature(String str) {
        byte[] a = a(str);
        if (a != null && a.length != 0) {
            return HEX.encodeHexString(SHA256.digest(a), true);
        }
        return null;
    }

    public String getPackageSigningCertificate(String str) {
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        Signature[] apkContentsSigners;
        if (Build.VERSION.SDK_INT < 28) {
            return getPackageSignature(str);
        }
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 134217728);
            signingInfo = packageInfo.signingInfo;
            if (!Objects.isNull(packageInfo, signingInfo)) {
                signingInfo2 = packageInfo.signingInfo;
                apkContentsSigners = signingInfo2.getApkContentsSigners();
                if (Objects.isNull(apkContentsSigners, apkContentsSigners[0])) {
                    HMSLog.e("PackageManagerHelper", "get V3 signature is null");
                    return null;
                }
                return HEX.encodeHexString(SHA256.digest(apkContentsSigners[0].toByteArray()), true);
            }
            HMSLog.e("PackageManagerHelper", "packageInfo or packageInfo.signingInfo is null");
            return null;
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.e("PackageManagerHelper", "getPackageSignatureV3 has exception");
            return null;
        }
    }

    public PackageStates getPackageStates(String str) {
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("PackageManagerHelper", "servicePackageName is empty.");
            return PackageStates.NOT_INSTALLED;
        }
        try {
            if (this.a.getApplicationInfo(str, UserVerificationMethods.USER_VERIFY_PATTERN).enabled) {
                return PackageStates.ENABLED;
            }
            return PackageStates.DISABLED;
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.e("PackageManagerHelper", "in getPackageStates, getApplicationInfo threw an exception");
            return PackageStates.NOT_INSTALLED;
        }
    }

    public int getPackageVersionCode(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 16);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.versionCode;
        } catch (AndroidException e) {
            HMSLog.e("PackageManagerHelper", "get PackageVersionCode failed " + e);
            return 0;
        } catch (RuntimeException e2) {
            HMSLog.e("PackageManagerHelper", "get PackageVersionCode failed", e2);
            return 0;
        }
    }

    public String getPackageVersionName(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    return str2;
                }
            }
            return "";
        } catch (AndroidException unused) {
            return "";
        } catch (RuntimeException e) {
            HMSLog.e("PackageManagerHelper", "get getPackageVersionName failed", e);
            return "";
        }
    }

    public boolean hasProvider(String str, String str2) {
        ProviderInfo[] providerInfoArr;
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, 8);
            if (packageInfo != null && (providerInfoArr = packageInfo.providers) != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str2.equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (AndroidException | RuntimeException unused) {
        }
        return false;
    }

    public boolean isPackageFreshInstall(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageInfo(str, UserVerificationMethods.USER_VERIFY_PATTERN);
            if (packageInfo == null) {
                return false;
            }
            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                return false;
            }
            return true;
        } catch (AndroidException | RuntimeException unused) {
            return false;
        }
    }

    public boolean verifyPackageArchive(String str, String str2, String str3) {
        PackageInfo packageInfo;
        InputStream inputStream = null;
        try {
            packageInfo = this.a.getPackageArchiveInfo(str, 64);
        } catch (Exception e) {
            HMSLog.e("PackageManagerHelper", "getPackageArchiveInfo Exception. " + e.getMessage());
            packageInfo = null;
        }
        if (packageInfo != null && packageInfo.signatures.length > 0) {
            try {
                if (!str2.equals(packageInfo.packageName)) {
                    return false;
                }
                try {
                    inputStream = IOUtils.toInputStream(packageInfo.signatures[0].toByteArray());
                    return str3.equalsIgnoreCase(HEX.encodeHexString(SHA256.digest(CertificateFactory.getInstance("X.509").generateCertificate(inputStream).getEncoded()), true));
                } catch (IOException | CertificateException e2) {
                    HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e2.getMessage());
                }
            } finally {
                IOUtils.closeQuietly((InputStream) null);
            }
        }
        return false;
    }
}
