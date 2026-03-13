package com.fyber.fairbid;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.fairbid.http.connection.HttpClient;
import com.fyber.fairbid.http.requests.JsonPostBodyProvider;
import com.fyber.fairbid.internal.Logger;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class x5 {
    @NotNull
    public final SharedPreferences a;

    public x5(@NotNull Context context, @NotNull ScheduledThreadPoolExecutor ioExecutorService) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioExecutorService, "ioExecutorService");
        SharedPreferences sharedPreferences = context.getSharedPreferences("fairbid.crash_report", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…LE, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
        if (sharedPreferences.contains("crash") && (string = sharedPreferences.getString("crash", null)) != null && string.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                int a = w1.UNCAUGHT_EXCEPTION.a();
                w6 w6Var = new w6(a);
                b2 b2Var = new b2(new RunnableC1452ga0(ioExecutorService, jSONObject, w6Var, a), ioExecutorService, new w5(this));
                w6Var.a(b2Var);
                b2Var.d();
            } catch (Exception e) {
                Logger.debug("CrashReportUtils An issue occurred while trying to report back the error", e);
            }
        }
    }

    public static final void a(ScheduledExecutorService executorService, JSONObject eventDataJSON, w6 responseHandler, int i) {
        Intrinsics.checkNotNullParameter(executorService, "$ioExecutorService");
        Intrinsics.checkNotNullParameter(eventDataJSON, "$jsonEvent");
        Intrinsics.checkNotNullParameter(responseHandler, "$responseHandler");
        k7 logger = k7.a;
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        x1 payloadSender = new x1(executorService);
        Intrinsics.checkNotNullParameter(payloadSender, "payloadSender");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Map<String, String> headers = Collections.singletonMap("X-FairBid-EventId", String.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(headers, "singletonMap(HEADER_EVENT_ID, eventId.toString())");
        Intrinsics.checkNotNullParameter(eventDataJSON, "eventDataJSON");
        Intrinsics.checkNotNullParameter(responseHandler, "responseHandler");
        Intrinsics.checkNotNullParameter(headers, "headers");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(eventDataJSON);
        try {
            jSONObject.put("events", jSONArray);
        } catch (JSONException e) {
            logger.b("Sending events failed: " + e.getMessage());
        }
        HttpClient.createHttpConnectionBuilder("https://fev.fyber.com/event").withPostBodyProvider(new JsonPostBodyProvider(jSONObject)).withHeaders(headers).withResponseHandler(responseHandler).build().trigger(payloadSender.a);
    }

    public final void a() {
        this.a.edit().remove("crash").apply();
    }

    public final void a(@NotNull u1 analyticsEvent) {
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        this.a.edit().putString("crash", c2.a(analyticsEvent.a()).toString()).apply();
    }
}
