package defpackage;

import android.window.OnBackInvokedCallback;
import io.flutter.embedding.android.FlutterActivity;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: mx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2201mx implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2201mx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((FlutterActivity) this.b).onBackPressed();
                return;
            case 1:
                InterfaceC0263Ez onBackInvoked = (InterfaceC0263Ez) this.b;
                Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            default:
                ((Runnable) this.b).run();
                return;
        }
    }
}
