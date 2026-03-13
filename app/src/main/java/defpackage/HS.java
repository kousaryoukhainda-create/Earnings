package defpackage;
/* renamed from: HS  reason: default package */
/* loaded from: classes.dex */
public final class HS {
    public final String a;
    public final Long b;

    public HS(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HS)) {
            return false;
        }
        HS hs = (HS) obj;
        if (!this.a.equals(hs.a)) {
            return false;
        }
        Long l = hs.b;
        Long l2 = this.b;
        if (l2 != null) {
            return l2.equals(l);
        }
        if (l == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
