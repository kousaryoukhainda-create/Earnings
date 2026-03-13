package com.fyber.fairbid;

import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.plugin.adtransparency.AdTransparencyPlugin;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class wa {
    @NotNull
    public static final Map<String, String> a = C2148mJ.e(new JQ("tp", "c_heyzap"), new JQ("tp-ver", AdTransparencyPlugin.currentFairBidSdkVersion));

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InMobiAdRequestStatus.StatusCode.values().length];
            try {
                iArr[InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static FetchFailure a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiAdRequestStatus.StatusCode statusCode;
        int i;
        if (inMobiAdRequestStatus != null) {
            statusCode = inMobiAdRequestStatus.getStatusCode();
        } else {
            statusCode = null;
        }
        if (statusCode == null) {
            i = -1;
        } else {
            i = a.a[statusCode.ordinal()];
        }
        switch (i) {
            case 1:
                return new FetchFailure(RequestFailure.NO_FILL, inMobiAdRequestStatus.getMessage());
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new FetchFailure(RequestFailure.NETWORK_ERROR, inMobiAdRequestStatus.getMessage());
            case 7:
                return new FetchFailure(RequestFailure.REMOTE_ERROR, inMobiAdRequestStatus.getMessage());
            case 8:
            case 9:
            case 10:
                return new FetchFailure(RequestFailure.INTERNAL, inMobiAdRequestStatus.getMessage());
            default:
                return new FetchFailure(RequestFailure.UNKNOWN, (inMobiAdRequestStatus == null || (r2 = inMobiAdRequestStatus.getMessage()) == null) ? "Unknown error when requesting ad" : "Unknown error when requesting ad");
        }
    }
}
