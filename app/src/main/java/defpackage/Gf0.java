package defpackage;

import java.util.Objects;
/* renamed from: Gf0  reason: default package */
/* loaded from: classes3.dex */
public final class Gf0 extends Ef0 {
    public static final Gf0 f = new Gf0(new Object[0]);
    public final transient Object[] d;

    public Gf0(Object[] objArr) {
        this.d = objArr;
    }

    @Override // defpackage.Ef0, defpackage.Bf0
    public final int b(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
        return 0;
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
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1281eb.c(i, 0);
        Object obj = this.d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
