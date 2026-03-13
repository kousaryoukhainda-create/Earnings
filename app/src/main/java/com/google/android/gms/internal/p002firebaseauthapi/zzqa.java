package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqa  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzqa {
    private final Class<?> zza;
    private final Class<?> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqa)) {
            return false;
        }
        zzqa zzqaVar = (zzqa) obj;
        if (!zzqaVar.zza.equals(this.zza) || !zzqaVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0324Hi.g(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }

    private zzqa(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
