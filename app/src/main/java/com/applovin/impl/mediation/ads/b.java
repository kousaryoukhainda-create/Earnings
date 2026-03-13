package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.ar;
import com.applovin.impl.br;
import com.applovin.impl.ie;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.n;
/* loaded from: classes.dex */
public class b implements br.a {
    private final com.applovin.impl.sdk.j a;
    private final ie b;
    private final br c;
    private final ar d;
    private final a.InterfaceC0018a e;

    public b(ie ieVar, ViewGroup viewGroup, a.InterfaceC0018a interfaceC0018a, com.applovin.impl.sdk.j jVar) {
        this.a = jVar;
        this.b = ieVar;
        this.e = interfaceC0018a;
        this.d = new ar(viewGroup, jVar);
        br brVar = new br(viewGroup, jVar, this);
        this.c = brVar;
        brVar.a(ieVar);
        jVar.I();
        if (n.a()) {
            n I = jVar.I();
            I.a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.c.b();
    }

    public ie b() {
        return this.b;
    }

    public void c() {
        this.a.I();
        if (n.a()) {
            this.a.I().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.b.q0().compareAndSet(false, true)) {
            this.a.I();
            if (n.a()) {
                this.a.I().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.b.getNativeAd().isExpired()) {
                n.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.a.f().a(this.b);
            }
            this.a.P().processRawAdImpression(this.b, this.e);
        }
    }

    @Override // com.applovin.impl.br.a
    public void onLogVisibilityImpression() {
        a(this.d.a(this.b));
    }

    private void a(long j) {
        if (this.b.s0().compareAndSet(false, true)) {
            this.a.I();
            if (n.a()) {
                this.a.I().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.a.P().processViewabilityAdImpressionPostback(this.b, j, this.e);
        }
    }
}
