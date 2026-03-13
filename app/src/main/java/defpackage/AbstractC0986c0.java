package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: c0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0986c0 {
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    public abstract Map a();

    public boolean b(Object obj) {
        for (Collection collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0986c0) {
            return a().equals(((AbstractC0986c0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
