package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes3.dex */
final class zzalq {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzalp
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((zzalq) obj).zzb.zzb, ((zzalq) obj2).zzb.zzb);
            return compare;
        }
    };
    private final zzalr zzb;
    private final int zzc;

    public /* synthetic */ zzalq(zzalr zzalrVar, int i, zzalu zzaluVar) {
        this.zzb = zzalrVar;
        this.zzc = i;
    }
}
