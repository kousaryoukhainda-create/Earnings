package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgdi extends zzgbx implements RunnableFuture {
    private volatile zzgcp zza;

    public zzgdi(zzgbn zzgbnVar) {
        this.zza = new zzgdg(this, zzgbnVar);
    }

    public static zzgdi zze(Runnable runnable, Object obj) {
        return new zzgdi(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgcp zzgcpVar = this.zza;
        if (zzgcpVar != null) {
            zzgcpVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        zzgcp zzgcpVar = this.zza;
        if (zzgcpVar != null) {
            return AbstractC2437ph.h("task=[", zzgcpVar.toString(), "]");
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzgcp zzgcpVar;
        if (zzt() && (zzgcpVar = this.zza) != null) {
            zzgcpVar.zzh();
        }
        this.zza = null;
    }

    public zzgdi(Callable callable) {
        this.zza = new zzgdh(this, callable);
    }
}
