package com.fyber.inneractive.sdk.config;
/* loaded from: classes.dex */
public class w {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r5, com.fyber.inneractive.sdk.config.v r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r5 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = r5.getId()     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "advertising id: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2d
            r4[r1] = r2     // Catch: java.lang.Exception -> L2d
            com.fyber.inneractive.sdk.util.IAlog.d(r3, r4)     // Catch: java.lang.Exception -> L28
            boolean r5 = r5.isLimitAdTrackingEnabled()     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "limit ad tracking: %s"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L26
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L26
            r0[r1] = r4     // Catch: java.lang.Exception -> L26
            com.fyber.inneractive.sdk.util.IAlog.d(r3, r0)     // Catch: java.lang.Exception -> L26
            goto L46
        L26:
            r0 = move-exception
            goto L2f
        L28:
            r0 = move-exception
        L29:
            r5 = 0
            goto L2f
        L2b:
            r0 = r5
            goto L29
        L2d:
            r5 = move-exception
            goto L2b
        L2f:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Handled Exception:"
            com.fyber.inneractive.sdk.util.IAlog.d(r4, r3)
            java.lang.String r0 = com.fyber.inneractive.sdk.util.u.b(r0)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.d(r0, r3)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = "Advertising ID is not available. Please add Google Play Services library (v 4.0+) to improve your ad targeting. (relevant for devices running Android API 2.3 and above)"
            com.fyber.inneractive.sdk.util.IAlog.c(r3, r0)
        L46:
            com.fyber.inneractive.sdk.config.l r6 = (com.fyber.inneractive.sdk.config.l) r6
            monitor-enter(r6)
            com.fyber.inneractive.sdk.config.l$c r0 = r6.b     // Catch: java.lang.Throwable -> L53
            r0.a = r2     // Catch: java.lang.Throwable -> L53
            r0.b = r5     // Catch: java.lang.Throwable -> L53
            r0.c = r1     // Catch: java.lang.Throwable -> L53
            monitor-exit(r6)
            return
        L53:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.w.a(android.content.Context, com.fyber.inneractive.sdk.config.v):void");
    }
}
