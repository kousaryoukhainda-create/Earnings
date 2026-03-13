package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzgik extends zzgeu {
    private final zzgij zza;
    private final int zzb;

    private zzgik(zzgij zzgijVar, int i) {
        this.zza = zzgijVar;
        this.zzb = i;
    }

    public static zzgik zzd(zzgij zzgijVar, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new zzgik(zzgijVar, i);
        }
        throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgik)) {
            return false;
        }
        zzgik zzgikVar = (zzgik) obj;
        if (zzgikVar.zza != this.zza || zzgikVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgik.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        return AbstractC2437ph.k(AbstractC0324Hi.m("X-AES-GCM Parameters (variant: ", this.zza.toString(), "salt_size_bytes: "), this.zzb, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != zzgij.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzgij zzc() {
        return this.zza;
    }
}
