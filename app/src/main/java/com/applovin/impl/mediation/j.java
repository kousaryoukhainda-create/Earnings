package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxError;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ g.d c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(g.d dVar, Object obj, int i) {
        this.b = i;
        this.c = dVar;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                g.d.c(this.c, (Bundle) this.d);
                return;
            case 1:
                g.d.e(this.c, (Bundle) this.d);
                return;
            case 2:
                g.d.p(this.c, (Bundle) this.d);
                return;
            case 3:
                g.d.a(this.c, (Bundle) this.d);
                return;
            case 4:
                g.d.h(this.c, (Bundle) this.d);
                return;
            case 5:
                g.d.b(this.c, (Bundle) this.d);
                return;
            case 6:
                g.d.l(this.c, (Bundle) this.d);
                return;
            case 7:
                g.d.n(this.c, (Bundle) this.d);
                return;
            case 8:
                g.d.j(this.c, (Bundle) this.d);
                return;
            case 9:
                g.d.o(this.c, (Bundle) this.d);
                return;
            case 10:
                g.d.d(this.c, (Bundle) this.d);
                return;
            default:
                g.d.i(this.c, (MaxError) this.d);
                return;
        }
    }
}
