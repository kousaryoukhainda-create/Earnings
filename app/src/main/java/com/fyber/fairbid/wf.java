package com.fyber.fairbid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class wf implements ic {
    @NotNull
    public static final wf a = new wf();

    @Override // com.fyber.fairbid.ic
    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C2053lA.d("OfferWall SDK", message);
    }

    @Override // com.fyber.fairbid.ic
    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C2053lA.i("OfferWall SDK", message);
    }

    @Override // com.fyber.fairbid.ic
    public final void c(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C2053lA.b("OfferWall SDK", message);
    }
}
