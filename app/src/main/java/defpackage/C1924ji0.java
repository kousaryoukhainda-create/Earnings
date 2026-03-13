package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: ji0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1924ji0 extends FutureTask {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1924ji0(Callable callable, int i) {
        super(callable);
        this.b = i;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        int i = this.b;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get() {
        switch (this.b) {
            case 0:
                try {
                    return super.get();
                } catch (InterruptedException unused) {
                    Thread.currentThread().getName();
                    Thread.currentThread().interrupt();
                    return null;
                }
            default:
                try {
                    return super.get();
                } catch (InterruptedException unused2) {
                    StringBuilder b = Ki0.b("future.get() Interrupted on Thread ");
                    b.append(Thread.currentThread().getName());
                    Log.w("ji0", b.toString());
                    Thread.currentThread().interrupt();
                    return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1924ji0(Runnable runnable) {
        super(runnable, null);
        this.b = 0;
        new AtomicBoolean(false);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        switch (this.b) {
            case 0:
                try {
                    return super.get(j, timeUnit);
                } catch (InterruptedException unused) {
                    Thread.currentThread().getName();
                    Thread.currentThread().interrupt();
                    return null;
                }
            default:
                try {
                    return super.get(j, timeUnit);
                } catch (InterruptedException unused2) {
                    StringBuilder b = Ki0.b("future.get() Interrupted on Thread ");
                    b.append(Thread.currentThread().getName());
                    Log.w("ji0", b.toString());
                    Thread.currentThread().interrupt();
                    return null;
                }
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
