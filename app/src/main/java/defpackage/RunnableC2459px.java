package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.appcheck.FlutterFirebaseAppCheckPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin;
/* renamed from: px  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2459px implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ RunnableC2459px(int i, TaskCompletionSource taskCompletionSource) {
        this.b = i;
        this.c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterFirebaseAnalyticsPlugin.getPluginConstantsForFirebaseApp$lambda$0(this.c);
                return;
            case 1:
                FlutterFirebaseAnalyticsPlugin.didReinitializeFirebaseCore$lambda$1(this.c);
                return;
            case 2:
                FlutterFirebaseAppCheckPlugin.a(this.c);
                return;
            case 3:
                FlutterFirebaseAppCheckPlugin.e(this.c);
                return;
            case 4:
                FlutterFirebaseCrashlyticsPlugin.lambda$deleteUnsentReports$2(this.c);
                return;
            case 5:
                FlutterFirebaseCrashlyticsPlugin.lambda$sendUnsentReports$6(this.c);
                return;
            case 6:
                FlutterFirebaseCrashlyticsPlugin.lambda$didReinitializeFirebaseCore$12(this.c);
                return;
            case 7:
                FlutterFirebaseDynamicLinksPlugin.e(this.c);
                return;
            case 8:
                FlutterFirebaseDynamicLinksPlugin.d(this.c);
                return;
            case 9:
                this.c.setResult(null);
                return;
            case 10:
                FlutterFirebaseMessagingPlugin.lambda$deleteToken$2(this.c);
                return;
            case 11:
                FlutterFirebasePerformancePlugin.c(this.c);
                return;
            case 12:
                FlutterFirebasePerformancePlugin.b(this.c);
                return;
            default:
                FlutterFirebasePluginRegistry.a(this.c);
                return;
        }
    }
}
