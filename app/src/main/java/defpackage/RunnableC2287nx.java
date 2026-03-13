package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import java.util.Map;
/* renamed from: nx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2287nx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin d;
    public final /* synthetic */ TaskCompletionSource f;

    public /* synthetic */ RunnableC2287nx(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.b = 2;
        this.d = flutterFirebaseAnalyticsPlugin;
        this.c = map;
        this.f = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f;
                FlutterFirebaseAnalyticsPlugin.b(this.d, this.c, taskCompletionSource);
                return;
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.f;
                FlutterFirebaseAnalyticsPlugin.a(this.d, this.c, taskCompletionSource2);
                return;
            default:
                FlutterFirebaseAnalyticsPlugin.n(this.d, this.c, this.f);
                return;
        }
    }

    public /* synthetic */ RunnableC2287nx(Map map, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = map;
        this.d = flutterFirebaseAnalyticsPlugin;
        this.f = taskCompletionSource;
    }
}
