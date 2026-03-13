package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoz  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzoz {
    private static zzoz zza = new zzoz();
    private final AtomicReference<zzpv> zzb = new AtomicReference<>(zzpv.zza().zza());

    public static zzoz zza() {
        return zza;
    }

    public final <KeyT extends zzbm, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.zzb.get().zza(keyt, cls);
    }

    public final synchronized <KeyT extends zzbm, PrimitiveT> void zza(zzpr<KeyT, PrimitiveT> zzprVar) throws GeneralSecurityException {
        this.zzb.set(zzpv.zza(this.zzb.get()).zza(zzprVar).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzqc<InputPrimitiveT, WrapperPrimitiveT> zzqcVar) throws GeneralSecurityException {
        this.zzb.set(zzpv.zza(this.zzb.get()).zza(zzqcVar).zza());
    }
}
