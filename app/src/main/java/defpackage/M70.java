package defpackage;
/* renamed from: M70  reason: default package */
/* loaded from: classes.dex */
public final class M70 {
    public final F70 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public M70(F70 f70, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        B10.j(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        B10.j(z2);
        B10.j(iArr2.length == jArr2.length);
        this.a = f70;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int b = Ha0.b(jArr, j, true); b < jArr.length; b++) {
            if ((this.g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
