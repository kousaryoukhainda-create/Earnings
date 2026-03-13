package defpackage;

import android.util.Pair;
/* renamed from: E60  reason: default package */
/* loaded from: classes.dex */
public abstract class E60 {
    public static final B60 a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, B60] */
    static {
        Ha0.H(0);
        Ha0.H(1);
        Ha0.H(2);
    }

    public int a(boolean z) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, C60 c60, D60 d60, int i2, boolean z) {
        int i3 = f(i, c60, false).c;
        if (m(i3, d60, 0L).o == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return m(e, d60, 0L).n;
        }
        return i + 1;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == c(z)) {
                        return a(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final boolean equals(Object obj) {
        int c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E60)) {
            return false;
        }
        E60 e60 = (E60) obj;
        if (e60.o() != o() || e60.h() != h()) {
            return false;
        }
        D60 d60 = new D60();
        C60 c60 = new C60();
        D60 d602 = new D60();
        C60 c602 = new C60();
        for (int i = 0; i < o(); i++) {
            if (!m(i, d60, 0L).equals(e60.m(i, d602, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < h(); i2++) {
            if (!f(i2, c60, true).equals(e60.f(i2, c602, true))) {
                return false;
            }
        }
        int a2 = a(true);
        if (a2 != e60.a(true) || (c = c(true)) != e60.c(true)) {
            return false;
        }
        while (a2 != c) {
            int e = e(a2, 0, true);
            if (e != e60.e(a2, 0, true)) {
                return false;
            }
            a2 = e;
        }
        return true;
    }

    public abstract C60 f(int i, C60 c60, boolean z);

    public C60 g(Object obj, C60 c60) {
        return f(b(obj), c60, true);
    }

    public abstract int h();

    public final int hashCode() {
        D60 d60 = new D60();
        C60 c60 = new C60();
        int o = o() + 217;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, d60, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, c60, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(D60 d60, C60 c60, int i, long j) {
        Pair j2 = j(d60, c60, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(D60 d60, C60 c60, int i, long j, long j2) {
        B10.m(i, o());
        m(i, d60, j2);
        if (j == -9223372036854775807L) {
            j = d60.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = d60.n;
        f(i2, c60, false);
        while (i2 < d60.o && c60.e != j) {
            int i3 = i2 + 1;
            if (f(i3, c60, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, c60, true);
        long j3 = j - c60.e;
        long j4 = c60.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = c60.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == a(z)) {
                        return c(z);
                    }
                    return i - 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object l(int i);

    public abstract D60 m(int i, D60 d60, long j);

    public final void n(int i, D60 d60) {
        m(i, d60, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
