package defpackage;
/* renamed from: n8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2221n8 extends AbstractC0299Gj {
    public final String a;

    public C2221n8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0299Gj) {
            return this.a.equals(((C2221n8) ((AbstractC0299Gj) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0324Hi.h(new StringBuilder("Log{content="), this.a, "}");
    }
}
