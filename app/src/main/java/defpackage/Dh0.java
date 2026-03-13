package defpackage;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.fc;
import com.applovin.sdk.AppLovinAd;
/* renamed from: Dh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Dh0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AppLovinAdViewEventListener c;
    public final /* synthetic */ AppLovinAd d;
    public final /* synthetic */ AppLovinAdView f;

    public /* synthetic */ Dh0(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i) {
        this.b = i;
        this.c = appLovinAdViewEventListener;
        this.d = appLovinAd;
        this.f = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fc.d(this.c, this.d, this.f);
                return;
            case 1:
                fc.f(this.c, this.d, this.f);
                return;
            default:
                fc.e(this.c, this.d, this.f);
                return;
        }
    }
}
