package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class zzbar {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzban(this);
    private final Object zzc = new Object();
    private zzbau zzd;
    private Context zze;
    private zzbax zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzbar zzbarVar) {
        synchronized (zzbarVar.zzc) {
            try {
                zzbau zzbauVar = zzbarVar.zzd;
                if (zzbauVar == null) {
                    return;
                }
                if (zzbauVar.isConnected() || zzbarVar.zzd.isConnecting()) {
                    zzbarVar.zzd.disconnect();
                }
                zzbarVar.zzd = null;
                zzbarVar.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbau zzd = zzd(new zzbap(this), new zzbaq(this));
                    this.zzd = zzd;
                    zzd.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final long zza(zzbav zzbavVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zze(zzbavVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbas zzb(zzbav zzbavVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbas();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbavVar);
                }
                return this.zzf.zzf(zzbavVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e);
                return new zzbas();
            }
        }
    }

    public final synchronized zzbau zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbau(this.zze, com.google.android.gms.ads.internal.zzv.zzu().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzem)).booleanValue()) {
                    zzl();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzel)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzbao(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzen)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzl();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzbzw.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeo)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
