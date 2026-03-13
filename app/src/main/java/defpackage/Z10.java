package defpackage;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* renamed from: Z10  reason: default package */
/* loaded from: classes.dex */
public class Z10 {
    public static Object[] f;
    public static int g;
    public static Object[] h;
    public static int i;
    public int[] b;
    public Object[] c;
    public int d;

    public Z10() {
        this.b = AbstractC1906jZ.c;
        this.c = AbstractC1906jZ.d;
        this.d = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (Z10.class) {
                try {
                    if (i < 10) {
                        objArr[0] = h;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        h = objArr;
                        i++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (Z10.class) {
                try {
                    if (g < 10) {
                        objArr[0] = f;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f = objArr;
                        g++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (Z10.class) {
                try {
                    Object[] objArr = h;
                    if (objArr != null) {
                        this.c = objArr;
                        h = (Object[]) objArr[0];
                        this.b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        i--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (Z10.class) {
                try {
                    Object[] objArr2 = f;
                    if (objArr2 != null) {
                        this.c = objArr2;
                        f = (Object[]) objArr2[0];
                        this.b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        g--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.b = new int[i2];
        this.c = new Object[i2 << 1];
    }

    public final void b(int i2) {
        int i3 = this.d;
        int[] iArr = this.b;
        if (iArr.length < i2) {
            Object[] objArr = this.c;
            a(i2);
            if (this.d > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i3);
                System.arraycopy(objArr, 0, this.c, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.d == i3) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        int i2 = this.d;
        if (i2 > 0) {
            int[] iArr = this.b;
            Object[] objArr = this.c;
            this.b = AbstractC1906jZ.c;
            this.c = AbstractC1906jZ.d;
            this.d = 0;
            c(iArr, objArr, i2);
        }
        if (this.d <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i2, Object obj) {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        try {
            int g2 = AbstractC1906jZ.g(i3, i2, this.b);
            if (g2 < 0) {
                return g2;
            }
            if (obj.equals(this.c[g2 << 1])) {
                return g2;
            }
            int i4 = g2 + 1;
            while (i4 < i3 && this.b[i4] == i2) {
                if (obj.equals(this.c[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = g2 - 1; i5 >= 0 && this.b[i5] == i2; i5--) {
                if (obj.equals(this.c[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z10) {
            Z10 z10 = (Z10) obj;
            if (this.d != z10.d) {
                return false;
            }
            for (int i2 = 0; i2 < this.d; i2++) {
                Object h2 = h(i2);
                Object k = k(i2);
                Object orDefault = z10.getOrDefault(h2, null);
                if (k == null) {
                    if (orDefault != null || !z10.containsKey(h2)) {
                        return false;
                    }
                } else if (!k.equals(orDefault)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.d != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.d; i3++) {
                Object h3 = h(i3);
                Object k2 = k(i3);
                Object obj2 = map.get(h3);
                if (k2 == null) {
                    if (obj2 != null || !map.containsKey(h3)) {
                        return false;
                    }
                } else if (!k2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int g2 = AbstractC1906jZ.g(i2, 0, this.b);
            if (g2 < 0) {
                return g2;
            }
            if (this.c[g2 << 1] == null) {
                return g2;
            }
            int i3 = g2 + 1;
            while (i3 < i2 && this.b[i3] == 0) {
                if (this.c[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = g2 - 1; i4 >= 0 && this.b[i4] == 0; i4--) {
                if (this.c[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i2 = this.d * 2;
        Object[] objArr = this.c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            return this.c[(e << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i2) {
        return this.c[i2 << 1];
    }

    public final int hashCode() {
        int hashCode;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i2 = this.d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i5 += hashCode ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i2) {
        Object[] objArr = this.c;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.d;
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.b;
            int i6 = 8;
            if (iArr.length > 8 && i4 < iArr.length / 3) {
                if (i4 > 8) {
                    i6 = i4 + (i4 >> 1);
                }
                a(i6);
                if (i4 == this.d) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.b, 0, i2);
                        System.arraycopy(objArr, 0, this.c, 0, i3);
                    }
                    if (i2 < i5) {
                        int i7 = i2 + 1;
                        int i8 = i5 - i2;
                        System.arraycopy(iArr, i7, this.b, i2, i8);
                        System.arraycopy(objArr, i7 << 1, this.c, i3, i8 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i2 < i5) {
                    int i9 = i2 + 1;
                    int i10 = i5 - i2;
                    System.arraycopy(iArr, i9, iArr, i2, i10);
                    Object[] objArr2 = this.c;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i3, i10 << 1);
                }
                Object[] objArr3 = this.c;
                int i11 = i5 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            }
            if (i4 == this.d) {
                this.d = i5;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final boolean isEmpty() {
        if (this.d <= 0) {
            return true;
        }
        return false;
    }

    public final Object k(int i2) {
        return this.c[(i2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int d;
        int i3 = this.d;
        if (obj == null) {
            d = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            d = d(hashCode, obj);
        }
        if (d >= 0) {
            int i4 = (d << 1) + 1;
            Object[] objArr = this.c;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~d;
        int[] iArr = this.b;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.c;
            a(i6);
            if (i3 == this.d) {
                int[] iArr2 = this.b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.c, 0, objArr2.length);
                }
                c(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.d - i5) << 1);
        }
        int i8 = this.d;
        if (i3 == i8) {
            int[] iArr4 = this.b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.c;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return i(e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            int i2 = (e << 1) + 1;
            Object[] objArr = this.c;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object k = k(i2);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            Object k = k(e);
            if (obj2 == k || (obj2 != null && obj2.equals(k))) {
                i(e);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e = e(obj);
        if (e >= 0) {
            Object k = k(e);
            if (k == obj2 || (obj2 != null && obj2.equals(k))) {
                int i2 = (e << 1) + 1;
                Object[] objArr = this.c;
                Object obj4 = objArr[i2];
                objArr[i2] = obj3;
                return true;
            }
            return false;
        }
        return false;
    }

    public Z10(Z10 z10) {
        this();
        if (z10 != null) {
            int i2 = z10.d;
            b(i2);
            if (this.d != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    put(z10.h(i3), z10.k(i3));
                }
            } else if (i2 > 0) {
                System.arraycopy(z10.b, 0, this.b, 0, i2);
                System.arraycopy(z10.c, 0, this.c, 0, i2 << 1);
                this.d = i2;
            }
        }
    }
}
