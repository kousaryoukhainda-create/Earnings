package com.google.android.gms.internal.gtm;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfn implements zzdb {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfp zzb;

    public zzfn(zzfp zzfpVar, Runnable runnable) {
        this.zzb = zzfpVar;
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.gtm.zzdb
    public final void zza(Throwable th) {
        Handler handler;
        handler = this.zzb.zzb;
        handler.post(this.zza);
    }
}
