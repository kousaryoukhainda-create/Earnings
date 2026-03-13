package com.fyber.fairbid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class b4 implements u6 {
    public final int a;
    public final long b;
    public final int c;
    @NotNull
    public final String d;
    @NotNull
    public final String e;
    @NotNull
    public final String f;

    public b4(int i, long j, int i2, @NotNull String sdkSessionId, @NotNull String connectionType, @NotNull String userSessionId) {
        Intrinsics.checkNotNullParameter(sdkSessionId, "sdkSessionId");
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        Intrinsics.checkNotNullParameter(userSessionId, "userSessionId");
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = sdkSessionId;
        this.e = connectionType;
        this.f = userSessionId;
    }
}
