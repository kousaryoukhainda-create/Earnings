package defpackage;

import java.util.Iterator;
/* renamed from: Hf0  reason: default package */
/* loaded from: classes3.dex */
public final class Hf0 extends Ff0 {
    public static final Object[] h;
    public static final Hf0 i;
    public final transient Object[] f;
    public final transient Object[] g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new Hf0(objArr, objArr);
    }

    public Hf0(Object[] objArr, Object[] objArr2) {
        this.f = objArr;
        this.g = objArr2;
    }

    @Override // defpackage.Bf0
    public final int b(Object[] objArr) {
        System.arraycopy(this.f, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            int length = this.g.length;
            return false;
        }
        return false;
    }

    @Override // defpackage.Bf0
    public final int e() {
        return 0;
    }

    @Override // defpackage.Bf0
    public final int f() {
        return 0;
    }

    @Override // defpackage.Bf0
    public final Object[] g() {
        return this.f;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Gf0 gf0 = this.c;
        if (gf0 == null) {
            Cf0 cf0 = Ef0.c;
            gf0 = Gf0.f;
            this.c = gf0;
        }
        return gf0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
