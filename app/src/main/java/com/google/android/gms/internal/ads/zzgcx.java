package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
/* loaded from: classes3.dex */
final class zzgcx extends zzgax.zzi implements Runnable {
    private final Runnable zza;

    public zzgcx(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        return AbstractC2437ph.h("task=[", this.zza.toString(), "]");
    }
}
