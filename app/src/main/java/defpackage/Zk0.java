package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Zk0  reason: default package */
/* loaded from: classes3.dex */
public abstract class Zk0 implements Runnable {
    private final TaskCompletionSource a;

    public Zk0() {
        this.a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public Zk0(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
