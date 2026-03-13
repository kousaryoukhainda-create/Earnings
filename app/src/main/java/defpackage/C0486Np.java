package defpackage;
/* renamed from: Np  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486Np implements XT, InterfaceC1973kG {
    public static final Object d = new Object();
    public volatile XT b;
    public volatile Object c = d;

    public C0486Np(XT xt) {
        this.b = xt;
    }

    public static XT a(InterfaceC0413Kt interfaceC0413Kt) {
        if (interfaceC0413Kt instanceof C0486Np) {
            return interfaceC0413Kt;
        }
        return new C0486Np(interfaceC0413Kt);
    }

    @Override // defpackage.XT
    public final Object get() {
        Object obj = this.c;
        Object obj2 = d;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.c;
                    if (obj == obj2) {
                        obj = this.b.get();
                        Object obj3 = this.c;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.c = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
