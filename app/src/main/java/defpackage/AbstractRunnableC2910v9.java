package defpackage;

import android.os.Process;
/* renamed from: v9  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2910v9 implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
