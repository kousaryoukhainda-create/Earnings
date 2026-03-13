package com.google.android.gms.internal.ads;

import android.view.View;
/* loaded from: classes3.dex */
final class zzazf implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzazj zzb;

    public zzazf(zzazj zzazjVar, View view) {
        this.zza = view;
        this.zzb = zzazjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
