package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfe;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzfc extends zzcv {
    private final zzfe zza;
    private final zzaae zzb;
    private final Integer zzc;

    private zzfc(zzfe zzfeVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzfeVar;
        this.zzb = zzaaeVar;
        this.zzc = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzfe) zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final /* synthetic */ zzcx zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final zzaae zzd() {
        return this.zzb;
    }

    public static zzfc zza(zzfe zzfeVar, Integer num) throws GeneralSecurityException {
        zzaae zzb;
        if (zzfeVar.zzc() == zzfe.zzb.zzb) {
            if (num == null) {
                zzb = zzpd.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzfeVar.zzc() != zzfe.zzb.zza) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzfeVar.zzc())));
        } else {
            if (num != null) {
                zzb = zzpd.zzb(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        }
        return new zzfc(zzfeVar, zzb, num);
    }
}
