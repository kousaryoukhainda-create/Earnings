package com.applovin.adview;

import com.applovin.impl.o9;
import com.applovin.impl.sb;
import com.applovin.impl.sdk.j;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements GG {
    private final j a;
    private final AtomicBoolean b = new AtomicBoolean(true);
    private o9 c;
    private sb d;

    public AppLovinFullscreenAdViewObserver(CG cg, sb sbVar, j jVar) {
        this.d = sbVar;
        this.a = jVar;
        cg.a(this);
    }

    @InterfaceC0937bQ(AG.ON_DESTROY)
    public void onDestroy() {
        sb sbVar = this.d;
        if (sbVar != null) {
            sbVar.a();
            this.d = null;
        }
        o9 o9Var = this.c;
        if (o9Var != null) {
            o9Var.f();
            this.c.t();
            this.c = null;
        }
    }

    @InterfaceC0937bQ(AG.ON_PAUSE)
    public void onPause() {
        o9 o9Var = this.c;
        if (o9Var != null) {
            o9Var.u();
            this.c.x();
        }
    }

    @InterfaceC0937bQ(AG.ON_RESUME)
    public void onResume() {
        o9 o9Var;
        if (!this.b.getAndSet(false) && (o9Var = this.c) != null) {
            o9Var.v();
            this.c.a(0L);
        }
    }

    @InterfaceC0937bQ(AG.ON_STOP)
    public void onStop() {
        o9 o9Var = this.c;
        if (o9Var != null) {
            o9Var.w();
        }
    }

    public void setPresenter(o9 o9Var) {
        this.c = o9Var;
    }
}
