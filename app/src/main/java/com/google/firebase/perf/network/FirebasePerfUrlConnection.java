package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        C2823u80 c2823u80 = C2823u80.u;
        Timer timer = new Timer();
        timer.f();
        long j = timer.b;
        C1020cO c1020cO = new C1020cO(c2823u80);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new C1010cE((HttpsURLConnection) openConnection, timer, c1020cO).a.b();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C0925bE((HttpURLConnection) openConnection, timer, c1020cO).a.b();
            }
            return openConnection.getContent();
        } catch (IOException e) {
            c1020cO.h(j);
            c1020cO.m(timer.c());
            c1020cO.n(url.toString());
            AbstractC1182dO.c(c1020cO);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new C1010cE((HttpsURLConnection) obj, new Timer(), new C1020cO(C2823u80.u));
        }
        if (obj instanceof HttpURLConnection) {
            return new C0925bE((HttpURLConnection) obj, new Timer(), new C1020cO(C2823u80.u));
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Keep
    public static InputStream openStream(URL url) throws IOException {
        C2823u80 c2823u80 = C2823u80.u;
        Timer timer = new Timer();
        if (!c2823u80.d.get()) {
            return url.openConnection().getInputStream();
        }
        timer.f();
        long j = timer.b;
        C1020cO c1020cO = new C1020cO(c2823u80);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                url = new C1010cE((HttpsURLConnection) openConnection, timer, c1020cO).a.e();
            } else if (openConnection instanceof HttpURLConnection) {
                url = new C0925bE((HttpURLConnection) openConnection, timer, c1020cO).a.e();
            } else {
                url = openConnection.getInputStream();
            }
            return url;
        } catch (IOException e) {
            c1020cO.h(j);
            c1020cO.m(timer.c());
            c1020cO.n(url.toString());
            AbstractC1182dO.c(c1020cO);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        C2823u80 c2823u80 = C2823u80.u;
        Timer timer = new Timer();
        timer.f();
        long j = timer.b;
        C1020cO c1020cO = new C1020cO(c2823u80);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new C1010cE((HttpsURLConnection) openConnection, timer, c1020cO).a.c(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C0925bE((HttpURLConnection) openConnection, timer, c1020cO).a.c(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            c1020cO.h(j);
            c1020cO.m(timer.c());
            c1020cO.n(url.toString());
            AbstractC1182dO.c(c1020cO);
            throw e;
        }
    }
}
