package com.fyber.fairbid.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.fairbid.internal.Utils;
import com.fyber.fairbid.lk;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class c implements lk {
    @NotNull
    public final SharedPreferences a;
    @NotNull
    public final String b;
    public final long c;
    @NotNull
    public String d;

    public c(@NotNull Context context, @NotNull Utils.ClockHelper clockHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clockHelper, "clockHelper");
        SharedPreferences sharedPreferences = context.getSharedPreferences("fairbid.ids", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…RE, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.b = uuid;
        this.c = clockHelper.getCurrentTimeMillis();
        this.d = "";
    }

    @Override // com.fyber.fairbid.lk
    @NotNull
    public final String a() {
        if (this.d.length() == 0) {
            String string = this.a.getString("install_id", null);
            if (string == null) {
                string = UUID.randomUUID().toString();
                this.a.edit().putString("install_id", string).apply();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString().…INSTALL_ID, it).apply() }");
            }
            this.d = string;
        }
        return this.d;
    }

    @NotNull
    public final String b() {
        return this.b;
    }
}
