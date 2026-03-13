package com.fyber.fairbid;
/* loaded from: classes.dex */
public final class g4 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.fyber.fairbid.common.lifecycle.FetchFailure a(@org.jetbrains.annotations.NotNull sg.bigo.ads.api.AdError r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.getCode()
            switch(r0) {
                case 1000: goto L27;
                case 1001: goto L24;
                case 1002: goto L21;
                case 1003: goto L1e;
                case 1004: goto L1b;
                case 1005: goto L18;
                case 1006: goto L21;
                case 1007: goto L24;
                default: goto Lc;
            }
        Lc:
            switch(r0) {
                case 2000: goto L15;
                case 2001: goto L12;
                case 2002: goto L21;
                case 2003: goto L15;
                case 2004: goto L21;
                case 2005: goto L21;
                default: goto Lf;
            }
        Lf:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.UNKNOWN
            goto L29
        L12:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.UNSUPPORTED_AD_TYPE
            goto L29
        L15:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.TIMEOUT
            goto L29
        L18:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.INTERNAL
            goto L29
        L1b:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.NO_FILL
            goto L29
        L1e:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.NETWORK_ERROR
            goto L29
        L21:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.UNKNOWN
            goto L29
        L24:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.BAD_CREDENTIALS
            goto L29
        L27:
            com.fyber.fairbid.ads.RequestFailure r0 = com.fyber.fairbid.ads.RequestFailure.CONFIGURATION_ERROR
        L29:
            com.fyber.fairbid.common.lifecycle.FetchFailure r1 = new com.fyber.fairbid.common.lifecycle.FetchFailure
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.g4.a(sg.bigo.ads.api.AdError):com.fyber.fairbid.common.lifecycle.FetchFailure");
    }
}
