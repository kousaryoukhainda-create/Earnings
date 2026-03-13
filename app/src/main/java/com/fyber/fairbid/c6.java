package com.fyber.fairbid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class c6 extends n5 {
    @NotNull
    public final n5 c;

    public c6(@NotNull n5 n5Var) {
        Intrinsics.checkNotNullParameter(n5Var, "default");
        this.c = n5Var;
    }

    @Override // com.fyber.fairbid.n5
    public final <T> T get$fairbid_sdk_release(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.c;
    }

    @Override // com.fyber.fairbid.n5
    public final <T> T get$fairbid_sdk_release(@NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.c;
    }
}
