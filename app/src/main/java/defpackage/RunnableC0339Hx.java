package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin;
/* renamed from: Hx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0339Hx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ MethodCall c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ RunnableC0339Hx(MethodCall methodCall, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = methodCall;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterFirebasePerformancePlugin.lambda$httpMetricStop$5(this.c, this.d);
                return;
            case 1:
                FlutterFirebasePerformancePlugin.lambda$httpMetricStart$4(this.c, this.d);
                return;
            case 2:
                FlutterFirebasePerformancePlugin.lambda$traceStart$2(this.c, this.d);
                return;
            case 3:
                FlutterFirebasePerformancePlugin.lambda$setPerformanceCollectionEnabled$1(this.c, this.d);
                return;
            default:
                FlutterFirebasePerformancePlugin.lambda$traceStop$3(this.c, this.d);
                return;
        }
    }
}
