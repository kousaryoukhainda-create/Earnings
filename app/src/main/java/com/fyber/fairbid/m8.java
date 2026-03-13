package com.fyber.fairbid;

import android.os.Handler;
import android.os.Message;
import com.fyber.fairbid.ads.RequestFailure;
import com.fyber.fairbid.ads.banner.internal.InternalBannerOptions;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.common.lifecycle.DisplayResult;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.common.lifecycle.FetchResult;
import com.fyber.fairbid.sdk.testsuite.bus.EventBus;
import com.fyber.fairbid.sm;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public final class m8 extends oh {
    public m8(eb ebVar, af afVar) {
        super(ebVar, afVar);
    }

    public /* synthetic */ void a(DisplayResult displayResult, Throwable th) {
        if (displayResult != null) {
            if (displayResult.isSuccess()) {
                return;
            }
            DisplayResult.Error error = displayResult.getError();
            if (error != null) {
                a(error.getDescription());
                return;
            } else {
                a("Unknown error");
                return;
            }
        }
        a();
        notifyObservers();
        if (th != null) {
            a(th.getMessage());
        } else {
            a("Unknown error");
        }
    }

    public /* synthetic */ void c() {
        a();
        notifyObservers();
    }

    public final void b() {
        this.c = true;
        notifyObservers();
        af afVar = this.b;
        eb placementData = this.a;
        afVar.getClass();
        Intrinsics.checkNotNullParameter(placementData, "placementData");
        afVar.a(placementData, (InternalBannerOptions) null).addListener(new Y(this, 1), oh.e);
    }

    public final void d() {
        AdDisplay a = this.b.a(this.a);
        SettableFuture<Boolean> settableFuture = a.closeListener;
        C30 c30 = new C30(this, 19);
        e9 e9Var = oh.e;
        settableFuture.addListener(c30, e9Var);
        a.displayEventStream.getFirstEventFuture().addListener(new Y(this, 0), e9Var);
        a();
    }

    public void a(FetchResult fetchResult, Throwable th) {
        this.c = false;
        if (fetchResult != null) {
            if (fetchResult.isSuccess()) {
                this.d = true;
                oh.a(sm.b.b, this.a);
            } else {
                a();
                if (fetchResult.getFetchFailure() != null) {
                    FetchFailure fetchFailure = fetchResult.getFetchFailure();
                    if (fetchFailure.getErrorType() == RequestFailure.NO_FILL) {
                        Handler handler = EventBus.eventBusMainThread;
                        Message obtainMessage = handler.obtainMessage(10);
                        obtainMessage.obj = this.a.b;
                        handler.sendMessage(obtainMessage);
                        oh.a(sm.b.c, this.a);
                    } else {
                        a(fetchFailure);
                        oh.a(sm.b.g, this.a);
                    }
                } else {
                    a(FetchFailure.UNKNOWN);
                    oh.a(sm.b.g, this.a);
                }
            }
        } else {
            a();
            a(FetchFailure.UNKNOWN);
            oh.a(sm.b.g, this.a);
        }
        notifyObservers();
    }
}
