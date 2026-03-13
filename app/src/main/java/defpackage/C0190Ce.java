package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: Ce  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190Ce extends AbstractC2618rm {
    public static final Logger o = Logger.getLogger(C0190Ce.class.getName());
    public static final boolean p = AbstractC0948ba0.e;
    public WC k;
    public final byte[] l;
    public final int m;
    public int n;

    public C0190Ce(byte[] bArr, int i) {
        if (((bArr.length - i) | i) >= 0) {
            this.l = bArr;
            this.n = 0;
            this.m = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
    }

    public static int a0(int i) {
        return s0(i) + 1;
    }

    public static int b0(int i, C0291Gb c0291Gb) {
        return c0(c0291Gb) + s0(i);
    }

    public static int c0(C0291Gb c0291Gb) {
        int size = c0291Gb.size();
        return u0(size) + size;
    }

    public static int d0(int i) {
        return s0(i) + 8;
    }

    public static int e0(int i, int i2) {
        return k0(i2) + s0(i);
    }

    public static int f0(int i) {
        return s0(i) + 4;
    }

    public static int g0(int i) {
        return s0(i) + 8;
    }

    public static int h0(int i) {
        return s0(i) + 4;
    }

    public static int i0(int i, Z z, UY uy) {
        return z.f(uy) + (s0(i) * 2);
    }

    public static int j0(int i, int i2) {
        return k0(i2) + s0(i);
    }

    public static int k0(int i) {
        if (i >= 0) {
            return u0(i);
        }
        return 10;
    }

    public static int l0(int i, long j) {
        return w0(j) + s0(i);
    }

    public static int m0(int i) {
        return s0(i) + 4;
    }

    public static int n0(int i) {
        return s0(i) + 8;
    }

    public static int o0(int i, int i2) {
        return u0((i2 >> 31) ^ (i2 << 1)) + s0(i);
    }

    public static int p0(int i, long j) {
        return w0((j >> 63) ^ (j << 1)) + s0(i);
    }

    public static int q0(int i, String str) {
        return r0(str) + s0(i);
    }

    public static int r0(String str) {
        int length;
        try {
            length = Da0.b(str);
        } catch (Ba0 unused) {
            length = str.getBytes(AbstractC2658sE.a).length;
        }
        return u0(length) + length;
    }

    public static int s0(int i) {
        return u0(i << 3);
    }

    public static int t0(int i, int i2) {
        return u0(i2) + s0(i);
    }

    public static int u0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int v0(int i, long j) {
        return w0(j) + s0(i);
    }

    public static int w0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public final void A0(int i, int i2) {
        G0(i, 5);
        B0(i2);
    }

    public final void B0(int i) {
        try {
            byte[] bArr = this.l;
            int i2 = this.n;
            int i3 = i2 + 1;
            this.n = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.n = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.n = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.n = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C0216De(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
        }
    }

    public final void C0(int i, long j) {
        G0(i, 1);
        D0(j);
    }

    public final void D0(long j) {
        try {
            byte[] bArr = this.l;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.n = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.n = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.n = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.n = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.n = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.n = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.n = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C0216De(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
        }
    }

    public final void E0(int i) {
        if (i >= 0) {
            H0(i);
        } else {
            J0(i);
        }
    }

    public final void F0(String str) {
        int i = this.n;
        try {
            int u0 = u0(str.length() * 3);
            int u02 = u0(str.length());
            byte[] bArr = this.l;
            int i2 = this.m;
            if (u02 == u0) {
                int i3 = i + u02;
                this.n = i3;
                int u = Da0.a.u(str, bArr, i3, i2 - i3);
                this.n = i;
                H0((u - i) - u02);
                this.n = u;
            } else {
                H0(Da0.b(str));
                int i4 = this.n;
                this.n = Da0.a.u(str, bArr, i4, i2 - i4);
            }
        } catch (Ba0 e) {
            this.n = i;
            o.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AbstractC2658sE.a);
            try {
                H0(bytes.length);
                y0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                throw new C0216De(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new C0216De(e3);
        }
    }

    public final void G0(int i, int i2) {
        H0((i << 3) | i2);
    }

    public final void H0(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.l;
            if (i2 == 0) {
                int i3 = this.n;
                this.n = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            }
            try {
                int i4 = this.n;
                this.n = i4 + 1;
                bArr[i4] = (byte) ((i & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C0216De(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
            }
            throw new C0216De(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
        }
    }

    public final void I0(int i, long j) {
        G0(i, 0);
        J0(j);
    }

    public final void J0(long j) {
        byte[] bArr = this.l;
        boolean z = p;
        int i = this.m;
        if (z && i - this.n >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.n;
                this.n = i2 + 1;
                AbstractC0948ba0.k(bArr, i2, (byte) ((((int) j) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j >>>= 7;
            }
            int i3 = this.n;
            this.n = 1 + i3;
            AbstractC0948ba0.k(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.n;
                this.n = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C0216De(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(i), 1), e);
            }
        }
        int i5 = this.n;
        this.n = i5 + 1;
        bArr[i5] = (byte) j;
    }

    public final void x0(byte b) {
        try {
            byte[] bArr = this.l;
            int i = this.n;
            this.n = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C0216De(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), 1), e);
        }
    }

    public final void y0(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.l, this.n, i2);
            this.n += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C0216De(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.m), Integer.valueOf(i2)), e);
        }
    }

    public final void z0(C0291Gb c0291Gb) {
        H0(c0291Gb.size());
        y0(c0291Gb.c, c0291Gb.e(), c0291Gb.size());
    }
}
