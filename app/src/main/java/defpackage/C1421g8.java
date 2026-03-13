package defpackage;

import java.util.List;
/* renamed from: g8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421g8 extends AbstractC0169Bj {
    public final String a;
    public final int b;
    public final List c;

    public C1421g8(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0169Bj)) {
            return false;
        }
        AbstractC0169Bj abstractC0169Bj = (AbstractC0169Bj) obj;
        if (this.a.equals(((C1421g8) abstractC0169Bj).a)) {
            C1421g8 c1421g8 = (C1421g8) abstractC0169Bj;
            if (this.b == c1421g8.b && this.c.equals(c1421g8.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
