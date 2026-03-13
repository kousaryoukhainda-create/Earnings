package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* renamed from: yb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3198yb extends AbstractC3014wQ implements Serializable {
    public final InterfaceC0548Pz b;
    public final AbstractC3014wQ c;

    public C3198yb(InterfaceC0548Pz interfaceC0548Pz, AbstractC3014wQ abstractC3014wQ) {
        this.b = interfaceC0548Pz;
        abstractC3014wQ.getClass();
        this.c = abstractC3014wQ;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC0548Pz interfaceC0548Pz = this.b;
        return this.c.compare(interfaceC0548Pz.apply(obj), interfaceC0548Pz.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3198yb)) {
            return false;
        }
        C3198yb c3198yb = (C3198yb) obj;
        if (this.b.equals(c3198yb.b) && this.c.equals(c3198yb.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final String toString() {
        return this.c + ".onResultOf(" + this.b + ")";
    }
}
