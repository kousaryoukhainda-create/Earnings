package androidx.work;
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ Worker b;

    public a(Worker worker) {
        this.b = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.b;
        try {
            worker.mFuture.i(worker.doWork());
        } catch (Throwable th) {
            worker.mFuture.j(th);
        }
    }
}
