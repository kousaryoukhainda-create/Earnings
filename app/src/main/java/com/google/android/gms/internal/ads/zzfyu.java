package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
final class zzfyu extends zzfvp {
    final transient zzfvf zza;

    public zzfyu(Map map, zzfvf zzfvfVar) {
        super(map);
        this.zza = zzfvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvp, com.google.android.gms.internal.ads.zzfwg
    public final /* bridge */ /* synthetic */ Collection zza() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwg, com.google.android.gms.internal.ads.zzfwj
    public final Map zzj() {
        return zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzfwg, com.google.android.gms.internal.ads.zzfwj
    public final Set zzl() {
        return zzm();
    }
}
