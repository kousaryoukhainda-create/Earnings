package defpackage;
/* renamed from: M5  reason: default package */
/* loaded from: classes.dex */
public final class M5 implements K5 {
    public final int a;
    public final int b;
    public int c;
    public int d;
    public final Object e;

    public M5(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = bArr;
    }

    @Override // defpackage.K5
    public int a() {
        return -1;
    }

    @Override // defpackage.K5
    public int b() {
        return this.a;
    }

    @Override // defpackage.K5
    public int c() {
        NQ nq = (NQ) this.e;
        int i = this.b;
        if (i == 8) {
            return nq.u();
        }
        if (i == 16) {
            return nq.A();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        if (i2 % 2 == 0) {
            int u = nq.u();
            this.d = u;
            return (u & 240) >> 4;
        }
        return this.d & 15;
    }

    public M5(G5 g5) {
        NQ nq = g5.d;
        this.e = nq;
        nq.G(12);
        this.b = nq.y() & 255;
        this.a = nq.y();
    }
}
