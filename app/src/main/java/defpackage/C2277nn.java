package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* renamed from: nn  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2277nn implements InterfaceC0309Gt {
    public final InterfaceC3046wl c;
    public final long d;
    public long f;
    public int h;
    public int i;
    public byte[] g = new byte[65536];
    public final byte[] b = new byte[4096];

    static {
        WK.a("media3.extractor");
    }

    public C2277nn(InterfaceC3046wl interfaceC3046wl, long j, long j2) {
        this.c = interfaceC3046wl;
        this.f = j;
        this.d = j2;
    }

    public final boolean a(int i, boolean z) {
        e(i);
        int i2 = this.i - this.h;
        while (i2 < i) {
            i2 = j(this.g, this.h, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.i = this.h + i2;
        }
        this.h += i;
        return true;
    }

    @Override // defpackage.InterfaceC0309Gt
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.i;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.g, 0, bArr, i, min);
            q(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = j(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.f += i4;
        }
        if (i4 == -1) {
            return false;
        }
        return true;
    }

    public final void e(int i) {
        int i2 = this.h + i;
        byte[] bArr = this.g;
        if (i2 > bArr.length) {
            this.g = Arrays.copyOf(this.g, Ha0.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.InterfaceC0309Gt
    public final void f(int i, byte[] bArr, int i2) {
        m(bArr, i, i2, false);
    }

    @Override // defpackage.InterfaceC0309Gt
    public final long getPosition() {
        return this.f;
    }

    public final int h(int i, byte[] bArr, int i2) {
        int min;
        e(i2);
        int i3 = this.i;
        int i4 = this.h;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = j(this.g, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.i += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.g, this.h, bArr, i, min);
        this.h += min;
        return min;
    }

    public final int j(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.c.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }

    public final int k(int i) {
        int min = Math.min(this.i, i);
        q(min);
        if (min == 0) {
            byte[] bArr = this.b;
            min = j(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f += min;
        }
        return min;
    }

    @Override // defpackage.InterfaceC0309Gt
    public final boolean m(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.g, this.h - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.InterfaceC0309Gt
    public final long n() {
        return this.f + this.h;
    }

    @Override // defpackage.InterfaceC0309Gt
    public final void p(int i) {
        a(i, false);
    }

    public final void q(int i) {
        byte[] bArr;
        int i2 = this.i - i;
        this.i = i2;
        this.h = 0;
        byte[] bArr2 = this.g;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.g = bArr;
    }

    @Override // defpackage.InterfaceC3046wl
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.i;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.g, 0, bArr, i, min);
            q(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = j(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.f += i4;
        }
        return i4;
    }

    @Override // defpackage.InterfaceC0309Gt
    public final void readFully(byte[] bArr, int i, int i2) {
        c(bArr, i, i2, false);
    }

    @Override // defpackage.InterfaceC0309Gt
    public final long s() {
        return this.d;
    }

    @Override // defpackage.InterfaceC0309Gt
    public final void u() {
        this.h = 0;
    }

    @Override // defpackage.InterfaceC0309Gt
    public final void v(int i) {
        int min = Math.min(this.i, i);
        q(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.b;
            i2 = j(bArr, -i2, Math.min(i, bArr.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.f += i2;
        }
    }
}
