package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzggw extends zzgeu {
    private final zzggv zza;

    private zzggw(zzggv zzggvVar) {
        this.zza = zzggvVar;
    }

    public static zzggw zzc(zzggv zzggvVar) {
        return new zzggw(zzggvVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggw) || ((zzggw) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzggw.class, this.zza);
    }

    public final String toString() {
        return AbstractC2437ph.h("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != zzggv.zzc;
    }

    public final zzggv zzb() {
        return this.zza;
    }
}
