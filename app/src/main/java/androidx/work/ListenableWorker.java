package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    @NonNull
    private WorkerParameters mWorkerParams;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T00, qH, java.lang.Object] */
    @NonNull
    public InterfaceFutureC2490qH getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    @NonNull
    public final C2187ml getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    @NonNull
    public N50 getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    @NonNull
    public Me0 getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [qH, java.lang.Object] */
    @NonNull
    public final InterfaceFutureC2490qH setForegroundAsync(@NonNull C2374oy c2374oy) {
        this.mRunInForeground = true;
        C3119xe0 c3119xe0 = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        c3119xe0.getClass();
        ?? obj = new Object();
        c3119xe0.a.v(new RunnableC2165ma(c3119xe0, obj, id, c2374oy, applicationContext, 1));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [qH, java.lang.Object] */
    @NonNull
    public InterfaceFutureC2490qH setProgressAsync(@NonNull C2187ml c2187ml) {
        Ce0 ce0 = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        ce0.getClass();
        ?? obj = new Object();
        ce0.b.v(new RunnableC2513qc(ce0, id, c2187ml, obj, 1));
        return obj;
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC2490qH startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
