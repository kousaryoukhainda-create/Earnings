package defpackage;

import java.util.Objects;
/* renamed from: FV  reason: default package */
/* loaded from: classes.dex */
public final class FV extends AbstractC2571rD {
    public static final FV g = new FV(new Object[0], 0);
    public final transient Object[] d;
    public final transient int f;

    public FV(Object[] objArr, int i) {
        this.d = objArr;
        this.f = i;
    }

    @Override // defpackage.AbstractC2571rD, defpackage.AbstractC2056lD
    public final int f(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.f;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC2056lD
    public final Object[] g() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        B10.l(i, this.f);
        Object obj = this.d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC2056lD
    public final int h() {
        return this.f;
    }

    @Override // defpackage.AbstractC2056lD
    public final int j() {
        return 0;
    }

    @Override // defpackage.AbstractC2056lD
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
