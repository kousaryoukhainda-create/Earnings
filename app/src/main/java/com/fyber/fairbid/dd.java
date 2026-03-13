package com.fyber.fairbid;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.fairbid.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dd {
    @NotNull
    public final SharedPreferences a;

    public dd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREFERENCES_KEY, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a(@NotNull JSONObject response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.a.edit().putString("config.cache", response.toString()).apply();
    }
}
