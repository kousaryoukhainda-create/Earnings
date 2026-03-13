package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.FetchOptions;
import com.fyber.fairbid.common.lifecycle.FetchResult;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.mediation.abstr.CachedAd;
/* loaded from: classes.dex */
public final class w7 {
    public final FetchOptions a;
    public final FetchResult.Factory b;
    public final long c;
    public final int d;
    public final SettableFuture<FetchResult> e = SettableFuture.create();
    public v7 f = v7.g;
    public CachedAd g;

    public w7(FetchOptions fetchOptions, FetchResult.Factory factory, long j, int i) {
        this.a = fetchOptions;
        this.b = factory;
        this.c = j;
        this.d = i * 1000;
    }

    public final synchronized boolean a(v7 v7Var) {
        if (this.f.a.contains(v7Var)) {
            v7 v7Var2 = this.f;
            Logger.info(this.a.getNetworkName() + " - " + this.a.getAdType() + " - switching state: " + v7Var2 + " -> " + v7Var);
            this.f = v7Var;
            return true;
        }
        return false;
    }

    public final synchronized v7 b() {
        return this.f;
    }

    public final String toString() {
        return "FetchStateMachine{state=" + this.f + ", cachedAd=" + this.g + ", fetchOptions=" + this.a + '}';
    }

    public final synchronized CachedAd a() {
        return this.g;
    }
}
