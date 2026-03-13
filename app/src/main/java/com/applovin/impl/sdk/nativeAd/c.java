package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AppLovinVastMediaView.e.a((AppLovinVastMediaView.e) this.c);
                return;
            default:
                AppLovinVastMediaView.f.a((AppLovinVastMediaView.f) this.c);
                return;
        }
    }
}
