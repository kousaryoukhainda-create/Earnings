package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: gd  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1457gd extends AbstractC1285ed {
    static {
        new AbstractC1285ed((char) 1, (char) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (kotlin.jvm.internal.Intrinsics.d(r2.b, r2.c) > 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C1457gd
            if (r0 == 0) goto L28
            char r0 = r4.b
            char r1 = r4.c
            int r2 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r2 <= 0) goto L1c
            r2 = r5
            gd r2 = (defpackage.C1457gd) r2
            char r3 = r2.b
            char r2 = r2.c
            int r2 = kotlin.jvm.internal.Intrinsics.d(r3, r2)
            if (r2 <= 0) goto L1c
            goto L26
        L1c:
            gd r5 = (defpackage.C1457gd) r5
            char r2 = r5.b
            if (r0 != r2) goto L28
            char r5 = r5.c
            if (r1 != r5) goto L28
        L26:
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1457gd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        char c = this.b;
        char c2 = this.c;
        if (Intrinsics.d(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
