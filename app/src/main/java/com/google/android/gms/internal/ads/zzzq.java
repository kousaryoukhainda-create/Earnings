package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzzq extends HandlerThread implements Handler.Callback {
    private zzdd zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzzs zze;

    public zzzq() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        zzdd zzddVar;
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    try {
                        zzddVar = this.zza;
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    if (zzddVar != null) {
                        zzddVar.zzc();
                        return true;
                    }
                    throw null;
                }
            } else {
                try {
                    int i2 = message.arg1;
                    zzdd zzddVar2 = this.zza;
                    if (zzddVar2 != null) {
                        zzddVar2.zzb(i2);
                        SurfaceTexture zza = this.zza.zza();
                        if (i2 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.zze = new zzzs(this, zza, z, null);
                        synchronized (this) {
                            notify();
                        }
                    } else {
                        throw null;
                    }
                } catch (zzde e) {
                    zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.zzd = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzc = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzd = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzzs zza(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdd(handler, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzzs zzzsVar = this.zze;
                zzzsVar.getClass();
                return zzzsVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
