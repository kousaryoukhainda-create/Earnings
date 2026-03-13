package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
/* renamed from: xx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3146xx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ TaskCompletionSource f;

    public /* synthetic */ RunnableC3146xx(String str, Boolean bool, TaskCompletionSource taskCompletionSource, int i) {
        this.b = i;
        this.c = str;
        this.d = bool;
        this.f = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterFirebaseCorePlugin.a(this.c, this.d, this.f);
                return;
            default:
                FlutterFirebaseCorePlugin.c(this.c, this.d, this.f);
                return;
        }
    }
}
