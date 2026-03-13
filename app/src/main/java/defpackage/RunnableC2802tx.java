package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.appcheck.FlutterFirebaseAppCheckPlugin;
import java.util.Map;
/* renamed from: tx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2802tx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FlutterFirebaseAppCheckPlugin c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ TaskCompletionSource f;

    public /* synthetic */ RunnableC2802tx(FlutterFirebaseAppCheckPlugin flutterFirebaseAppCheckPlugin, Map map, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = flutterFirebaseAppCheckPlugin;
        this.d = map;
        this.f = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterFirebaseAppCheckPlugin.f(this.c, this.d, this.f);
                return;
            case 1:
                FlutterFirebaseAppCheckPlugin.c(this.c, this.d, this.f);
                return;
            case 2:
                FlutterFirebaseAppCheckPlugin.g(this.c, this.d, this.f);
                return;
            case 3:
                FlutterFirebaseAppCheckPlugin.h(this.c, this.d, this.f);
                return;
            default:
                FlutterFirebaseAppCheckPlugin.d(this.c, this.d, this.f);
                return;
        }
    }
}
