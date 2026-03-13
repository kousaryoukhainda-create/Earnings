package defpackage;

import java.util.TimerTask;
/* renamed from: wh0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3039wh0 extends TimerTask {
    public final /* synthetic */ int b;
    public final /* synthetic */ RunnableC3125xh0 c;

    public /* synthetic */ C3039wh0(RunnableC3125xh0 runnableC3125xh0, int i) {
        this.b = i;
        this.c = runnableC3125xh0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                try {
                    C2781th0 c2781th0 = AbstractC3211yh0.b;
                    if (c2781th0.getQueue().isEmpty() && c2781th0.getActiveCount() <= 0) {
                        this.c.i();
                        this.c.r.set(null);
                        synchronized (this.c.j) {
                            this.c.j.notifyAll();
                        }
                        return;
                    }
                    this.c.s.set(null);
                    this.c.r.set(null);
                    synchronized (this.c.j) {
                        this.c.j.notifyAll();
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (this.c.j) {
                        this.c.j.notifyAll();
                        throw th;
                    }
                }
            default:
                AbstractC3211yh0.a.post(new RunnableC2953vh0(this, 1));
                return;
        }
    }
}
