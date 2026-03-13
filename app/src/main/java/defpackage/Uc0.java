package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
/* renamed from: Uc0  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class Uc0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float f;
    public final /* synthetic */ WebViewClient g;

    public /* synthetic */ Uc0(WebViewClient webViewClient, WebView webView, float f, float f2, int i) {
        this.b = i;
        this.g = webViewClient;
        this.c = webView;
        this.d = f;
        this.f = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                WebViewClientProxyApi.WebViewClientCompatImpl.y((WebViewClientProxyApi.WebViewClientCompatImpl) this.g, this.c, this.d, this.f);
                return;
            default:
                WebViewClientProxyApi.WebViewClientImpl.x((WebViewClientProxyApi.WebViewClientImpl) this.g, this.c, this.d, this.f);
                return;
        }
    }
}
