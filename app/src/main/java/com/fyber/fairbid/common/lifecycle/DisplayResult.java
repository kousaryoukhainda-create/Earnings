package com.fyber.fairbid.common.lifecycle;

import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.common.banner.BannerWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public class DisplayResult {
    @NotNull
    public static final Error f;
    @NotNull
    public static final DisplayResult g;
    @NotNull
    public static final DisplayResult h;
    public final boolean a;
    public final Error b;
    public final BannerWrapper c;
    public final int d;
    @NotNull
    public static final a Companion = new a();
    @NotNull
    public static final DisplayResult SUCCESS = new DisplayResult();
    @NotNull
    public static final DisplayResult NOT_READY = new DisplayResult(new Error(ErrorType.NOT_READY, "Ad not ready", null));
    @NotNull
    public static final DisplayResult e = new DisplayResult(new Error(ErrorType.UNSUPPORTED_AD_TYPE, "Unsupported Ad Type", null));

    @Metadata
    /* loaded from: classes.dex */
    public static final class Error {
        @NotNull
        public final ErrorType a;
        @NotNull
        public final String b;
        public final RequestFailure c;

        public Error(@NotNull ErrorType errorType, @NotNull String description, RequestFailure requestFailure) {
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            Intrinsics.checkNotNullParameter(description, "description");
            this.a = errorType;
            this.b = description;
            this.c = requestFailure;
        }

        @NotNull
        public final String getDescription() {
            return this.b;
        }

        @NotNull
        public final ErrorType getErrorType() {
            return this.a;
        }

        public final RequestFailure getRequestFailure() {
            return this.c;
        }

        @NotNull
        public String toString() {
            return "Error{errorType=" + this.a + ", description='" + this.b + "', requestFailure=" + this.c + '}';
        }
    }

    @Metadata
    /* loaded from: classes.dex */
    public enum ErrorType {
        TIMEOUT,
        UNSUPPORTED_AD_TYPE,
        NOT_READY,
        INTERNAL_ERROR,
        APP_NOT_FOREGROUND,
        AD_REUSED,
        REQUEST_ERROR,
        AD_EXPIRED,
        CONCURRENT_FS_AD_ON_SCREEN;

        ErrorType() {
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        Error error = new Error(ErrorType.TIMEOUT, "Display timeout", null);
        f = error;
        g = new DisplayResult(error);
        h = new DisplayResult(new Error(ErrorType.CONCURRENT_FS_AD_ON_SCREEN, "Another fullscreen ad is currently on screen", null));
    }

    public DisplayResult() {
        this((BannerWrapper) null);
    }

    public final BannerWrapper getBannerWrapper() {
        return this.c;
    }

    public final int getDisplayTimeout() {
        return this.d;
    }

    public final Error getError() {
        return this.b;
    }

    @NotNull
    public final String getErrorMessage() {
        String description;
        Error error = this.b;
        if (error == null || (description = error.getDescription()) == null) {
            return "no error message available (there is no error)";
        }
        return description;
    }

    @NotNull
    public final RequestFailure getFetchFailure() {
        RequestFailure requestFailure;
        Error error = this.b;
        if (error == null || (requestFailure = error.getRequestFailure()) == null) {
            return RequestFailure.UNAVAILABLE;
        }
        return requestFailure;
    }

    public boolean getWasBannerDestroyed() {
        return false;
    }

    public boolean isBannerResult() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean isSuccess() {
        return this.a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DisplayResult{isSuccess=");
        sb.append(this.a);
        sb.append(", error='");
        Error error = this.b;
        sb.append((error == null || (r1 = error.toString()) == null) ? "n/a'" : "n/a'");
        sb.append("', bannerWrapper=");
        sb.append(this.c);
        sb.append("wasBannerDestroyed=");
        sb.append(getWasBannerDestroyed());
        sb.append(" }");
        return sb.toString();
    }

    public DisplayResult(BannerWrapper bannerWrapper) {
        this.a = true;
        this.c = bannerWrapper;
        this.b = null;
        this.d = -1;
    }

    public DisplayResult(Error error) {
        this.b = error;
        this.a = false;
        this.c = null;
        this.d = 10;
    }

    public DisplayResult(int i) {
        this.b = f;
        this.a = false;
        this.c = null;
        this.d = i;
    }
}
