package com.applovin.impl;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.pa;
import com.fyber.fairbid.http.connection.HttpConnection;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* loaded from: classes.dex */
public class c6 extends a2 implements pa {
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private final pa.f i;
    private final pa.f j;
    private final boolean k;
    private Predicate l;
    private k5 m;
    private HttpURLConnection n;
    private InputStream o;
    private boolean p;
    private int q;
    private long r;
    private long s;

    private c6(String str, int i, int i2, boolean z, pa.f fVar, Predicate predicate, boolean z2) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = fVar;
        this.l = predicate;
        this.j = new pa.f();
        this.k = z2;
    }

    private URL a(URL url, String str, k5 k5Var) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!HttpConnection.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new pa.c(AbstractC2437ph.g("Unsupported protocol redirect: ", protocol), k5Var, 2001, 1);
                }
                if (this.e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new pa.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", k5Var, 2001, 1);
            } catch (MalformedURLException e) {
                throw new pa.c(e, k5Var, 2001, 1);
            }
        }
        throw new pa.c("Null location redirect", k5Var, 2001, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection d(com.applovin.impl.k5 r26) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c6.d(com.applovin.impl.k5):java.net.HttpURLConnection");
    }

    private void h() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                oc.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.n = null;
        }
    }

    @Override // com.applovin.impl.h5
    public Uri c() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.impl.h5
    public void close() {
        try {
            InputStream inputStream = this.o;
            if (inputStream != null) {
                long j = this.r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.s;
                }
                a(this.n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new pa.c(e, (k5) xp.a(this.m), 2000, 3);
                }
            }
        } finally {
            this.o = null;
            h();
            if (this.p) {
                this.p = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.a2, com.applovin.impl.h5
    public Map e() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* loaded from: classes.dex */
    public static final class b implements pa.b {
        private xo b;
        private Predicate c;
        private String d;
        private boolean g;
        private boolean h;
        private final pa.f a = new pa.f();
        private int e = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        private int f = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        @Override // com.applovin.impl.pa.b, com.applovin.impl.h5.a
        /* renamed from: b */
        public c6 a() {
            c6 c6Var = new c6(this.d, this.e, this.f, this.g, this.a, this.c, this.h);
            xo xoVar = this.b;
            if (xoVar != null) {
                c6Var.a(xoVar);
            }
            return c6Var;
        }

        public b a(String str) {
            this.d = str;
            return this;
        }
    }

    private int e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.r;
        if (j != -1) {
            long j2 = j - this.s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) xp.a((Object) this.o)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.s += read;
        d(read);
        return read;
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return HttpConnection.ENCODING_GZIP.equalsIgnoreCase(httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING));
    }

    private HttpURLConnection a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection a2 = a(url);
        a2.setConnectTimeout(this.f);
        a2.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        pa.f fVar = this.i;
        if (fVar != null) {
            hashMap.putAll(fVar.a());
        }
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a3 = ra.a(j, j2);
        if (a3 != null) {
            a2.setRequestProperty("Range", a3);
        }
        String str = this.h;
        if (str != null) {
            a2.setRequestProperty(HttpConnection.USER_AGENT_HEADER, str);
        }
        a2.setRequestProperty(HttpConnection.ACCEPT_ENCODING, z ? HttpConnection.ENCODING_GZIP : "identity");
        a2.setInstanceFollowRedirects(z2);
        a2.setDoOutput(bArr != null);
        a2.setRequestMethod(k5.a(i));
        if (bArr != null) {
            a2.setFixedLengthStreamingMode(bArr.length);
            a2.connect();
            OutputStream outputStream = a2.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            a2.connect();
        }
        return a2;
    }

    private static void a(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = xp.a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) b1.a(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.applovin.impl.h5
    public long a(k5 k5Var) {
        byte[] bArr;
        this.m = k5Var;
        long j = 0;
        this.s = 0L;
        this.r = 0L;
        b(k5Var);
        try {
            HttpURLConnection d = d(k5Var);
            this.n = d;
            this.q = d.getResponseCode();
            String responseMessage = d.getResponseMessage();
            int i = this.q;
            if (i >= 200 && i <= 299) {
                String contentType = d.getContentType();
                Predicate predicate = this.l;
                if (predicate != null && !predicate.apply(contentType)) {
                    h();
                    throw new pa.d(contentType, k5Var);
                }
                if (this.q == 200) {
                    long j2 = k5Var.g;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                boolean a2 = a(d);
                if (!a2) {
                    long j3 = k5Var.h;
                    if (j3 != -1) {
                        this.r = j3;
                    } else {
                        long a3 = ra.a(d.getHeaderField("Content-Length"), d.getHeaderField("Content-Range"));
                        this.r = a3 != -1 ? a3 - j : -1L;
                    }
                } else {
                    this.r = k5Var.h;
                }
                try {
                    this.o = d.getInputStream();
                    if (a2) {
                        this.o = new GZIPInputStream(this.o);
                    }
                    this.p = true;
                    c(k5Var);
                    try {
                        a(j, k5Var);
                        return this.r;
                    } catch (IOException e) {
                        h();
                        if (e instanceof pa.c) {
                            throw ((pa.c) e);
                        }
                        throw new pa.c(e, k5Var, 2000, 1);
                    }
                } catch (IOException e2) {
                    h();
                    throw new pa.c(e2, k5Var, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = d.getHeaderFields();
            if (this.q == 416) {
                if (k5Var.g == ra.a(d.getHeaderField("Content-Range"))) {
                    this.p = true;
                    c(k5Var);
                    long j4 = k5Var.h;
                    if (j4 != -1) {
                        return j4;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = d.getErrorStream();
            try {
                if (errorStream != null) {
                    bArr = xp.a(errorStream);
                } else {
                    bArr = xp.f;
                }
            } catch (IOException unused) {
                bArr = xp.f;
            }
            byte[] bArr2 = bArr;
            h();
            throw new pa.e(this.q, responseMessage, this.q == 416 ? new i5(2008) : null, headerFields, k5Var, bArr2);
        } catch (IOException e3) {
            h();
            throw pa.c.a(e3, k5Var, 1);
        }
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        try {
            return e(bArr, i, i2);
        } catch (IOException e) {
            throw pa.c.a(e, (k5) xp.a(this.m), 2);
        }
    }

    private void a(long j, k5 k5Var) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int read = ((InputStream) xp.a((Object) this.o)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new pa.c(new InterruptedIOException(), k5Var, 2000, 1);
            }
            if (read != -1) {
                j -= read;
                d(read);
            } else {
                throw new pa.c(k5Var, 2008, 1);
            }
        }
    }
}
