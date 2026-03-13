package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.FlutterFirebaseMultiFactor;
import io.flutter.plugins.firebase.auth.FlutterFirebaseTotpMultiFactor;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
/* renamed from: ux  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2888ux implements OnCompleteListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.Result c;

    public /* synthetic */ C2888ux(GeneratedAndroidFirebaseAuth.Result result, int i) {
        this.b = i;
        this.c = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.b) {
            case 0:
                FlutterFirebaseAuthPlugin.q(this.c, task);
                return;
            case 1:
                FlutterFirebaseAuthPlugin.i(this.c, task);
                return;
            case 2:
                FlutterFirebaseAuthPlugin.a(this.c, task);
                return;
            case 3:
                FlutterFirebaseAuthPlugin.e(this.c, task);
                return;
            case 4:
                FlutterFirebaseAuthPlugin.g(this.c, task);
                return;
            case 5:
                FlutterFirebaseAuthPlugin.l(this.c, task);
                return;
            case 6:
                FlutterFirebaseAuthPlugin.c(this.c, task);
                return;
            case 7:
                FlutterFirebaseAuthPlugin.r(this.c, task);
                return;
            case 8:
                FlutterFirebaseAuthPlugin.m(this.c, task);
                return;
            case 9:
                FlutterFirebaseAuthPlugin.b(this.c, task);
                return;
            case 10:
                FlutterFirebaseAuthUser.o(this.c, task);
                return;
            case 11:
                FlutterFirebaseAuthUser.i(this.c, task);
                return;
            case 12:
                FlutterFirebaseAuthUser.d(this.c, task);
                return;
            case 13:
                FlutterFirebaseAuthUser.t(this.c, task);
                return;
            case 14:
                FlutterFirebaseAuthUser.k(this.c, task);
                return;
            case 15:
                FlutterFirebaseMultiFactor.c(this.c, task);
                return;
            case 16:
                FlutterFirebaseMultiFactor.e(this.c, task);
                return;
            default:
                FlutterFirebaseTotpMultiFactor.a(this.c, task);
                return;
        }
    }
}
