package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.common.lifecycle.FetchResult;
/* loaded from: classes.dex */
public final /* synthetic */ class Q0 implements SettableFuture.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ t3 c;

    public /* synthetic */ Q0(t3 t3Var, int i) {
        this.b = i;
        this.c = t3Var;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public final void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                t3.c(this.c, (FetchResult) obj, th);
                return;
            default:
                t3.b(this.c, (DisplayResult) obj, th);
                return;
        }
    }
}
