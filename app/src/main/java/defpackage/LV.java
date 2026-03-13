package defpackage;
/* renamed from: LV  reason: default package */
/* loaded from: classes.dex */
public final class LV extends AbstractC3001wD {
    public static final Object[] k;
    public static final LV l;
    public final transient Object[] f;
    public final transient int g;
    public final transient Object[] h;
    public final transient int i;
    public final transient int j;

    static {
        Object[] objArr = new Object[0];
        k = objArr;
        l = new LV(objArr, 0, objArr, 0, 0);
    }

    public LV(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f = objArr;
        this.g = i;
        this.h = objArr2;
        this.i = i2;
        this.j = i3;
    }

    @Override // defpackage.AbstractC2056lD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.h;
            if (objArr.length != 0) {
                int k0 = AbstractC0957bf.k0(obj);
                while (true) {
                    int i = k0 & this.i;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    k0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC2056lD
    public final int f(int i, Object[] objArr) {
        Object[] objArr2 = this.f;
        int i2 = this.j;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC2056lD
    public final Object[] g() {
        return this.f;
    }

    @Override // defpackage.AbstractC2056lD
    public final int h() {
        return this.j;
    }

    @Override // defpackage.AbstractC3001wD, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.g;
    }

    @Override // defpackage.AbstractC2056lD
    public final int j() {
        return 0;
    }

    @Override // defpackage.AbstractC2056lD
    public final boolean l() {
        return false;
    }

    @Override // defpackage.AbstractC2056lD
    public final H90 n() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // defpackage.AbstractC3001wD
    public final AbstractC2571rD t() {
        return AbstractC2571rD.o(this.j, this.f);
    }
}
