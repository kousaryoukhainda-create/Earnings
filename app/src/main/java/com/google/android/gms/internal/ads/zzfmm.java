package com.google.android.gms.internal.ads;

import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class zzfmm {
    private final zzfln zza;
    private final ArrayList zzb;

    public zzfmm(zzfln zzflnVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzflnVar;
        arrayList.add(str);
    }

    public final zzfln zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
