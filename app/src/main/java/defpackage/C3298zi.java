package defpackage;

import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.CookieManagerProxyApi;
import io.flutter.plugins.webviewflutter.WebViewProxyApi;
import kotlin.jvm.functions.Function1;
/* renamed from: zi  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3298zi implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ C3298zi(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                CookieManagerProxyApi.b(this.b, (Boolean) obj);
                return;
            default:
                WebViewProxyApi.c((String) obj, this.b);
                return;
        }
    }
}
