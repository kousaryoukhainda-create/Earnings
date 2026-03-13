package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzem;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzei  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzei extends zzcv {
    private final zzem zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    private zzei(zzem zzemVar, zzaaf zzaafVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzemVar;
        this.zzb = zzaafVar;
        this.zzc = zzaaeVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzem) zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final /* synthetic */ zzcx zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final zzaae zzd() {
        return this.zzc;
    }

    public final zzaaf zze() {
        return this.zzb;
    }

    public static zzei zza(zzem.zza zzaVar, zzaaf zzaafVar, Integer num) throws GeneralSecurityException {
        zzaae zzb;
        zzem.zza zzaVar2 = zzem.zza.zzc;
        if (zzaVar == zzaVar2 || num != null) {
            if (zzaVar == zzaVar2 && num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            if (zzaafVar.zza() == 32) {
                zzem zza = zzem.zza(zzaVar);
                if (zza.zzb() == zzaVar2) {
                    zzb = zzpd.zza;
                } else if (zza.zzb() == zzem.zza.zzb) {
                    zzb = zzpd.zza(num.intValue());
                } else if (zza.zzb() == zzem.zza.zza) {
                    zzb = zzpd.zzb(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zza.zzb())));
                }
                return new zzei(zza, zzaafVar, zzb, num);
            }
            throw new GeneralSecurityException(AbstractC0324Hi.e(zzaafVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        throw new GeneralSecurityException(AbstractC2437ph.h("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
    }
}
