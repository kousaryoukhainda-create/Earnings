package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes3.dex */
final class zzek implements Runnable {
    final Future zza;
    final zzej zzb;

    public zzek(Future future, zzej zzejVar) {
        this.zza = future;
        this.zzb = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable zza;
        boolean z = false;
        Future future = this.zza;
        if ((future instanceof zzfi) && (zza = zzfj.zza((zzfi) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            Future future2 = this.zza;
            if (future2.isDone()) {
                while (true) {
                    try {
                        obj = future2.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                this.zzb.zzb(obj);
                return;
            }
            throw new IllegalStateException(zzbf.zza("Future was expected to be done: %s", future2));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzba zza = zzbc.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
