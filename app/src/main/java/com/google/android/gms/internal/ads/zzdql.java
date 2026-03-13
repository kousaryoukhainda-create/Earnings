package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.location.LocationRequest;
/* loaded from: classes3.dex */
public final class zzdql implements zzcyq, zzcxh, zzcvw, zzcwn, com.google.android.gms.ads.internal.client.zza, zzdbc {
    private final zzbbj zza;
    private boolean zzb = false;

    public zzdql(zzbbj zzbbjVar, zzezj zzezjVar) {
        this.zza = zzbbjVar;
        zzbbjVar.zzc(2);
        if (zzezjVar != null) {
            zzbbjVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(final zzfca zzfcaVar) {
        this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqh
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzbbq.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbbq.zzi.zza zzbM2 = zzaVar.zze().zzad().zzbM();
                zzbM2.zzo(zzfca.this.zzb.zzb.zzb);
                zzbM.zzT(zzbM2);
                zzaVar.zzG(zzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(LocationRequest.PRIORITY_LOW_POWER);
                return;
            case 6:
                this.zza.zzc(LocationRequest.PRIORITY_NO_POWER);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzi(final zzbbq.zzb zzbVar) {
        this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbq.zzb.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzj(final zzbbq.zzb zzbVar) {
        this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqi
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbq.zzb.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzl(boolean z) {
        int i;
        if (true != z) {
            i = 1108;
        } else {
            i = 1107;
        }
        this.zza.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzm(final zzbbq.zzb zzbVar) {
        this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqj
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbq.zzb.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzn(boolean z) {
        int i;
        if (true != z) {
            i = 1106;
        } else {
            i = 1105;
        }
        this.zza.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zza.zzc(3);
    }
}
