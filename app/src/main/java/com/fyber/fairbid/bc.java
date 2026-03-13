package com.fyber.fairbid;

import com.fyber.fairbid.k8;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bc {
    public static final Boolean a(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter("exchange_fallback", Constants.KEY);
        String it = jSONObject.optString("exchange_fallback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        String lowerCase = it.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (Intrinsics.a(lowerCase, "false") ? true : Intrinsics.a(lowerCase, InneractiveMediationDefs.SHOW_HOUSE_AD_YES)) {
            return Boolean.valueOf(Boolean.parseBoolean(lowerCase));
        }
        return null;
    }

    public static final Double b(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter("fallback_threshold_on_request", Constants.KEY);
        double optDouble = jSONObject.optDouble("fallback_threshold_on_request", Double.NaN);
        Double valueOf = Double.valueOf(optDouble);
        if (Double.isNaN(optDouble)) {
            return null;
        }
        return valueOf;
    }

    public static final Integer a(@NotNull JSONObject jSONObject, @NotNull k8.a predicate) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter("close_timeout", Constants.KEY);
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int optInt = jSONObject.optInt("close_timeout", Integer.MIN_VALUE);
        Integer valueOf = Integer.valueOf(optInt);
        if (((Boolean) predicate.invoke(Integer.valueOf(optInt))).booleanValue()) {
            return valueOf;
        }
        return null;
    }
}
