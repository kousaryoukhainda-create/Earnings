package com.appsflyer.internal;

import com.appsflyer.internal.AFb1fSDK;
/* loaded from: classes.dex */
public final class AFd1aSDK {
    public final AFe1sSDK AFInAppEventParameterName;
    public final AFb1fSDK.AFa1ySDK values;

    public AFd1aSDK() {
    }

    public final boolean equals(Object obj) {
        AFe1sSDK aFe1sSDK;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFd1aSDK.class == obj.getClass()) {
            AFd1aSDK aFd1aSDK = (AFd1aSDK) obj;
            AFb1fSDK.AFa1ySDK aFa1ySDK = this.values;
            if (aFa1ySDK != null && aFa1ySDK.equals(aFd1aSDK.values) && (aFe1sSDK = this.AFInAppEventParameterName) != null && aFe1sSDK.equals(aFd1aSDK.AFInAppEventParameterName)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AFb1fSDK.AFa1ySDK aFa1ySDK = this.values;
        if (aFa1ySDK != null) {
            return aFa1ySDK.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFd1aSDK(org.json.JSONObject r13) {
        /*
            r12 = this;
            r12.<init>()
            java.lang.String r0 = "exc_mngr"
            boolean r1 = r13.has(r0)
            r2 = 0
            java.lang.String r3 = "v1"
            java.lang.String r4 = "data"
            r5 = 0
            if (r1 == 0) goto L47
            org.json.JSONArray r0 = r13.getJSONArray(r0)     // Catch: java.lang.Throwable -> L46
            org.json.JSONObject r0 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L46
            org.json.JSONObject r0 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L46
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L46
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "sdk_ver"
            java.lang.String r7 = r0.getString(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "min"
            r6 = -1
            int r8 = r0.optInt(r1, r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "expire"
            int r9 = r0.optInt(r1, r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "ttl"
            r10 = -1
            long r10 = r0.optLong(r1, r10)     // Catch: java.lang.Throwable -> L46
            com.appsflyer.internal.AFb1fSDK$AFa1ySDK r0 = new com.appsflyer.internal.AFb1fSDK$AFa1ySDK     // Catch: java.lang.Throwable -> L46
            r6 = r0
            r6.<init>(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
        L47:
            r0 = r2
        L48:
            java.lang.String r1 = "meta_data"
            boolean r6 = r13.has(r1)
            if (r6 == 0) goto L71
            org.json.JSONArray r13 = r13.getJSONArray(r1)     // Catch: java.lang.Throwable -> L71
            org.json.JSONObject r13 = r13.optJSONObject(r5)     // Catch: java.lang.Throwable -> L71
            org.json.JSONObject r13 = r13.optJSONObject(r4)     // Catch: java.lang.Throwable -> L71
            java.util.Objects.requireNonNull(r13)     // Catch: java.lang.Throwable -> L71
            org.json.JSONObject r13 = r13.optJSONObject(r3)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = "send_rate"
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r13.optDouble(r1, r3)     // Catch: java.lang.Throwable -> L71
            com.appsflyer.internal.AFe1sSDK r13 = new com.appsflyer.internal.AFe1sSDK     // Catch: java.lang.Throwable -> L71
            r13.<init>(r3)     // Catch: java.lang.Throwable -> L71
            r2 = r13
        L71:
            r12.values = r0
            r12.AFInAppEventParameterName = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1aSDK.<init>(org.json.JSONObject):void");
    }
}
