package defpackage;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import io.flutter.plugins.webviewflutter.ResultCompat;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import kotlin.jvm.functions.Function1;
/* renamed from: Lc0  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class Lc0 implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ WebChromeClientProxyApi.WebChromeClientImpl c;
    public final /* synthetic */ JsResult d;

    public /* synthetic */ Lc0(WebChromeClientProxyApi.WebChromeClientImpl webChromeClientImpl, JsResult jsResult, int i) {
        this.b = i;
        this.c = webChromeClientImpl;
        this.d = jsResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B90 lambda$onJsConfirm$9;
        B90 lambda$onJsAlert$8;
        B90 lambda$onJsPrompt$10;
        ResultCompat resultCompat = (ResultCompat) obj;
        switch (this.b) {
            case 0:
                lambda$onJsConfirm$9 = this.c.lambda$onJsConfirm$9(this.d, resultCompat);
                return lambda$onJsConfirm$9;
            case 1:
                lambda$onJsAlert$8 = this.c.lambda$onJsAlert$8(this.d, resultCompat);
                return lambda$onJsAlert$8;
            default:
                lambda$onJsPrompt$10 = this.c.lambda$onJsPrompt$10((JsPromptResult) this.d, resultCompat);
                return lambda$onJsPrompt$10;
        }
    }
}
