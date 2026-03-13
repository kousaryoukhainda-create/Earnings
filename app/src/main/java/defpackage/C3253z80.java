package defpackage;

import java.nio.ByteBuffer;
/* renamed from: z80  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3253z80 extends J9 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.J9, defpackage.InterfaceC2217n6
    public final ByteBuffer a() {
        int i;
        if (super.e() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // defpackage.InterfaceC2217n6
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer j = j(length);
        int j2 = Ha0.j(length, 0, this.n);
        j.put(this.m, 0, j2);
        int j3 = Ha0.j(length - j2, 0, i2);
        byteBuffer.limit(byteBuffer.position() + j3);
        j.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - j3;
        int i4 = this.n - j2;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, j2, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        j.flip();
    }

    @Override // defpackage.J9, defpackage.InterfaceC2217n6
    public final boolean e() {
        if (super.e() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.J9
    public final C2045l6 f(C2045l6 c2045l6) {
        if (c2045l6.c == 2) {
            this.k = true;
            if (this.i == 0 && this.j == 0) {
                return C2045l6.e;
            }
            return c2045l6;
        }
        throw new C2131m6(c2045l6);
    }

    @Override // defpackage.J9
    public final void g() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.J9
    public final void h() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.J9
    public final void i() {
        this.m = Ha0.f;
    }
}
