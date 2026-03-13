package defpackage;
/* renamed from: Q7  reason: default package */
/* loaded from: classes.dex */
public final class Q7 extends AbstractC2612rj {
    public final String a;
    public final String b;

    public Q7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2612rj)) {
            return false;
        }
        AbstractC2612rj abstractC2612rj = (AbstractC2612rj) obj;
        if (this.a.equals(((Q7) abstractC2612rj).a) && this.b.equals(((Q7) abstractC2612rj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return AbstractC0324Hi.h(sb, this.b, "}");
    }
}
