package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajp  reason: invalid package */
/* loaded from: classes3.dex */
public abstract class zzajp implements Serializable, Iterable<Byte> {
    public static final zzajp zza = new zzajw(zzalb.zzb);
    private static final zzajs zzb = new zzajz();
    private int zzc = 0;

    static {
        new zzajr();
    }

    public static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public static zzajp zzb(byte[] bArr) {
        return new zzajw(bArr);
    }

    public static zzaju zzc(int i) {
        return new zzaju(i);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzb2 = zzb();
            i = zzb(zzb2, 0, zzb2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzajo(this);
    }

    public final String toString() {
        String f;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzb2 = zzb();
        if (zzb() <= 50) {
            f = zzanh.zza(this);
        } else {
            f = AbstractC0324Hi.f(zzanh.zza(zza(0, 47)), "...");
        }
        return AbstractC0324Hi.h(AbstractC0324Hi.j(zzb2, "<ByteString@", hexString, " size=", " contents=\""), f, "\">");
    }

    public abstract byte zza(int i);

    public abstract zzajp zza(int i, int i2);

    public abstract void zza(zzajm zzajmVar) throws IOException;

    public abstract void zza(byte[] bArr, int i, int i2, int i3);

    public abstract byte zzb(int i);

    public abstract int zzb();

    public abstract int zzb(int i, int i2, int i3);

    public abstract zzakb zzc();

    public final byte[] zzd() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzalb.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }

    public static int zza(int i, int i2, int i3) {
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

    public final int zza() {
        return this.zzc;
    }

    public static zzajp zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzajp zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zzajw(zzb.zza(bArr, i, i2));
    }

    public static zzajp zza(String str) {
        return new zzajw(str.getBytes(zzalb.zza));
    }
}
