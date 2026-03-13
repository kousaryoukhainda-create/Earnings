package defpackage;

import java.util.List;
/* renamed from: e8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249e8 extends AbstractC3214yj {
    public final String a;
    public final String b;
    public final List c;
    public final AbstractC3214yj d;
    public final int e;

    public C1249e8(String str, String str2, List list, AbstractC3214yj abstractC3214yj, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = abstractC3214yj;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3214yj)) {
            return false;
        }
        AbstractC3214yj abstractC3214yj = (AbstractC3214yj) obj;
        if (this.a.equals(((C1249e8) abstractC3214yj).a) && ((str = this.b) != null ? str.equals(((C1249e8) abstractC3214yj).b) : ((C1249e8) abstractC3214yj).b == null)) {
            C1249e8 c1249e8 = (C1249e8) abstractC3214yj;
            if (this.c.equals(c1249e8.c)) {
                AbstractC3214yj abstractC3214yj2 = c1249e8.d;
                AbstractC3214yj abstractC3214yj3 = this.d;
                if (abstractC3214yj3 != null ? abstractC3214yj3.equals(abstractC3214yj2) : abstractC3214yj2 == null) {
                    if (this.e == c1249e8.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        AbstractC3214yj abstractC3214yj = this.d;
        if (abstractC3214yj != null) {
            i = abstractC3214yj.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return AbstractC2437ph.k(sb, this.e, "}");
    }
}
