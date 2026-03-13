package com.fyber.fairbid.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.fyber.fairbid.C1097g;
import com.fyber.fairbid.internal.ActivityProvider;
import com.fyber.fairbid.m3;
import com.fyber.fairbid.t5;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class ContextReference implements t5, ActivityProvider {
    public Context a;
    public Activity b;
    public Application c;
    @NotNull
    public final m3 d = new m3();
    @NotNull
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    @Override // com.fyber.fairbid.internal.ActivityProvider
    @NotNull
    public final m3 a() {
        return this.d;
    }

    @Override // com.fyber.fairbid.t5
    @NotNull
    public final Context b() {
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        throw new IllegalStateException("The SDK was not initialized yet");
    }

    @Override // com.fyber.fairbid.t5
    public Context getApplicationContext() {
        return this.a;
    }

    @Override // com.fyber.fairbid.internal.ActivityProvider
    public Activity getForegroundActivity() {
        return this.b;
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (getApplicationContext() == null) {
            this.a = context.getApplicationContext();
            Logger.debug("ContextReference - updateContext - applicationContext: " + getApplicationContext());
            Log.d("ContextReference", "ContextReference - updateContext - applicationContext: " + getApplicationContext());
            if (getApplicationContext() instanceof Application) {
                Context applicationContext = getApplicationContext();
                Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                Application application = (Application) applicationContext;
                Logger.debug("ContextReference - registerApplicationCallbacks - hit");
                Log.d("ContextReference", "ContextReference - registerApplicationCallbacks - hit");
                application.registerActivityLifecycleCallbacks(this.d);
                application.registerActivityLifecycleCallbacks(new b(this));
                this.c = application;
            }
            if ((context instanceof Activity) && getForegroundActivity() == null) {
                this.b = (Activity) context;
            }
        }
    }

    @Override // com.fyber.fairbid.internal.ActivityProvider
    public final void b(@NotNull ActivityProvider.a l) {
        Intrinsics.checkNotNullParameter(l, "l");
        this.e.add(l);
    }

    @Override // com.fyber.fairbid.internal.ActivityProvider
    public final void a(@NotNull C1097g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Application application = this.c;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(listener);
        }
    }

    @Override // com.fyber.fairbid.internal.ActivityProvider
    public final void a(@NotNull Application.ActivityLifecycleCallbacks listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Application application = this.c;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(listener);
        }
    }

    @Override // com.fyber.fairbid.internal.ActivityProvider
    public final void a(@NotNull ActivityProvider.a l) {
        Intrinsics.checkNotNullParameter(l, "l");
        this.e.remove(l);
    }
}
