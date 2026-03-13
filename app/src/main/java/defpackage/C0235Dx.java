package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
/* renamed from: Dx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0235Dx implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ FlutterFirebaseDynamicLinksPlugin b;

    public /* synthetic */ C0235Dx(FlutterFirebaseDynamicLinksPlugin flutterFirebaseDynamicLinksPlugin) {
        this.b = flutterFirebaseDynamicLinksPlugin;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.b.lambda$onNewIntent$1(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.b.lambda$onNewIntent$0((WQ) obj);
    }
}
