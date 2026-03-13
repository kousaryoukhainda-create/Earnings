package defpackage;
/* renamed from: Ra0  reason: default package */
/* loaded from: classes.dex */
public final class Ra0 implements InterfaceC2508qZ {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public Ra0(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.InterfaceC2508qZ
    public final long a(long j) {
        return this.a[Ha0.f(this.b, j, true)];
    }

    @Override // defpackage.InterfaceC2508qZ
    public final long d() {
        return this.d;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final boolean f() {
        return true;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final C2078lZ i(long j) {
        long[] jArr = this.a;
        int f = Ha0.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        C2336oZ c2336oZ = new C2336oZ(j2, jArr2[f]);
        if (j2 < j && f != jArr.length - 1) {
            int i = f + 1;
            return new C2078lZ(c2336oZ, new C2336oZ(jArr[i], jArr2[i]));
        }
        return new C2078lZ(c2336oZ, c2336oZ);
    }

    @Override // defpackage.InterfaceC2508qZ
    public final int j() {
        return this.e;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final long k() {
        return this.c;
    }
}
