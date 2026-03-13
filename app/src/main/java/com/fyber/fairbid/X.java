package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
/* loaded from: classes.dex */
public final /* synthetic */ class X implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ lm c;
    public final /* synthetic */ SettableFuture d;

    public /* synthetic */ X(lm lmVar, SettableFuture settableFuture, int i) {
        this.b = i;
        this.c = lmVar;
        this.d = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                lm.a(this.c, this.d);
                return;
            default:
                lm.b(this.c, this.d);
                return;
        }
    }
}
