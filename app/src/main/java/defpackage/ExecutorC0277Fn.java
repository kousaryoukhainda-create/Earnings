package defpackage;

import java.util.concurrent.Executor;
/* renamed from: Fn  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC0277Fn extends AbstractC2711ss implements Executor {
    public static final ExecutorC0277Fn d = new AbstractC0531Pi();
    public static final AbstractC0531Pi f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Fn, Pi] */
    /* JADX WARN: Type inference failed for: r2v3, types: [NG] */
    static {
        G90 g90 = G90.d;
        int i = D50.a;
        if (64 >= i) {
            i = 64;
        }
        int c0 = AbstractC2870uj.c0("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        g90.getClass();
        if (c0 >= 1) {
            if (c0 < Q50.d) {
                if (c0 >= 1) {
                    g90 = new NG(g90, c0);
                } else {
                    throw new IllegalArgumentException(AbstractC0324Hi.e(c0, "Expected positive parallelism level, but got ").toString());
                }
            }
            f = g90;
            return;
        }
        throw new IllegalArgumentException(AbstractC0324Hi.e(c0, "Expected positive parallelism level, but got ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.AbstractC0531Pi
    public final void e(InterfaceC0428Li interfaceC0428Li, Runnable runnable) {
        f.e(interfaceC0428Li, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(C2710sr.b, runnable);
    }

    @Override // defpackage.AbstractC0531Pi
    public final String toString() {
        return "Dispatchers.IO";
    }
}
