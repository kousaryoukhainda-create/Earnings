package com.fyber.fairbid;

import com.fyber.fairbid.ads.offerwall.OfferWallError;
import com.fyber.fairbid.ads.offerwall.ShowOptions;
import com.fyber.fairbid.ads.offerwall.VirtualCurrencyErrorResponse;
import com.fyber.fairbid.ads.offerwall.VirtualCurrencyRequestOptions;
import com.fyber.fairbid.ads.offerwall.VirtualCurrencySuccessfulResponse;
import com.fyber.fairbid.sdk.privacy.OfferWallPrivacyConsent;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public interface ha {
    void a();

    void a(long j, @NotNull ShowOptions showOptions, String str, @NotNull String str2);

    void a(long j, @NotNull ShowOptions showOptions, String str, @NotNull String str2, @NotNull OfferWallError offerWallError);

    void a(long j, @NotNull VirtualCurrencyErrorResponse virtualCurrencyErrorResponse);

    void a(long j, @NotNull VirtualCurrencySuccessfulResponse virtualCurrencySuccessfulResponse);

    void a(@NotNull ShowOptions showOptions, String str);

    void a(@NotNull VirtualCurrencyRequestOptions virtualCurrencyRequestOptions);

    void a(@NotNull OfferWallPrivacyConsent offerWallPrivacyConsent);

    void b(long j, @NotNull ShowOptions showOptions, String str, @NotNull String str2);
}
