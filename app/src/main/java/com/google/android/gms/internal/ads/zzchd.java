package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
/* loaded from: classes3.dex */
public final class zzchd implements zzher {
    private final zzhfj zza;

    public zzchd(zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzche) this.zza).zza().getApplicationInfo();
        zzhez.zzb(applicationInfo);
        return applicationInfo;
    }
}
