package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: rf  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2604rf {
    public final Object a;
    public final Function1 b;

    public C2604rf(Function1 function1, Object obj) {
        this.a = obj;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2604rf)) {
            return false;
        }
        C2604rf c2604rf = (C2604rf) obj;
        if (Intrinsics.a(this.a, c2604rf.a) && Intrinsics.a(this.b, c2604rf.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
