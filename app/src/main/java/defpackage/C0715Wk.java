package defpackage;
/* renamed from: Wk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715Wk {
    public final C1531hU a;
    public final boolean b;

    public C0715Wk(C1531hU c1531hU, boolean z) {
        this.a = c1531hU;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0715Wk)) {
            return false;
        }
        C0715Wk c0715Wk = (C0715Wk) obj;
        if (!c0715Wk.a.equals(this.a) || c0715Wk.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
