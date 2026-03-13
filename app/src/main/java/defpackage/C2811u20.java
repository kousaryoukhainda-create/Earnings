package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.HandlerThread;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executors;
import org.json.JSONObject;
/* renamed from: u20  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2811u20 {
    public static final C2741tB o = new C2741tB("Instance", 8);
    public static int p = 0;
    public static C2811u20 q;
    public final Application a;
    public final L3 b;
    public final D20 c;
    public C2468q20 d;
    public G00 e;
    public C2021kp f;
    public HashMap g;
    public HashMap h;
    public HashMap i;
    public HashMap j;
    public String k;
    public boolean l = false;
    public boolean m = false;
    public double n;

    /* JADX WARN: Type inference failed for: r11v2, types: [D20, android.os.HandlerThread, java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r1v2, types: [D20, android.os.HandlerThread] */
    /* JADX WARN: Type inference failed for: r3v4, types: [fY, java.lang.Object] */
    public C2811u20(Context context, C2468q20 c2468q20) {
        JSONObject jSONObject;
        C2741tB c2741tB = o;
        c2741tB.b("SDK version: %s", InterfaceC2608rh.b);
        c2741tB.b("SDK build info: %s", InterfaceC2608rh.a);
        c2741tB.b("new SingularInstance() with config: %s", c2468q20);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            this.a = (Application) applicationContext;
            this.d = c2468q20;
            ?? handlerThread = new HandlerThread("worker");
            this.c = handlerThread;
            ?? handlerThread2 = new HandlerThread("api");
            ?? obj = new Object();
            obj.a = new C2407pK(new SQLiteOpenHelper(context.getApplicationContext(), "singular-1.db", (SQLiteDatabase.CursorFactory) null, 1), 9);
            this.b = new L3(handlerThread2, context, obj);
            handlerThread.start();
            try {
                jSONObject = new JSONObject(b().getString("global_properties", JsonUtils.EMPTY_JSON));
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                } catch (Throwable unused2) {
                }
            }
            this.g = hashMap;
            if (this.d.h.size() != 0) {
                HashMap hashMap2 = (HashMap) this.g.clone();
                for (C2553r20 c2553r20 : this.d.h.values()) {
                    boolean z = c2553r20.c;
                    String str = c2553r20.a;
                    if (z || !hashMap2.containsKey(str)) {
                        hashMap2.put(str, c2553r20.b);
                    }
                }
                if (hashMap2.size() <= 5) {
                    this.g = hashMap2;
                    i();
                    if (this.g == null) {
                        this.g = null;
                        i();
                    }
                }
            }
            g(new RunnableC2639s20(this, this, 2));
            return;
        }
        throw new IllegalStateException("Context failed to cast to ApplicationContext");
    }

    public static C2811u20 a(Context context, C2468q20 c2468q20) {
        if (q == null) {
            synchronized (C2811u20.class) {
                try {
                    if (q == null) {
                        C2741tB.g = c2468q20.j;
                        C2741tB.h = c2468q20.k;
                        q = new C2811u20(context, c2468q20);
                    }
                } finally {
                }
            }
        }
        C2811u20 c2811u20 = q;
        c2811u20.d = c2468q20;
        return c2811u20;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a2, code lost:
        if (r13.h != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a5, code lost:
        r4 = "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ad, code lost:
        if (r13.h != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(long r13) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2811u20.j(long):void");
    }

    public final SharedPreferences b() {
        return this.a.getSharedPreferences("singular-pref-session", 0);
    }

    public final void c(JSONObject jSONObject) {
        C2741tB c2741tB = o;
        try {
            C2741tB c2741tB2 = UX.a;
            HashMap hashMap = new HashMap();
            if (jSONObject != JSONObject.NULL) {
                hashMap = UX.b(jSONObject);
            }
            c2741tB.a("device attribution json to map: " + hashMap);
            C0942bV c0942bV = this.d.n;
            if (c0942bV != null) {
                Executors.newSingleThreadExecutor().execute(new RunnableC1881jA(18, c0942bV, hashMap));
            }
        } catch (Throwable th) {
            c2741tB.a("could not convert device attribution json object to map" + th.getMessage());
        }
    }

    public final void d(I9 i9) {
        if (b().getBoolean("stop_all_tracking", false)) {
            o.a("Tracking was stopped! not logging event!");
        } else if (this.l && q != null && this.e != null) {
            g(new DH(i9, 23));
        } else {
            RunnableC1881jA runnableC1881jA = new RunnableC1881jA(this, false, i9, 20);
            if (p < 10) {
                this.c.a().postDelayed(runnableC1881jA, 200);
                p++;
            }
        }
    }

    public final void e(P3 p3) {
        if (b().getBoolean("stop_all_tracking", false)) {
            o.a("Tracking was stopped! not logging event!");
        } else if (this.l && q != null && this.e != null) {
            g(new DH(p3, 22));
        } else {
            RunnableC1881jA runnableC1881jA = new RunnableC1881jA(this, false, p3, 19);
            if (p < 10) {
                this.c.a().postDelayed(runnableC1881jA, 200);
                p++;
            }
        }
    }

    public final boolean f(String str, String str2) {
        int i;
        int i2;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        if (str2 != null) {
            i2 = str2.length();
        } else {
            i2 = 0;
        }
        int i3 = i + i2;
        if (i3 > 3746) {
            o.b("Event discarded! payload length = %d", Integer.valueOf(i3));
            return false;
        }
        e(new P3(str, str2));
        return true;
    }

    public final void g(Runnable runnable) {
        this.c.a().post(runnable);
    }

    public final void h(String str) {
        SharedPreferences.Editor edit = b().edit();
        edit.putString("custom_user_id", str);
        edit.commit();
        C2021kp c2021kp = this.f;
        if (c2021kp != null) {
            c2021kp.P = str;
        }
    }

    public final void i() {
        if (this.g == null) {
            this.g = new HashMap();
        }
        SharedPreferences.Editor edit = b().edit();
        edit.putString("global_properties", new JSONObject(this.g).toString());
        edit.commit();
    }
}
