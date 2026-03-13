package com.google.android.gms.internal.measurement;

import java.util.Objects;
/* loaded from: classes3.dex */
final class zzdu extends zzcw {
    final /* synthetic */ Runnable zza;

    public zzdu(zzdv zzdvVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzdvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcx
    public final void zze() {
        this.zza.run();
    }
}
