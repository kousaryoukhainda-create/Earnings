package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class e {
    public final Context a;
    public WeakReference<Context> b;

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            e.this.b = new WeakReference<>(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    public e(Context context, Context context2) {
        a aVar = new a();
        this.a = context2;
        if (context instanceof Activity) {
            this.b = new WeakReference<>(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(aVar);
        }
    }

    public Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.u.a(this.b);
        if (context == null) {
            return this.a;
        }
        return context;
    }
}
