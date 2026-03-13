package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
public final class zzafg implements zzacq {
    private final long zzb;
    private final zzacq zzc;

    public zzafg(long j, zzacq zzacqVar) {
        this.zzb = j;
        this.zzc = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzO(zzadm zzadmVar) {
        this.zzc.zzO(new zzaff(this, zzadmVar, zzadmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final zzadt zzw(int i, int i2) {
        return this.zzc.zzw(i, i2);
    }
}
