package defpackage;
/* renamed from: q8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2479q8 extends AbstractC0325Hj {
    public final String a;
    public final String b;

    public C2479q8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0325Hj)) {
            return false;
        }
        AbstractC0325Hj abstractC0325Hj = (AbstractC0325Hj) obj;
        if (this.a.equals(((C2479q8) abstractC0325Hj).a) && this.b.equals(((C2479q8) abstractC0325Hj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return AbstractC0324Hi.h(sb, this.b, "}");
    }
}
