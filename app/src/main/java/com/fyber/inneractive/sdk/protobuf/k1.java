package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class k1<T, B> {
    public abstract B a();

    public abstract B a(Object obj);

    public abstract T a(T t, T t2);

    public abstract void a(B b, int i, int i2);

    public abstract void a(B b, int i, long j);

    public abstract void a(B b, int i, i iVar);

    public abstract void a(B b, int i, T t);

    public abstract void a(T t, s1 s1Var) throws IOException;

    public abstract boolean a(c1 c1Var);

    public final boolean a(B b, c1 c1Var) throws IOException {
        int e = c1Var.e();
        int i = r1.a;
        int i2 = e >>> 3;
        int i3 = e & 7;
        if (i3 == 0) {
            b(b, i2, c1Var.o());
            return true;
        } else if (i3 == 1) {
            a((k1<T, B>) b, i2, c1Var.g());
            return true;
        } else if (i3 == 2) {
            a((k1<T, B>) b, i2, c1Var.a());
            return true;
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 5) {
                    a((k1<T, B>) b, i2, c1Var.q());
                    return true;
                }
                throw z.d();
            }
            return false;
        } else {
            B a = a();
            int a2 = r1.a(i2, 4);
            while (c1Var.s() != Integer.MAX_VALUE && a((k1<T, B>) a, c1Var)) {
            }
            if (a2 == c1Var.e()) {
                a((k1<T, B>) b, i2, (int) f(a));
                return true;
            }
            throw z.a();
        }
    }

    public abstract T b(Object obj);

    public abstract void b(B b, int i, long j);

    public abstract void b(T t, s1 s1Var) throws IOException;

    public abstract void b(Object obj, B b);

    public abstract int c(T t);

    public abstract void c(Object obj, T t);

    public abstract int d(T t);

    public abstract void e(Object obj);

    public abstract T f(B b);
}
