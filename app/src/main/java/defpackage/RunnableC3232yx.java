package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
/* renamed from: yx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3232yx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FlutterFirebaseCorePlugin c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ RunnableC3232yx(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = flutterFirebaseCorePlugin;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.lambda$optionsFromResource$5(this.d);
                return;
            default:
                this.c.lambda$initializeCore$4(this.d);
                return;
        }
    }
}
