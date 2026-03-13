package com.applovin.impl;

import com.applovin.impl.ib;
import com.applovin.impl.o1;
/* loaded from: classes.dex */
public final /* synthetic */ class T implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ T(int i, int i2, Object obj) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ib.b.b((ib.b) this.d, this.c);
                return;
            default:
                o1.a.a((o1.a) this.d, this.c);
                return;
        }
    }
}
