package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
/* loaded from: classes3.dex */
final class zzcc implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzcd zzb;

    public zzcc(zzcd zzcdVar, ComponentName componentName) {
        this.zzb = zzcdVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzce.zzb(this.zzb.zza, this.zza);
    }
}
