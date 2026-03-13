package defpackage;

import java.util.List;
/* renamed from: c8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002c8 extends AbstractC0195Cj {
    public final List a;
    public final C1249e8 b;
    public final AbstractC2527qj c;
    public final C1335f8 d;
    public final List e;

    public C1002c8(List list, C1249e8 c1249e8, AbstractC2527qj abstractC2527qj, C1335f8 c1335f8, List list2) {
        this.a = list;
        this.b = c1249e8;
        this.c = abstractC2527qj;
        this.d = c1335f8;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0195Cj)) {
            return false;
        }
        AbstractC0195Cj abstractC0195Cj = (AbstractC0195Cj) obj;
        List list = this.a;
        if (list != null ? list.equals(((C1002c8) abstractC0195Cj).a) : ((C1002c8) abstractC0195Cj).a == null) {
            C1249e8 c1249e8 = this.b;
            if (c1249e8 != null ? c1249e8.equals(((C1002c8) abstractC0195Cj).b) : ((C1002c8) abstractC0195Cj).b == null) {
                AbstractC2527qj abstractC2527qj = this.c;
                if (abstractC2527qj != null ? abstractC2527qj.equals(((C1002c8) abstractC0195Cj).c) : ((C1002c8) abstractC0195Cj).c == null) {
                    C1002c8 c1002c8 = (C1002c8) abstractC0195Cj;
                    if (this.d.equals(c1002c8.d) && this.e.equals(c1002c8.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        List list = this.a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        C1249e8 c1249e8 = this.b;
        if (c1249e8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c1249e8.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        AbstractC2527qj abstractC2527qj = this.c;
        if (abstractC2527qj != null) {
            i = abstractC2527qj.hashCode();
        }
        return ((((i ^ i3) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
