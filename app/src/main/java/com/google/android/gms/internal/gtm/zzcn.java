package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcn implements Callable {
    final /* synthetic */ zzcp zza;

    public zzcn(zzcp zzcpVar) {
        this.zza = zzcpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return this.zza.zzc();
    }
}
