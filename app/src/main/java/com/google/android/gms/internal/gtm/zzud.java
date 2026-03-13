package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes3.dex */
public abstract class zzud implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzud zzb = new zzua(zzye.zzd);
    private static final zzuc zzd;
    private int zzc = 0;

    static {
        int i = zzto.zza;
        zzd = new zzuc(null);
        zza = new zztv();
    }

    public static int zzj(int i, int i2, int i3) {
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

    public static zzud zzl(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzua(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zze(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zztu(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        if (zzd() <= 50) {
            concat = zzaai.zza(this);
        } else {
            concat = zzaai.zza(zzf(0, 47)).concat("...");
        }
        return AbstractC0324Hi.h(AbstractC0324Hi.j(zzd2, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzud zzf(int i, int i2);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zztt zzttVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
