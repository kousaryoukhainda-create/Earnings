package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgwd extends zzgwg {
    private final int zzc;
    private final int zzd;

    public zzgwd(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgwj.zzq(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final byte zza(int i) {
        zzgwj.zzy(i, this.zzd);
        return ((zzgwg) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final byte zzb(int i) {
        return ((zzgwg) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwj
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzgwg) this).zza, this.zzc + i, bArr, i2, i3);
    }
}
