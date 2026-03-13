package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgbc extends zzgbe {
    public zzgbc(InterfaceFutureC2490qH interfaceFutureC2490qH, zzgbo zzgboVar) {
        super(interfaceFutureC2490qH, zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgbo zzgboVar = (zzgbo) obj;
        InterfaceFutureC2490qH zza = zzgboVar.zza(obj2);
        zzfun.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgboVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    public final /* synthetic */ void zzf(Object obj) {
        zzs((InterfaceFutureC2490qH) obj);
    }
}
