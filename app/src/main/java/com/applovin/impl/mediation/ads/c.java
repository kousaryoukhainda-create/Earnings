package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxError;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements MaxFullscreenAdImpl.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxFullscreenAdImpl b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i) {
        this.a = i;
        this.b = maxFullscreenAdImpl;
        this.c = str;
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.c(this.c);
                return;
            default:
                this.b.b(this.c);
                return;
        }
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final /* synthetic */ void a(MaxError maxError) {
        int i = this.a;
        l.a(this, maxError);
    }
}
