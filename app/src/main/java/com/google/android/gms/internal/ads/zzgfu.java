package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzgfu extends zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgfs zzd;

    public /* synthetic */ zzgfu(int i, int i2, int i3, zzgfs zzgfsVar, zzgft zzgftVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgfsVar;
    }

    public static zzgfr zzd() {
        return new zzgfr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfu)) {
            return false;
        }
        zzgfu zzgfuVar = (zzgfu) obj;
        if (zzgfuVar.zza != this.zza || zzgfuVar.zzb != this.zzb || zzgfuVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgfu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder m = AbstractC0324Hi.m("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        m.append(this.zzb);
        m.append("-byte IV, 16-byte tag, and ");
        return AbstractC2437ph.k(m, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzd != zzgfs.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgfs zze() {
        return this.zzd;
    }
}
