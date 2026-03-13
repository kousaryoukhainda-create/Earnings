package com.applovin.impl.mediation.ads;

import com.applovin.impl.he;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ a.InterfaceC0018a c;
    public final /* synthetic */ MaxAd d;

    public /* synthetic */ j(a.InterfaceC0018a interfaceC0018a, MaxAd maxAd, int i) {
        this.b = i;
        this.c = interfaceC0018a;
        this.d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((MaxFullscreenAdImpl.c) this.c).a((he) this.d);
                return;
            default:
                MaxNativeAdLoaderImpl.c.a((MaxNativeAdLoaderImpl.c) this.c, this.d);
                return;
        }
    }
}
