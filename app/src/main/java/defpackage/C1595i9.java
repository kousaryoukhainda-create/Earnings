package defpackage;
/* renamed from: i9  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1595i9 implements InterfaceC2164mZ {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ C1595i9(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final boolean f() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC2164mZ
    public final C2078lZ i(long j) {
        long j2;
        switch (this.a) {
            case 0:
                C1879j9 c1879j9 = (C1879j9) this.c;
                C2078lZ b = c1879j9.i[0].b(j);
                int i = 1;
                while (true) {
                    C0163Bd[] c0163BdArr = c1879j9.i;
                    if (i < c0163BdArr.length) {
                        C2078lZ b2 = c0163BdArr[i].b(j);
                        if (b2.a.b < b.a.b) {
                            b = b2;
                        }
                        i++;
                    } else {
                        return b;
                    }
                }
            case 1:
                C0519Ow c0519Ow = (C0519Ow) this.c;
                B10.w(c0519Ow.k);
                C0647Tu c0647Tu = c0519Ow.k;
                long[] jArr = (long[]) c0647Tu.c;
                int f = Ha0.f(jArr, Ha0.k((c0519Ow.e * j) / 1000000, 0L, c0519Ow.j - 1), false);
                long j3 = 0;
                if (f == -1) {
                    j2 = 0;
                } else {
                    j2 = jArr[f];
                }
                long[] jArr2 = (long[]) c0647Tu.d;
                if (f != -1) {
                    j3 = jArr2[f];
                }
                int i2 = c0519Ow.e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                C2336oZ c2336oZ = new C2336oZ(j4, j3 + j5);
                if (j4 != j && f != jArr.length - 1) {
                    int i3 = f + 1;
                    return new C2078lZ(c2336oZ, new C2336oZ((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
                }
                return new C2078lZ(c2336oZ, c2336oZ);
            default:
                return (C2078lZ) this.c;
        }
    }

    @Override // defpackage.InterfaceC2164mZ
    public final long k() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((C0519Ow) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1595i9(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public C1595i9(long j, long j2) {
        this.a = 2;
        this.b = j;
        C2336oZ c2336oZ = j2 == 0 ? C2336oZ.c : new C2336oZ(0L, j2);
        this.c = new C2078lZ(c2336oZ, c2336oZ);
    }
}
