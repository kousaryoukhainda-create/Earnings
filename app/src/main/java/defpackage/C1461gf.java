package defpackage;

import java.io.Serializable;
/* renamed from: gf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461gf extends AbstractC3014wQ implements Serializable {
    public final R9 b;

    public C1461gf(R9 r9) {
        this.b = r9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1461gf) {
            return this.b.equals(((C1461gf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
