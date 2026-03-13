package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.net.HttpURLConnection;
/* loaded from: classes.dex */
public class x {
    public static final byte[] b = new byte[0];
    public static final x c = new x();
    public final v<z> a = new v<>(1048576);

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.web.y a(java.net.HttpURLConnection r11, java.nio.ByteBuffer r12) throws java.io.IOException {
        /*
            r11.connect()
            r0 = 0
            r1 = 0
        L5:
            r2 = 20
            r3 = 0
            if (r1 >= r2) goto Le4
            int r9 = r11.getResponseCode()
            r2 = 300(0x12c, float:4.2E-43)
            if (r9 < r2) goto L3e
            r2 = 400(0x190, float:5.6E-43)
            if (r9 < r2) goto L17
            goto L3e
        L17:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r11.getHeaderField(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L24
            return r3
        L24:
            r11.disconnect()
            java.net.URL r11 = new java.net.URL
            r11.<init>(r2)
            java.net.URLConnection r11 = r11.openConnection()
            java.lang.Object r11 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r11)
            java.net.URLConnection r11 = (java.net.URLConnection) r11
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11
            r11.connect()
            int r1 = r1 + 1
            goto L5
        L3e:
            java.io.InputStream r1 = r11.getInputStream()     // Catch: java.lang.Throwable -> L5a
            byte[] r12 = r12.array()     // Catch: java.lang.Throwable -> L58
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
        L4b:
            int r4 = r1.read(r12)     // Catch: java.lang.Throwable -> L56
            r5 = -1
            if (r4 == r5) goto L5d
            r2.write(r12, r0, r4)     // Catch: java.lang.Throwable -> L56
            goto L4b
        L56:
            goto L5d
        L58:
            goto L5c
        L5a:
            r1 = r3
        L5c:
            r2 = r3
        L5d:
            com.fyber.inneractive.sdk.util.u.b(r1)
            r11.disconnect()
            java.lang.String r12 = r11.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r4 = ""
            if (r1 != 0) goto L90
            java.lang.String r1 = ";"
            java.lang.String[] r12 = r12.split(r1)
            int r1 = r12.length
            if (r1 <= 0) goto L7f
            r1 = r12[r0]
            java.lang.String r1 = r1.trim()
            goto L80
        L7f:
            r1 = r4
        L80:
            int r5 = r12.length
            r6 = 1
            if (r5 <= r6) goto L8d
            r12 = r12[r6]
            java.lang.String r12 = r12.trim()
            r8 = r12
            r7 = r1
            goto L92
        L8d:
            r7 = r1
            r8 = r4
            goto L92
        L90:
            r7 = r4
            r8 = r7
        L92:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r12 = r11.getHeaderFields()
            if (r12 == 0) goto Lc7
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        La5:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lc7
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r12.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto La5
            int r10 = r5.size()
            if (r10 <= 0) goto La5
            java.lang.Object r5 = r5.get(r0)
            r6.put(r4, r5)
            goto La5
        Lc7:
            java.lang.String r10 = r11.getResponseMessage()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto Ld2
            return r3
        Ld2:
            com.fyber.inneractive.sdk.web.y r11 = new com.fyber.inneractive.sdk.web.y
            if (r2 != 0) goto Lda
            byte[] r12 = com.fyber.inneractive.sdk.web.x.b
        Ld8:
            r5 = r12
            goto Ldf
        Lda:
            byte[] r12 = r2.toByteArray()
            goto Ld8
        Ldf:
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r11
        Le4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.x.a(java.net.HttpURLConnection, java.nio.ByteBuffer):com.fyber.inneractive.sdk.web.y");
    }

    public static void a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
