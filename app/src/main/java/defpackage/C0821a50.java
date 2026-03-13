package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* renamed from: a50  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821a50 implements X40, Serializable {
    public final Object b;

    public C0821a50(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0821a50) {
            return B10.C(this.b, ((C0821a50) obj).b);
        }
        return false;
    }

    @Override // defpackage.X40
    public final Object get() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.b + ")";
    }
}
