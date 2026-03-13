package com.fyber.fairbid;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class cb {
    @NotNull
    public final SharedPreferences a;

    public cb(@NotNull Context context, @NotNull d2 appInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        SharedPreferences sharedPreferences = context.getSharedPreferences("install_metrics", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
        if (!Intrinsics.a(appInfo.a(), sharedPreferences.getString("app_version", null))) {
            sharedPreferences.edit().putString("app_version", appInfo.a()).remove("num_app_version_starts").remove("first_app_version_start_timestamp").apply();
        }
        if (!Intrinsics.a(appInfo.b(), sharedPreferences.getString("fairbid_version", null))) {
            sharedPreferences.edit().putString("fairbid_version", appInfo.b()).remove("num_sdk_version_starts").remove("first_sdk_version_start_timestamp").apply();
        }
    }

    public final void a() {
        this.a.edit().putInt("num_app_version_starts", this.a.getInt("num_app_version_starts", 0) + 1).apply();
    }

    public final void b() {
        this.a.edit().putInt("num_sdk_starts", this.a.getInt("num_sdk_starts", 0) + 1).apply();
    }

    public final void c() {
        this.a.edit().putInt("num_sdk_version_starts", this.a.getInt("num_sdk_version_starts", 0) + 1).apply();
    }

    public final void a(long j) {
        this.a.edit().putLong("first_app_version_start_timestamp", j).apply();
    }

    public final void b(long j) {
        this.a.edit().putLong("first_sdk_start_timestamp", j).apply();
    }

    public final void c(long j) {
        this.a.edit().putLong("first_sdk_version_start_timestamp", j).apply();
    }
}
