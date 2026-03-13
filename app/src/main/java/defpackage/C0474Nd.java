package defpackage;

import java.lang.reflect.Method;
/* renamed from: Nd  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474Nd {
    public final int a;
    public final Method b;

    public C0474Nd(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0474Nd)) {
            return false;
        }
        C0474Nd c0474Nd = (C0474Nd) obj;
        if (this.a == c0474Nd.a && this.b.getName().equals(c0474Nd.b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
