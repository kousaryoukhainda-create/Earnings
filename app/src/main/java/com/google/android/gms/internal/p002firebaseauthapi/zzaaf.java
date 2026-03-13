package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaf  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaaf {
    private final zzaae zza;

    private zzaaf(zzaae zzaaeVar) {
        this.zza = zzaaeVar;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzaaf zza(byte[] bArr, zzck zzckVar) {
        if (zzckVar != null) {
            return new zzaaf(zzaae.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzaaf zza(int i) {
        return new zzaaf(zzaae.zza(zzqg.zza(i)));
    }

    public final byte[] zza(zzck zzckVar) {
        if (zzckVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
