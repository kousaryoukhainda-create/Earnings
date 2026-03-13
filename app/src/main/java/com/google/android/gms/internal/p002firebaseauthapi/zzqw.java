package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqw  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzqw extends zzrm {
    private final int zza;
    private final int zzb;
    private final zzb zzc;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqw$zza */
    /* loaded from: classes3.dex */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private zzb zzc;

        public final zza zza(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zza zzb(int i) throws GeneralSecurityException {
            if (i >= 10 && 16 >= i) {
                this.zzb = Integer.valueOf(i);
                return this;
            }
            throw new GeneralSecurityException(AbstractC0324Hi.e(i, "Invalid tag size for AesCmacParameters: "));
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zzb.zzd;
        }

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zzqw zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        return new zzqw(num.intValue(), this.zzb.intValue(), this.zzc);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqw$zzb */
    /* loaded from: classes3.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("LEGACY");
        public static final zzb zzd = new zzb("NO_PREFIX");
        private final String zze;

        private zzb(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static zza zzd() {
        return new zza();
    }

    private final int zzf() {
        int i;
        zzb zzbVar = this.zzc;
        if (zzbVar == zzb.zzd) {
            return this.zzb;
        }
        if (zzbVar == zzb.zza) {
            i = this.zzb;
        } else if (zzbVar == zzb.zzb) {
            i = this.zzb;
        } else if (zzbVar == zzb.zzc) {
            i = this.zzb;
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqw)) {
            return false;
        }
        zzqw zzqwVar = (zzqw) obj;
        if (zzqwVar.zza != this.zza || zzqwVar.zzf() != zzf() || zzqwVar.zzc != this.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzqw.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i = this.zzb;
        return AbstractC2437ph.k(AbstractC0324Hi.j(i, "AES-CMAC Parameters (variant: ", valueOf, ", ", "-byte tags, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        if (this.zzc != zzb.zzd) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzb zze() {
        return this.zzc;
    }

    private zzqw(int i, int i2, zzb zzbVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzbVar;
    }
}
