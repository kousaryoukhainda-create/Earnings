package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: gE  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429gE extends AbstractC1233e0 implements InterfaceC2315oE, RandomAccess, ZS {
    public static final C1429gE f = new C1429gE(new int[0], 0, false);
    public int[] c;
    public int d;

    public C1429gE(int[] iArr, int i, boolean z) {
        super(z);
        this.c = iArr;
        this.d = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i >= 0 && i <= (i2 = this.d)) {
            int[] iArr = this.c;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[BK.y(i2, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
                this.c = iArr2;
            }
            this.c[i] = intValue;
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder i3 = AbstractC0324Hi.i(i, "Index:", ", Size:");
        i3.append(this.d);
        throw new IndexOutOfBoundsException(i3.toString());
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = AbstractC2658sE.a;
        collection.getClass();
        if (!(collection instanceof C1429gE)) {
            return super.addAll(collection);
        }
        C1429gE c1429gE = (C1429gE) collection;
        int i = c1429gE.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.c;
            if (i3 > iArr.length) {
                this.c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c1429gE.c, 0, this.c, this.d, c1429gE.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1429gE)) {
            return super.equals(obj);
        }
        C1429gE c1429gE = (C1429gE) obj;
        if (this.d != c1429gE.d) {
            return false;
        }
        int[] iArr = c1429gE.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        e();
        int i2 = this.d;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[BK.y(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.c = iArr2;
        }
        int[] iArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    public final void g(int i) {
        if (i >= 0 && i < this.d) {
            return;
        }
        StringBuilder i2 = AbstractC0324Hi.i(i, "Index:", ", Size:");
        i2.append(this.d);
        throw new IndexOutOfBoundsException(i2.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(h(i));
    }

    public final int h(int i) {
        g(i);
        return this.c[i];
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    @Override // defpackage.InterfaceC2487qE
    public final InterfaceC2487qE i(int i) {
        if (i >= this.d) {
            return new C1429gE(Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        e();
        g(i);
        int[] iArr = this.c;
        int i3 = iArr[i];
        if (i < this.d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        e();
        if (i2 >= i) {
            int[] iArr = this.c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        g(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
