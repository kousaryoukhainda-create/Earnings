package com.fyber.fairbid.ads.mediation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class MediatedNetwork {
    @NotNull
    public final String a;
    public final String b;

    public MediatedNetwork(@NotNull String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = str;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public final String getVersion() {
        return this.b;
    }
}
