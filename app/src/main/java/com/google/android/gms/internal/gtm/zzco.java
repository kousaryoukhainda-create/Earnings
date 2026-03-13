package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzco implements Callable {
    final /* synthetic */ zzcp zza;

    public zzco(zzcp zzcpVar) {
        this.zza = zzcpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        String zzf;
        zzf = this.zza.zzf();
        return zzf;
    }
}
