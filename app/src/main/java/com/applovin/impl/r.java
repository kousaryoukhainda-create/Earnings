package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public abstract class r {

    /* loaded from: classes.dex */
    public class a extends AbstractC1075p {
        final /* synthetic */ Class a;
        final /* synthetic */ b b;
        final /* synthetic */ C1076q c;

        public a(Class cls, b bVar, C1076q c1076q) {
            this.a = cls;
            this.b = bVar;
            this.c = c1076q;
        }

        @Override // com.applovin.impl.AbstractC1075p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.a.isInstance(activity)) {
                this.b.a(activity);
            }
        }

        @Override // com.applovin.impl.AbstractC1075p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.a.isInstance(activity) && !activity.isChangingConfigurations()) {
                this.c.b(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Activity activity);
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static void a(boolean z, Activity activity) {
        WindowInsetsController insetsController;
        int systemBars;
        if (z && z3.b()) {
            insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(2);
                systemBars = WindowInsets.Type.systemBars();
                insetsController.hide(systemBars);
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static boolean a(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (z3.d() && activity.isDestroyed());
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void a(Context context, Class cls, C1076q c1076q, b bVar) {
        c1076q.a(new a(cls, bVar, c1076q));
        a(context, cls);
    }
}
