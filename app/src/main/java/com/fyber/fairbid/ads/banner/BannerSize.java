package com.fyber.fairbid.ads.banner;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public enum BannerSize {
    SMART("Typical banner - 320x50 for phone and 728x90 for tablet"),
    MREC("Medium rectangle - 300x250");
    
    @NotNull
    public final String a;

    BannerSize(String str) {
        this.a = str;
    }

    @NotNull
    public final String getDescription() {
        return this.a;
    }
}
