package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    public zzkg(zzkd zzkdVar, Character ch) {
        this.zza = zzkdVar;
        if (ch != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        zzkd zzkdVar;
        CharSequence zze = zze(charSequence);
        if (this.zza.zzc(zze.length())) {
            int i = 0;
            int i2 = 0;
            while (i < zze.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    zzkdVar = this.zza;
                    if (i3 >= zzkdVar.zzc) {
                        break;
                    }
                    j <<= zzkdVar.zzb;
                    if (i + i3 < zze.length()) {
                        j |= this.zza.zzb(zze.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = zzkdVar.zzd;
                int i6 = i4 * zzkdVar.zzb;
                int i7 = (i5 - 1) * 8;
                while (i7 >= (i5 * 8) - i6) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.zza.zzc;
            }
            return i2;
        }
        throw new zzkf(AbstractC0324Hi.e(zze.length(), "Invalid input length "));
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzjf.zzd(0, i2, bArr.length);
        while (i3 < i2) {
            zzf(appendable, bArr, i3, Math.min(this.zza.zzd, i2 - i3));
            i3 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzc(int i) {
        return (int) (((this.zza.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzd(int i) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        zzjf.zzd(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.zza.zzd) {
            z = true;
        } else {
            z = false;
        }
        zzjf.zza(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = (i2 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - zzkdVar.zzb) - i3);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(zzkdVar2.zza & ((int) j2)));
            i3 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i3 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i3 += this.zza.zzb;
            }
        }
    }

    public zzkg(String str, String str2, Character ch) {
        this(new zzkd(str, str2.toCharArray()), ch);
    }
}
