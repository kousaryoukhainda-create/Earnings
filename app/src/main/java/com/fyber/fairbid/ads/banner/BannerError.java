package com.fyber.fairbid.ads.banner;

import com.fyber.fairbid.ads.RequestFailure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class BannerError {
    public final String a;
    public final RequestFailure b;

    public BannerError(String str, RequestFailure requestFailure) {
        this.a = str;
        this.b = requestFailure;
    }

    public static /* synthetic */ BannerError copy$default(BannerError bannerError, String str, RequestFailure requestFailure, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerError.a;
        }
        if ((i & 2) != 0) {
            requestFailure = bannerError.b;
        }
        return bannerError.copy(str, requestFailure);
    }

    public final String component1() {
        return this.a;
    }

    public final RequestFailure component2() {
        return this.b;
    }

    @NotNull
    public final BannerError copy(String str, RequestFailure requestFailure) {
        return new BannerError(str, requestFailure);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BannerError) {
            BannerError bannerError = (BannerError) obj;
            return Intrinsics.a(this.a, bannerError.a) && this.b == bannerError.b;
        }
        return false;
    }

    public final String getErrorMessage() {
        return this.a;
    }

    public final RequestFailure getFailure() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        RequestFailure requestFailure = this.b;
        return hashCode + (requestFailure != null ? requestFailure.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BannerError(errorMessage=" + this.a + ", failure=" + this.b + ')';
    }
}
