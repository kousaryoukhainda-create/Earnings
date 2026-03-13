package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqj  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzqj {
    private final Class<? extends zzqi> zza;
    private final zzaae zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        if (!zzqjVar.zza.equals(this.zza) || !zzqjVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0324Hi.g(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzqj(Class<? extends zzqi> cls, zzaae zzaaeVar) {
        this.zza = cls;
        this.zzb = zzaaeVar;
    }
}
