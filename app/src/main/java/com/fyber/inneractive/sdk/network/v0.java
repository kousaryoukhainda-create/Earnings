package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class v0 {
    public final WeakReference<Thread> a;
    public final WeakReference<c0> b;
    public final int c;
    public final Runnable d = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            InneractiveAdRequest inneractiveAdRequest;
            com.fyber.inneractive.sdk.response.e eVar;
            JSONArray jSONArray;
            v0 v0Var = v0.this;
            c0 c0Var = (c0) com.fyber.inneractive.sdk.util.u.a(v0Var.b);
            Thread thread = (Thread) com.fyber.inneractive.sdk.util.u.a(v0.this.a);
            if (c0Var != null && c0Var.p() != r0.DONE && c0Var.p() != r0.RESOLVED) {
                if (v0.a(c0Var)) {
                    String str2 = "";
                    if (thread == null) {
                        str = "";
                    } else {
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        Exception exc = new Exception();
                        exc.setStackTrace(stackTrace);
                        str = com.fyber.inneractive.sdk.util.u.a(exc);
                    }
                    if (c0Var != null) {
                        str2 = c0Var.a();
                    }
                    if (c0Var instanceof d0) {
                        inneractiveAdRequest = ((d0) c0Var).r;
                    } else {
                        inneractiveAdRequest = null;
                    }
                    if (c0Var instanceof o0) {
                        eVar = ((o0) c0Var).u;
                    } else {
                        eVar = null;
                    }
                    r rVar = r.NETWORK_REQUEST_PASSED_ALLOWED_TIME;
                    if (c0Var != null && c0Var.m() != null) {
                        jSONArray = c0Var.m().c();
                    } else {
                        jSONArray = null;
                    }
                    s.a aVar = new s.a(rVar, inneractiveAdRequest, eVar, jSONArray);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", str2);
                    } catch (Exception unused) {
                        IAlog.e("Got exception adding param to json object: %s, %s", "url", str2);
                    }
                    try {
                        jSONObject.put(CrashHianalyticsData.STACK_TRACE, str);
                    } catch (Exception unused2) {
                        IAlog.e("Got exception adding param to json object: %s, %s", CrashHianalyticsData.STACK_TRACE, str);
                    }
                    Integer valueOf = Integer.valueOf(v0Var.c);
                    try {
                        jSONObject.put("total_time", valueOf);
                    } catch (Exception unused3) {
                        IAlog.e("Got exception adding param to json object: %s, %s", "total_time", valueOf);
                    }
                    aVar.f.put(jSONObject);
                    aVar.a((String) null);
                }
                IAlog.a("%s : NetworkWatchdogHolder should cancel by timeout: %d", IAlog.a(v0Var), Integer.valueOf(v0Var.c));
                c0Var.d();
            }
        }
    }

    public v0(c0 c0Var, Thread thread, int i) {
        this.b = new WeakReference<>(c0Var);
        this.a = new WeakReference<>(thread);
        this.c = i;
    }

    public static boolean a(c0<?> c0Var) {
        boolean z;
        if (c0Var != null && c0Var.j()) {
            z = true;
        } else {
            z = false;
        }
        IAlog.a("%s : NetworkWatchdogHolder : should report: %s", IAlog.a((Class<?>) v0.class), Boolean.valueOf(z));
        return z;
    }
}
