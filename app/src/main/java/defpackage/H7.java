package defpackage;
/* renamed from: H7  reason: default package */
/* loaded from: classes.dex */
public final class H7 extends AbstractC0786Zd {
    public final E7 a;

    public H7(E7 e7) {
        this.a = e7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0786Zd)) {
            return false;
        }
        AbstractC0786Zd abstractC0786Zd = (AbstractC0786Zd) obj;
        Object obj2 = EnumC0760Yd.b;
        ((H7) abstractC0786Zd).getClass();
        if (obj2.equals(obj2) && this.a.equals(((H7) abstractC0786Zd).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((EnumC0760Yd.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC0760Yd.b + ", androidClientInfo=" + this.a + "}";
    }
}
