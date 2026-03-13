package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
public class d {
    private static final String o = "d";
    private Map<String, List<String>> a;
    private byte[] b;
    private int c;
    private long d;
    private long e;
    private long f;
    private String g;
    private int h;
    private int i;
    private String j;
    private long k;
    private String l;
    private Exception m;
    private String n;

    public d(int i, Map<String, List<String>> map, byte[] bArr, long j) {
        this.h = 2;
        this.i = ConnectionResult.RESOLUTION_REQUIRED;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.c = i;
        this.a = map;
        this.b = ByteBuffer.wrap(bArr).array();
        this.d = j;
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r9.getInt("resultCode") == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "errorList"
            java.lang.String r2 = "errorDesc"
            java.lang.String r3 = "errorCode"
            java.lang.String r4 = "resultCode"
            java.lang.String r5 = "isSuccess"
            boolean r6 = r10.m()
            r7 = 1
            if (r6 == 0) goto L1d
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK get httpcode{304} not any changed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r7)
            return
        L1d:
            boolean r6 = r10.o()
            r8 = 2
            if (r6 != 0) goto L2f
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK parse server body all failed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r8)
            return
        L2f:
            byte[] r6 = r10.b     // Catch: org.json.JSONException -> L47
            java.lang.String r6 = com.huawei.hms.framework.common.StringUtils.byte2Str(r6)     // Catch: org.json.JSONException -> L47
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L47
            r9.<init>(r6)     // Catch: org.json.JSONException -> L47
            boolean r6 = r9.has(r5)     // Catch: org.json.JSONException -> L47
            if (r6 == 0) goto L4a
            int r4 = r9.getInt(r5)     // Catch: org.json.JSONException -> L47
            if (r4 != r7) goto L58
            goto L56
        L47:
            r1 = move-exception
            goto Lba
        L4a:
            boolean r5 = r9.has(r4)     // Catch: org.json.JSONException -> L47
            if (r5 == 0) goto L5a
            int r4 = r9.getInt(r4)     // Catch: org.json.JSONException -> L47
            if (r4 != 0) goto L58
        L56:
            r4 = 1
            goto L62
        L58:
            r4 = 2
            goto L62
        L5a:
            java.lang.String r4 = com.huawei.hms.framework.network.grs.g.d.o     // Catch: org.json.JSONException -> L47
            java.lang.String r5 = "sth. wrong because server errorcode's key."
            com.huawei.hms.framework.common.Logger.e(r4, r5)     // Catch: org.json.JSONException -> L47
            r4 = -1
        L62:
            java.lang.String r5 = "services"
            if (r4 == r7) goto L6d
            boolean r6 = r9.has(r5)     // Catch: org.json.JSONException -> L47
            if (r6 == 0) goto L6d
            r4 = 0
        L6d:
            r10.c(r4)     // Catch: org.json.JSONException -> L47
            java.lang.String r6 = ""
            if (r4 == r7) goto L95
            if (r4 != 0) goto L77
            goto L95
        L77:
            boolean r1 = r9.has(r3)     // Catch: org.json.JSONException -> L47
            if (r1 == 0) goto L82
            int r1 = r9.getInt(r3)     // Catch: org.json.JSONException -> L47
            goto L84
        L82:
            r1 = 9001(0x2329, float:1.2613E-41)
        L84:
            r10.b(r1)     // Catch: org.json.JSONException -> L47
            boolean r1 = r9.has(r2)     // Catch: org.json.JSONException -> L47
            if (r1 == 0) goto L91
            java.lang.String r6 = r9.getString(r2)     // Catch: org.json.JSONException -> L47
        L91:
            r10.d(r6)     // Catch: org.json.JSONException -> L47
            goto Ld0
        L95:
            boolean r2 = r9.has(r5)     // Catch: org.json.JSONException -> L47
            if (r2 == 0) goto La4
            org.json.JSONObject r2 = r9.getJSONObject(r5)     // Catch: org.json.JSONException -> L47
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L47
            goto La5
        La4:
            r2 = r6
        La5:
            r10.f(r2)     // Catch: org.json.JSONException -> L47
            boolean r2 = r9.has(r1)     // Catch: org.json.JSONException -> L47
            if (r2 == 0) goto Lb6
            org.json.JSONObject r1 = r9.getJSONObject(r1)     // Catch: org.json.JSONException -> L47
            java.lang.String r6 = r1.toString()     // Catch: org.json.JSONException -> L47
        Lb6:
            r10.e(r6)     // Catch: org.json.JSONException -> L47
            goto Ld0
        Lba:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r1)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r0] = r1
            java.lang.String r0 = "GrsResponse GrsResponse(String result) JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r2, r0, r3)
            r10.c(r8)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[Catch: JSONException -> 0x0032, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0032, blocks: (B:13:0x0025, B:15:0x002b, B:21:0x003a, B:23:0x0040, B:20:0x0034), top: B:27:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            r4 = this;
            boolean r0 = r4.o()
            if (r0 != 0) goto L13
            boolean r0 = r4.n()
            if (r0 != 0) goto L13
            boolean r0 = r4.m()
            if (r0 != 0) goto L13
            return
        L13:
            java.util.Map r0 = r4.r()
            int r1 = r0.size()
            if (r1 > 0) goto L25
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "parseHeader {headers.size() <= 0}"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            return
        L25:
            boolean r1 = r4.o()     // Catch: org.json.JSONException -> L32
            if (r1 != 0) goto L34
            boolean r1 = r4.m()     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L3a
            goto L34
        L32:
            r0 = move-exception
            goto L44
        L34:
            r4.b(r0)     // Catch: org.json.JSONException -> L32
            r4.a(r0)     // Catch: org.json.JSONException -> L32
        L3a:
            boolean r1 = r4.n()     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L59
            r4.c(r0)     // Catch: org.json.JSONException -> L32
            goto L59
        L44:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "parseHeader catch JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r2)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.q():void");
    }

    private Map<String, String> r() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.a;
        if (map == null || map.size() <= 0) {
            Logger.v(o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return hashMap;
        }
        for (Map.Entry<String, List<String>> entry : this.a.entrySet()) {
            String key = entry.getKey();
            for (String str : entry.getValue()) {
                hashMap.put(key, str);
            }
        }
        return hashMap;
    }

    private void s() {
        q();
        p();
    }

    public String a() {
        return this.j;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.i;
    }

    public Exception d() {
        return this.m;
    }

    public String e() {
        return this.l;
    }

    public int f() {
        return this.h;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return this.e;
    }

    public long i() {
        return this.d;
    }

    public String j() {
        return this.g;
    }

    public long k() {
        return this.k;
    }

    public String l() {
        return this.n;
    }

    public boolean m() {
        return this.c == 304;
    }

    public boolean n() {
        return this.c == 503;
    }

    public boolean o() {
        return this.c == 200;
    }

    public d(Exception exc, long j) {
        this.c = 0;
        this.h = 2;
        this.i = ConnectionResult.RESOLUTION_REQUIRED;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.m = exc;
        this.d = j;
    }

    private void b(int i) {
        this.i = i;
    }

    private void c(int i) {
        this.h = i;
    }

    private void d(String str) {
    }

    private void e(String str) {
    }

    private void f(String str) {
        this.g = str;
    }

    public void a(int i) {
    }

    private void c(long j) {
        this.k = j;
    }

    public void a(long j) {
        this.f = j;
    }

    public void b(long j) {
        this.e = j;
    }

    private void c(String str) {
        this.j = str;
    }

    public void a(String str) {
        this.l = str;
    }

    public void b(String str) {
        this.n = str;
    }

    private void a(Map<String, String> map) {
        String str;
        String str2;
        if (map.containsKey("ETag")) {
            String str3 = map.get("ETag");
            if (!TextUtils.isEmpty(str3)) {
                Logger.i(o, "success get Etag from server");
                a(str3);
                return;
            }
            str = o;
            str2 = "The Response Heads Etag is Empty";
        } else {
            str = o;
            str2 = "Response Heads has not Etag";
        }
        Logger.i(str, str2);
    }

    private void b(Map<String, String> map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v(o, "Cache-Control value{%s}", Long.valueOf(time));
                    } catch (NumberFormatException e) {
                        e = e;
                        Logger.w(o, "getExpireTime addHeadersToResult NumberFormatException", e);
                        long j = ((time > 0 || time > 2592000) ? 86400L : 86400L) * 1000;
                        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j));
                        c(String.valueOf(System.currentTimeMillis() + j));
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    time = 0;
                }
            }
            time = 0;
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e3) {
                    Logger.w(o, "getExpireTime ParseException.", e3);
                }
            } else {
                Logger.i(o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        long j2 = ((time > 0 || time > 2592000) ? 86400L : 86400L) * 1000;
        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j2));
        c(String.valueOf(System.currentTimeMillis() + j2));
    }

    private void c(Map<String, String> map) {
        long j;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    Logger.w(o, "getRetryAfter addHeadersToResult NumberFormatException", e);
                }
                long j2 = j * 1000;
                Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j2));
                c(j2);
            }
        }
        j = 0;
        long j22 = j * 1000;
        Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j22));
        c(j22);
    }
}
