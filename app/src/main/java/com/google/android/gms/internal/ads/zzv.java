package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
/* loaded from: classes3.dex */
public final class zzv {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzv zza(int i) {
        zzcw.zzf(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzx zzb() {
        zzcw.zzf(!this.zzb);
        this.zzb = true;
        return new zzx(this.zza, null);
    }
}
