package com.fyber.fairbid.common.concurrency;

import com.fyber.fairbid.common.concurrency.a;
/* loaded from: classes.dex */
public final class b extends a.b<Object> {
    public final /* synthetic */ SettableFuture<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SettableFuture settableFuture, SettableFuture settableFuture2) {
        super(settableFuture);
        this.b = settableFuture2;
    }

    @Override // com.fyber.fairbid.common.concurrency.a.b
    public final void a(Object obj, Exception exc) {
        if (exc == null) {
            this.b.set(obj);
        } else {
            this.b.setException(exc);
        }
    }
}
