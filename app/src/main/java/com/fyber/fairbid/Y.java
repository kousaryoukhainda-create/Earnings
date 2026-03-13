package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.common.lifecycle.FetchResult;
/* loaded from: classes.dex */
public final /* synthetic */ class Y implements SettableFuture.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ m8 c;

    public /* synthetic */ Y(m8 m8Var, int i) {
        this.b = i;
        this.c = m8Var;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public final void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                m8.b(this.c, (DisplayResult) obj, th);
                return;
            default:
                m8.d(this.c, (FetchResult) obj, th);
                return;
        }
    }
}
