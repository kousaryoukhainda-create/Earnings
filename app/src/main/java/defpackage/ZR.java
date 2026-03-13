package defpackage;

import android.util.SparseBooleanArray;
/* renamed from: ZR  reason: default package */
/* loaded from: classes.dex */
public final class ZR {
    public final C0545Pw a;

    static {
        new SparseBooleanArray();
        B10.u(!false);
        Ha0.H(0);
    }

    public ZR(C0545Pw c0545Pw) {
        this.a = c0545Pw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZR)) {
            return false;
        }
        return this.a.equals(((ZR) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
