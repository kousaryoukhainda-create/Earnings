package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.je;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.mediation.debugger.ui.testmode.a;
import com.applovin.impl.o0;
import com.applovin.impl.p0;
import com.applovin.impl.re;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class a extends re implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, o0.a {
    private Map A;
    private je a;
    private j b;
    private MaxAdView c;
    private MaxAdView d;
    private MaxInterstitialAd f;
    private MaxAppOpenAd g;
    private MaxRewardedInterstitialAd h;
    private MaxRewardedAd i;
    private MaxAd j;
    private MaxNativeAdLoader k;
    private List l;
    private String m;
    private AdControlButton n;
    private AdControlButton o;
    private AdControlButton p;
    private AdControlButton q;
    private AdControlButton r;
    private AdControlButton s;
    private AdControlButton t;
    private Button u;
    private Button v;
    private FrameLayout w;
    private FrameLayout x;
    private Switch y;
    private Switch z;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0020a extends MaxNativeAdListener {
        public C0020a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.j != null) {
                a.this.k.destroy(a.this.j);
            }
            a.this.j = maxAd;
            a.this.x.removeAllViews();
            a.this.x.addView(maxNativeAdView);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (r.contains(maxAdFormat)) {
            String str = "test_mode_rewarded_" + this.a.m();
            this.m = str;
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.b.q0(), this);
            this.i = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.i.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
            this.s = adControlButton;
            adControlButton.setOnClickListener(this);
            this.s.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.rewarded_control_view).setVisibility(8);
    }

    @Override // com.applovin.impl.re
    public j getSdk() {
        return this.b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        if (this.a.x() != null && this.a.x().containsKey(maxAdFormat)) {
            return (String) this.a.x().get(maxAdFormat);
        }
        return this.a.m();
    }

    public void initialize(je jeVar) {
        this.a = jeVar;
        this.b = jeVar.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        yp.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        yp.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        yp.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        yp.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        yp.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        yp.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton a = a(str);
        a.setControlState(AdControlButton.b.LOAD);
        yp.a(maxError, a.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton a = a(maxAd.getAdUnitId());
        if (!maxAd.getFormat().isAdViewAd() && !maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a.setControlState(AdControlButton.b.SHOW);
        } else {
            a.setControlState(AdControlButton.b.LOAD);
        }
    }

    @Override // com.applovin.impl.o0.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
        } else {
            this.c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        yp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map map = this.A;
            if (map != null && map.get(format) != null) {
                ((o0) this.A.get(format)).a();
            } else {
                a(format);
            }
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(bVar);
            b(format);
        }
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a == null) {
            n.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.a.g() + " Test Ads");
        this.l = this.b.k0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.u = (Button) findViewById(R.id.show_mrec_button);
        this.v = (Button) findViewById(R.id.show_native_button);
        if (this.a.H() && this.a.r().contains(MaxAdFormat.MREC)) {
            this.x.setVisibility(8);
            this.u.setBackgroundColor(-1);
            this.v.setBackgroundColor(-3355444);
            this.u.setOnClickListener(new View.OnClickListener(this) { // from class: bf0
                public final /* synthetic */ a c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.c.a(view);
                            return;
                        case 1:
                            this.c.b(view);
                            return;
                        case 2:
                            this.c.c(view);
                            return;
                        default:
                            this.c.d(view);
                            return;
                    }
                }
            });
            this.v.setOnClickListener(new View.OnClickListener(this) { // from class: bf0
                public final /* synthetic */ a c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.c.a(view);
                            return;
                        case 1:
                            this.c.b(view);
                            return;
                        case 2:
                            this.c.c(view);
                            return;
                        default:
                            this.c.d(view);
                            return;
                    }
                }
            });
        } else {
            this.u.setVisibility(8);
            this.v.setVisibility(8);
        }
        this.y = (Switch) findViewById(R.id.native_banner_switch);
        this.z = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.a.I()) {
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: bf0
                public final /* synthetic */ a c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.c.a(view);
                            return;
                        case 1:
                            this.c.b(view);
                            return;
                        case 2:
                            this.c.c(view);
                            return;
                        default:
                            this.c.d(view);
                            return;
                    }
                }
            });
            this.z.setOnClickListener(new View.OnClickListener(this) { // from class: bf0
                public final /* synthetic */ a c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.c.a(view);
                            return;
                        case 1:
                            this.c.b(view);
                            return;
                        case 2:
                            this.c.c(view);
                            return;
                        default:
                            this.c.d(view);
                            return;
                    }
                }
            });
        } else {
            this.y.setVisibility(8);
            this.z.setVisibility(8);
        }
        if (StringUtils.isValidString(this.a.e()) && this.a.d() != null && this.a.d().size() > 0) {
            AdRegistration.getInstance(this.a.e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.a.d().size());
            for (MaxAdFormat maxAdFormat : this.a.d().keySet()) {
                hashMap.put(maxAdFormat, new o0((p0) this.a.d().get(maxAdFormat), maxAdFormat, this));
            }
            this.A = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            n.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.b.k0().a(this.l);
        MaxAdView maxAdView = this.c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.k;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.j;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.k.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        yp.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.d.removeAllViews();
        this.o.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.x.setVisibility(0);
        this.w.setVisibility(8);
        this.v.setBackgroundColor(-1);
        this.u.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.c.removeAllViews();
        this.n.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.w.setVisibility(0);
        this.x.setVisibility(8);
        this.u.setBackgroundColor(-1);
        this.v.setBackgroundColor(-3355444);
    }

    private void d() {
        this.x = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.a.H()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.b.q0(), this);
            this.k = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.k.setNativeAdListener(new C0020a());
            this.k.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.t = adControlButton;
            adControlButton.setOnClickListener(this);
            this.t.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.x.setVisibility(8);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.i.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.k.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.w = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (r.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.b.q0(), this);
            this.d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.d.setExtraParameter("disable_precache", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.d.setExtraParameter("allow_pause_auto_refresh_immediately", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.d.stopAutoRefresh();
            this.d.setListener(this);
            this.w.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.o.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.w.setVisibility(8);
    }

    private void b() {
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (r.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.b.q0(), this);
            this.f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.f.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.p.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.b.q0(), this);
            this.c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.c.setExtraParameter("disable_auto_retries", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.c.setExtraParameter("disable_precache", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.c.setExtraParameter("allow_pause_auto_refresh_immediately", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            this.c.stopAutoRefresh();
            this.c.setListener(this);
            frameLayout.addView(this.c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.h.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z = false;
        boolean z2 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.y.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.z.isChecked()) {
            z = true;
        }
        if (!z2 && !z) {
            this.b.k0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.b.k0().a(this.a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.c.loadAd();
        } else if (maxAdFormat3 == maxAdFormat) {
            this.d.loadAd();
            this.u.callOnClick();
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.loadAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.h.loadAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.k.loadAd();
            this.v.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.o;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.p;
            }
            if (str.equals("test_mode_app_open")) {
                return this.q;
            }
            if (str.equals("test_mode_rewarded_interstitial")) {
                return this.r;
            }
            if (str.equals(this.m)) {
                return this.s;
            }
            if (str.equals("test_mode_native")) {
                return this.t;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.n;
    }
}
