package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: BJ  reason: default package */
/* loaded from: classes2.dex */
public final class BJ {
    public final String a;
    public final C2057lE b;

    public BJ(String value, C2057lE range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.a = value;
        this.b = range;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BJ)) {
            return false;
        }
        BJ bj = (BJ) obj;
        if (Intrinsics.a(this.a, bj.a) && Intrinsics.a(this.b, bj.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
