package defpackage;

import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
/* renamed from: Vc0  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class Vc0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ WebViewClientProxyApi.WebViewClientCompatImpl c;
    public final /* synthetic */ WebView d;
    public final /* synthetic */ String f;

    public /* synthetic */ Vc0(WebViewClientProxyApi.WebViewClientCompatImpl webViewClientCompatImpl, WebView webView, String str, int i) {
        this.b = i;
        this.c = webViewClientCompatImpl;
        this.d = webView;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.lambda$onPageStarted$1(this.d, this.f);
                return;
            case 1:
                this.c.lambda$shouldOverrideUrlLoading$13(this.d, this.f);
                return;
            case 2:
                this.c.lambda$onPageCommitVisible$23(this.d, this.f);
                return;
            case 3:
                this.c.lambda$onLoadResource$21(this.d, this.f);
                return;
            default:
                this.c.lambda$onPageFinished$3(this.d, this.f);
                return;
        }
    }
}
