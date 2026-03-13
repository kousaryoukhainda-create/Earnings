package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzsz extends zzst {
    static final zzst zza = new zzsz(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzsz(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzsl.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzst, com.google.android.gms.internal.gtm.zzsq
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzsq
    public final Object[] zze() {
        return this.zzb;
    }
}
