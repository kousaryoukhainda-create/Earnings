package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgbs extends zzgbt {
    final /* synthetic */ zzgbu zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbs(zzgbu zzgbuVar, Callable callable, Executor executor) {
        super(zzgbuVar, executor);
        this.zza = zzgbuVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
