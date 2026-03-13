package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqm  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzqm {
    private final Class<?> zza;
    private final Class<? extends zzqi> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqm)) {
            return false;
        }
        zzqm zzqmVar = (zzqm) obj;
        if (!zzqmVar.zza.equals(this.zza) || !zzqmVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0324Hi.g(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }

    private zzqm(Class<?> cls, Class<? extends zzqi> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
