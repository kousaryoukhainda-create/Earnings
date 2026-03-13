package com.applovin.impl;

import com.applovin.impl.d8;
import com.applovin.impl.ib;
import com.applovin.impl.tm;
import com.applovin.impl.x5;
import com.applovin.sdk.AppLovinAd;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ai.a((ai) this.c, (ij) this.d);
                return;
            case 1:
                b8.R((b8) this.c, (d8.e) this.d);
                return;
            case 2:
                d8.c((d8) this.c, (rh) this.d);
                return;
            case 3:
                i1.a((i1) this.c, (Runnable) this.d);
                return;
            case 4:
                ((ib.b) this.c).a((AppLovinAd) this.d);
                return;
            case 5:
                tm.b((ScheduledThreadPoolExecutor) this.c, (tm.d) this.d);
                return;
            default:
                x5.f.b((x5.f) this.c, (e9) this.d);
                return;
        }
    }
}
