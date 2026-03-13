package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Ym0  reason: default package */
/* loaded from: classes3.dex */
public abstract class Ym0 implements Runnable {
    public final TaskCompletionSource b;

    public Ym0() {
        this.b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public Ym0(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }
}
