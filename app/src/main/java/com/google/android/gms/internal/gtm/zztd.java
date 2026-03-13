package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zztd extends zzst {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zztd(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzsl.zza(i, this.zzc, "index");
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
