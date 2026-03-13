package defpackage;
/* renamed from: IA  reason: default package */
/* loaded from: classes.dex */
public abstract class IA implements Cloneable {
    public final MA b;
    public MA c;

    public IA(MA ma) {
        this.b = ma;
        if (!ma.i()) {
            this.c = ma.k();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final MA a() {
        MA c = c();
        c.getClass();
        if (MA.h(c, true)) {
            return c;
        }
        throw new A90();
    }

    public final MA c() {
        if (!this.c.i()) {
            return this.c;
        }
        MA ma = this.c;
        ma.getClass();
        ST st = ST.c;
        st.getClass();
        st.a(ma.getClass()).b(ma);
        ma.j();
        return this.c;
    }

    public final Object clone() {
        IA ia = (IA) this.b.e(5);
        ia.c = c();
        return ia;
    }

    public final void d() {
        if (!this.c.i()) {
            MA k = this.b.k();
            MA ma = this.c;
            ST st = ST.c;
            st.getClass();
            st.a(k.getClass()).a(k, ma);
            this.c = k;
        }
    }
}
