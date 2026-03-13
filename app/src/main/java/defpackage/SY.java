package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* renamed from: SY  reason: default package */
/* loaded from: classes2.dex */
public abstract class SY extends AbstractC2711ss {
    public ExecutorC0609Si d;

    @Override // defpackage.AbstractC0531Pi
    public final void e(InterfaceC0428Li interfaceC0428Li, Runnable runnable) {
        ExecutorC0609Si executorC0609Si = this.d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0609Si.j;
        executorC0609Si.b(runnable, Q50.g, false);
    }
}
