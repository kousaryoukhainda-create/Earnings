package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: sE  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2658sE {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length >= 0) {
                int i = (0 - 0) + length;
                if (i >= 0) {
                    if (i <= Integer.MAX_VALUE) {
                        return;
                    }
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new IOException("Failed to parse the message.");
            }
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } catch (EE e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
