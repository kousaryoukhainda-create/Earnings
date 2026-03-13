package com.fyber.fairbid.internal;

import com.fyber.fairbid.ads.offerwall.VirtualCurrencyListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class VirtualCurrencySettings {
    @NotNull
    public final String a;
    @NotNull
    public final VirtualCurrencyListener b;

    public VirtualCurrencySettings(@NotNull String token, @NotNull VirtualCurrencyListener virtualCurrencyListener) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(virtualCurrencyListener, "virtualCurrencyListener");
        this.a = token;
        this.b = virtualCurrencyListener;
    }

    @NotNull
    public final String getToken$fairbid_sdk_release() {
        return this.a;
    }

    @NotNull
    public final VirtualCurrencyListener getVirtualCurrencyListener$fairbid_sdk_release() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return kotlin.text.b.c("VirtualCurrencySettings(\n        token = " + this.a + "\n        virtualCurrencyListener = " + this.b + "\n        )\n    ");
    }
}
