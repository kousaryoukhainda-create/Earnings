package defpackage;
/* renamed from: T00  reason: default package */
/* loaded from: classes.dex */
public final class T00 extends E {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = E.i;
        }
        if (E.h.n(this, null, obj)) {
            E.b(this);
            return true;
        }
        return false;
    }

    public final boolean j(Throwable th) {
        if (E.h.n(this, null, new C3149y(th))) {
            E.b(this);
            return true;
        }
        return false;
    }

    public final boolean k(InterfaceFutureC2490qH interfaceFutureC2490qH) {
        C3149y c3149y;
        interfaceFutureC2490qH.getClass();
        Object obj = this.b;
        if (obj == null) {
            if (interfaceFutureC2490qH.isDone()) {
                if (!E.h.n(this, null, E.e(interfaceFutureC2490qH))) {
                    return false;
                }
                E.b(this);
            } else {
                B b = new B(this, interfaceFutureC2490qH);
                if (E.h.n(this, null, b)) {
                    try {
                        interfaceFutureC2490qH.addListener(b, EnumC0175Bp.b);
                    } catch (Throwable th) {
                        try {
                            c3149y = new C3149y(th);
                        } catch (Throwable unused) {
                            c3149y = C3149y.b;
                        }
                        E.h.n(this, b, c3149y);
                    }
                } else {
                    obj = this.b;
                }
            }
            return true;
        }
        if (!(obj instanceof C2977w)) {
            return false;
        }
        interfaceFutureC2490qH.cancel(((C2977w) obj).a);
        return false;
    }
}
