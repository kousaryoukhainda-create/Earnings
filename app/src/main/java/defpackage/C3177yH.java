package defpackage;
/* renamed from: yH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3177yH {
    public final Object a;
    public C0858ab b = new C0858ab();
    public boolean c;
    public boolean d;

    public C3177yH(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3177yH.class == obj.getClass()) {
            return this.a.equals(((C3177yH) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
