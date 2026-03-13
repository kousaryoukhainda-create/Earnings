package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;
/* renamed from: LE  reason: default package */
/* loaded from: classes2.dex */
public final class LE extends AbstractC0835aF {
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(LE.class, "_invoked");
    private volatile int _invoked;
    public final Function1 g;

    public LE(Function1 function1) {
        this.g = function1;
    }

    @Override // defpackage.AbstractC1173dF
    public final void i(Throwable th) {
        if (h.compareAndSet(this, 0, 1)) {
            this.g.invoke(th);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return B90.a;
    }
}
