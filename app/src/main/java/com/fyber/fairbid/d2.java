package com.fyber.fairbid;

import com.fyber.fairbid.plugin.adtransparency.AdTransparencyPlugin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class d2 {
    @NotNull
    public final String a;
    @NotNull
    public final String b;

    public d2(@NotNull String appVersion) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(AdTransparencyPlugin.currentFairBidSdkVersion, "fairBidSdkVersion");
        this.a = appVersion;
        this.b = AdTransparencyPlugin.currentFairBidSdkVersion;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }
}
