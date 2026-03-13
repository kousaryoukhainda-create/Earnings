package com.fyber.fairbid;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.fairbid.mediation.Network;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123t0 {
    @NotNull
    public final SharedPreferences a;

    public C1123t0(@NotNull Network network, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("fairbid." + network.getCanonicalName(), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…}\", Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a(boolean z) {
        this.a.edit().putBoolean("test_mode_enabled", z).apply();
    }
}
