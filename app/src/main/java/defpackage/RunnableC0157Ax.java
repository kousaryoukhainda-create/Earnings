package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import java.util.Map;
/* renamed from: Ax  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0157Ax implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ TaskCompletionSource f;

    public /* synthetic */ RunnableC0157Ax(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, Map map, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = flutterFirebaseCrashlyticsPlugin;
        this.d = map;
        this.f = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.k(this.c, this.d, this.f);
                return;
            default:
                FlutterFirebaseCrashlyticsPlugin.i(this.c, this.d, this.f);
                return;
        }
    }
}
