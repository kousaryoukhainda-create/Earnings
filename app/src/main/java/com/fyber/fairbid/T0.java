package com.fyber.fairbid;

import com.google.android.gms.ads.AdRequest;
/* loaded from: classes.dex */
public final /* synthetic */ class T0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ C1128w c;
    public final /* synthetic */ AdRequest.Builder d;

    public /* synthetic */ T0(C1128w c1128w, AdRequest.Builder builder, int i) {
        this.b = i;
        this.c = c1128w;
        this.d = builder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C1128w.b(this.c, this.d);
                return;
            default:
                C1128w.a(this.c, this.d);
                return;
        }
    }
}
