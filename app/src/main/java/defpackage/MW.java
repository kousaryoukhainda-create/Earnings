package defpackage;

import java.io.Serializable;
/* renamed from: MW  reason: default package */
/* loaded from: classes.dex */
public final class MW extends AbstractC3014wQ implements Serializable {
    public static final MW b = new AbstractC3014wQ();

    @Override // defpackage.AbstractC3014wQ
    public final AbstractC3014wQ a() {
        return KN.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
