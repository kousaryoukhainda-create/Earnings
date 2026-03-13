package defpackage;

import java.lang.Thread;
/* renamed from: ki0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2010ki0 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;

    public C2010ki0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public static void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof C2010ki0)) {
            Thread.setDefaultUncaughtExceptionHandler(new C2010ki0(defaultUncaughtExceptionHandler));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            java.lang.String r0 = "uncaught-exception"
            java.lang.String r1 = "category"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            qg r1 = new qg
            r1.<init>(r0)
            java.lang.String r0 = "Uncaught exception in thread "
            java.lang.StringBuilder r0 = defpackage.Ki0.b(r0)
            java.lang.String r2 = r5.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.e = r0
            long r2 = r5.getId()
            java.lang.String r0 = "ThreadID"
            r1.b(r0, r2)
            java.lang.String r0 = r5.getName()
            java.lang.String r2 = "ThreadName"
            r1.c(r2, r0)
            java.lang.String r0 = "t"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.ThreadGroup r0 = r5.getThreadGroup()     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Exception -> L46
            goto L48
        L46:
            java.lang.String r0 = ""
        L48:
            java.lang.String r2 = "ThreadGroup"
            r1.c(r2, r0)
            int r0 = r5.getPriority()
            java.lang.String r2 = "ThreadPriority"
            r1.a(r2, r0)
            java.lang.Thread$State r0 = r5.getState()
            java.lang.String r0 = r0.name()
            java.lang.String r2 = "ThreadState"
            r1.c(r2, r0)
            Lg0 r0 = defpackage.Lg0.b
            r1.d = r0
            if (r6 == 0) goto L6b
            r1.f = r6
        L6b:
            r1.e()
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.a
            if (r0 == 0) goto L75
            r0.uncaughtException(r5, r6)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2010ki0.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
