package defpackage;

import java.util.HashSet;
/* renamed from: U8  reason: default package */
/* loaded from: classes.dex */
public final class U8 {
    public final HashSet a;

    public U8(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof U8) {
            return this.a.equals(((U8) obj).a);
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
