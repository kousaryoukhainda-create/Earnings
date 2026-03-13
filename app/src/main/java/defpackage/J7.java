package defpackage;

import java.util.HashSet;
/* renamed from: J7  reason: default package */
/* loaded from: classes.dex */
public final class J7 extends AbstractC0322Hg {
    public final HashSet a;

    public J7(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0322Hg) {
            return this.a.equals(((J7) ((AbstractC0322Hg) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}
