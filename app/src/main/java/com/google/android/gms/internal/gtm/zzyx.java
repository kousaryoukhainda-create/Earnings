package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zzyx implements zzze {
    private final zzze[] zza;

    public zzyx(zzze... zzzeVarArr) {
        this.zza = zzzeVarArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzze
    public final zzzd zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzze zzzeVar = this.zza[i];
            if (zzzeVar.zzc(cls)) {
                return zzzeVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.gtm.zzze
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
