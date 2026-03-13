package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafp  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzafp {
    private final String zza;
    private final String zzb;

    public zzafp(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafp(Context context, String str) {
        Preconditions.checkNotNull(context);
        String checkNotEmpty = Preconditions.checkNotEmpty(str);
        this.zza = checkNotEmpty;
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, checkNotEmpty);
            if (packageCertificateHashBytes == null) {
                AbstractC0324Hi.v("single cert required: ", str, "FBA-PackageInfo");
                this.zzb = null;
                return;
            }
            this.zzb = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC0324Hi.v("no pkg: ", str, "FBA-PackageInfo");
            this.zzb = null;
        }
    }
}
