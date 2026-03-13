package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public final class zzv {
    @NonNull
    public static zzeu zza(@NonNull C2362om0 c2362om0) {
        zzr zzrVar = new zzr();
        zzu zzuVar = new zzu(zzrVar);
        zzrVar.zzb = zzuVar;
        zzrVar.zza = c2362om0.getClass();
        try {
            c2362om0.a(zzrVar);
            zzrVar.zza = "billingOverrideService.getBillingOverride";
        } catch (Exception e) {
            zzuVar.zzc(e);
        }
        return zzuVar;
    }
}
