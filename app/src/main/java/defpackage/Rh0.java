package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;
/* renamed from: Rh0  reason: default package */
/* loaded from: classes2.dex */
public final class Rh0 extends AbstractExecutorService {
    public final /* synthetic */ int b;
    public final Handler c;

    public Rh0(int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new Handler(Looper.getMainLooper());
                return;
            default:
                this.c = new Handler(Looper.getMainLooper());
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                this.c.post(runnable);
                return;
            default:
                this.c.post(runnable);
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        int i = this.b;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.b) {
            case 0:
                return Collections.emptyList();
            default:
                return Collections.emptyList();
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
