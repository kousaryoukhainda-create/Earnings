package defpackage;

import android.os.Process;
/* renamed from: pW  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2419pW extends Thread {
    public final int b;

    public C2419pW(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.b = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.b);
        super.run();
    }
}
