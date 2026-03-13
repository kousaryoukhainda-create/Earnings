package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.common.concurrency.PauseSignal;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.fa;
import com.fyber.fairbid.internal.ContextReference;
import com.fyber.fairbid.internal.Logger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public class la implements fa {
    @NotNull
    public final l7 a;
    @NotNull
    public final Callable<fa.a> b;
    @NotNull
    public final SettableFuture<fa.b> c;
    public final Context d;
    public Future<fa.a> e;
    public fa.a f;
    @NotNull
    public final InterfaceC2059lG g;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC1431gG implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object k;
            String str;
            AppSetIdInfo info = (AppSetIdInfo) obj;
            Intrinsics.checkNotNullParameter(info, "info");
            la laVar = la.this;
            try {
                String id = info.getId();
                Intrinsics.checkNotNullExpressionValue(id, "info.id");
                int scope = info.getScope();
                if (scope != 1) {
                    if (scope != 2) {
                        str = "";
                    } else {
                        str = "dev";
                    }
                } else {
                    str = "app";
                }
                k = Boolean.valueOf(laVar.c.set(new fa.b(id, str)));
            } catch (Throwable th) {
                k = AbstractC1522hL.k(th);
            }
            la laVar2 = la.this;
            Throwable a = JW.a(k);
            if (a != null) {
                Logger.error("AppSet class could be found, but some issue happened, setting the value to 'null'", a);
                laVar2.c.set(null);
            }
            return B90.a;
        }
    }

    public la(@NotNull ContextReference contextReference, @NotNull ContextReference activityProvider, @NotNull l7 fairBidStartOptions, @NotNull Callable callable) {
        Intrinsics.checkNotNullParameter(contextReference, "contextReference");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(fairBidStartOptions, "fairBidStartOptions");
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.a = fairBidStartOptions;
        this.b = callable;
        SettableFuture<fa.b> create = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.c = create;
        this.d = contextReference.getApplicationContext();
        this.e = a();
        this.g = C2231nG.a(new ka(this));
        activityProvider.a().a(this);
        b();
    }

    @Override // com.fyber.fairbid.fa
    public final fa.b a(long j) {
        fa.b k;
        try {
            k = this.c.get(j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            k = AbstractC1522hL.k(th);
        }
        Throwable a2 = JW.a(k);
        if (a2 == null) {
            return (fa.b) k;
        }
        Logger.trace(a2);
        return null;
    }

    @Override // com.fyber.fairbid.common.concurrency.PauseSignal.a
    public final void b(@NotNull PauseSignal pauseSignal) {
        Intrinsics.checkNotNullParameter(pauseSignal, "pauseSignal");
    }

    @Override // com.fyber.fairbid.fa
    public fa.a b(long j) {
        fa.a aVar = null;
        if (this.a.isAdvertisingIdDisabled()) {
            return null;
        }
        try {
            Future<fa.a> future = this.e;
            if (future != null) {
                aVar = future.get(j, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            aVar = AbstractC1522hL.k(th);
        }
        Throwable a2 = JW.a(aVar);
        if (a2 == null) {
            this.f = (fa.a) aVar;
        } else {
            Logger.trace(a2);
        }
        return this.f;
    }

    public final Future<fa.a> a() {
        Future<fa.a> future;
        if (!this.a.isAdvertisingIdDisabled() && ((future = this.e) == null || future.isDone())) {
            FutureTask futureTask = new FutureTask(this.b);
            new Thread(futureTask).start();
            this.e = futureTask;
        }
        return this.e;
    }

    public final void b() {
        Object k;
        Context context;
        if (this.c.isDone()) {
            return;
        }
        if (ja.a("com.google.android.gms.appset.AppSet", "classExists(\"com.google.…droid.gms.appset.AppSet\")")) {
            try {
                context = this.d;
            } catch (Throwable th) {
                k = AbstractC1522hL.k(th);
            }
            if (context != null) {
                AppSetIdClient client = AppSet.getClient(context);
                Intrinsics.checkNotNullExpressionValue(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
                k = appSetIdInfo.addOnSuccessListener(new C2941vb0(new a(), 13));
                Throwable a2 = JW.a(k);
                if (a2 != null) {
                    Logger.error("AppSet class could be found, but some issue happened, setting the value to 'null'", a2);
                    this.c.set(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to load AppSet with a null context. Unable to proceed.");
        }
        Logger.debug("Couldn't found AppSet class, setting the value to 'null'");
        this.c.set(null);
    }

    public static final void a(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.fyber.fairbid.common.concurrency.PauseSignal.a
    public final void a(PauseSignal pauseSignal) {
        a();
    }
}
