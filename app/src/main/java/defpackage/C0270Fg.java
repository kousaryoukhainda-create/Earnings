package defpackage;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Fg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270Fg {
    public static final Date f = new Date(-1);
    public static final Date g = new Date(-1);
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();
    public final Object e = new Object();

    public C0270Fg(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Eg, java.lang.Object] */
    public final C0244Eg a() {
        ?? obj;
        synchronized (this.c) {
            int i = this.a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.a.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.a = i;
            obj.b = date;
        }
        return obj;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.a.getString("customSignals", JsonUtils.EMPTY_JSON));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Eg, java.lang.Object] */
    public final C0244Eg c() {
        ?? obj;
        synchronized (this.d) {
            int i = this.a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.a = i;
            obj.b = date;
        }
        return obj;
    }

    public final void d(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(String str) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void f(int i, Date date) {
        synchronized (this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void g() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void h() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
