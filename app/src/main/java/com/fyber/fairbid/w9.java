package com.fyber.fairbid;

import com.fyber.fairbid.ads.RequestFailure;
import com.hyprmx.android.sdk.core.HyprMXErrors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class w9 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HyprMXErrors.values().length];
            try {
                iArr[HyprMXErrors.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HyprMXErrors.DISPLAY_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HyprMXErrors.PLACEMENT_DOES_NOT_EXIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HyprMXErrors.SDK_NOT_INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HyprMXErrors.AD_SIZE_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HyprMXErrors.PLACEMENT_NAME_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HyprMXErrors.INVALID_BANNER_PLACEMENT_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HyprMXErrors.AD_FAILED_TO_RENDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final RequestFailure a(@NotNull HyprMXErrors hyprMXErrors) {
        Intrinsics.checkNotNullParameter(hyprMXErrors, "<this>");
        switch (a.a[hyprMXErrors.ordinal()]) {
            case 1:
                return RequestFailure.NO_FILL;
            case 2:
                return RequestFailure.INTERNAL;
            case 3:
                return RequestFailure.CONFIGURATION_ERROR;
            case 4:
                return RequestFailure.ADAPTER_NOT_STARTED;
            case 5:
                return RequestFailure.CONFIGURATION_ERROR;
            case 6:
                return RequestFailure.CONFIGURATION_ERROR;
            case 7:
                return RequestFailure.CONFIGURATION_ERROR;
            case 8:
                return RequestFailure.INTERNAL;
            default:
                return RequestFailure.UNKNOWN;
        }
    }
}
