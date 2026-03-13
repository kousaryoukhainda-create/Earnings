package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes3.dex */
public final class zzmo {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzlh(bArr, 0, 0, false, null).zza(0);
        } catch (zzmq e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int zzb(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzc(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static boolean zzd(zznl zznlVar) {
        if (!(zznlVar instanceof zzks)) {
            return false;
        }
        throw null;
    }
}
