package defpackage;

import java.util.concurrent.ScheduledFuture;
/* renamed from: Kp  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0409Kp implements InterfaceC0435Lp {
    public final ScheduledFuture b;

    public C0409Kp(ScheduledFuture scheduledFuture) {
        this.b = scheduledFuture;
    }

    @Override // defpackage.InterfaceC0435Lp
    public final void dispose() {
        this.b.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.b + ']';
    }
}
