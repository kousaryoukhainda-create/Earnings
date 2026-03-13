package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
/* renamed from: f90  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1338f90 {
    public static AbstractC2013kk a(AbstractC2013kk abstractC2013kk, AbstractC2013kk abstractC2013kk2) {
        if (abstractC2013kk == abstractC2013kk2) {
            return abstractC2013kk;
        }
        abstractC2013kk.getClass();
        boolean z = abstractC2013kk instanceof C1557hk;
        String str = "java.lang.Object";
        if (z) {
            abstractC2013kk2.getClass();
            if (abstractC2013kk2 instanceof C1557hk) {
                AbstractC2013kk h = abstractC2013kk.h();
                AbstractC2013kk h2 = abstractC2013kk2.h();
                AbstractC2013kk a = a(h, h2);
                if (a == h) {
                    return abstractC2013kk;
                }
                if (a == h2) {
                    return abstractC2013kk2;
                }
                C0397Kd g = abstractC2013kk.g();
                if (a != null) {
                    str = AbstractC0324Hi.h(new StringBuilder(), a.a, "[]");
                }
                return g.d(str);
            }
        }
        if (!(abstractC2013kk instanceof C2614rk)) {
            abstractC2013kk2.getClass();
            if (!(abstractC2013kk2 instanceof C2614rk)) {
                if (!z && !(abstractC2013kk2 instanceof C1557hk)) {
                    AbstractC2013kk abstractC2013kk3 = abstractC2013kk;
                    AbstractC2013kk abstractC2013kk4 = abstractC2013kk2;
                    while (true) {
                        if ((abstractC2013kk3 != abstractC2013kk4 && !abstractC2013kk3.a.equals(abstractC2013kk4.a)) || abstractC2013kk3.r() == null) {
                            AbstractC2013kk r = abstractC2013kk3.r();
                            AbstractC2013kk r2 = abstractC2013kk4.r();
                            if (r2 == null) {
                                break;
                            } else if (r == null) {
                                abstractC2013kk3 = abstractC2013kk4;
                                abstractC2013kk2 = abstractC2013kk;
                                abstractC2013kk = abstractC2013kk2;
                                break;
                            } else {
                                abstractC2013kk3 = r;
                                abstractC2013kk4 = r2;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        abstractC2013kk3 = abstractC2013kk3.r();
                        if (abstractC2013kk3 == null) {
                            break;
                        }
                        abstractC2013kk = abstractC2013kk.r();
                    }
                    abstractC2013kk3 = abstractC2013kk;
                    while (abstractC2013kk3 != abstractC2013kk2 && (abstractC2013kk3 == null || abstractC2013kk2 == null || !abstractC2013kk3.a.equals(abstractC2013kk2.a))) {
                        abstractC2013kk3 = abstractC2013kk3.r();
                        abstractC2013kk2 = abstractC2013kk2.r();
                    }
                    return abstractC2013kk3;
                }
                return abstractC2013kk.g().d("java.lang.Object");
            }
            return null;
        }
        return null;
    }

    public static AbstractC1338f90[] n(int i) {
        AbstractC1338f90[] abstractC1338f90Arr = new AbstractC1338f90[i];
        for (int i2 = 0; i2 < i; i2++) {
            abstractC1338f90Arr[i2] = C1262eJ.g;
        }
        return abstractC1338f90Arr;
    }

    public abstract boolean d(AbstractC1338f90 abstractC1338f90);

    public abstract AbstractC1338f90 e(int i);

    public abstract String f();

    public abstract int g(L5 l5);

    public abstract int h();

    public abstract boolean i();

    public abstract Y80 j();

    public boolean k() {
        return this instanceof C0829a90;
    }

    public boolean l() {
        return false;
    }

    public AbstractC1338f90 m() {
        return new C0920b90(this);
    }

    public abstract void o(String str, C0397Kd c0397Kd);

    public abstract String p(HashSet hashSet);

    public C0920b90 q(int i) {
        return null;
    }

    public final String toString() {
        return super.toString() + "(" + p(new HashSet()) + ")";
    }

    public void b(int i) {
    }

    public int c(ArrayList arrayList, int i, C0397Kd c0397Kd) {
        return i;
    }
}
