package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: rF  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2573rF extends AbstractC3003wF implements Iterable {
    public final ArrayList b = new ArrayList();

    @Override // defpackage.AbstractC3003wF
    public final boolean e() {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((AbstractC3003wF) arrayList.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof C2573rF) || !((C2573rF) obj).b.equals(this.b))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.AbstractC3003wF
    public final String g() {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((AbstractC3003wF) arrayList.get(0)).g();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }
}
