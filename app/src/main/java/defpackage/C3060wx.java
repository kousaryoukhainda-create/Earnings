package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
/* renamed from: wx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3060wx implements OnCompleteListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ GeneratedAndroidFirebaseAuth.Result c;
    public final /* synthetic */ FirebaseUser d;

    public /* synthetic */ C3060wx(FirebaseUser firebaseUser, GeneratedAndroidFirebaseAuth.Result result, int i) {
        this.b = i;
        this.d = firebaseUser;
        this.c = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.b) {
            case 0:
                FlutterFirebaseAuthUser.lambda$updatePassword$12(this.c, this.d, task);
                return;
            case 1:
                FlutterFirebaseAuthUser.lambda$reload$6(this.c, this.d, task);
                return;
            case 2:
                FlutterFirebaseAuthUser.lambda$updateProfile$16(this.c, this.d, task);
                return;
            case 3:
                FlutterFirebaseAuthUser.lambda$updateEmail$10(this.c, this.d, task);
                return;
            case 4:
                FlutterFirebaseAuthUser.lambda$updatePhoneNumber$15(this.d, this.c, task);
                return;
            case 5:
                FlutterFirebaseAuthUser.lambda$updatePassword$13(this.d, this.c, task);
                return;
            case 6:
                FlutterFirebaseAuthUser.lambda$updateEmail$11(this.d, this.c, task);
                return;
            case 7:
                FlutterFirebaseAuthUser.lambda$updatePhoneNumber$14(this.c, this.d, task);
                return;
            default:
                FlutterFirebaseAuthUser.lambda$updateProfile$17(this.d, this.c, task);
                return;
        }
    }

    public /* synthetic */ C3060wx(GeneratedAndroidFirebaseAuth.Result result, FirebaseUser firebaseUser, int i) {
        this.b = i;
        this.c = result;
        this.d = firebaseUser;
    }
}
