package com.google.android.recaptcha.internal;

import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        String A = d.A(10, String.valueOf(this.zzb / this.zza));
        String A2 = d.A(10, String.valueOf(this.zzc));
        return BK.o(BK.q("avgExecutionTime: ", A, " us| maxExecutionTime: ", A2, " us| totalTime: "), d.A(10, String.valueOf(this.zzb)), " us| #Usages: ", d.A(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(@NotNull zzbj zzbjVar) {
        return AbstractC1424g90.u(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
