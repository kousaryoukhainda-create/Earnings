package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.applovin.impl.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1076q implements Application.ActivityLifecycleCallbacks {
    private final List a = Collections.synchronizedList(new ArrayList());
    private WeakReference b;
    private WeakReference c;

    public C1076q(Context context) {
        this.b = new WeakReference(null);
        this.c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.c = this.b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.c.get();
    }

    public Activity b() {
        return (Activity) this.b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((AbstractC1075p) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((AbstractC1075p) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.c = new WeakReference(null);
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((AbstractC1075p) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.b = weakReference;
        this.c = weakReference;
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((AbstractC1075p) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((AbstractC1075p) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((AbstractC1075p) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((AbstractC1075p) it.next()).onActivityStopped(activity);
        }
    }

    public void a(AbstractC1075p abstractC1075p) {
        this.a.add(abstractC1075p);
    }

    public void b(AbstractC1075p abstractC1075p) {
        this.a.remove(abstractC1075p);
    }
}
