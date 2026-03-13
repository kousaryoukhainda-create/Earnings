package com.fyber.fairbid.ads.offerwall;

import com.fyber.fairbid.fm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class VirtualCurrencySuccessfulResponse {
    @NotNull
    public static final a Companion = new a();
    public final double a;
    @NotNull
    public final String b;
    @NotNull
    public final String c;
    @NotNull
    public final String d;
    public final boolean e;

    /* loaded from: classes.dex */
    public static final class a {
    }

    public VirtualCurrencySuccessfulResponse() {
        this(0.0d, null, null, null, false, 31, null);
    }

    public static /* synthetic */ VirtualCurrencySuccessfulResponse copy$default(VirtualCurrencySuccessfulResponse virtualCurrencySuccessfulResponse, double d, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = virtualCurrencySuccessfulResponse.a;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = virtualCurrencySuccessfulResponse.b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = virtualCurrencySuccessfulResponse.c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = virtualCurrencySuccessfulResponse.d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = virtualCurrencySuccessfulResponse.e;
        }
        return virtualCurrencySuccessfulResponse.copy(d2, str4, str5, str6, z);
    }

    public final double component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    @NotNull
    public final VirtualCurrencySuccessfulResponse copy(double d, @NotNull String latestTransactionId, @NotNull String currencyId, @NotNull String currencyName, boolean z) {
        Intrinsics.checkNotNullParameter(latestTransactionId, "latestTransactionId");
        Intrinsics.checkNotNullParameter(currencyId, "currencyId");
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        return new VirtualCurrencySuccessfulResponse(d, latestTransactionId, currencyId, currencyName, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VirtualCurrencySuccessfulResponse) {
            VirtualCurrencySuccessfulResponse virtualCurrencySuccessfulResponse = (VirtualCurrencySuccessfulResponse) obj;
            return Double.compare(this.a, virtualCurrencySuccessfulResponse.a) == 0 && Intrinsics.a(this.b, virtualCurrencySuccessfulResponse.b) && Intrinsics.a(this.c, virtualCurrencySuccessfulResponse.c) && Intrinsics.a(this.d, virtualCurrencySuccessfulResponse.d) && this.e == virtualCurrencySuccessfulResponse.e;
        }
        return false;
    }

    @NotNull
    public final String getCurrencyId() {
        return this.c;
    }

    @NotNull
    public final String getCurrencyName() {
        return this.d;
    }

    public final double getDeltaOfCoins() {
        return this.a;
    }

    @NotNull
    public final String getLatestTransactionId() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        int a2 = fm.a(this.d, fm.a(this.c, fm.a(this.b, ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31, 31), 31), 31);
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a2 + i;
    }

    public final boolean isDefault() {
        return this.e;
    }

    @NotNull
    public String toString() {
        return "VirtualCurrencySuccessfulResponse(deltaOfCoins=" + this.a + ", latestTransactionId=" + this.b + ", currencyId=" + this.c + ", currencyName=" + this.d + ", isDefault=" + this.e + ')';
    }

    public VirtualCurrencySuccessfulResponse(double d, @NotNull String latestTransactionId, @NotNull String currencyId, @NotNull String currencyName, boolean z) {
        Intrinsics.checkNotNullParameter(latestTransactionId, "latestTransactionId");
        Intrinsics.checkNotNullParameter(currencyId, "currencyId");
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        this.a = d;
        this.b = latestTransactionId;
        this.c = currencyId;
        this.d = currencyName;
        this.e = z;
    }

    public /* synthetic */ VirtualCurrencySuccessfulResponse(double d, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z);
    }
}
