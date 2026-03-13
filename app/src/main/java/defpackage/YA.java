package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
/* renamed from: YA  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class YA implements OnCompleteListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ GoogleSignInPlugin.Delegate c;

    public /* synthetic */ YA(GoogleSignInPlugin.Delegate delegate, int i) {
        this.b = i;
        this.c = delegate;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.b) {
            case 0:
                GoogleSignInPlugin.Delegate.a(this.c, task);
                return;
            case 1:
                GoogleSignInPlugin.Delegate.b(this.c, task);
                return;
            default:
                GoogleSignInPlugin.Delegate.c(this.c, task);
                return;
        }
    }
}
