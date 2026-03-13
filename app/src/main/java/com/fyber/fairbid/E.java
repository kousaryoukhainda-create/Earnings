package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
/* loaded from: classes.dex */
public final /* synthetic */ class E implements SettableFuture.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ ai c;

    public /* synthetic */ E(ai aiVar, int i) {
        this.b = i;
        this.c = aiVar;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public final void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                ai.b(this.c, (Boolean) obj, th);
                return;
            default:
                ai.a(this.c, (Boolean) obj, th);
                return;
        }
    }
}
