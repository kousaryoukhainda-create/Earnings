package defpackage;
/* renamed from: z50  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3247z50 {
    public final String a;
    public final int b;

    public C3247z50(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3247z50)) {
            return false;
        }
        C3247z50 c3247z50 = (C3247z50) obj;
        if (this.b != c3247z50.b) {
            return false;
        }
        return this.a.equals(c3247z50.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
