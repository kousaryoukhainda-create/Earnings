package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes3.dex */
public abstract class zzlg implements Iterable, Serializable {
    public static final zzlg zzb = new zzlf(zzmo.zzb);
    private int zza = 0;

    static {
        int i = zzku.zza;
    }

    public static zzlg zzh(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzlf(bArr2);
    }

    public static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
                    sb.append("Beginning index larger than ending index: ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
                sb2.append("End index: ");
                sb2.append(i2);
                sb2.append(" >= ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 21);
            sb3.append("Beginning index: ");
            sb3.append(i);
            sb3.append(" < 0");
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        return i4;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc = zzc();
            i = zzg(zzc, 0, zzc);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkz(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzc = zzc();
        if (zzc() <= 50) {
            concat = zzof.zza(this);
        } else {
            concat = zzof.zza(zze(0, 47)).concat("...");
        }
        return AbstractC0324Hi.h(AbstractC0324Hi.j(zzc, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzlg zze(int i, int i2);

    public abstract void zzf(zzky zzkyVar) throws IOException;

    public abstract int zzg(int i, int i2, int i3);

    public final int zzi() {
        return this.zza;
    }
}
