package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* renamed from: L5  reason: default package */
/* loaded from: classes.dex */
public final class L5 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public L5() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public synchronized void a(long j, Object obj) {
        int i = this.b;
        if (i > 0) {
            if (j <= ((long[]) this.c)[((this.a + i) - 1) % ((Object[]) this.d).length]) {
                k();
            }
        }
        m();
        int i2 = this.a;
        int i3 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.c)[length] = j;
        objArr[length] = obj;
        this.b = i3 + 1;
    }

    public int b(AbstractC2013kk abstractC2013kk) {
        String replace;
        if (abstractC2013kk == null) {
            return this.b;
        }
        boolean z = abstractC2013kk instanceof C1557hk;
        if (!z) {
            return c(abstractC2013kk.a);
        }
        if (z) {
            replace = AbstractC0957bf.X(abstractC2013kk);
        } else {
            replace = abstractC2013kk.a.replace('.', '/');
        }
        return c(replace);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Id, kh] */
    public int c(String str) {
        int j = j(str.replace('.', '/'));
        ?? abstractC2007kh = new AbstractC2007kh(this.a);
        abstractC2007kh.b = j;
        return g(abstractC2007kh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kh, Rp] */
    public int d(double d) {
        ?? abstractC2007kh = new AbstractC2007kh(this.a);
        abstractC2007kh.b = d;
        int g = g(abstractC2007kh);
        int i = this.a;
        if (g == i - 1) {
            h(new AbstractC2007kh(i));
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [IN, kh] */
    public int e(int i, String str, String str2) {
        int j = j(str);
        int j2 = j(str2);
        ?? abstractC2007kh = new AbstractC2007kh(this.a);
        abstractC2007kh.b = j;
        abstractC2007kh.c = j2;
        return g(new DL(i, g(abstractC2007kh), this.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Sw, kh] */
    public int f(float f) {
        ?? abstractC2007kh = new AbstractC2007kh(this.a);
        abstractC2007kh.b = f;
        return g(abstractC2007kh);
    }

    public int g(AbstractC2007kh abstractC2007kh) {
        if (((HashMap) this.d) == null) {
            C0731Xa c0731Xa = (C0731Xa) this.c;
            HashMap hashMap = new HashMap();
            int i = 1;
            while (true) {
                int i2 = i + 1;
                AbstractC2007kh i3 = c0731Xa.i(i);
                if (i3 == null) {
                    break;
                }
                hashMap.put(i3, i3);
                i = i2;
            }
            this.d = hashMap;
        }
        AbstractC2007kh abstractC2007kh2 = (AbstractC2007kh) ((HashMap) this.d).get(abstractC2007kh);
        if (abstractC2007kh2 != null) {
            return abstractC2007kh2.a;
        }
        ((C0731Xa) this.c).e(abstractC2007kh);
        ((HashMap) this.d).put(abstractC2007kh, abstractC2007kh);
        int i4 = this.a;
        this.a = i4 + 1;
        return i4;
    }

    public int h(AbstractC2007kh abstractC2007kh) {
        ((C0731Xa) this.c).e(abstractC2007kh);
        int i = this.a;
        this.a = i + 1;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [GI, kh] */
    public int i(long j) {
        ?? abstractC2007kh = new AbstractC2007kh(this.a);
        abstractC2007kh.b = j;
        int g = g(abstractC2007kh);
        int i = this.a;
        if (g == i - 1) {
            h(new AbstractC2007kh(i));
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Fa0, kh] */
    public int j(String str) {
        ?? abstractC2007kh = new AbstractC2007kh(this.a);
        abstractC2007kh.b = str;
        return g(abstractC2007kh);
    }

    public synchronized void k() {
        this.a = 0;
        this.b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public int l(int i, L5 l5, Map map) {
        if (i == 0) {
            return 0;
        }
        return ((C0731Xa) this.c).i(i).a(this, l5, map);
    }

    public void m() {
        int length = ((Object[]) this.d).length;
        if (this.b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.d, this.a, objArr, 0, i3);
        int i4 = this.a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.d, 0, objArr, i3, this.a);
        }
        this.c = jArr;
        this.d = objArr;
        this.a = 0;
    }

    public String n(int i) {
        C0345Id c0345Id = (C0345Id) ((C0731Xa) this.c).i(i);
        if (c0345Id == null) {
            return null;
        }
        return p(c0345Id.b).replace('/', '.');
    }

    public int o(int i) {
        return ((C2143mE) ((C0731Xa) this.c).i(i)).b;
    }

    public String p(int i) {
        return ((Fa0) ((C0731Xa) this.c).i(i)).b;
    }

    public synchronized Object q() {
        Object s;
        if (this.b == 0) {
            s = null;
        } else {
            s = s();
        }
        return s;
    }

    public synchronized Object r(long j) {
        Object obj;
        obj = null;
        while (this.b > 0 && j - ((long[]) this.c)[this.a] >= 0) {
            obj = s();
        }
        return obj;
    }

    public Object s() {
        boolean z;
        if (this.b > 0) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = (i + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public synchronized int t() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Xa, java.lang.Object] */
    public L5(String str) {
        ?? obj = new Object();
        obj.c = new AbstractC2007kh[8];
        obj.b = 0;
        this.c = obj;
        this.d = null;
        this.a = 0;
        h(null);
        this.b = c(str);
    }
}
