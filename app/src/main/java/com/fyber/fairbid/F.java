package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.mediation.NetworkResult;
/* loaded from: classes.dex */
public final /* synthetic */ class F implements SettableFuture.Listener, Logger.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ F(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.fyber.fairbid.internal.Logger.a
    public String a() {
        return of.a((of) this.c, (String) this.d);
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                c7.a((c7) this.c, (SettableFuture) this.d, (NetworkResult) obj, th);
                return;
            case 1:
                k6.a((k6) this.c, (AdDisplay) this.d, (DisplayResult) obj, th);
                return;
            default:
                r3.a((r3) this.c, (C1106k0) this.d, (Boolean) obj, th);
                return;
        }
    }
}
