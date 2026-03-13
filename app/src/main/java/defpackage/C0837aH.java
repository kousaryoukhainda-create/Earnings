package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
/* renamed from: aH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0837aH extends AbstractMap implements Serializable {
    public static final C0272Fi j = new C0272Fi(2);
    public final Comparator b;
    public ZG c;
    public int d;
    public int f;
    public final ZG g;
    public YG h;
    public YG i;

    public C0837aH() {
        C0272Fi c0272Fi = j;
        this.d = 0;
        this.f = 0;
        this.g = new ZG();
        this.b = c0272Fi;
    }

    public final ZG a(Object obj, boolean z) {
        int i;
        ZG zg;
        Comparable comparable;
        ZG zg2;
        ZG zg3 = this.c;
        C0272Fi c0272Fi = j;
        Comparator comparator = this.b;
        if (zg3 != null) {
            if (comparator == c0272Fi) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = zg3.h;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = comparator.compare(obj, obj2);
                }
                if (i == 0) {
                    return zg3;
                }
                if (i < 0) {
                    zg2 = zg3.c;
                } else {
                    zg2 = zg3.d;
                }
                if (zg2 == null) {
                    break;
                }
                zg3 = zg2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        ZG zg4 = this.g;
        if (zg3 == null) {
            if (comparator == c0272Fi && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zg = new ZG(zg3, obj, zg4, zg4.g);
            this.c = zg;
        } else {
            zg = new ZG(zg3, obj, zg4, zg4.g);
            if (i < 0) {
                zg3.c = zg;
            } else {
                zg3.d = zg;
            }
            b(zg3, true);
        }
        this.d++;
        this.f++;
        return zg;
    }

    public final void b(ZG zg, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (zg != null) {
            ZG zg2 = zg.c;
            ZG zg3 = zg.d;
            int i5 = 0;
            if (zg2 != null) {
                i = zg2.j;
            } else {
                i = 0;
            }
            if (zg3 != null) {
                i2 = zg3.j;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                ZG zg4 = zg3.c;
                ZG zg5 = zg3.d;
                if (zg5 != null) {
                    i4 = zg5.j;
                } else {
                    i4 = 0;
                }
                if (zg4 != null) {
                    i5 = zg4.j;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    f(zg3);
                    e(zg);
                } else {
                    e(zg);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                ZG zg6 = zg2.c;
                ZG zg7 = zg2.d;
                if (zg7 != null) {
                    i3 = zg7.j;
                } else {
                    i3 = 0;
                }
                if (zg6 != null) {
                    i5 = zg6.j;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    e(zg2);
                    f(zg);
                } else {
                    f(zg);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                zg.j = i + 1;
                if (z) {
                    return;
                }
            } else {
                zg.j = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zg = zg.b;
        }
    }

    public final void c(ZG zg, boolean z) {
        ZG zg2;
        ZG zg3;
        int i;
        if (z) {
            ZG zg4 = zg.g;
            zg4.f = zg.f;
            zg.f.g = zg4;
        }
        ZG zg5 = zg.c;
        ZG zg6 = zg.d;
        ZG zg7 = zg.b;
        int i2 = 0;
        if (zg5 != null && zg6 != null) {
            if (zg5.j > zg6.j) {
                ZG zg8 = zg5.d;
                while (true) {
                    ZG zg9 = zg8;
                    zg3 = zg5;
                    zg5 = zg9;
                    if (zg5 == null) {
                        break;
                    }
                    zg8 = zg5.d;
                }
            } else {
                ZG zg10 = zg6.c;
                while (true) {
                    zg2 = zg6;
                    zg6 = zg10;
                    if (zg6 == null) {
                        break;
                    }
                    zg10 = zg6.c;
                }
                zg3 = zg2;
            }
            c(zg3, false);
            ZG zg11 = zg.c;
            if (zg11 != null) {
                i = zg11.j;
                zg3.c = zg11;
                zg11.b = zg3;
                zg.c = null;
            } else {
                i = 0;
            }
            ZG zg12 = zg.d;
            if (zg12 != null) {
                i2 = zg12.j;
                zg3.d = zg12;
                zg12.b = zg3;
                zg.d = null;
            }
            zg3.j = Math.max(i, i2) + 1;
            d(zg, zg3);
            return;
        }
        if (zg5 != null) {
            d(zg, zg5);
            zg.c = null;
        } else if (zg6 != null) {
            d(zg, zg6);
            zg.d = null;
        } else {
            d(zg, null);
        }
        b(zg7, false);
        this.d--;
        this.f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.f++;
        ZG zg = this.g;
        zg.g = zg;
        zg.f = zg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        ZG zg = null;
        if (obj != null) {
            try {
                zg = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (zg == null) {
            return false;
        }
        return true;
    }

    public final void d(ZG zg, ZG zg2) {
        ZG zg3 = zg.b;
        zg.b = null;
        if (zg2 != null) {
            zg2.b = zg3;
        }
        if (zg3 != null) {
            if (zg3.c == zg) {
                zg3.c = zg2;
                return;
            } else {
                zg3.d = zg2;
                return;
            }
        }
        this.c = zg2;
    }

    public final void e(ZG zg) {
        int i;
        int i2;
        ZG zg2 = zg.c;
        ZG zg3 = zg.d;
        ZG zg4 = zg3.c;
        ZG zg5 = zg3.d;
        zg.d = zg4;
        if (zg4 != null) {
            zg4.b = zg;
        }
        d(zg, zg3);
        zg3.c = zg;
        zg.b = zg3;
        int i3 = 0;
        if (zg2 != null) {
            i = zg2.j;
        } else {
            i = 0;
        }
        if (zg4 != null) {
            i2 = zg4.j;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        zg.j = max;
        if (zg5 != null) {
            i3 = zg5.j;
        }
        zg3.j = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        YG yg = this.h;
        if (yg == null) {
            YG yg2 = new YG(this, 0);
            this.h = yg2;
            return yg2;
        }
        return yg;
    }

    public final void f(ZG zg) {
        int i;
        int i2;
        ZG zg2 = zg.c;
        ZG zg3 = zg.d;
        ZG zg4 = zg2.c;
        ZG zg5 = zg2.d;
        zg.c = zg5;
        if (zg5 != null) {
            zg5.b = zg;
        }
        d(zg, zg2);
        zg2.d = zg;
        zg.b = zg2;
        int i3 = 0;
        if (zg3 != null) {
            i = zg3.j;
        } else {
            i = 0;
        }
        if (zg5 != null) {
            i2 = zg5.j;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        zg.j = max;
        if (zg4 != null) {
            i3 = zg4.j;
        }
        zg2.j = Math.max(max, i3) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            r1 = 0
            ZG r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto Lb
        L9:
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto Lf
            java.lang.Object r0 = r3.i
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0837aH.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        YG yg = this.i;
        if (yg == null) {
            YG yg2 = new YG(this, 1);
            this.i = yg2;
            return yg2;
        }
        return yg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            ZG a = a(obj, true);
            Object obj3 = a.i;
            a.i = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            r1 = 0
            ZG r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto Lb
        L9:
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto L11
            r1 = 1
            r2.c(r3, r1)
        L11:
            if (r3 == 0) goto L15
            java.lang.Object r0 = r3.i
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0837aH.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
