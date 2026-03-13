package com.fyber.fairbid.mediation.pmn;

import com.fyber.fairbid.ads.banner.BannerSize;
import com.fyber.fairbid.ads.banner.internal.InternalBannerOptions;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.abstr.FetchConstraintsWhileOnScreen;
import com.fyber.fairbid.mediation.display.NetworkModel;
import com.fyber.fairbid.mediation.request.MediationRequest;
import com.fyber.fairbid.sdk.placements.IPlacementsHandler;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface ProgrammaticNetworkAdapter {

    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @NotNull
        public static FetchConstraintsWhileOnScreen programmaticFetchConstraintsWhileShowing(@NotNull ProgrammaticNetworkAdapter programmaticNetworkAdapter) {
            return FetchConstraintsWhileOnScreen.NONE;
        }

        public static boolean supportsProgrammatic(@NotNull ProgrammaticNetworkAdapter programmaticNetworkAdapter, @NotNull String placementId, @NotNull MediationRequest mediationRequest) {
            BannerSize bannerSize;
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(mediationRequest, "mediationRequest");
            Constants.AdType adType = mediationRequest.getAdType();
            if (programmaticNetworkAdapter.getAllProgrammaticAdTypeCapabilities().contains(adType) && programmaticNetworkAdapter.getPlacementsHandler().isInstanceProgrammatic(programmaticNetworkAdapter.getCanonicalName(), placementId)) {
                if (adType == Constants.AdType.BANNER) {
                    InternalBannerOptions internalBannerOptions = mediationRequest.getInternalBannerOptions();
                    if (internalBannerOptions != null) {
                        bannerSize = internalBannerOptions.getBannerSize();
                    } else {
                        bannerSize = null;
                    }
                    if (bannerSize == BannerSize.MREC) {
                        return programmaticNetworkAdapter.isMRECSupported();
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    @NotNull
    EnumSet<Constants.AdType> getAllProgrammaticAdTypeCapabilities();

    @NotNull
    String getCanonicalName();

    @NotNull
    String getMarketingName();

    @NotNull
    IPlacementsHandler getPlacementsHandler();

    ProgrammaticSessionInfo getProgrammaticSessionInfo(@NotNull NetworkModel networkModel, @NotNull MediationRequest mediationRequest);

    boolean isMRECSupported();

    @NotNull
    FetchConstraintsWhileOnScreen programmaticFetchConstraintsWhileShowing();

    boolean supportsProgrammatic(@NotNull String str, @NotNull MediationRequest mediationRequest);
}
