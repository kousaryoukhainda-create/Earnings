package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: th0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2781th0 extends ThreadPoolExecutor {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ C2781th0(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(i, i2, j, timeUnit, blockingQueue);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        switch (this.b) {
            case 0:
                return new C2867uh0((RunnableC3125xh0) runnable);
            default:
                return super.newTaskFor(runnable, obj);
        }
    }

    public /* synthetic */ C2781th0(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }
}
