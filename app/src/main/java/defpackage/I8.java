package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* renamed from: I8  reason: default package */
/* loaded from: classes.dex */
public final class I8 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public static void c(String str, JSONObject jSONObject) {
        StringBuilder l = AbstractC0324Hi.l(str);
        l.append(jSONObject.toString());
        String sb = l.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, null);
        }
    }

    public U00 a(int i) {
        U00 u00 = null;
        try {
            if (!AbstractC0324Hi.a(2, i)) {
                JSONObject k0 = ((Oc0) this.e).k0();
                if (k0 != null) {
                    U00 D = ((C0942bV) this.c).D(k0);
                    c("Loaded cached settings: ", k0);
                    ((C1314ew) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!AbstractC0324Hi.a(3, i) && D.c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            u00 = D;
                        } catch (Exception e) {
                            e = e;
                            u00 = D;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return u00;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return u00;
    }

    public U00 b() {
        return (U00) ((AtomicReference) this.h).get();
    }
}
