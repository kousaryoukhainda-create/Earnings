package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
/* renamed from: Cx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0209Cx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ RunnableC0209Cx(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = flutterFirebaseCrashlyticsPlugin;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.lambda$checkForUnsentReports$0(this.d);
                return;
            default:
                this.c.lambda$didCrashOnPreviousExecution$3(this.d);
                return;
        }
    }
}
