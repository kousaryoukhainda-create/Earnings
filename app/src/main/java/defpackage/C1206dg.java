package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
/* renamed from: dg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1206dg extends AbstractC3014wQ implements Serializable {
    public final Comparator[] b;

    public C1206dg(C3198yb c3198yb, C3198yb c3198yb2) {
        this.b = new Comparator[]{c3198yb, c3198yb2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.b;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1206dg) {
            return Arrays.equals(this.b, ((C1206dg) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return AbstractC0324Hi.h(new StringBuilder("Ordering.compound("), Arrays.toString(this.b), ")");
    }
}
