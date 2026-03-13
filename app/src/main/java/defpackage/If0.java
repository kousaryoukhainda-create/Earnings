package defpackage;
/* renamed from: If0  reason: default package */
/* loaded from: classes3.dex */
public final class If0 implements InterfaceC1292eg0 {
    public static final Object d = new Object();
    public volatile Jf0 b;
    public volatile Object c;

    /* JADX WARN: Type inference failed for: r0v1, types: [If0, java.lang.Object] */
    public static If0 b(Jf0 jf0) {
        if (jf0 instanceof If0) {
            return (If0) jf0;
        }
        ?? obj = new Object();
        obj.c = d;
        obj.b = jf0;
        return obj;
    }

    @Override // defpackage.InterfaceC1378fg0
    public final Object a() {
        Object obj = this.c;
        Object obj2 = d;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.c;
                    if (obj == obj2) {
                        obj = this.b.a();
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
