package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* renamed from: Xb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732Xb implements InterfaceFutureC2490qH {
    public final WeakReference b;
    public final C0706Wb c = new C0706Wb(this);

    public C0732Xb(C0680Vb c0680Vb) {
        this.b = new WeakReference(c0680Vb);
    }

    @Override // defpackage.InterfaceFutureC2490qH
    public final void addListener(Runnable runnable, Executor executor) {
        this.c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0680Vb c0680Vb = (C0680Vb) this.b.get();
        boolean cancel = this.c.cancel(z);
        if (cancel && c0680Vb != null) {
            c0680Vb.a = null;
            c0680Vb.b = null;
            c0680Vb.c.l(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.b instanceof C1405g0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.isDone();
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.c.get(j, timeUnit);
    }
}
