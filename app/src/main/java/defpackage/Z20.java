package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* renamed from: Z20  reason: default package */
/* loaded from: classes.dex */
public final class Z20 implements InterfaceC2217n6 {
    public int b;
    public float c;
    public float d;
    public C2045l6 e;
    public C2045l6 f;
    public C2045l6 g;
    public C2045l6 h;
    public boolean i;
    public Y20 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.InterfaceC2217n6
    public final ByteBuffer a() {
        Y20 y20 = this.j;
        if (y20 != null) {
            int i = y20.m;
            int i2 = y20.b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i2, y20.m);
                int i4 = min * i2;
                shortBuffer.put(y20.l, 0, i4);
                int i5 = y20.m - min;
                y20.m = i5;
                short[] sArr = y20.l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.o += i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = InterfaceC2217n6.a;
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC2217n6
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        Y20 y20 = this.j;
        y20.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i = y20.b;
        int i2 = remaining2 / i;
        short[] c = y20.c(y20.j, y20.k, i2);
        y20.j = c;
        asShortBuffer.get(c, y20.k * i, ((i2 * i) * 2) / 2);
        y20.k += i2;
        y20.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // defpackage.InterfaceC2217n6
    public final C2045l6 c(C2045l6 c2045l6) {
        if (c2045l6.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = c2045l6.a;
            }
            this.e = c2045l6;
            C2045l6 c2045l62 = new C2045l6(i, c2045l6.b, 2);
            this.f = c2045l62;
            this.i = true;
            return c2045l62;
        }
        throw new C2131m6(c2045l6);
    }

    @Override // defpackage.InterfaceC2217n6
    public final void d() {
        Y20 y20 = this.j;
        if (y20 != null) {
            int i = y20.k;
            float f = y20.c;
            float f2 = y20.d;
            float f3 = y20.e * f2;
            int i2 = y20.m + ((int) ((((i / (f / f2)) + y20.o) / f3) + 0.5f));
            short[] sArr = y20.j;
            int i3 = y20.h * 2;
            y20.j = y20.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = y20.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                y20.j[(i5 * i) + i4] = 0;
                i4++;
            }
            y20.k = i3 + y20.k;
            y20.f();
            if (y20.m > i2) {
                y20.m = i2;
            }
            y20.k = 0;
            y20.r = 0;
            y20.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.InterfaceC2217n6
    public final boolean e() {
        Y20 y20;
        if (this.p && ((y20 = this.j) == null || y20.m * y20.b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC2217n6
    public final void flush() {
        if (isActive()) {
            C2045l6 c2045l6 = this.e;
            this.g = c2045l6;
            C2045l6 c2045l62 = this.f;
            this.h = c2045l62;
            if (this.i) {
                this.j = new Y20(c2045l6.a, c2045l6.b, this.c, this.d, c2045l62.a);
            } else {
                Y20 y20 = this.j;
                if (y20 != null) {
                    y20.k = 0;
                    y20.m = 0;
                    y20.o = 0;
                    y20.p = 0;
                    y20.q = 0;
                    y20.r = 0;
                    y20.s = 0;
                    y20.t = 0;
                    y20.u = 0;
                    y20.v = 0;
                }
            }
        }
        this.m = InterfaceC2217n6.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.InterfaceC2217n6
    public final boolean isActive() {
        if (this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC2217n6
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        C2045l6 c2045l6 = C2045l6.e;
        this.e = c2045l6;
        this.f = c2045l6;
        this.g = c2045l6;
        this.h = c2045l6;
        ByteBuffer byteBuffer = InterfaceC2217n6.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
