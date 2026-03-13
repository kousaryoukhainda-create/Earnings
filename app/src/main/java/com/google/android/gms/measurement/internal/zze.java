package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
/* loaded from: classes3.dex */
final class zze {
    private final zzjh zza;

    public zze(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    public static zze zzc(String str) {
        zzjh zzjhVar;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            zzjhVar = zzjk.zzj(str.charAt(0));
        } else {
            zzjhVar = zzjh.UNINITIALIZED;
        }
        return new zze(zzjhVar);
    }

    public final zzjh zza() {
        return this.zza;
    }

    public final String zzb() {
        return String.valueOf(zzjk.zzm(this.zza));
    }
}
