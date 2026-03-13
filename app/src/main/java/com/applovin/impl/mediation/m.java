package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.he;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ g.d c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m(g.d dVar, Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = dVar;
        this.d = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.a((he) this.d, (MaxReward) this.f, (Bundle) this.g);
                return;
            default:
                this.c.a((Runnable) this.d, (MaxAdListener) this.f, (String) this.g);
                return;
        }
    }
}
