package defpackage;
/* renamed from: Z40  reason: default package */
/* loaded from: classes.dex */
public final class Z40 implements X40 {
    public static final C0684Vf d = new C0684Vf(3);
    public volatile X40 b;
    public Object c;

    @Override // defpackage.X40
    public final Object get() {
        X40 x40 = this.b;
        C0684Vf c0684Vf = d;
        if (x40 != c0684Vf) {
            synchronized (this) {
                try {
                    if (this.b != c0684Vf) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = c0684Vf;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
