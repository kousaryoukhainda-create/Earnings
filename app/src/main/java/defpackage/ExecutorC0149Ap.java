package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* renamed from: Ap  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC0149Ap implements Executor {
    public static final ExecutorC0149Ap c = new ExecutorC0149Ap(0);
    public static final /* synthetic */ ExecutorC0149Ap d = new ExecutorC0149Ap(2);
    public final /* synthetic */ int b;

    public /* synthetic */ ExecutorC0149Ap(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                runnable.run();
                return;
            case 1:
                new Handler(Looper.getMainLooper()).post(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
