package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* renamed from: He0  reason: default package */
/* loaded from: classes.dex */
public final class He0 implements ThreadFactory {
    public int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.a);
        this.a = this.a + 1;
        return newThread;
    }
}
