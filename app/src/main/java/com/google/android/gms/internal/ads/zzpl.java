package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzpl extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzab zzc;

    public zzpl(int i, zzab zzabVar, boolean z) {
        super(AbstractC0324Hi.e(i, "AudioTrack write failed: "));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzabVar;
    }
}
