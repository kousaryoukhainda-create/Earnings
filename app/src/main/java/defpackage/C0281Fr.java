package defpackage;
/* renamed from: Fr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281Fr {
    public final String a;

    public C0281Fr(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0281Fr)) {
            return false;
        }
        return this.a.equals(((C0281Fr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0324Hi.h(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
