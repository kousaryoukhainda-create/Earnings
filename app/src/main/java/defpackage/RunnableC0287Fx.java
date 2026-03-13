package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
/* renamed from: Fx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0287Fx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FlutterFirebaseMessagingPlugin c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ RunnableC0287Fx(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = flutterFirebaseMessagingPlugin;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterFirebaseMessagingPlugin.i(this.c, this.d);
                return;
            case 1:
                FlutterFirebaseMessagingPlugin.d(this.c, this.d);
                return;
            case 2:
                FlutterFirebaseMessagingPlugin.b(this.c, this.d);
                return;
            default:
                FlutterFirebaseMessagingPlugin.j(this.c, this.d);
                return;
        }
    }
}
