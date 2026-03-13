package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzu implements zzeu {
    final WeakReference zza;
    private final zzq zzb = new zzt(this);

    public zzu(zzr zzrVar) {
        this.zza = new WeakReference(zzrVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzr zzrVar = (zzr) this.zza.get();
        boolean cancel = this.zzb.cancel(z);
        if (cancel && zzrVar != null) {
            zzrVar.zza();
            return true;
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zzb.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzb.zzc instanceof zzg;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzb.isDone();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza(Object obj) {
        return this.zzb.zzd(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.zzb.zzb(runnable, executor);
    }

    public final boolean zzc(Throwable th) {
        zzi zziVar = new zzi(th);
        zzf zzfVar = zzq.zzb;
        zzq zzqVar = this.zzb;
        if (zzfVar.zzd(zzqVar, null, zziVar)) {
            zzq.zzc(zzqVar);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzb.get(j, timeUnit);
    }
}
