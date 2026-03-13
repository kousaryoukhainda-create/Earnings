package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
/* loaded from: classes3.dex */
public final class zzlc {
    private final Object zza;
    private Looper zzb;
    private HandlerThread zzc;
    private int zzd;

    public zzlc() {
        throw null;
    }

    public final Looper zza() {
        Looper looper;
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    boolean z = false;
                    if (this.zzd == 0 && this.zzc == null) {
                        z = true;
                    }
                    zzcw.zzf(z);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.zzc = handlerThread;
                    handlerThread.start();
                    this.zzb = this.zzc.getLooper();
                }
                this.zzd++;
                looper = this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final void zzb() {
        boolean z;
        HandlerThread handlerThread;
        synchronized (this.zza) {
            try {
                if (this.zzd > 0) {
                    z = true;
                } else {
                    z = false;
                }
                zzcw.zzf(z);
                int i = this.zzd - 1;
                this.zzd = i;
                if (i == 0 && (handlerThread = this.zzc) != null) {
                    handlerThread.quit();
                    this.zzc = null;
                    this.zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzlc(Looper looper) {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }
}
