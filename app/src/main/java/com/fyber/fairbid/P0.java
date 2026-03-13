package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.FetchResult;
import com.fyber.fairbid.tm;
/* loaded from: classes.dex */
public final /* synthetic */ class P0 implements SettableFuture.Listener, tm.a {
    public final /* synthetic */ sm b;
    public final /* synthetic */ tm c;

    public /* synthetic */ P0(sm smVar, tm tmVar) {
        this.b = smVar;
        this.c = tmVar;
    }

    @Override // com.fyber.fairbid.tm.a
    public void a(FetchResult fetchResult, FetchResult fetchResult2) {
        sm.a(this.b, this.c, fetchResult, fetchResult2);
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public void onComplete(Object obj, Throwable th) {
        sm.a(this.c, this.b, (FetchResult) obj, th);
    }

    public /* synthetic */ P0(tm tmVar, sm smVar) {
        this.c = tmVar;
        this.b = smVar;
    }
}
