package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
abstract class zzfva extends zzfts {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    public zzfva(zzfvc zzfvcVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i = this.zzc;
        while (true) {
            int i2 = this.zzc;
            if (i2 != -1) {
                int zzd = zzd(i2);
                if (zzd == -1) {
                    zzd = this.zzb.length();
                    this.zzc = -1;
                    zzc = -1;
                } else {
                    zzc = zzc(zzd);
                    this.zzc = zzc;
                }
                if (zzc == i) {
                    int i3 = zzc + 1;
                    this.zzc = i3;
                    if (i3 > this.zzb.length()) {
                        this.zzc = -1;
                    }
                } else {
                    if (i < zzd) {
                        this.zzb.charAt(i);
                    }
                    if (i < zzd) {
                        this.zzb.charAt(zzd - 1);
                    }
                    int i4 = this.zzd;
                    if (i4 == 1) {
                        zzd = this.zzb.length();
                        this.zzc = -1;
                        if (zzd > i) {
                            this.zzb.charAt(zzd - 1);
                        }
                    } else {
                        this.zzd = i4 - 1;
                    }
                    return this.zzb.subSequence(i, zzd).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
