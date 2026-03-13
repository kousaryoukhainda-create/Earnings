package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.fo;
/* renamed from: com.applovin.impl.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1061b extends fo {
    private final int c;
    private final wj d;
    private final boolean f;

    public AbstractC1061b(boolean z, wj wjVar) {
        this.f = z;
        this.d = wjVar;
        this.c = wjVar.a();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    public abstract int b(Object obj);

    @Override // com.applovin.impl.fo
    public int b(boolean z) {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        if (this.f) {
            z = false;
        }
        int c = z ? this.d.c() : i - 1;
        while (i(c).c()) {
            c = b(c, z);
            if (c == -1) {
                return -1;
            }
        }
        return i(c).b(z) + h(c);
    }

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract Object f(int i);

    public abstract int g(int i);

    public abstract int h(int i);

    public abstract fo i(int i);

    @Override // com.applovin.impl.fo
    public int a(boolean z) {
        if (this.c == 0) {
            return -1;
        }
        if (this.f) {
            z = false;
        }
        int b = z ? this.d.b() : 0;
        while (i(b).c()) {
            b = a(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return i(b).a(z) + h(b);
    }

    private int b(int i, boolean z) {
        if (z) {
            return this.d.b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.fo
    public final int a(Object obj) {
        int a;
        if (obj instanceof Pair) {
            Object d = d(obj);
            Object c = c(obj);
            int b = b(d);
            if (b == -1 || (a = i(b).a(c)) == -1) {
                return -1;
            }
            return g(b) + a;
        }
        return -1;
    }

    @Override // com.applovin.impl.fo
    public int b(int i, int i2, boolean z) {
        if (this.f) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int e = e(i);
        int h = h(e);
        int b = i(e).b(i - h, i2 != 2 ? i2 : 0, z);
        if (b != -1) {
            return h + b;
        }
        int b2 = b(e, z);
        while (b2 != -1 && i(b2).c()) {
            b2 = b(b2, z);
        }
        if (b2 != -1) {
            return i(b2).b(z) + h(b2);
        } else if (i2 == 2) {
            return b(z);
        } else {
            return -1;
        }
    }

    private int a(int i, boolean z) {
        if (z) {
            return this.d.a(i);
        }
        if (i < this.c - 1) {
            return i + 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.fo
    public int a(int i, int i2, boolean z) {
        if (this.f) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int e = e(i);
        int h = h(e);
        int a = i(e).a(i - h, i2 != 2 ? i2 : 0, z);
        if (a != -1) {
            return h + a;
        }
        int a2 = a(e, z);
        while (a2 != -1 && i(a2).c()) {
            a2 = a(a2, z);
        }
        if (a2 != -1) {
            return i(a2).a(z) + h(a2);
        } else if (i2 == 2) {
            return a(z);
        } else {
            return -1;
        }
    }

    @Override // com.applovin.impl.fo
    public final Object b(int i) {
        int d = d(i);
        return a(f(d), i(d).b(i - g(d)));
    }

    @Override // com.applovin.impl.fo
    public final fo.b a(int i, fo.b bVar, boolean z) {
        int d = d(i);
        int h = h(d);
        i(d).a(i - g(d), bVar, z);
        bVar.c += h;
        if (z) {
            bVar.b = a(f(d), b1.a(bVar.b));
        }
        return bVar;
    }

    @Override // com.applovin.impl.fo
    public final fo.b a(Object obj, fo.b bVar) {
        Object d = d(obj);
        Object c = c(obj);
        int b = b(d);
        int h = h(b);
        i(b).a(c, bVar);
        bVar.c += h;
        bVar.b = obj;
        return bVar;
    }

    @Override // com.applovin.impl.fo
    public final fo.d a(int i, fo.d dVar, long j) {
        int e = e(i);
        int h = h(e);
        int g = g(e);
        i(e).a(i - h, dVar, j);
        Object f = f(e);
        if (!fo.d.s.equals(dVar.a)) {
            f = a(f, dVar.a);
        }
        dVar.a = f;
        dVar.p += g;
        dVar.q += g;
        return dVar;
    }
}
