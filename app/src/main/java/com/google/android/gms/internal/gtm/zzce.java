package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.Collections;
/* loaded from: classes3.dex */
public final class zzce extends zzbu {
    private final zzcd zza;
    private final zzcy zzb;
    private final zzfq zzc;
    private zzfa zzd;

    public zzce(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzc = new zzfq(zzbxVar.zzr());
        this.zza = new zzcd(this);
        this.zzb = new zzca(this, zzbxVar);
    }

    public static /* synthetic */ void zzb(zzce zzceVar, ComponentName componentName) {
        com.google.android.gms.analytics.zzr.zzh();
        if (zzceVar.zzd != null) {
            zzceVar.zzd = null;
            zzceVar.zzO("Disconnected from device AnalyticsService", componentName);
            zzceVar.zzs().zzk();
        }
    }

    public static /* synthetic */ void zzi(zzce zzceVar, zzfa zzfaVar) {
        com.google.android.gms.analytics.zzr.zzh();
        zzceVar.zzd = zzfaVar;
        zzceVar.zzj();
        zzceVar.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        zzw();
        this.zzb.zzg(((Long) zzew.zzK.zzb()).longValue());
    }

    public final void zzc() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        try {
            ConnectionTracker.getInstance().unbindService(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
    }

    public final boolean zze() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzfa zzfaVar = this.zzd;
        if (zzfaVar == null) {
            return false;
        }
        try {
            zzfaVar.zze();
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzN("Failed to clear hits from AnalyticsService");
            return false;
        }
    }

    public final boolean zzf() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (this.zzd != null) {
            return true;
        }
        zzfa zza = this.zza.zza();
        if (zza != null) {
            this.zzd = zza;
            zzj();
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (this.zzd != null) {
            return true;
        }
        return false;
    }

    public final boolean zzh(zzez zzezVar) {
        String zzk;
        Preconditions.checkNotNull(zzezVar);
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzfa zzfaVar = this.zzd;
        if (zzfaVar == null) {
            return false;
        }
        if (zzezVar.zzh()) {
            zzw();
            zzk = zzcv.zzi();
        } else {
            zzw();
            zzk = zzcv.zzk();
        }
        try {
            zzfaVar.zzf(zzezVar.zzg(), zzezVar.zzd(), zzk, Collections.emptyList());
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzN("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}
