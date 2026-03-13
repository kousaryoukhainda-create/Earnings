package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes3.dex */
public final class zzddw {
    private final List zza;
    private final zzfja zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzddw(zzfbo zzfboVar, zzfja zzfjaVar) {
        this.zza = zzfboVar.zzp;
        this.zzb = zzfjaVar;
        this.zzc = zzfboVar.zzax;
    }

    public final void zza() {
        if (!this.zzd) {
            this.zzb.zze(this.zza, this.zzc);
            this.zzd = true;
        }
    }
}
