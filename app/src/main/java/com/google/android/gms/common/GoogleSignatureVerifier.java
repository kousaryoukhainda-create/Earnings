package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Set;
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzb;
    private static volatile Set zzc;
    private final Context zzd;
    private volatile String zze;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.zzd = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzn.zze(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static final zzj zza(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzb(@androidx.annotation.NonNull android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = 1
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
            goto L45
        L39:
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            r4 = r4[r1]
            com.google.android.gms.common.zzj[] r5 = new com.google.android.gms.common.zzj[r0]
            r5[r1] = r4
            com.google.android.gms.common.zzj r4 = zza(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzw zzc(String str, boolean z, boolean z2) {
        zzw zzc2;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzw.zzc("null pkg");
        }
        if (!str.equals(this.zze)) {
            if (zzn.zzg()) {
                zzc2 = zzn.zzb(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.zzd.getPackageManager().getPackageInfo(str, 64);
                    boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd);
                    if (packageInfo == null) {
                        zzc2 = zzw.zzc("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            zzw zza2 = zzn.zza(str2, zzkVar, honorsDebugCertificates, false);
                            if (zza2.zza && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && zzn.zza(str2, zzkVar, false, true).zza) {
                                zzc2 = zzw.zzc("debuggable release cert app rejected");
                            } else {
                                zzc2 = zza2;
                            }
                        } else {
                            zzc2 = zzw.zzc("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    return zzw.zzd("no pkg ".concat(str), e);
                }
            }
            if (zzc2.zza) {
                this.zze = str;
            }
            return zzc2;
        }
        return zzw.zzb();
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        zzw zzc2 = zzc(str, false, false);
        zzc2.zze();
        return zzc2.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        zzw zzc2;
        int length;
        String[] packagesForUid = this.zzd.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc2 = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    zzc2 = zzc(packagesForUid[i2], false, false);
                    if (zzc2.zza) {
                        break;
                    }
                    i2++;
                } else {
                    Preconditions.checkNotNull(zzc2);
                    break;
                }
            }
        } else {
            zzc2 = zzw.zzc("no pkgs");
        }
        zzc2.zze();
        return zzc2.zza;
    }
}
