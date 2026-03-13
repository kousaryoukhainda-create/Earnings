package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzda {
    private boolean zza;

    public zzda() {
        throw null;
    }

    public final synchronized void zza() throws InterruptedException {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z;
        z = this.zza;
        this.zza = false;
        return z;
    }

    public final synchronized boolean zzd() {
        return this.zza;
    }

    public final synchronized boolean zze() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public zzda(zzcx zzcxVar) {
    }
}
