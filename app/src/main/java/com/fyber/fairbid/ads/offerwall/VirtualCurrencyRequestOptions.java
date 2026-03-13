package com.fyber.fairbid.ads.offerwall;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class VirtualCurrencyRequestOptions {
    public final boolean a;
    public final String b;

    public VirtualCurrencyRequestOptions() {
        this(false, null, 3, null);
    }

    public final String getCurrencyId$fairbid_sdk_release() {
        return this.b;
    }

    public final boolean getToastOnReward$fairbid_sdk_release() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return b.c("VirtualCurrencyRequestOptions(\n        toastOnReward = " + this.a + "\n        currencyId = " + this.b + "\n        )\n    ");
    }

    public VirtualCurrencyRequestOptions(boolean z) {
        this(z, null, 2, null);
    }

    public VirtualCurrencyRequestOptions(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public /* synthetic */ VirtualCurrencyRequestOptions(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str);
    }
}
