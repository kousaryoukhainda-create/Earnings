package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalp  reason: invalid package */
/* loaded from: classes3.dex */
final class zzalp implements zzalm {
    private static <E> zzalc<E> zzc(Object obj, long j) {
        return (zzalc) zzanp.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final <L> List<L> zza(Object obj, long j) {
        zzalc zzc = zzc(obj, j);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzalc zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzanp.zza(obj, j, zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzalc<E> zzc = zzc(obj, j);
        zzalc<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzalc<E> zzalcVar = zzc;
        zzalcVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zzc3 = zzc.zzc();
            zzalc<E> zzalcVar2 = zzc;
            if (!zzc3) {
                zzalcVar2 = zzc.zza(size2 + size);
            }
            zzalcVar2.addAll(zzc2);
            zzalcVar = zzalcVar2;
        }
        if (size > 0) {
            zzc2 = zzalcVar;
        }
        zzanp.zza(obj, j, zzc2);
    }
}
