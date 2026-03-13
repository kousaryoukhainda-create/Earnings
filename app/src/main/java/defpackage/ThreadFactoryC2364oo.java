package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: oo  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2364oo implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Number b;

    public ThreadFactoryC2364oo(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(0);
                return;
            default:
                this.b = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.b).getAndIncrement());
                return thread;
            case 1:
                StringBuilder b = Ki0.b("adjoe-tll-");
                b.append(((AtomicInteger) this.b).getAndIncrement());
                return new Thread(runnable, b.toString());
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(new C2883us(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.b).getAndIncrement());
                return newThread;
        }
    }

    public ThreadFactoryC2364oo(AtomicLong atomicLong) {
        this.a = 2;
        this.b = atomicLong;
    }
}
