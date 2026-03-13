package com.fyber.fairbid;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class fk {
    @NotNull
    public final d2 a;
    @NotNull
    public final SharedPreferences b;

    public fk(@NotNull Context context, @NotNull d2 appInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        this.a = appInfo;
        SharedPreferences sharedPreferences = context.getSharedPreferences("testsuite_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
        if (!Intrinsics.a(appInfo.b(), a())) {
            sharedPreferences.edit().remove("was_displayed").apply();
        }
    }

    public final String a() {
        return this.b.getString("last_fairbid_version", null);
    }

    public final void b() {
        this.b.edit().putBoolean("was_displayed", true).putString("last_fairbid_version", this.a.b).apply();
    }
}
