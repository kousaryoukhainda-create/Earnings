package defpackage;
/* renamed from: fG  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345fG {
    public final String a;
    public final String b;

    static {
        Ha0.H(0);
        Ha0.H(1);
    }

    public C1345fG(String str, String str2) {
        this.a = Ha0.N(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1345fG.class != obj.getClass()) {
            return false;
        }
        C1345fG c1345fG = (C1345fG) obj;
        if (Ha0.a(this.a, c1345fG.a) && Ha0.a(this.b, c1345fG.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
