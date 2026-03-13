package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* renamed from: Um  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0665Um implements Executor {
    public final /* synthetic */ Handler b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
