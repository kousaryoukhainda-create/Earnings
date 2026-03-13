package defpackage;

import java.io.Serializable;
/* renamed from: Y40  reason: default package */
/* loaded from: classes.dex */
public final class Y40 implements X40, Serializable {
    public final X40 b;
    public volatile transient boolean c;
    public transient Object d;

    public Y40(X40 x40) {
        this.b = x40;
    }

    @Override // defpackage.X40
    public final Object get() {
        if (!this.c) {
            synchronized (this) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
