package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: tE  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2744tE {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C3204ye(bArr, 0, 0, false).j(0);
        } catch (FE e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
