package defpackage;
/* renamed from: Pp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538Pp implements XT {
    public static final Object d = new Object();
    public volatile InterfaceC0438Lt b;
    public volatile Object c;

    /* JADX WARN: Type inference failed for: r0v1, types: [Pp, java.lang.Object, XT] */
    public static XT a(InterfaceC0438Lt interfaceC0438Lt) {
        if (interfaceC0438Lt instanceof C0538Pp) {
            return interfaceC0438Lt;
        }
        ?? obj = new Object();
        obj.c = d;
        obj.b = interfaceC0438Lt;
        return obj;
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
