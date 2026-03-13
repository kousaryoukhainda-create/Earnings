package defpackage;

import java.io.Serializable;
/* renamed from: NW  reason: default package */
/* loaded from: classes.dex */
public final class NW extends AbstractC3014wQ implements Serializable {
    public final AbstractC3014wQ b;

    public NW(AbstractC3014wQ abstractC3014wQ) {
        this.b = abstractC3014wQ;
    }

    @Override // defpackage.AbstractC3014wQ
    public final AbstractC3014wQ a() {
        return this.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NW) {
            return this.b.equals(((NW) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.b.hashCode();
    }

    public final String toString() {
        return this.b + ".reverse()";
    }
}
