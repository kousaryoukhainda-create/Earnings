package com.appsflyer.internal;

import java.util.TimerTask;
/* loaded from: classes.dex */
public final class AFd1uSDK extends TimerTask {
    private final Thread AFInAppEventType;

    public AFd1uSDK(Thread thread) {
        this.AFInAppEventType = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.AFInAppEventType.interrupt();
    }
}
