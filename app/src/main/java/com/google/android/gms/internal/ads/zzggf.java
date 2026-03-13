package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzggf extends zzgeu {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzggd zzd;

    public /* synthetic */ zzggf(int i, int i2, int i3, zzggd zzggdVar, zzgge zzggeVar) {
        this.zza = i;
        this.zzd = zzggdVar;
    }

    public static zzggc zzc() {
        return new zzggc(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggf)) {
            return false;
        }
        zzggf zzggfVar = (zzggf) obj;
        if (zzggfVar.zza != this.zza || zzggfVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzggf.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return AbstractC2437ph.k(AbstractC0324Hi.m("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzd != zzggd.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggd zzd() {
        return this.zzd;
    }
}
