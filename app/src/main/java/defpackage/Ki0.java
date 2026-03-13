package defpackage;

import android.text.TextUtils;
import com.fyber.fairbid.http.connection.HttpConnection;
import io.adjoe.sdk.PlaytimeInitialisationListener;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
/* renamed from: Ki0  reason: default package */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class Ki0 {
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static PlaytimeInitialisationListener d;

    public static String a(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        d(bufferedReader2);
                        d(inputStream);
                        return sb2;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    d(bufferedReader);
                    d(inputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static StringBuilder b(String str) {
        return AbstractC0324Hi.l(str);
    }

    public static void c(C2948vf c2948vf, HttpsURLConnection httpsURLConnection) {
        DataOutputStream dataOutputStream;
        if (!TextUtils.isEmpty((String) c2948vf.e)) {
            DataOutputStream dataOutputStream2 = null;
            try {
                httpsURLConnection.setDoOutput(true);
                if (HttpConnection.ENCODING_GZIP.equals(((HashMap) c2948vf.f).get("content-encoding"))) {
                    dataOutputStream = new DataOutputStream(new GZIPOutputStream(httpsURLConnection.getOutputStream()));
                } else {
                    dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
                }
                dataOutputStream2 = dataOutputStream;
                dataOutputStream2.writeBytes((String) c2948vf.e);
                dataOutputStream2.flush();
                d(dataOutputStream2);
            } catch (Throwable th) {
                d(dataOutputStream2);
                throw th;
            }
        }
    }

    public static void d(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void e(C2948vf c2948vf, HttpsURLConnection httpsURLConnection) {
        for (Map.Entry entry : ((HashMap) c2948vf.f).entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
