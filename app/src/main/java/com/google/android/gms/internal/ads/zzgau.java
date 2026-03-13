package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgau extends zzgaw {
    public zzgau(InterfaceFutureC2490qH interfaceFutureC2490qH, Class cls, zzgbo zzgboVar) {
        super(interfaceFutureC2490qH, cls, zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgbo zzgboVar = (zzgbo) obj;
        InterfaceFutureC2490qH zza = zzgboVar.zza(th);
        zzfun.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgboVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final /* synthetic */ void zzf(Object obj) {
        zzs((InterfaceFutureC2490qH) obj);
    }
}
