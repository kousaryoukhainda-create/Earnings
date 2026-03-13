package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: L00  reason: default package */
/* loaded from: classes.dex */
public final class L00 {
    public final InterfaceC0813a10 a;
    public final InterfaceC0813a10 b;

    public L00(InterfaceC0813a10 localOverrideSettings, InterfaceC0813a10 remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.a = localOverrideSettings;
        this.b = remoteSettings;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.AbstractC3040wi r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.K00
            if (r0 == 0) goto L13
            r0 = r6
            K00 r0 = (defpackage.K00) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            K00 r0 = new K00
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            Ui r1 = defpackage.EnumC0661Ui.b
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.AbstractC1522hL.T(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            L00 r2 = r0.b
            defpackage.AbstractC1522hL.T(r6)
            goto L49
        L38:
            defpackage.AbstractC1522hL.T(r6)
            r0.b = r5
            r0.f = r4
            a10 r6 = r5.a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            a10 r6 = r2.b
            r2 = 0
            r0.b = r2
            r0.f = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            B90 r6 = defpackage.B90.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.L00.b(wi):java.lang.Object");
    }
}
