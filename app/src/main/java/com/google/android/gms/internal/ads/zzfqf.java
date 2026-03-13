package com.google.android.gms.internal.ads;

import java.io.Closeable;
/* loaded from: classes3.dex */
public abstract class zzfqf implements Closeable {
    public static zzfqr zza() {
        return new zzfqr();
    }

    public static zzfqr zzb(final int i, zzfqq zzfqqVar) {
        return new zzfqr(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqd
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        }, new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqe
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return zzfqf.zze();
            }
        }, zzfqqVar);
    }

    public static zzfqr zzc(zzfvf<Integer> zzfvfVar, zzfvf<Integer> zzfvfVar2, zzfqq zzfqqVar) {
        return new zzfqr(zzfvfVar, zzfvfVar2, zzfqqVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
