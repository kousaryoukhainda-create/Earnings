package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zzsr extends zzsn {
    private final zzst zza;

    public zzsr(zzst zzstVar, int i) {
        super(zzstVar.size(), i);
        this.zza = zzstVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzsn
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
