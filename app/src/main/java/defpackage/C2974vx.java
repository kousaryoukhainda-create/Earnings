package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.FlutterFirebaseMultiFactor;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
/* renamed from: vx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2974vx implements OnCompleteListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.VoidResult c;

    public /* synthetic */ C2974vx(GeneratedAndroidFirebaseAuth.VoidResult voidResult, int i) {
        this.b = i;
        this.c = voidResult;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.b) {
            case 0:
                FlutterFirebaseAuthPlugin.d(this.c, task);
                return;
            case 1:
                FlutterFirebaseAuthPlugin.h(this.c, task);
                return;
            case 2:
                FlutterFirebaseAuthPlugin.j(this.c, task);
                return;
            case 3:
                FlutterFirebaseAuthPlugin.o(this.c, task);
                return;
            case 4:
                FlutterFirebaseAuthPlugin.s(this.c, task);
                return;
            case 5:
                FlutterFirebaseAuthPlugin.n(this.c, task);
                return;
            case 6:
                FlutterFirebaseAuthUser.l(this.c, task);
                return;
            case 7:
                FlutterFirebaseAuthUser.n(this.c, task);
                return;
            case 8:
                FlutterFirebaseAuthUser.m(this.c, task);
                return;
            case 9:
                FlutterFirebaseAuthUser.e(this.c, task);
                return;
            case 10:
                FlutterFirebaseAuthUser.q(this.c, task);
                return;
            case 11:
                FlutterFirebaseMultiFactor.d(this.c, task);
                return;
            case 12:
                FlutterFirebaseMultiFactor.a(this.c, task);
                return;
            default:
                FlutterFirebaseMultiFactor.b(this.c, task);
                return;
        }
    }
}
