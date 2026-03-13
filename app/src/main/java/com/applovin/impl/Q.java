package com.applovin.impl;

import com.applovin.impl.fm;
import com.applovin.impl.o9;
import com.applovin.impl.wm;
import com.applovin.impl.x5;
import com.applovin.impl.z6;
/* loaded from: classes.dex */
public final /* synthetic */ class Q implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fm.c.a((fm.c) this.c);
                return;
            case 1:
                ((il) this.c).d();
                return;
            case 2:
                ((o9.e) this.c).a();
                return;
            case 3:
                ((wm.b.a) this.c).a();
                return;
            case 4:
                ((x5.f) this.c).c();
                return;
            default:
                ((w5) this.c).a((z6.a) null);
                return;
        }
    }
}
