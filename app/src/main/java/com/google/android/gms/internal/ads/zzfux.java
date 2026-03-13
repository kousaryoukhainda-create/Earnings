package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
final class zzfux extends zzfva {
    public zzfux(zzfuy zzfuyVar, zzfvc zzfvcVar, CharSequence charSequence, int i) {
        super(zzfvcVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzfva) this).zzb.length()) {
            return i2;
        }
        return -1;
    }
}
