package com.fyber.fairbid;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ShowError;
import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class f5 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CacheError.Code.values().length];
            try {
                iArr[CacheError.Code.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheError.Code.INTERNET_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheError.Code.NETWORK_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheError.Code.NO_AD_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CacheError.Code.SESSION_NOT_STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CacheError.Code.SERVER_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CacheError.Code.ASSET_DOWNLOAD_FAILURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CacheError.Code.BANNER_DISABLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CacheError.Code.BANNER_VIEW_IS_DETACHED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr;
            int[] iArr2 = new int[ShowError.Code.values().length];
            try {
                iArr2[ShowError.Code.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ShowError.Code.SESSION_NOT_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ShowError.Code.INTERNET_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ShowError.Code.PRESENTATION_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ShowError.Code.NO_CACHED_AD.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ShowError.Code.BANNER_DISABLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ShowError.Code.BANNER_VIEW_IS_DETACHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ShowError.Code.AD_ALREADY_VISIBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static e5 a(CacheError cacheError) {
        e5 e5Var;
        CacheError.Code code = cacheError != null ? cacheError.getCode() : null;
        switch (code == null ? -1 : a.a[code.ordinal()]) {
            case 1:
                e5Var = new e5(new FetchFailure(RequestFailure.INTERNAL, cacheError.toString()));
                break;
            case 2:
                e5Var = new e5(new FetchFailure(RequestFailure.NETWORK_ERROR, cacheError.toString()));
                break;
            case 3:
                e5Var = new e5(new FetchFailure(RequestFailure.NETWORK_ERROR, cacheError.toString()));
                break;
            case 4:
                e5Var = new e5(new FetchFailure(RequestFailure.NO_FILL, cacheError.toString()));
                break;
            case 5:
                e5Var = new e5(new FetchFailure(RequestFailure.CONFIGURATION_ERROR, cacheError.toString()));
                break;
            case 6:
                e5Var = new e5(new FetchFailure(RequestFailure.REMOTE_ERROR, cacheError.toString()));
                break;
            case 7:
                e5Var = new e5(new FetchFailure(RequestFailure.NETWORK_ERROR, cacheError.toString()));
                break;
            case 8:
                e5Var = new e5(new FetchFailure(RequestFailure.CONFIGURATION_ERROR, cacheError.toString()));
                break;
            case 9:
                e5Var = new e5(new FetchFailure(RequestFailure.INTERNAL, cacheError.toString()));
                break;
            default:
                return new e5(new FetchFailure(RequestFailure.UNKNOWN, "Unknown failure"));
        }
        return e5Var;
    }

    @NotNull
    public static DisplayResult.Error a(@NotNull ShowError showError) {
        DisplayResult.Error error;
        String message;
        Intrinsics.checkNotNullParameter(showError, "<this>");
        switch (a.b[showError.getCode().ordinal()]) {
            case 1:
                DisplayResult.ErrorType errorType = DisplayResult.ErrorType.INTERNAL_ERROR;
                Exception exception = showError.getException();
                message = exception != null ? exception.getMessage() : null;
                error = new DisplayResult.Error(errorType, message != null ? message : "", RequestFailure.INTERNAL);
                break;
            case 2:
                DisplayResult.ErrorType errorType2 = DisplayResult.ErrorType.INTERNAL_ERROR;
                Exception exception2 = showError.getException();
                message = exception2 != null ? exception2.getMessage() : null;
                error = new DisplayResult.Error(errorType2, message != null ? message : "", RequestFailure.INTERNAL);
                break;
            case 3:
                DisplayResult.ErrorType errorType3 = DisplayResult.ErrorType.INTERNAL_ERROR;
                Exception exception3 = showError.getException();
                message = exception3 != null ? exception3.getMessage() : null;
                error = new DisplayResult.Error(errorType3, message != null ? message : "", RequestFailure.NETWORK_ERROR);
                break;
            case 4:
                DisplayResult.ErrorType errorType4 = DisplayResult.ErrorType.INTERNAL_ERROR;
                Exception exception4 = showError.getException();
                message = exception4 != null ? exception4.getMessage() : null;
                error = new DisplayResult.Error(errorType4, message != null ? message : "", RequestFailure.INTERNAL);
                break;
            case 5:
                DisplayResult.ErrorType errorType5 = DisplayResult.ErrorType.AD_EXPIRED;
                Exception exception5 = showError.getException();
                message = exception5 != null ? exception5.getMessage() : null;
                error = new DisplayResult.Error(errorType5, message != null ? message : "", RequestFailure.NO_FILL);
                break;
            case 6:
                DisplayResult.ErrorType errorType6 = DisplayResult.ErrorType.INTERNAL_ERROR;
                Exception exception6 = showError.getException();
                message = exception6 != null ? exception6.getMessage() : null;
                error = new DisplayResult.Error(errorType6, message != null ? message : "", RequestFailure.CONFIGURATION_ERROR);
                break;
            case 7:
                DisplayResult.ErrorType errorType7 = DisplayResult.ErrorType.INTERNAL_ERROR;
                Exception exception7 = showError.getException();
                message = exception7 != null ? exception7.getMessage() : null;
                error = new DisplayResult.Error(errorType7, message != null ? message : "", RequestFailure.INTERNAL);
                break;
            case 8:
                DisplayResult.ErrorType errorType8 = DisplayResult.ErrorType.AD_REUSED;
                Exception exception8 = showError.getException();
                message = exception8 != null ? exception8.getMessage() : null;
                error = new DisplayResult.Error(errorType8, message != null ? message : "", RequestFailure.INTERNAL);
                break;
            default:
                return new DisplayResult.Error(DisplayResult.ErrorType.INTERNAL_ERROR, "Unknown error", RequestFailure.UNKNOWN);
        }
        return error;
    }
}
