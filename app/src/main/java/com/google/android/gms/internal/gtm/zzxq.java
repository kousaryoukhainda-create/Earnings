package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public class zzxq extends zzxp implements zzzh {
    public zzxq(zzxr zzxrVar) {
        super(zzxrVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzxp
    public final void zzH() {
        super.zzH();
        if (((zzxr) this.zza).zza != zzxk.zze()) {
            zzxr zzxrVar = (zzxr) this.zza;
            zzxrVar.zza = zzxrVar.zza.clone();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzxp, com.google.android.gms.internal.gtm.zzzf
    /* renamed from: zzJ */
    public final zzxr zzE() {
        if (!((zzxr) this.zza).zzaq()) {
            return (zzxr) this.zza;
        }
        ((zzxr) this.zza).zza.zzi();
        return (zzxr) super.zzE();
    }
}
