package com.fyber.fairbid;

import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class k7 implements ic {
    @NotNull
    public static final k7 a = new k7();

    @Override // com.fyber.fairbid.ic
    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.error(message);
    }

    @Override // com.fyber.fairbid.ic
    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.warn(message);
    }

    @Override // com.fyber.fairbid.ic
    public final void c(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.debug(message);
    }
}
