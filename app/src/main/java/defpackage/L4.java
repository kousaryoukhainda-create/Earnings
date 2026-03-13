package defpackage;

import java.lang.ref.WeakReference;
/* renamed from: L4  reason: default package */
/* loaded from: classes.dex */
public abstract class L4 implements J4 {
    private final K4 appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private R4 currentAppState = R4.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<J4> appStateCallback = new WeakReference<>(this);

    public L4(K4 k4) {
        this.appStateMonitor = k4;
    }

    public R4 getAppState() {
        return this.currentAppState;
    }

    public WeakReference<J4> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.j.addAndGet(i);
    }

    @Override // defpackage.J4
    public void onUpdateAppState(R4 r4) {
        R4 r42 = this.currentAppState;
        R4 r43 = R4.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (r42 == r43) {
            this.currentAppState = r4;
        } else if (r42 != r4 && r4 != r43) {
            this.currentAppState = R4.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        K4 k4 = this.appStateMonitor;
        this.currentAppState = k4.q;
        k4.d(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        K4 k4 = this.appStateMonitor;
        WeakReference<J4> weakReference = this.appStateCallback;
        synchronized (k4.h) {
            k4.h.remove(weakReference);
        }
        this.isRegisteredForAppState = false;
    }
}
