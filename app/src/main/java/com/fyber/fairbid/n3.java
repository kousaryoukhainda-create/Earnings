package com.fyber.fairbid;

import com.fyber.fairbid.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class n3 extends AbstractC1117q {
    public final int c;
    @NotNull
    public final String d;
    public final C1106k0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(int i, int i2, @NotNull String requestId, C1106k0 c1106k0) {
        super(Constants.AdType.BANNER, i, 0);
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.c = i2;
        this.d = requestId;
        this.e = c1106k0;
    }
}
