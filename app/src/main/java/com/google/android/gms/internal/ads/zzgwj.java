package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes3.dex */
public abstract class zzgwj implements Iterable<Byte>, Serializable {
    public static final zzgwj zzb = new zzgwg(zzgye.zzb);
    private int zza = 0;

    static {
        int i = zzgvw.zza;
    }

    private static zzgwj zzc(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (zzgwj) it.next();
            }
            int i2 = i >>> 1;
            zzgwj zzc = zzc(it, i2);
            zzgwj zzc2 = zzc(it, i - i2);
            if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
                return zzgzu.zzC(zzc, zzc2);
            }
            throw new IllegalArgumentException(AbstractC0324Hi.d(zzc.zzd(), zzc2.zzd(), "ByteString would be too long: ", "+"));
        }
        throw new IllegalArgumentException(AbstractC2437ph.c(i, "length (", ") must be >= 1"));
    }

    public static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(AbstractC0324Hi.d(i, i2, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(AbstractC0324Hi.d(i2, i3, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(AbstractC2437ph.c(i, "Beginning index: ", " < 0"));
        }
        return i4;
    }

    public static zzgwh zzt() {
        return new zzgwh(UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    public static zzgwj zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzgwj zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgwg(bArr2);
    }

    public static zzgwj zzw(String str) {
        return new zzgwg(str.getBytes(zzgye.zza));
    }

    public static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.d(i, i2, "Index > length: ", ", "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzd = zzd();
            i = zzi(zzd, 0, zzd);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        if (zzd() <= 50) {
            concat = zzhaf.zza(this);
        } else {
            concat = zzhaf.zza(zzk(0, 47)).concat("...");
        }
        return AbstractC0324Hi.h(AbstractC0324Hi.j(zzd, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }

    public final byte[] zzA() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzgye.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzgwj zzk(int i, int i2);

    public abstract zzgwp zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgwa zzgwaVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs */
    public zzgwe iterator() {
        return new zzgwb(this);
    }

    public final String zzx() {
        Charset charset = zzgye.zza;
        if (zzd() == 0) {
            return "";
        }
        return zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }
}
