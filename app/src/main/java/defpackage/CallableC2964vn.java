package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: vn  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2964vn implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ C3050wn c;

    public /* synthetic */ CallableC2964vn(C3050wn c3050wn, int i) {
        this.b = i;
        this.c = c3050wn;
    }

    private final Object a() {
        String byteArrayOutputStream;
        C3050wn c3050wn = this.c;
        synchronized (c3050wn) {
            try {
                C3257zB c3257zB = (C3257zB) c3050wn.a.get();
                ArrayList c = c3257zB.c();
                c3257zB.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < c.size(); i++) {
                    D8 d8 = (D8) c.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", d8.a);
                    jSONObject.put("dates", new JSONArray((Collection) d8.b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return a();
            default:
                C3050wn c3050wn = this.c;
                synchronized (c3050wn) {
                    ((C3257zB) c3050wn.a.get()).k(System.currentTimeMillis(), ((C0304Go) c3050wn.c.get()).a());
                }
                return null;
        }
    }
}
