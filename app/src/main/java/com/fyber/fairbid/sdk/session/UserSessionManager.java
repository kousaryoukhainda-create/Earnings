package com.fyber.fairbid.sdk.session;

import com.fyber.fairbid.internal.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class UserSessionManager {
    @NotNull
    public final UserSessionStorage a;
    @NotNull
    public final Utils.ClockHelper b;
    @NotNull
    public UserSession c;

    public UserSessionManager(@NotNull UserSessionStorage storage, @NotNull Utils.ClockHelper clockHelper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(clockHelper, "clockHelper");
        this.a = storage;
        this.b = clockHelper;
        this.c = new UserSession(clockHelper.getCurrentTimeMillis(), storage);
    }

    @NotNull
    public final Utils.ClockHelper getClockHelper() {
        return this.b;
    }

    @NotNull
    public final UserSession getCurrentSession() {
        return this.c;
    }

    @NotNull
    public final UserSessionStorage getStorage() {
        return this.a;
    }

    public final void startNewSession() {
        this.c = new UserSession(this.b.getCurrentTimeMillis(), this.a);
    }
}
