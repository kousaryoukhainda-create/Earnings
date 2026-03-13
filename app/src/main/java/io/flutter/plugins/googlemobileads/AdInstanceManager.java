package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AdInstanceManager {
    private Activity activity;
    @NonNull
    private final Map<Integer, FlutterAd> ads = new HashMap();
    @NonNull
    private final MethodChannel channel;

    public AdInstanceManager(@NonNull MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    private void invokeOnAdEvent(final Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.googlemobileads.AdInstanceManager.1
            @Override // java.lang.Runnable
            public void run() {
                AdInstanceManager.this.channel.invokeMethod("onAdEvent", map);
            }
        });
    }

    public FlutterAd adForId(int i) {
        return this.ads.get(Integer.valueOf(i));
    }

    public Integer adIdFor(@NonNull FlutterAd flutterAd) {
        for (Integer num : this.ads.keySet()) {
            if (this.ads.get(num) == flutterAd) {
                return num;
            }
        }
        return null;
    }

    public void disposeAd(int i) {
        if (!this.ads.containsKey(Integer.valueOf(i))) {
            return;
        }
        FlutterAd flutterAd = this.ads.get(Integer.valueOf(i));
        if (flutterAd != null) {
            flutterAd.dispose();
        }
        this.ads.remove(Integer.valueOf(i));
    }

    public void disposeAllAds() {
        for (Map.Entry<Integer, FlutterAd> entry : this.ads.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().dispose();
            }
        }
        this.ads.clear();
    }

    public Activity getActivity() {
        return this.activity;
    }

    public void onAdClicked(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdClicked");
        invokeOnAdEvent(hashMap);
    }

    public void onAdClosed(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdClosed");
        invokeOnAdEvent(hashMap);
    }

    public void onAdDismissedFullScreenContent(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdDismissedFullScreenContent");
        invokeOnAdEvent(hashMap);
    }

    public void onAdFailedToLoad(int i, @NonNull FlutterAd.FlutterLoadAdError flutterLoadAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdFailedToLoad");
        hashMap.put("loadAdError", flutterLoadAdError);
        invokeOnAdEvent(hashMap);
    }

    public void onAdImpression(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdImpression");
        invokeOnAdEvent(hashMap);
    }

    public void onAdLoaded(int i, ResponseInfo responseInfo) {
        FlutterAd.FlutterResponseInfo flutterResponseInfo;
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdLoaded");
        if (responseInfo == null) {
            flutterResponseInfo = null;
        } else {
            flutterResponseInfo = new FlutterAd.FlutterResponseInfo(responseInfo);
        }
        hashMap.put("responseInfo", flutterResponseInfo);
        invokeOnAdEvent(hashMap);
    }

    public void onAdMetadataChanged(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdMetadataChanged");
        invokeOnAdEvent(hashMap);
    }

    public void onAdOpened(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdOpened");
        invokeOnAdEvent(hashMap);
    }

    public void onAdShowedFullScreenContent(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdShowedFullScreenContent");
        invokeOnAdEvent(hashMap);
    }

    public void onAppEvent(int i, @NonNull String str, @NonNull String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAppEvent");
        hashMap.put("name", str);
        hashMap.put("data", str2);
        invokeOnAdEvent(hashMap);
    }

    public void onFailedToShowFullScreenContent(int i, @NonNull AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onFailedToShowFullScreenContent");
        hashMap.put("error", new FlutterAd.FlutterAdError(adError));
        invokeOnAdEvent(hashMap);
    }

    public void onFluidAdHeightChanged(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onFluidAdHeightChanged");
        hashMap.put("height", Integer.valueOf(i2));
        invokeOnAdEvent(hashMap);
    }

    public void onPaidEvent(@NonNull FlutterAd flutterAd, @NonNull FlutterAdValue flutterAdValue) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", adIdFor(flutterAd));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(flutterAdValue.valueMicros));
        hashMap.put("precision", Integer.valueOf(flutterAdValue.precisionType));
        hashMap.put(AppsFlyerProperties.CURRENCY_CODE, flutterAdValue.currencyCode);
        invokeOnAdEvent(hashMap);
    }

    public void onRewardedAdUserEarnedReward(int i, @NonNull FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(hashMap);
    }

    public void onRewardedInterstitialAdUserEarnedReward(int i, @NonNull FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onRewardedInterstitialAdUserEarnedReward");
        hashMap.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(hashMap);
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public boolean showAdWithId(int i) {
        FlutterAd.FlutterOverlayAd flutterOverlayAd = (FlutterAd.FlutterOverlayAd) adForId(i);
        if (flutterOverlayAd == null) {
            return false;
        }
        flutterOverlayAd.show();
        return true;
    }

    public void trackAd(@NonNull FlutterAd flutterAd, int i) {
        if (this.ads.get(Integer.valueOf(i)) == null) {
            this.ads.put(Integer.valueOf(i), flutterAd);
            return;
        }
        throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i)));
    }
}
