package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import kotlin.jvm.functions.Function1;
/* renamed from: ox  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2373ox implements OnCompleteListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ C2373ox(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, int i) {
        this.b = i;
        this.c = flutterFirebaseAnalyticsPlugin;
        this.d = function1;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.b) {
            case 0:
                FlutterFirebaseAnalyticsPlugin.setConsent$lambda$18(this.c, this.d, task);
                return;
            case 1:
                FlutterFirebaseAnalyticsPlugin.setDefaultEventParameters$lambda$19(this.c, this.d, task);
                return;
            case 2:
                FlutterFirebaseAnalyticsPlugin.resetAnalyticsData$lambda$16(this.c, this.d, task);
                return;
            case 3:
                FlutterFirebaseAnalyticsPlugin.logEvent$lambda$12(this.c, this.d, task);
                return;
            case 4:
                FlutterFirebaseAnalyticsPlugin.setUserProperty$lambda$14(this.c, this.d, task);
                return;
            case 5:
                FlutterFirebaseAnalyticsPlugin.setAnalyticsCollectionEnabled$lambda$15(this.c, this.d, task);
                return;
            case 6:
                FlutterFirebaseAnalyticsPlugin.getSessionId$lambda$21(this.c, this.d, task);
                return;
            case 7:
                FlutterFirebaseAnalyticsPlugin.setUserId$lambda$13(this.c, this.d, task);
                return;
            case 8:
                FlutterFirebaseAnalyticsPlugin.setSessionTimeoutDuration$lambda$17(this.c, this.d, task);
                return;
            default:
                FlutterFirebaseAnalyticsPlugin.getAppInstanceId$lambda$20(this.c, this.d, task);
                return;
        }
    }
}
