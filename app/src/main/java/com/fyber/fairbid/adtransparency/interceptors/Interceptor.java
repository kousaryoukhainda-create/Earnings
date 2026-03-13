package com.fyber.fairbid.adtransparency.interceptors;

import android.util.Log;
import android.webkit.JavascriptInterface;
import com.fyber.fairbid.adtransparency.interceptors.ironsource.IronSourceInterceptor;
import com.fyber.fairbid.cj;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.Network;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class Interceptor {
    @NotNull
    public static final a Companion = new a();

    @Metadata
    /* loaded from: classes.dex */
    public static final class LoadListener {
        @JavascriptInterface
        public final void getContent(@NotNull String network, @NotNull String adTypeString, @NotNull String instanceId, String str) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(adTypeString, "adTypeString");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Constants.AdType fromPlacementType = Constants.AdType.fromPlacementType(adTypeString);
            Intrinsics.checkNotNullExpressionValue(fromPlacementType, "fromPlacementType(adTypeString)");
            if (Intrinsics.a(network, Network.IRONSOURCE.getMarketingName())) {
                IronSourceInterceptor.INSTANCE.storeMetadataForInstance(fromPlacementType, instanceId, str);
            }
        }

        @JavascriptInterface
        public final void processHTML(String str) {
            String s = "Interceptor - " + str;
            Intrinsics.checkNotNullParameter(s, "s");
            if (cj.a) {
                Log.d("Snoopy", s);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
    }
}
