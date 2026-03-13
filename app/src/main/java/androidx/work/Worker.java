package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    T00 mFuture;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract AbstractC2833uH doWork();

    /* JADX WARN: Type inference failed for: r0v0, types: [T00, java.lang.Object] */
    @Override // androidx.work.ListenableWorker
    @NonNull
    public final InterfaceFutureC2490qH startWork() {
        this.mFuture = new Object();
        getBackgroundExecutor().execute(new a(this));
        return this.mFuture;
    }
}
