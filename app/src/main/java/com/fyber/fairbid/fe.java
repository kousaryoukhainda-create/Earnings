package com.fyber.fairbid;
/* loaded from: classes.dex */
public final class fe {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r2.equals("EXCEPTION_APP_ID_EMPTY") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r2.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r2.equals("EXCEPTION_UNIT_ID_EMPTY") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r2.equals("EXCEPTION_UNIT_ADTYPE_ERROR") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r2.equals("EXCEPTION_APP_NOT_FOUND") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        if (r2.equals("EXCEPTION_UNIT_NOT_FOUND") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return com.fyber.fairbid.ads.RequestFailure.CONFIGURATION_ERROR;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.fairbid.ads.RequestFailure a(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            java.lang.String r0 = "errorMsg"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length()
            if (r0 <= 0) goto L7f
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "errorMsg is "
            r0.<init>(r1)
            java.util.List r2 = r0.c(r2)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r0 = r2.length
            int r0 = r0 + (-1)
            r2 = r2[r0]
            int r0 = r2.hashCode()
            switch(r0) {
                case -2037243925: goto L71;
                case -298484216: goto L68;
                case -244577426: goto L5c;
                case -240954415: goto L53;
                case 175604052: goto L4a;
                case 332024507: goto L41;
                case 370240407: goto L38;
                case 706920753: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L79
        L2c:
            java.lang.String r0 = "EXCEPTION_TIMEOUT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L35
            goto L79
        L35:
            com.fyber.fairbid.ads.RequestFailure r2 = com.fyber.fairbid.ads.RequestFailure.TIMEOUT
            goto L81
        L38:
            java.lang.String r0 = "EXCEPTION_APP_ID_EMPTY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7c
            goto L79
        L41:
            java.lang.String r0 = "EXCEPTION_UNIT_NOT_FOUND_IN_APP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7c
            goto L79
        L4a:
            java.lang.String r0 = "EXCEPTION_UNIT_ID_EMPTY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7c
            goto L79
        L53:
            java.lang.String r0 = "EXCEPTION_UNIT_ADTYPE_ERROR"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7c
            goto L79
        L5c:
            java.lang.String r0 = "EXCEPTION_RETURN_EMPTY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L65
            goto L79
        L65:
            com.fyber.fairbid.ads.RequestFailure r2 = com.fyber.fairbid.ads.RequestFailure.NO_FILL
            goto L81
        L68:
            java.lang.String r0 = "EXCEPTION_APP_NOT_FOUND"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7c
            goto L79
        L71:
            java.lang.String r0 = "EXCEPTION_UNIT_NOT_FOUND"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7c
        L79:
            com.fyber.fairbid.ads.RequestFailure r2 = com.fyber.fairbid.ads.RequestFailure.UNKNOWN
            goto L81
        L7c:
            com.fyber.fairbid.ads.RequestFailure r2 = com.fyber.fairbid.ads.RequestFailure.CONFIGURATION_ERROR
            goto L81
        L7f:
            com.fyber.fairbid.ads.RequestFailure r2 = com.fyber.fairbid.ads.RequestFailure.UNKNOWN
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.fe.a(java.lang.String):com.fyber.fairbid.ads.RequestFailure");
    }
}
