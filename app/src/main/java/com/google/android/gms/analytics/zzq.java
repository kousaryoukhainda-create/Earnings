package com.google.android.gms.analytics;

import android.os.Process;
/* loaded from: classes3.dex */
final class zzq extends Thread {
    public zzq(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
