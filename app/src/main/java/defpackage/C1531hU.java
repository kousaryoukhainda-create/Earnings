package defpackage;
/* renamed from: hU  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531hU {
    public final Class a;
    public final Class b;

    public C1531hU(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static C1531hU a(Class cls) {
        return new C1531hU(InterfaceC1445gU.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1531hU.class != obj.getClass()) {
            return false;
        }
        C1531hU c1531hU = (C1531hU) obj;
        if (!this.b.equals(c1531hU.b)) {
            return false;
        }
        return this.a.equals(c1531hU.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == InterfaceC1445gU.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
