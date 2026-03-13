package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.fairbid.http.connection.HttpConnection;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class i extends h implements g {

    /* loaded from: classes.dex */
    public static class a extends j {
        public final HttpURLConnection g;

        public a(HttpURLConnection httpURLConnection, int i, InputStream inputStream, Map<String, List<String>> map, String str) {
            this.g = httpURLConnection;
            a(i);
            a(inputStream);
            a(map);
            a(str);
        }

        @Override // com.fyber.inneractive.sdk.network.j
        public void a() throws IOException {
            try {
                HttpURLConnection httpURLConnection = this.g;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
            super.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.network.g
    public <T> j a(c0<T> c0Var, String str, String str2) throws Exception {
        InputStream inputStream;
        j a2;
        IAlog.a("%s hurl network stack is in use", "HttpExecutorImpl");
        URL url = new URL(c0Var.a());
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0Var.a());
        Pair<List<String>, HttpURLConnection> a3 = a(c0Var, arrayList, url, str, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) a3.second;
        List<String> list = (List) a3.first;
        if (httpURLConnection == null) {
            try {
                if (list.size() <= 0) {
                    throw new x0("failed reading network response connection null");
                }
            } catch (SocketTimeoutException e) {
                throw new a1(e);
            } catch (IOException e2) {
                IAlog.a("failed reading network response", e2, new Object[0]);
                throw new x0(e2);
            }
        }
        if (httpURLConnection == null) {
            a2 = a((InputStream) null, 200, "", (Map<String, List<String>>) null, (String) null);
        } else {
            try {
                inputStream = a(httpURLConnection.getInputStream(), TextUtils.equals(HttpConnection.ENCODING_GZIP, httpURLConnection.getContentEncoding()));
            } catch (Exception unused) {
                inputStream = null;
            }
            a2 = a(inputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField("Last-Modified"));
        }
        a aVar = new a(httpURLConnection, a2.a, a2.c, a2.d, a2.e);
        for (String str3 : list) {
            aVar.f.add(str3);
        }
        return aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.g
    public void b() {
    }

    public final <T> Pair<List<String>, HttpURLConnection> a(c0<T> c0Var, List<String> list, URL url, String str, String str2) throws b {
        String headerField;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            if (!c0Var.l()) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            u0 n = c0Var.n();
            httpURLConnection.setConnectTimeout(n.a);
            httpURLConnection.setReadTimeout(n.b);
            a(httpURLConnection, HttpConnection.USER_AGENT_HEADER, str);
            a(httpURLConnection, "If-Modified-Since", str2);
            a(httpURLConnection, HttpConnection.ACCEPT_ENCODING, HttpConnection.ENCODING_GZIP);
            Map<String, String> w = c0Var.w();
            if (w != null) {
                for (String str3 : w.keySet()) {
                    a(httpURLConnection, str3, w.get(str3));
                }
            }
            c0Var.b(System.currentTimeMillis());
            if (c0Var.r() != z.POST && c0Var.r() != z.PUT) {
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                c0Var.a(System.currentTimeMillis());
                IAlog.a("%s (%s) response code - %d", c0Var.toString(), url, Integer.valueOf(responseCode));
                if (c0Var.l() && (((responseCode > 300 && responseCode < 304) || responseCode == 307 || responseCode == 308) && (headerField = httpURLConnection.getHeaderField("Location")) != null)) {
                    if (!headerField.startsWith("http") && !headerField.contains("://") && list.size() > 0) {
                        Uri parse = Uri.parse(list.get(list.size() - 1));
                        headerField = String.format(headerField.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), headerField);
                    }
                    list.add(headerField);
                    if (list.size() <= 5) {
                        if (headerField.startsWith("http")) {
                            return a(c0Var, list, new URL(headerField), str, str2);
                        }
                        return Pair.create(list, null);
                    }
                    throw new b("Url chain too big for us");
                }
                return new Pair<>(list, httpURLConnection);
            }
            a(httpURLConnection, (c0<?>) c0Var);
            int responseCode2 = httpURLConnection.getResponseCode();
            c0Var.a(System.currentTimeMillis());
            IAlog.a("%s (%s) response code - %d", c0Var.toString(), url, Integer.valueOf(responseCode2));
            if (c0Var.l()) {
            }
            return new Pair<>(list, httpURLConnection);
        } catch (Exception e) {
            c0Var.a(System.currentTimeMillis());
            IAlog.a("failed executing network request", e, new Object[0]);
            throw new b(e);
        }
    }

    public final void a(HttpURLConnection httpURLConnection, c0<?> c0Var) throws Exception {
        httpURLConnection.setRequestMethod(c0Var.r().key);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] u = c0Var.u();
        int length = u != null ? u.length : 0;
        httpURLConnection.setRequestProperty("Content-Length", "" + length);
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE_HEADER, c0Var.q());
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(u);
        try {
            outputStream.close();
        } catch (Throwable unused) {
        }
    }

    public final void a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (httpURLConnection == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        IAlog.a(1, null, "%s %s : %s", "REQUEST_HEADER", str, str2);
        httpURLConnection.addRequestProperty(str, str2);
    }
}
