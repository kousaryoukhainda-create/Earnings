package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: u00  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2807u00 implements InterfaceC2549r00 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final C1571hv a;
    public final InterfaceC0440Lv b;
    public final L00 c;
    public final C0644Tr d;
    public final InterfaceC0428Li e;

    public C2807u00(C1571hv firebaseApp, InterfaceC0440Lv firebaseInstallations, L00 sessionSettings, C0644Tr eventGDTLogger, InterfaceC0428Li backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.a = firebaseApp;
        this.b = firebaseInstallations;
        this.c = sessionSettings;
        this.d = eventGDTLogger;
        this.e = backgroundDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.C2807u00 r5, defpackage.AbstractC3040wi r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C2721t00
            if (r0 == 0) goto L13
            r0 = r6
            t00 r0 = (defpackage.C2721t00) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            t00 r0 = new t00
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            Ui r1 = defpackage.EnumC0661Ui.b
            int r2 = r0.f
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            u00 r5 = r0.b
            defpackage.AbstractC1522hL.T(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.AbstractC1522hL.T(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r4, r6)
            r0.b = r5
            r0.f = r3
            L00 r6 = r5.c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L48
            goto L83
        L48:
            L00 r6 = r5.c
            a10 r0 = r6.a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L57
            boolean r3 = r0.booleanValue()
            goto L63
        L57:
            a10 r6 = r6.b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L63
            boolean r3 = r6.booleanValue()
        L63:
            if (r3 != 0) goto L6d
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L83
        L6d:
            L00 r5 = r5.c
            double r5 = r5.a()
            double r0 = defpackage.C2807u00.f
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L7c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L83
        L7c:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2807u00.a(u00, wi):java.lang.Object");
    }
}
