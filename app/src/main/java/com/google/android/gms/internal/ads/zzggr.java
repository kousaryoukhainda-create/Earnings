package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes3.dex */
public final class zzggr extends zzget {
    private final zzggw zza;
    private final zzgvp zzb;
    private final zzgvo zzc;
    private final Integer zzd;

    private zzggr(zzggw zzggwVar, zzgvp zzgvpVar, zzgvo zzgvoVar, Integer num) {
        this.zza = zzggwVar;
        this.zzb = zzgvpVar;
        this.zzc = zzgvoVar;
        this.zzd = num;
    }

    public static zzggr zza(zzggv zzggvVar, zzgvp zzgvpVar, Integer num) throws GeneralSecurityException {
        zzgvo zzb;
        zzggv zzggvVar2 = zzggv.zzc;
        if (zzggvVar != zzggvVar2 && num == null) {
            throw new GeneralSecurityException(AbstractC2437ph.h("For given Variant ", zzggvVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzggvVar == zzggvVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgvpVar.zza() == 32) {
            zzggw zzc = zzggw.zzc(zzggvVar);
            if (zzc.zzb() == zzggvVar2) {
                zzb = zzgml.zza;
            } else if (zzc.zzb() == zzggv.zzb) {
                zzb = zzgml.zza(num.intValue());
            } else if (zzc.zzb() == zzggv.zza) {
                zzb = zzgml.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            return new zzggr(zzc, zzgvpVar, zzb, num);
        }
        throw new GeneralSecurityException(AbstractC0324Hi.e(zzgvpVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
    }

    public final zzggw zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzc;
    }

    public final zzgvp zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}
