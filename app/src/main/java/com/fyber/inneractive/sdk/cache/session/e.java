package com.fyber.inneractive.sdk.cache.session;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    public int a;
    public int b;
    public int c;
    public long d;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.cache.session.enums.a.values().length];
            a = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.cache.session.enums.a.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e() {
        this(0, 0, 0, System.currentTimeMillis());
    }

    public JSONObject a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put(CrashHianalyticsData.TIME, this.d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.a);
        if (z2) {
            jSONObject.put("com", this.c);
        }
        jSONObject.put("cli", this.b);
        return jSONObject;
    }

    public e(int i, int i2, int i3, long j) {
        this.d = j;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static e a(JSONObject jSONObject) {
        if (jSONObject != null) {
            long optLong = jSONObject.optLong(CrashHianalyticsData.TIME);
            int optInt = jSONObject.optInt("cli", -1);
            int optInt2 = jSONObject.optInt("imp", -1);
            int optInt3 = jSONObject.optInt("com", -1);
            if (optLong != 0 && optInt >= 0 && optInt2 >= 0 && optInt3 >= 0) {
                return new e(optInt2, optInt, optInt3, optLong);
            }
        }
        return null;
    }
}
