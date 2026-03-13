package defpackage;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
/* renamed from: g5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1415g5 implements Collection, Set {
    public static Object[] f;
    public static int g;
    public static Object[] h;
    public static int i;
    public static final Object j = new Object();
    public static final Object k = new Object();
    public int[] b;
    public Object[] c;
    public int d;

    public C1415g5(int i2) {
        if (i2 == 0) {
            this.b = AbstractC1906jZ.c;
            this.c = AbstractC1906jZ.d;
        } else {
            c(i2);
        }
        this.d = 0;
    }

    public static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (k) {
                try {
                    if (i < 10) {
                        objArr[0] = h;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        h = objArr;
                        i++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (j) {
                try {
                    if (g < 10) {
                        objArr[0] = f;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
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

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int e;
        int i3 = this.d;
        if (obj == null) {
            e = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            e = e(hashCode, obj);
        }
        if (e >= 0) {
            return false;
        }
        int i4 = ~e;
        int[] iArr = this.b;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.c;
            c(i5);
            if (i3 == this.d) {
                int[] iArr2 = this.b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.c, 0, objArr.length);
                }
                d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.b;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.d;
        if (i3 == i8) {
            int[] iArr4 = this.b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.c[i4] = obj;
                this.d = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.d;
        int i2 = this.d;
        int[] iArr = this.b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.c;
            c(size);
            int i3 = this.d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i3);
                System.arraycopy(objArr, 0, this.c, 0, this.d);
            }
            d(iArr, objArr, this.d);
        }
        if (this.d == i2) {
            for (Object obj : collection) {
                z |= add(obj);
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    public final void c(int i2) {
        if (i2 == 8) {
            synchronized (k) {
                try {
                    Object[] objArr = h;
                    if (objArr != null) {
                        try {
                            this.c = objArr;
                            h = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.b = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                i--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        h = null;
                        i = 0;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (j) {
                try {
                    Object[] objArr2 = f;
                    if (objArr2 != null) {
                        try {
                            this.c = objArr2;
                            f = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.b = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                g--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f = null;
                        g = 0;
                    }
                } finally {
                }
            }
        }
        this.b = new int[i2];
        this.c = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.d;
        if (i2 != 0) {
            int[] iArr = this.b;
            Object[] objArr = this.c;
            this.b = AbstractC1906jZ.c;
            this.c = AbstractC1906jZ.d;
            this.d = 0;
            d(iArr, objArr, i2);
        }
        if (this.d == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int e;
        if (obj == null) {
            e = f();
        } else {
            e = e(obj.hashCode(), obj);
        }
        if (e >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final int e(int i2, Object obj) {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        try {
            int g2 = AbstractC1906jZ.g(i3, i2, this.b);
            if (g2 < 0) {
                return g2;
            }
            if (obj.equals(this.c[g2])) {
                return g2;
            }
            int i4 = g2 + 1;
            while (i4 < i3 && this.b[i4] == i2) {
                if (obj.equals(this.c[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = g2 - 1; i5 >= 0 && this.b[i5] == i2; i5--) {
                if (obj.equals(this.c[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.d != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.d; i2++) {
                try {
                    if (!set.contains(this.c[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
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
            if (this.c[g2] == null) {
                return g2;
            }
            int i3 = g2 + 1;
            while (i3 < i2 && this.b[i3] == 0) {
                if (this.c[i3] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = g2 - 1; i4 >= 0 && this.b[i4] == 0; i4--) {
                if (this.c[i4] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g(int i2) {
        int i3 = this.d;
        Object[] objArr = this.c;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
            return;
        }
        int i4 = i3 - 1;
        int[] iArr = this.b;
        int i5 = 8;
        if (iArr.length > 8 && i3 < iArr.length / 3) {
            if (i3 > 8) {
                i5 = i3 + (i3 >> 1);
            }
            c(i5);
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i2);
                System.arraycopy(objArr, 0, this.c, 0, i2);
            }
            if (i2 < i4) {
                int i6 = i2 + 1;
                int i7 = i4 - i2;
                System.arraycopy(iArr, i6, this.b, i2, i7);
                System.arraycopy(objArr, i6, this.c, i2, i7);
            }
        } else {
            if (i2 < i4) {
                int i8 = i2 + 1;
                int i9 = i4 - i2;
                System.arraycopy(iArr, i8, iArr, i2, i9);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, i8, objArr2, i2, i9);
            }
            this.c[i4] = null;
        }
        if (i3 == this.d) {
            this.d = i4;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.b;
        int i2 = this.d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.d <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0820a5(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int e;
        if (obj == null) {
            e = f();
        } else {
            e = e(obj.hashCode(), obj);
        }
        if (e >= 0) {
            g(e);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i2 = this.d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.c[i2])) {
                g(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.c, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.d);
        }
        System.arraycopy(this.c, 0, objArr, 0, this.d);
        int length = objArr.length;
        int i2 = this.d;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
