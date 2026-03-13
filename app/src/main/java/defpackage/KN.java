package defpackage;

import java.io.Serializable;
/* renamed from: KN  reason: default package */
/* loaded from: classes.dex */
public final class KN extends AbstractC3014wQ implements Serializable {
    public static final KN b = new AbstractC3014wQ();

    @Override // defpackage.AbstractC3014wQ
    public final AbstractC3014wQ a() {
        return MW.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
