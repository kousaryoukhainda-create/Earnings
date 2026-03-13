package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: ph0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2438ph0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final ThreadFactory c;
    public final AtomicInteger d;

    public ThreadFactoryC2438ph0(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = Executors.defaultThreadFactory();
                this.d = new AtomicInteger(0);
                return;
            default:
                this.b = str;
                this.c = Executors.defaultThreadFactory();
                this.d = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = this.c.newThread(runnable);
                newThread.setName(this.b + "-th-" + this.d.incrementAndGet());
                return newThread;
            default:
                Thread newThread2 = this.c.newThread(runnable);
                newThread2.setName(this.b + "-th-" + this.d.incrementAndGet());
                return newThread2;
        }
    }
}
