package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes3.dex */
public final class zzob extends zzg {
    protected final zzoa zza;
    protected final zznz zzb;
    protected final zznx zzc;
    private Handler zzd;
    private boolean zze;

    public zzob(zzib zzibVar) {
        super(zzibVar);
        this.zze = true;
        this.zza = new zzoa(this);
        this.zzb = new zznz(this);
        this.zzc = new zznx(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn */
    public final void zzj() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcn(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh(boolean z) {
        zzg();
        this.zze = z;
    }

    public final boolean zzi() {
        zzg();
        return this.zze;
    }

    public final /* synthetic */ void zzk(long j) {
        zzg();
        zzj();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzibVar.zzc().zzp(null, zzfx.zzaU)) {
            if (zzibVar.zzc().zzv() || this.zze) {
                this.zzb.zza(j);
            }
        } else if (zzibVar.zzc().zzv() || zzibVar.zzd().zzn.zza()) {
            this.zzb.zza(j);
        }
        this.zzc.zza();
        zzoa zzoaVar = this.zza;
        zzob zzobVar = zzoaVar.zza;
        zzobVar.zzg();
        if (!zzobVar.zzu.zzB()) {
            return;
        }
        zzoaVar.zzb(zzobVar.zzu.zzaZ().currentTimeMillis(), false);
    }

    public final /* synthetic */ void zzl(long j) {
        zzg();
        zzj();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("Activity paused, time", Long.valueOf(j));
        this.zzc.zzb(j);
        if (zzibVar.zzc().zzv()) {
            this.zzb.zzb(j);
        }
    }

    public final /* synthetic */ Handler zzm() {
        return this.zzd;
    }
}
