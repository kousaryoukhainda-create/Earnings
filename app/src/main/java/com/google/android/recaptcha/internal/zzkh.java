package com.google.android.recaptcha.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class zzkh {
    private static final zzkh zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzkh zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        char[] cArr;
        boolean z;
        new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzkd zzkdVar = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new zzkg(zzkdVar, null);
        char[] cArr2 = new char[512];
        cArr = zzkdVar.zzf;
        if (cArr.length == 16) {
            z = true;
        } else {
            z = false;
        }
        zzjf.zza(z);
        for (int i = 0; i < 256; i++) {
            cArr2[i] = zzkdVar.zza(i >>> 4);
            cArr2[i | UserVerificationMethods.USER_VERIFY_HANDPRINT] = zzkdVar.zza(i & 15);
        }
    }

    public static zzkh zzg() {
        return zza;
    }

    public static zzkh zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzkf;

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzc(int i);

    public abstract int zzd(int i);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i, int i2) {
        zzjf.zzd(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 != zzc) {
                byte[] bArr2 = new byte[zza2];
                System.arraycopy(bArr, 0, bArr2, 0, zza2);
                return bArr2;
            }
            return bArr;
        } catch (zzkf e) {
            throw new IllegalArgumentException(e);
        }
    }
}
