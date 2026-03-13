package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
/* loaded from: classes.dex */
public final /* synthetic */ class W implements SettableFuture.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ l3 c;
    public final /* synthetic */ AbstractC1117q d;

    public /* synthetic */ W(l3 l3Var, AbstractC1117q abstractC1117q, int i) {
        this.b = i;
        this.c = l3Var;
        this.d = abstractC1117q;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public final void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                l3.b(this.c, this.d, (Boolean) obj, th);
                return;
            default:
                l3.a(this.c, this.d, (Boolean) obj, th);
                return;
        }
    }
}
