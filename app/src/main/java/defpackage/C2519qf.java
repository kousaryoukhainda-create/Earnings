package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: qf  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2519qf {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C2519qf.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public C2519qf(boolean z, Throwable th) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
