package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;
/* loaded from: classes3.dex */
public final class zzemk implements zzetr {
    private final Set zza;

    public zzemk(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final InterfaceFutureC2490qH zzb() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzgch.zzh(new zzemi(arrayList, null));
    }
}
