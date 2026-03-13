package com.fyber.fairbid;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class se implements ic {
    @NotNull
    public static final se a = new se();

    @Override // com.fyber.fairbid.ic
    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.e("DT", message);
    }

    @Override // com.fyber.fairbid.ic
    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w("DT", message);
    }

    @Override // com.fyber.fairbid.ic
    public final void c(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("DT", message);
    }
}
