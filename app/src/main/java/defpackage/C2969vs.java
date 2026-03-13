package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* renamed from: vs  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2969vs extends AbstractRunnableC2910v9 {
    public final /* synthetic */ ExecutorService b;
    public final /* synthetic */ TimeUnit c;

    public C2969vs(ExecutorService executorService, TimeUnit timeUnit) {
        this.b = executorService;
        this.c = timeUnit;
    }

    @Override // defpackage.AbstractRunnableC2910v9
    public final void a() {
        ExecutorService executorService = this.b;
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(2L, this.c)) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", null);
            }
            executorService.shutdownNow();
        }
    }
}
