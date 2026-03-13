package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
/* renamed from: qx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2545qx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ RunnableC2545qx(TaskCompletionSource taskCompletionSource, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin) {
        this.b = 1;
        this.c = flutterFirebaseAnalyticsPlugin;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterFirebaseAnalyticsPlugin.handleGetAppInstanceId$lambda$11(this.d, this.c);
                return;
            case 1:
                FlutterFirebaseAnalyticsPlugin.handleResetAnalyticsData$lambda$8(this.c, this.d);
                return;
            default:
                FlutterFirebaseAnalyticsPlugin.handleGetSessionId$lambda$2(this.d, this.c);
                return;
        }
    }

    public /* synthetic */ RunnableC2545qx(TaskCompletionSource taskCompletionSource, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, int i) {
        this.b = i;
        this.d = taskCompletionSource;
        this.c = flutterFirebaseAnalyticsPlugin;
    }
}
