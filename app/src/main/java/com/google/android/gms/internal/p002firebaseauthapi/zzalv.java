package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalv  reason: invalid package */
/* loaded from: classes3.dex */
final class zzalv implements zzamd {
    private zzamd[] zza;

    public zzalv(zzamd... zzamdVarArr) {
        this.zza = zzamdVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final zzama zza(Class<?> cls) {
        zzamd[] zzamdVarArr;
        for (zzamd zzamdVar : this.zza) {
            if (zzamdVar.zzb(cls)) {
                return zzamdVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final boolean zzb(Class<?> cls) {
        for (zzamd zzamdVar : this.zza) {
            if (zzamdVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
