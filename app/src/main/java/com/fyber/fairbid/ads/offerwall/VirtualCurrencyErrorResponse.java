package com.fyber.fairbid.ads.offerwall;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class VirtualCurrencyErrorResponse {
    @NotNull
    public final OfferWallError a;
    public final String b;
    public final String c;

    public VirtualCurrencyErrorResponse(@NotNull OfferWallError error, String str, String str2) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
        this.b = str;
        this.c = str2;
    }

    public static /* synthetic */ VirtualCurrencyErrorResponse copy$default(VirtualCurrencyErrorResponse virtualCurrencyErrorResponse, OfferWallError offerWallError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            offerWallError = virtualCurrencyErrorResponse.a;
        }
        if ((i & 2) != 0) {
            str = virtualCurrencyErrorResponse.b;
        }
        if ((i & 4) != 0) {
            str2 = virtualCurrencyErrorResponse.c;
        }
        return virtualCurrencyErrorResponse.copy(offerWallError, str, str2);
    }

    @NotNull
    public final OfferWallError component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    @NotNull
    public final VirtualCurrencyErrorResponse copy(@NotNull OfferWallError error, String str, String str2) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new VirtualCurrencyErrorResponse(error, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VirtualCurrencyErrorResponse) {
            VirtualCurrencyErrorResponse virtualCurrencyErrorResponse = (VirtualCurrencyErrorResponse) obj;
            return this.a == virtualCurrencyErrorResponse.a && Intrinsics.a(this.b, virtualCurrencyErrorResponse.b) && Intrinsics.a(this.c, virtualCurrencyErrorResponse.c);
        }
        return false;
    }

    public final String getCurrencyId() {
        return this.c;
    }

    @NotNull
    public final OfferWallError getError() {
        return this.a;
    }

    public final String getServerErrorMessage() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VirtualCurrencyErrorResponse(error=" + this.a + ", serverErrorMessage=" + this.b + ", currencyId=" + this.c + ')';
    }

    public /* synthetic */ VirtualCurrencyErrorResponse(OfferWallError offerWallError, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(offerWallError, (i & 2) != 0 ? null : str, str2);
    }
}
