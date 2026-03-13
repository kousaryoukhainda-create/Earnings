package defpackage;
/* renamed from: Ee0  reason: default package */
/* loaded from: classes.dex */
public final class Ee0 {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ee0)) {
            return false;
        }
        Ee0 ee0 = (Ee0) obj;
        if (this.b != ee0.b) {
            return false;
        }
        return this.a.equals(ee0.a);
    }

    public final int hashCode() {
        return AbstractC0324Hi.A(this.b) + (this.a.hashCode() * 31);
    }
}
