package defpackage;
/* renamed from: Je0  reason: default package */
/* loaded from: classes.dex */
public final class Je0 implements Runnable {
    public final Ke0 b;
    public final String c;

    public Je0(Ke0 ke0, String str) {
        this.b = ke0;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.d) {
            try {
                if (((Je0) this.b.b.remove(this.c)) != null) {
                    Ie0 ie0 = (Ie0) this.b.c.remove(this.c);
                    if (ie0 != null) {
                        String str = this.c;
                        EI c = EI.c();
                        c.a(C0434Lo.l, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((C0434Lo) ie0).e();
                    }
                } else {
                    EI c2 = EI.c();
                    String str2 = this.c;
                    c2.a("WrkTimerRunnable", "Timer with " + str2 + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
