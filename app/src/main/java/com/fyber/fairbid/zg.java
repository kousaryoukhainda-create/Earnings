package com.fyber.fairbid;

import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.internal.Logger;
import com.google.android.gms.location.LocationRequest;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zg {
    @NotNull
    public static FetchFailure a(int i) {
        switch (i) {
            case -2:
                FetchFailure fetchFailure = new FetchFailure(RequestFailure.NETWORK_ERROR, "Network error");
                Logger.debug("Indicates that your network connection is not stable enough.");
                return fetchFailure;
            case -1:
                FetchFailure fetchFailure2 = new FetchFailure(RequestFailure.INTERNAL, "Data parsing failed.");
                Logger.debug("For the collection of client code problems, you can first check the following situations: One: show is called in the child thread. Two: ViewGroup is empty when registering click events. Three: The business logic of the media in the onFeedLoaded callback is abnormal, which causes the SDK to go to the onError callback. If the above ideas still can not solve your problem, you can contact the TS");
                return fetchFailure2;
            case 101:
                FetchFailure fetchFailure3 = new FetchFailure(RequestFailure.INTERNAL, "Data parsing failed for template ads");
                Logger.debug("Please update to the latest sdk.");
                return fetchFailure3;
            case LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY /* 102 */:
                FetchFailure fetchFailure4 = new FetchFailure(RequestFailure.INTERNAL, "Template missing");
                Logger.debug("Please update to the latest sdk.");
                return fetchFailure4;
            case 103:
                FetchFailure fetchFailure5 = new FetchFailure(RequestFailure.INTERNAL, "Subtemplate missing");
                Logger.debug("Please update to the latest sdk.");
                return fetchFailure5;
            case 107:
                FetchFailure fetchFailure6 = new FetchFailure(RequestFailure.INTERNAL, "SDK rendering timeout");
                Logger.debug("Please update to the latest sdk.");
                return fetchFailure6;
            case 108:
                FetchFailure fetchFailure7 = new FetchFailure(RequestFailure.INTERNAL, "SDK rendering timeout");
                Logger.debug("Please update to the latest sdk.");
                return fetchFailure7;
            case 109:
                FetchFailure fetchFailure8 = new FetchFailure(RequestFailure.INTERNAL, "Template loads failed");
                Logger.debug("Please update to the latest sdk.");
                return fetchFailure8;
            case 20001:
                return FetchFailure.NO_FILL;
            case PayStatusCodes.PRODUCT_NOT_EXIST /* 40001 */:
                FetchFailure fetchFailure9 = new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "BadRequest: Http request pb error");
                Logger.debug("Indicates that some necessary parameters have invalid values. Please check the integration guideline on Pangle platform");
                return fetchFailure9;
            case PayStatusCodes.PRODUCT_SOME_NOT_EXIST /* 40004 */:
                FetchFailure fetchFailure10 = new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "BadRequest: Empty Slot ID");
                Logger.debug("Indicates that the slotID is null");
                return fetchFailure10;
            case 40005:
                FetchFailure fetchFailure11 = new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "BadRequest: Invalid Ad Size");
                Logger.debug("Indicates that the AdSize is missing or an unsupported size is passed.");
                return fetchFailure11;
            case 40006:
                FetchFailure fetchFailure12 = new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "Invalid Slot ID");
                Logger.debug("Indicates that the length of the slotID is incorrect, or an empty string is passed.");
                return fetchFailure12;
            case 40007:
                FetchFailure fetchFailure13 = new FetchFailure(RequestFailure.INTERNAL, "BadRequest: Ad counts error");
                Logger.debug("Indicates that the Ad counts is invalid");
                return fetchFailure13;
            case 40008:
                FetchFailure fetchFailure14 = new FetchFailure(RequestFailure.INTERNAL, "BadRequest: Image size error");
                Logger.debug("Indicates that the image size is not supported.");
                return fetchFailure14;
            case 40009:
                FetchFailure fetchFailure15 = new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "Invalid App ID");
                Logger.debug("Indicates that the app id is invalid or app id is missing");
                return fetchFailure15;
            case 40016:
                FetchFailure fetchFailure16 = new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "BadRequest: Slot ID and App ID is not matched");
                Logger.debug("Indicates that the relationship between App Id and Slot Id is invalid or App Id is missing.");
                return fetchFailure16;
            case 40018:
                FetchFailure fetchFailure17 = new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "Invalid Package Name");
                Logger.debug("Indicates that the package name of your project does not match the package name you filled in Pangle platform.");
                return fetchFailure17;
            case 40019:
                FetchFailure fetchFailure18 = new FetchFailure(RequestFailure.CONFIGURATION_ERROR, "BadRequest: Ad Type and Slot Id is not matched");
                Logger.debug("Indicates that Ad Type and Slot Id is not matched. For example, try to load a rewarded ad with a banner ad slot id.");
                return fetchFailure18;
            case 40021:
                FetchFailure fetchFailure19 = new FetchFailure(RequestFailure.INTERNAL, "BadRequest: Invalid SHA1 value");
                Logger.debug("Indicates that the SHA1 is not matched with the SHA1 you entered on the Pangle platform");
                return fetchFailure19;
            case 40022:
                FetchFailure fetchFailure20 = new FetchFailure(RequestFailure.INTERNAL, "BadRequest: Incorrect API method");
                Logger.debug("Indicates that the API method is incorrect");
                return fetchFailure20;
            case 40024:
                FetchFailure fetchFailure21 = new FetchFailure(RequestFailure.INTERNAL, "BadRequest: The SDK version is too low");
                Logger.debug("Please update to the latest SDK");
                return fetchFailure21;
            case 40025:
                FetchFailure fetchFailure22 = new FetchFailure(RequestFailure.INTERNAL, "BadRequest: verification failed");
                Logger.debug("Update to the latest SDK");
                return fetchFailure22;
            case 40026:
                FetchFailure fetchFailure23 = new FetchFailure(RequestFailure.UNAVAILABLE, "Unsupported regions");
                Logger.debug("Indicates that your Pangle account only support China traffic. No ads returned when you try to load ads outside of china(non-china IP)");
                return fetchFailure23;
            case 40029:
                FetchFailure fetchFailure24 = new FetchFailure(RequestFailure.INTERNAL, "BadRequest: Incorrect API method");
                Logger.debug("There are three situations: One: IOS: ad request method error, SDK rendering advertisement and self rendering ad request method are different. Solution: Use the SDK rendering method and the correct parameters to request SDK rendering ad. Two: The server slotID configuration is not effective: you need to wait 2-3 minutes for the new slotID to request the ad. Three: Low SDK version: the SDK version used is too low (lower than 2.9.5.0) and does not support personalized SDK rendering function. Solution: update to the latest version of the Platform SDK.");
                return fetchFailure24;
            case 50001:
                FetchFailure fetchFailure25 = new FetchFailure(RequestFailure.REMOTE_ERROR, "Servers error");
                Logger.debug("Server error, if the error could be 100% replicated, please give feedback to us via pangle_support@bytedance.com");
                return fetchFailure25;
            default:
                return FetchFailure.UNKNOWN;
        }
    }
}
