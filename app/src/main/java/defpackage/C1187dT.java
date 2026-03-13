package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: dT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187dT {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public C1187dT(boolean z, String processName, int i, int i2) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.a = processName;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187dT)) {
            return false;
        }
        C1187dT c1187dT = (C1187dT) obj;
        if (Intrinsics.a(this.a, c1187dT.a) && this.b == c1187dT.b && this.c == c1187dT.c && this.d == c1187dT.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
