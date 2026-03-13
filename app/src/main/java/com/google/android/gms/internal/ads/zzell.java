package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes3.dex */
public final class zzell implements zzetr {
    private final Context zza;

    public zzell(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        boolean z;
        if (AbstractC2525qi.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
            z = true;
        } else {
            z = false;
        }
        return zzgch.zzh(new zzelm(z));
    }
}
