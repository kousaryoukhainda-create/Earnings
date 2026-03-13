package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.Map;
/* renamed from: Bx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0183Bx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ RunnableC0183Bx(Map map, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = map;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.f(this.c, this.d);
                return;
            case 1:
                FlutterFirebaseCrashlyticsPlugin.j(this.c, this.d);
                return;
            case 2:
                FlutterFirebaseCrashlyticsPlugin.m(this.c, this.d);
                return;
            case 3:
                FlutterFirebaseMessagingPlugin.e(this.c, this.d);
                return;
            case 4:
                FlutterFirebaseMessagingPlugin.m(this.c, this.d);
                return;
            case 5:
                FlutterFirebaseMessagingPlugin.c(this.c, this.d);
                return;
            default:
                FlutterFirebaseMessagingPlugin.a(this.c, this.d);
                return;
        }
    }
}
