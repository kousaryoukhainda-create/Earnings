package com.fyber.fairbid;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.fyber.fairbid.internal.DevLogger;
import com.fyber.fairbid.internal.FairBidState;
import com.fyber.fairbid.internal.Utils;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class wm implements Runnable {
    public final Runnable a;
    public final ExecutorService b;

    public wm(Runnable runnable, ExecutorService executorService) {
        this.a = runnable;
        this.b = executorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        AdapterPool adapterPool;
        try {
            this.a.run();
        } catch (Throwable th) {
            DevLogger.error(th, "FairBid has encountered an error and is shutting down in 5 seconds.");
            com.fyber.fairbid.internal.e eVar = com.fyber.fairbid.internal.e.a;
            com.fyber.fairbid.internal.f fVar = com.fyber.fairbid.internal.e.b;
            Context applicationContext = fVar.c().getApplicationContext();
            if (applicationContext != null) {
                if (com.fyber.a.f()) {
                    adapterPool = eVar.a();
                } else {
                    adapterPool = null;
                }
                ca d = fVar.d();
                ExecutorService executorService = this.b;
                Objects.requireNonNull(executorService);
                d.a(th, adapterPool, true, new C30(executorService, 25));
            } else {
                this.b.shutdown();
            }
            ((FairBidState) ((C2474q50) fVar.c).a()).disableSDK();
            if (applicationContext != null && Utils.isDebug(applicationContext).booleanValue()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Object(), 5000L);
            }
        }
    }
}
