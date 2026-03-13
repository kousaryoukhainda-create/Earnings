package com.google.android.gms.internal.gtm;

import java.util.AbstractMap;
/* loaded from: classes3.dex */
final class zzta extends zzst {
    final /* synthetic */ zztb zza;

    public zzta(zztb zztbVar) {
        this.zza = zztbVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzsl.zza(i, i2, "index");
        zztb zztbVar = this.zza;
        objArr = zztbVar.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zztbVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }
}
