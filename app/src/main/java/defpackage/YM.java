package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* renamed from: YM  reason: default package */
/* loaded from: classes.dex */
public final class YM extends FutureTask {
    public final /* synthetic */ RunnableC2558r5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YM(RunnableC2558r5 runnableC2558r5, XM xm) {
        super(xm);
        this.b = runnableC2558r5;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC2558r5 runnableC2558r5 = this.b;
        try {
            Object obj = get();
            if (!runnableC2558r5.f.get()) {
                runnableC2558r5.a(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (!runnableC2558r5.f.get()) {
                runnableC2558r5.a(null);
            }
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
