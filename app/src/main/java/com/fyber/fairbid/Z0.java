package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
/* loaded from: classes.dex */
public final /* synthetic */ class Z0 implements SettableFuture.Listener {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ z3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ C1106k0 f;

    public /* synthetic */ Z0(C1106k0 c1106k0, z3 z3Var, int i) {
        this.f = c1106k0;
        this.c = z3Var;
        this.d = i;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public final void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                z3.a(this.f, this.c, this.d, (Boolean) obj, th);
                return;
            default:
                z3.a(this.c, this.d, this.f, (Boolean) obj, th);
                return;
        }
    }

    public /* synthetic */ Z0(z3 z3Var, int i, C1106k0 c1106k0) {
        this.c = z3Var;
        this.d = i;
        this.f = c1106k0;
    }
}
