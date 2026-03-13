package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes3.dex */
final class zzfzx extends zzfzz {
    private zzfzx(zzfzv zzfzvVar, Character ch) {
        super(zzfzvVar, ch);
        zzfun.zze(zzfzv.zzf(zzfzvVar).length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzfzy {
        CharSequence zzg = zzg(charSequence);
        if (this.zzb.zzd(zzg.length())) {
            int i = 0;
            int i2 = 0;
            while (i < zzg.length()) {
                int i3 = i2 + 1;
                int zzb = (this.zzb.zzb(zzg.charAt(i)) << 18) | (this.zzb.zzb(zzg.charAt(i + 1)) << 12);
                bArr[i2] = (byte) (zzb >>> 16);
                int i4 = i + 2;
                if (i4 < zzg.length()) {
                    int i5 = i + 3;
                    int zzb2 = zzb | (this.zzb.zzb(zzg.charAt(i4)) << 6);
                    int i6 = i2 + 2;
                    bArr[i3] = (byte) ((zzb2 >>> 8) & 255);
                    if (i5 < zzg.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((zzb2 | this.zzb.zzb(zzg.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i = i4;
                    i2 = i3;
                }
            }
            return i2;
        }
        throw new zzfzy(AbstractC0324Hi.e(zzg.length(), "Invalid input length "));
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final zzgaa zzb(zzfzv zzfzvVar, Character ch) {
        return new zzfzx(zzfzvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfun.zzk(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (bArr[i3 + 2] & 255);
            appendable.append(this.zzb.zza(i5 >>> 18));
            appendable.append(this.zzb.zza((i5 >>> 12) & 63));
            appendable.append(this.zzb.zza((i5 >>> 6) & 63));
            appendable.append(this.zzb.zza(i5 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zzh(appendable, bArr, i3, i2 - i3);
        }
    }

    public zzfzx(String str, String str2, Character ch) {
        this(new zzfzv(str, str2.toCharArray()), ch);
    }
}
