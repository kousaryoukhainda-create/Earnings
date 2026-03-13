package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object f;

    public /* synthetic */ l(int i, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((g.d) this.c).a((MaxError) this.d, (Bundle) this.f);
                return;
            default:
                ((g.e) this.c).a((MaxAdapter.InitializationStatus) this.d, (String) this.f);
                return;
        }
    }
}
