package com.fyber.fairbid;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.fairbid.common.concurrency.PauseSignal;
import com.fyber.fairbid.internal.Logger;
import java.util.Locale;
/* loaded from: classes.dex */
public class m5 extends PauseSignal implements Application.ActivityLifecycleCallbacks {
    public final int f;
    public final Handler g;

    public m5(int i, String str) {
        super(str);
        this.f = i;
        this.g = new Handler(Looper.getMainLooper(), new C2919vH(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        if (message.what != 123) {
            return false;
        }
        if (this.b.compareAndSet(false, true)) {
            Locale locale = Locale.ENGLISH;
            String str = this.a;
            Logger.info("PauseSignal \"" + str + "\" is pausing...");
            long currentTimeMillis = System.currentTimeMillis();
            this.d = currentTimeMillis;
            this.e = currentTimeMillis;
            for (PauseSignal.a aVar : this.c) {
                aVar.b(this);
            }
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.g.hasMessages(123) && !this.b.get()) {
            this.g.sendEmptyMessageDelayed(123, this.f);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        long j;
        long j2;
        this.g.removeMessages(123);
        if (this.b.compareAndSet(true, false)) {
            this.e = System.currentTimeMillis();
            Locale locale = Locale.ENGLISH;
            String str = this.a;
            if (this.b.get()) {
                j = System.currentTimeMillis();
                j2 = this.d;
            } else {
                j = this.e;
                j2 = this.d;
            }
            long j3 = j - j2;
            Logger.info("PauseSignal \"" + str + "\" is resuming after " + j3 + "ms");
            for (PauseSignal.a aVar : this.c) {
                aVar.a(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
