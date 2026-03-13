package com.fyber.fairbid;

import android.net.Uri;
import android.webkit.CookieManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class h9 {
    public HashMap a;
    public final URL b;
    public boolean c = false;
    public int d;
    public Map<String, List<String>> e;
    public String f;

    public h9(String str) throws MalformedURLException {
        Uri parse = Uri.parse(str);
        this.b = new URL((parse.isRelative() ? parse.buildUpon().scheme("http").build() : parse).toString());
    }

    public final h9 a() throws IOException {
        InputStream errorStream;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(this.b.openConnection()));
        if (lc.a(this.a)) {
            for (Map.Entry entry : this.a.entrySet()) {
                String str2 = (String) entry.getValue();
                if (Wh0.P(str2)) {
                    str2 = "";
                }
                httpURLConnection.addRequestProperty((String) entry.getKey(), str2);
            }
        }
        String cookie = CookieManager.getInstance().getCookie(this.b.getHost());
        if (cookie != null && !cookie.isEmpty()) {
            httpURLConnection.addRequestProperty("Cookie", cookie);
        }
        try {
            this.d = httpURLConnection.getResponseCode();
        } catch (IOException e) {
            C2053lA.e("HttpConnection", e.getMessage());
            this.d = httpURLConnection.getResponseCode();
        }
        this.e = Collections.unmodifiableMap(httpURLConnection.getHeaderFields());
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int read = errorStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            str = byteArrayOutputStream.toString("UTF-8");
        } else {
            str = "";
        }
        this.f = str;
        synchronized (this) {
            try {
                List<String> list = this.e.get("Set-Cookie");
                if (list != null) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    for (String str3 : list) {
                        cookieManager.setCookie(this.b.toString(), str3);
                    }
                    cookieManager.flush();
                }
                List<String> list2 = this.e.get("Set-Cookie2");
                if (list2 != null) {
                    CookieManager cookieManager2 = CookieManager.getInstance();
                    for (String str4 : list2) {
                        cookieManager2.setCookie(this.b.toString(), str4);
                    }
                    cookieManager2.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        httpURLConnection.disconnect();
        this.c = true;
        return this;
    }
}
