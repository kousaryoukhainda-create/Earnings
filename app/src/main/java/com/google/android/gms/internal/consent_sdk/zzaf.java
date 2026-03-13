package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaf extends zza {
    private final zzaf zza = this;
    private final zzdn zzb;
    private final zzdn zzc;
    private final zzdn zzd;
    private final zzdn zze;
    private final zzdn zzf;
    private final zzdn zzg;
    private final zzdn zzh;
    private final zzdn zzi;
    private final zzdn zzj;
    private final zzdn zzk;
    private final zzdn zzl;

    public /* synthetic */ zzaf(Application application, zzaj zzajVar) {
        zzad zzadVar;
        zzar zzarVar;
        zzar zzarVar2;
        zzar zzarVar3;
        zzap zzapVar;
        zzar zzarVar4;
        zzdk zzb = zzdl.zzb(application);
        this.zzb = zzb;
        zzdn zzb2 = zzdj.zzb(new zzan(zzb));
        this.zzc = zzb2;
        zzadVar = zzac.zza;
        zzdn zzb3 = zzdj.zzb(zzadVar);
        this.zzd = zzb3;
        zzae zzaeVar = new zzae(this);
        this.zze = zzaeVar;
        zzarVar = zzaq.zza;
        zzdn zzb4 = zzdj.zzb(new zzbl(zzaeVar, zzarVar));
        this.zzf = zzb4;
        zzo zzoVar = new zzo(zzb, zzb2);
        this.zzg = zzoVar;
        zzarVar2 = zzaq.zza;
        zzdn zzb5 = zzdj.zzb(new zzf(zzarVar2));
        this.zzh = zzb5;
        zzarVar3 = zzaq.zza;
        zzal zzalVar = new zzal(zzb, zzb2, zzarVar3);
        this.zzi = zzalVar;
        zzaa zzaaVar = new zzaa(zzb5, zzalVar, zzb2);
        this.zzj = zzaaVar;
        zzapVar = zzao.zza;
        zzarVar4 = zzaq.zza;
        zzv zzvVar = new zzv(zzb, zzb3, zzapVar, zzarVar4, zzb2, zzb4, zzoVar, zzaaVar, zzb5);
        this.zzk = zzvVar;
        this.zzl = zzdj.zzb(new zzk(zzb2, zzvVar, zzb4));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zza
    public final zzj zzb() {
        return (zzj) this.zzl.zza();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zza
    public final zzbk zzc() {
        return (zzbk) this.zzf.zza();
    }
}
