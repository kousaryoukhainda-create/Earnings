package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: Uo  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledFutureC0667Uo extends AbstractC2119m0 implements ScheduledFuture {
    public final ScheduledFuture j;

    public ScheduledFutureC0667Uo(InterfaceC0641To interfaceC0641To) {
        this.j = interfaceC0641To.a(new WC(this, 17));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.j.compareTo(delayed);
    }

    @Override // defpackage.AbstractC2119m0
    public final void e() {
        boolean z;
        ScheduledFuture scheduledFuture = this.j;
        Object obj = this.b;
        if ((obj instanceof C1405g0) && ((C1405g0) obj).a) {
            z = true;
        } else {
            z = false;
        }
        scheduledFuture.cancel(z);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.j.getDelay(timeUnit);
    }
}
