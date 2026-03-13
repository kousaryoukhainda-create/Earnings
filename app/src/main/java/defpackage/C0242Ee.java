package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: Ee  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242Ee extends AbstractC1522hL {
    public static final Logger F = Logger.getLogger(C0242Ee.class.getName());
    public static final boolean G = AbstractC1033ca0.e;
    public Oc0 A;
    public final byte[] B;
    public final int C;
    public int D;
    public final OutputStream E;

    public C0242Ee(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.B = new byte[max];
            this.C = max;
            if (outputStream != null) {
                this.E = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int f0(int i) {
        return v0(i) + 1;
    }

    public static int g0(int i, C0317Hb c0317Hb) {
        int v0 = v0(i);
        int size = c0317Hb.size();
        return x0(size) + size + v0;
    }

    public static int h0(int i) {
        return v0(i) + 8;
    }

    public static int i0(int i, int i2) {
        return z0(i2) + v0(i);
    }

    public static int j0(int i) {
        return v0(i) + 4;
    }

    public static int k0(int i) {
        return v0(i) + 8;
    }

    public static int l0(int i) {
        return v0(i) + 4;
    }

    public static int m0(int i, AbstractC0810a0 abstractC0810a0, VY vy) {
        return abstractC0810a0.a(vy) + (v0(i) * 2);
    }

    public static int n0(int i, int i2) {
        return z0(i2) + v0(i);
    }

    public static int o0(int i, long j) {
        return z0(j) + v0(i);
    }

    public static int p0(int i) {
        return v0(i) + 4;
    }

    public static int q0(int i) {
        return v0(i) + 8;
    }

    public static int r0(int i, int i2) {
        return x0((i2 >> 31) ^ (i2 << 1)) + v0(i);
    }

    public static int s0(int i, long j) {
        return z0((j >> 63) ^ (j << 1)) + v0(i);
    }

    public static int t0(int i, String str) {
        return u0(str) + v0(i);
    }

    public static int u0(String str) {
        int length;
        try {
            length = Ea0.a(str);
        } catch (Ca0 unused) {
            length = str.getBytes(AbstractC2744tE.a).length;
        }
        return x0(length) + length;
    }

    public static int v0(int i) {
        return x0(i << 3);
    }

    public static int w0(int i, int i2) {
        return x0(i2) + v0(i);
    }

    public static int x0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int y0(int i, long j) {
        return z0(j) + v0(i);
    }

    public static int z0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A0() {
        this.E.write(this.B, 0, this.D);
        this.D = 0;
    }

    public final void B0(int i) {
        if (this.C - this.D < i) {
            A0();
        }
    }

    public final void C0(byte b) {
        if (this.D == this.C) {
            A0();
        }
        int i = this.D;
        this.D = i + 1;
        this.B[i] = b;
    }

    public final void D0(byte[] bArr, int i, int i2) {
        int i3 = this.D;
        int i4 = this.C;
        int i5 = i4 - i3;
        byte[] bArr2 = this.B;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.D += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.D = i4;
        A0();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.D = i7;
            return;
        }
        this.E.write(bArr, i6, i7);
    }

    public final void E0(int i, boolean z) {
        B0(11);
        c0(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.D;
        this.D = i2 + 1;
        this.B[i2] = b;
    }

    public final void F0(int i, C0317Hb c0317Hb) {
        P0(i, 2);
        G0(c0317Hb);
    }

    public final void G0(C0317Hb c0317Hb) {
        R0(c0317Hb.size());
        Z(c0317Hb.g(), c0317Hb.c, c0317Hb.size());
    }

    public final void H0(int i, int i2) {
        B0(14);
        c0(i, 5);
        a0(i2);
    }

    public final void I0(int i) {
        B0(4);
        a0(i);
    }

    public final void J0(int i, long j) {
        B0(18);
        c0(i, 1);
        b0(j);
    }

    public final void K0(long j) {
        B0(8);
        b0(j);
    }

    public final void L0(int i, int i2) {
        B0(20);
        c0(i, 0);
        if (i2 >= 0) {
            d0(i2);
        } else {
            e0(i2);
        }
    }

    public final void M0(int i) {
        if (i >= 0) {
            R0(i);
        } else {
            T0(i);
        }
    }

    public final void N0(int i, String str) {
        P0(i, 2);
        O0(str);
    }

    public final void O0(String str) {
        try {
            int length = str.length() * 3;
            int x0 = x0(length);
            int i = x0 + length;
            int i2 = this.C;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int t = Ea0.a.t(str, bArr, 0, length);
                R0(t);
                D0(bArr, 0, t);
                return;
            }
            if (i > i2 - this.D) {
                A0();
            }
            int x02 = x0(str.length());
            int i3 = this.D;
            byte[] bArr2 = this.B;
            try {
                if (x02 == x0) {
                    int i4 = i3 + x02;
                    this.D = i4;
                    int t2 = Ea0.a.t(str, bArr2, i4, i2 - i4);
                    this.D = i3;
                    d0((t2 - i3) - x02);
                    this.D = t2;
                } else {
                    int a = Ea0.a(str);
                    d0(a);
                    this.D = Ea0.a.t(str, bArr2, this.D, a);
                }
            } catch (Ca0 e) {
                this.D = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C0216De(e2);
            }
        } catch (Ca0 e3) {
            F.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC2744tE.a);
            try {
                R0(bytes.length);
                Z(0, bytes, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C0216De(e4);
            }
        }
    }

    public final void P0(int i, int i2) {
        R0((i << 3) | i2);
    }

    public final void Q0(int i, int i2) {
        B0(20);
        c0(i, 0);
        d0(i2);
    }

    public final void R0(int i) {
        B0(5);
        d0(i);
    }

    public final void S0(int i, long j) {
        B0(20);
        c0(i, 0);
        e0(j);
    }

    public final void T0(long j) {
        B0(10);
        e0(j);
    }

    @Override // defpackage.AbstractC1522hL
    public final void Z(int i, byte[] bArr, int i2) {
        D0(bArr, i, i2);
    }

    public final void a0(int i) {
        int i2 = this.D;
        int i3 = i2 + 1;
        this.D = i3;
        byte[] bArr = this.B;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.D = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.D = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.D = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void b0(long j) {
        int i = this.D;
        int i2 = i + 1;
        this.D = i2;
        byte[] bArr = this.B;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.D = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.D = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.D = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.D = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.D = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.D = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.D = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void c0(int i, int i2) {
        d0((i << 3) | i2);
    }

    public final void d0(int i) {
        boolean z = G;
        byte[] bArr = this.B;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.D;
                this.D = i2 + 1;
                AbstractC1033ca0.j(bArr, i2, (byte) ((i | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                i >>>= 7;
            }
            int i3 = this.D;
            this.D = i3 + 1;
            AbstractC1033ca0.j(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.D;
            this.D = i4 + 1;
            bArr[i4] = (byte) ((i | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
            i >>>= 7;
        }
        int i5 = this.D;
        this.D = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void e0(long j) {
        boolean z = G;
        byte[] bArr = this.B;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.D;
                this.D = i + 1;
                AbstractC1033ca0.j(bArr, i, (byte) ((((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                j >>>= 7;
            }
            int i2 = this.D;
            this.D = i2 + 1;
            AbstractC1033ca0.j(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.D;
            this.D = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
            j >>>= 7;
        }
        int i4 = this.D;
        this.D = i4 + 1;
        bArr[i4] = (byte) j;
    }
}
