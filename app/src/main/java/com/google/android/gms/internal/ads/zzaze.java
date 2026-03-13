package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
/* loaded from: classes3.dex */
public final class zzaze {
    private final Object zza = new Object();
    private zzazc zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            try {
                zzazc zzazcVar = this.zzb;
                if (zzazcVar != null) {
                    return zzazcVar.zza();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            try {
                zzazc zzazcVar = this.zzb;
                if (zzazcVar != null) {
                    return zzazcVar.zzb();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzazd zzazdVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzazc();
                }
                this.zzb.zzf(zzazdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(Context context) {
        Application application;
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    if (application == null) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.zzb == null) {
                        this.zzb = new zzazc();
                    }
                    this.zzb.zzg(application, context);
                    this.zzc = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(zzazd zzazdVar) {
        synchronized (this.zza) {
            try {
                zzazc zzazcVar = this.zzb;
                if (zzazcVar == null) {
                    return;
                }
                zzazcVar.zzh(zzazdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
