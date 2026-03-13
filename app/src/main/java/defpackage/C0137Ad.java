package defpackage;

import java.util.Arrays;
/* renamed from: Ad  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137Ad implements InterfaceC2164mZ {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public C0137Ad(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // defpackage.InterfaceC2164mZ
    public final boolean f() {
        return true;
    }

    @Override // defpackage.InterfaceC2164mZ
    public final C2078lZ i(long j) {
        long[] jArr = this.e;
        int f = Ha0.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.c;
        C2336oZ c2336oZ = new C2336oZ(j2, jArr2[f]);
        if (j2 < j && f != this.a - 1) {
            int i = f + 1;
            return new C2078lZ(c2336oZ, new C2336oZ(jArr[i], jArr2[i]));
        }
        return new C2078lZ(c2336oZ, c2336oZ);
    }

    @Override // defpackage.InterfaceC2164mZ
    public final long k() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
