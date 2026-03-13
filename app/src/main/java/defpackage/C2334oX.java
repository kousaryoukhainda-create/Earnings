package defpackage;

import java.util.Locale;
/* renamed from: oX  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2334oX {
    public static final byte[] g = new byte[0];
    public final boolean a;
    public final byte b;
    public final int c;
    public final long d;
    public final int e;
    public final byte[] f;

    public C2334oX(C2248nX c2248nX) {
        this.a = c2248nX.a;
        this.b = c2248nX.b;
        this.c = c2248nX.c;
        this.d = c2248nX.d;
        this.e = c2248nX.e;
        this.f = c2248nX.f;
    }

    public static int a(int i) {
        return AbstractC1906jZ.F(i + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2334oX.class != obj.getClass()) {
            return false;
        }
        C2334oX c2334oX = (C2334oX) obj;
        if (this.b == c2334oX.b && this.c == c2334oX.c && this.a == c2334oX.a && this.d == c2334oX.d && this.e == c2334oX.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return ((((((((527 + this.b) * 31) + this.c) * 31) + (this.a ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.a)};
        int i = Ha0.a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
