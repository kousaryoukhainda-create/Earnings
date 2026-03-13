package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzem  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzem extends zzcx {
    private final zza zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzem$zza */
    /* loaded from: classes3.dex */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzem(zza zzaVar) {
        this.zza = zzaVar;
    }

    public static zzem zza(zza zzaVar) {
        return new zzem(zzaVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzem) || ((zzem) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzem.class, this.zza);
    }

    public final String toString() {
        return AbstractC2437ph.h("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.zza), ")");
    }

    public final zza zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}
