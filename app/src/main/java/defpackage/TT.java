package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: TT  reason: default package */
/* loaded from: classes.dex */
public final class TT extends AbstractC1233e0 implements RandomAccess {
    public static final TT f = new TT(new Object[0], 0, false);
    public Object[] c;
    public int d;

    public TT(Object[] objArr, int i, boolean z) {
        super(z);
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i = this.d;
        Object[] objArr = this.c;
        if (i == objArr.length) {
            this.c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void f(int i) {
        if (i >= 0 && i < this.d) {
            return;
        }
        StringBuilder i2 = AbstractC0324Hi.i(i, "Index:", ", Size:");
        i2.append(this.d);
        throw new IndexOutOfBoundsException(i2.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f(i);
        return this.c[i];
    }

    @Override // defpackage.InterfaceC2487qE
    public final InterfaceC2487qE i(int i) {
        if (i >= this.d) {
            return new TT(Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        e();
        f(i);
        Object[] objArr = this.c;
        Object obj = objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        e();
        f(i);
        Object[] objArr = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        e();
        if (i >= 0 && i <= (i2 = this.d)) {
            Object[] objArr = this.c;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[BK.y(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.c, i, objArr2, i + 1, this.d - i);
                this.c = objArr2;
            }
            this.c[i] = obj;
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder i3 = AbstractC0324Hi.i(i, "Index:", ", Size:");
        i3.append(this.d);
        throw new IndexOutOfBoundsException(i3.toString());
    }
}
