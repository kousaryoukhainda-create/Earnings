package com.fyber.fairbid;

import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ql {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HyBidErrorCode.values().length];
            try {
                iArr[HyBidErrorCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HyBidErrorCode.ERROR_RENDERING_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HyBidErrorCode.ERROR_RENDERING_INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HyBidErrorCode.ERROR_RENDERING_REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HyBidErrorCode.MRAID_PLAYER_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HyBidErrorCode.VAST_PLAYER_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static kl a(Throwable th) {
        HyBidError hyBidError;
        int i;
        if (th == null) {
            Intrinsics.checkNotNullParameter("Verve has invoked an error callback without an exception", "message");
            Logger.warn("Verve Adapter - Verve has invoked an error callback without an exception");
            hyBidError = new HyBidError();
        } else {
            hyBidError = (HyBidError) th;
        }
        String message = "hyBidError code: " + hyBidError.getErrorCode().getCode();
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.debug("Verve Adapter - " + message);
        String message2 = "hyBidError message: " + hyBidError.getMessage();
        Intrinsics.checkNotNullParameter(message2, "message");
        Logger.debug("Verve Adapter - " + message2);
        HyBidErrorCode errorCode = hyBidError.getErrorCode();
        if (errorCode == null) {
            i = -1;
        } else {
            i = a.a[errorCode.ordinal()];
        }
        switch (i) {
            case 1:
                RequestFailure requestFailure = RequestFailure.NO_FILL;
                String message3 = hyBidError.getMessage();
                if (message3 == null) {
                    message3 = "no fill from verve";
                }
                return new rl(new FetchFailure(requestFailure, message3));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                DisplayResult.ErrorType errorType = DisplayResult.ErrorType.INTERNAL_ERROR;
                String message4 = hyBidError.getMessage();
                if (message4 == null) {
                    message4 = "verve - " + hyBidError.getErrorCode().name();
                }
                return new pl(new DisplayResult.Error(errorType, message4, null));
            default:
                return new rl(new FetchFailure(RequestFailure.INTERNAL, hyBidError.getMessage()));
        }
    }
}
