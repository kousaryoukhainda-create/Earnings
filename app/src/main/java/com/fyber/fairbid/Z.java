package com.fyber.fairbid;

import android.app.Activity;
/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ mi c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ dk f;

    public /* synthetic */ Z(mi miVar, Activity activity, dk dkVar, int i) {
        this.b = i;
        this.c = miVar;
        this.d = activity;
        this.f = dkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                mi.b(this.c, this.d, this.f);
                return;
            default:
                mi.a(this.c, this.d, this.f);
                return;
        }
    }
}
