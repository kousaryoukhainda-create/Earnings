package defpackage;
/* renamed from: Op  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0512Op implements XT {
    public static final Object d = new Object();
    public volatile C0206Cu b;
    public volatile Object c;

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
