package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzyc extends AbstractList {
    private final List zza;
    private final zzyb zzb;

    public zzyc(List list, zzyb zzybVar) {
        this.zza = list;
        this.zzb = zzybVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.zzb.zzb(this.zza.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
