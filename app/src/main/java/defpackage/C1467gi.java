package defpackage;

import java.util.HashSet;
/* renamed from: gi  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467gi {
    public final HashSet a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1467gi.class == obj.getClass()) {
            return this.a.equals(((C1467gi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
