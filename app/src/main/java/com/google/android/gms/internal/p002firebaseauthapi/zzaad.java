package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaad  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaad {
    private final BigInteger zza;

    private zzaad(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzaad zza(BigInteger bigInteger, zzck zzckVar) {
        if (zzckVar != null) {
            return new zzaad(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzck zzckVar) {
        if (zzckVar != null) {
            return this.zza;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
