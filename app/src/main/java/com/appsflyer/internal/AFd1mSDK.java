package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkResult;
/* loaded from: classes.dex */
public final class AFd1mSDK extends AFd1zSDK<DeepLinkResult> {
    private DeepLinkResult afDebugLog;
    private final AFb1mSDK afInfoLog;

    /* renamed from: com.appsflyer.internal.AFd1mSDK$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            values = iArr;
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                values[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AFd1mSDK(@NonNull AFb1mSDK aFb1mSDK) {
        super(AFd1vSDK.DLSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "DdlSdk");
        this.afInfoLog = aFb1mSDK;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final long AFInAppEventType() {
        return 90000L;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFd1ySDK valueOf() throws Exception {
        DeepLinkResult AFLogger = this.afInfoLog.AFLogger();
        this.afDebugLog = AFLogger;
        if (AnonymousClass2.values[AFLogger.getStatus().ordinal()] != 1) {
            if (this.afDebugLog.getError() == DeepLinkResult.Error.TIMEOUT) {
                return AFd1ySDK.TIMEOUT;
            }
            return AFd1ySDK.FAILURE;
        }
        return AFd1ySDK.SUCCESS;
    }
}
