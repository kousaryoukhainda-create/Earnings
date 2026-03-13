package com.fyber.fairbid.ads;

import com.fyber.fairbid.k5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class OfferWallStartOptions implements k5 {
    @NotNull
    public final String a;
    public final boolean b;
    public final boolean c;

    public OfferWallStartOptions(@NotNull String appId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.a = appId;
        this.b = z;
        this.c = z2;
    }

    public static /* synthetic */ OfferWallStartOptions copy$default(OfferWallStartOptions offerWallStartOptions, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerWallStartOptions.a;
        }
        if ((i & 2) != 0) {
            z = offerWallStartOptions.b;
        }
        if ((i & 4) != 0) {
            z2 = offerWallStartOptions.c;
        }
        return offerWallStartOptions.copy(str, z, z2);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    @NotNull
    public final OfferWallStartOptions copy(@NotNull String appId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new OfferWallStartOptions(appId, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfferWallStartOptions) {
            OfferWallStartOptions offerWallStartOptions = (OfferWallStartOptions) obj;
            return Intrinsics.a(this.a, offerWallStartOptions.a) && this.b == offerWallStartOptions.b && this.c == offerWallStartOptions.c;
        }
        return false;
    }

    @NotNull
    public String getAppId() {
        return this.a;
    }

    @NotNull
    public Boolean getUsesVc() {
        return Boolean.valueOf(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    @Override // com.fyber.fairbid.k5
    public boolean isAdvertisingIdDisabled() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "OfferWallStartOptions(appId=" + this.a + ", usesVc=" + this.b + ", isAdvertisingIdDisabled=" + this.c + ')';
    }
}
