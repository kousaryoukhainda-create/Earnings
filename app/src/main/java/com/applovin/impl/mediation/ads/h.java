package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements MaxFullscreenAdImpl.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxFullscreenAdImpl.c b;
    public final /* synthetic */ MaxAd c;

    public /* synthetic */ h(MaxFullscreenAdImpl.c cVar, MaxAd maxAd, int i) {
        this.a = i;
        this.b = cVar;
        this.c = maxAd;
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                return;
            default:
                this.b.a(this.c);
                return;
        }
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final /* synthetic */ void a(MaxError maxError) {
        int i = this.a;
        l.a(this, maxError);
    }
}
