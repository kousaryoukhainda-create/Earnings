package com.google.android.gms.measurement.internal;

import java.util.Objects;
/* loaded from: classes3.dex */
final class zznu implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzob zzb;

    public zznu(zzob zzobVar, long j) {
        this.zza = j;
        Objects.requireNonNull(zzobVar);
        this.zzb = zzobVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzl(this.zza);
    }
}
