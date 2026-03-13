package com.fyber.fairbid.ads.offerwall;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface OfferWallListener {
    void onClose(String str);

    void onShow(String str);

    void onShowError(String str, @NotNull OfferWallError offerWallError);
}
