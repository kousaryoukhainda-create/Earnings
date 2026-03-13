package defpackage;
/* renamed from: yJ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3179yJ extends AbstractC3147xy {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public C3179yJ(E60 e60, Object obj, Object obj2) {
        super(e60);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.AbstractC3147xy, defpackage.E60
    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.AbstractC3147xy, defpackage.E60
    public final C60 f(int i, C60 c60, boolean z) {
        this.b.f(i, c60, z);
        if (Ha0.a(c60.b, this.d) && z) {
            c60.b = e;
        }
        return c60;
    }

    @Override // defpackage.AbstractC3147xy, defpackage.E60
    public final Object l(int i) {
        Object l = this.b.l(i);
        if (Ha0.a(l, this.d)) {
            return e;
        }
        return l;
    }

    @Override // defpackage.AbstractC3147xy, defpackage.E60
    public final D60 m(int i, D60 d60, long j) {
        this.b.m(i, d60, j);
        if (Ha0.a(d60.a, this.c)) {
            d60.a = D60.q;
        }
        return d60;
    }
}
