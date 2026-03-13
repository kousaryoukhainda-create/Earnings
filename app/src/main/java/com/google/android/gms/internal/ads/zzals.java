package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzals implements Comparable {
    public final int zza;
    public final zzaln zzb;

    public zzals(int i, zzaln zzalnVar) {
        this.zza = i;
        this.zzb = zzalnVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzals) obj).zza);
    }
}
