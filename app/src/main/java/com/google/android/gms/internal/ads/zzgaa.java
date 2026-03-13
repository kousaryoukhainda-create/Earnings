package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class zzgaa {
    private static final zzgaa zza;

    static {
        new zzfzx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new zzfzx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzfzz("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzfzz("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zza = new zzfzw("base16()", "0123456789ABCDEF");
    }

    public static zzgaa zzi() {
        return zza;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzfzy;

    public abstract void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzd(int i);

    public abstract int zze(int i);

    public abstract zzgaa zzf();

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i, int i2) {
        zzfun.zzk(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zze(i2));
        try {
            zzc(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzd = zzd(zzg.length());
            byte[] bArr = new byte[zzd];
            int zza2 = zza(bArr, zzg);
            if (zza2 != zzd) {
                byte[] bArr2 = new byte[zza2];
                System.arraycopy(bArr, 0, bArr2, 0, zza2);
                return bArr2;
            }
            return bArr;
        } catch (zzfzy e) {
            throw new IllegalArgumentException(e);
        }
    }
}
