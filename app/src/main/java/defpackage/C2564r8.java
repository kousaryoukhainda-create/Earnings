package defpackage;

import java.util.List;
/* renamed from: r8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2564r8 extends AbstractC0377Jj {
    public final List a;

    public C2564r8(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0377Jj) {
            return this.a.equals(((C2564r8) ((AbstractC0377Jj) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
