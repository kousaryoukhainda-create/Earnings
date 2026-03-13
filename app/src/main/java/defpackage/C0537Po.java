package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: Po  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0537Po implements InterfaceC0641To {
    public final /* synthetic */ int b;
    public final /* synthetic */ ScheduledExecutorServiceC0615So c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ TimeUnit h;

    public /* synthetic */ C0537Po(ScheduledExecutorServiceC0615So scheduledExecutorServiceC0615So, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.b = i;
        this.c = scheduledExecutorServiceC0615So;
        this.d = runnable;
        this.f = j;
        this.g = j2;
        this.h = timeUnit;
    }

    @Override // defpackage.InterfaceC0641To
    public final ScheduledFuture a(WC wc) {
        switch (this.b) {
            case 0:
                ScheduledExecutorServiceC0615So scheduledExecutorServiceC0615So = this.c;
                scheduledExecutorServiceC0615So.getClass();
                return scheduledExecutorServiceC0615So.c.scheduleAtFixedRate(new RunnableC0563Qo(scheduledExecutorServiceC0615So, this.d, wc, 0), this.f, this.g, this.h);
            default:
                ScheduledExecutorServiceC0615So scheduledExecutorServiceC0615So2 = this.c;
                scheduledExecutorServiceC0615So2.getClass();
                return scheduledExecutorServiceC0615So2.c.scheduleWithFixedDelay(new RunnableC0563Qo(scheduledExecutorServiceC0615So2, this.d, wc, 2), this.f, this.g, this.h);
        }
    }
}
