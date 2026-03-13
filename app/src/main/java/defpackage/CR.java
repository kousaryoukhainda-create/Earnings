package defpackage;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebResourceError;
import io.flutter.plugins.webviewflutter.PigeonApiWebResourceErrorCompat;
import io.flutter.plugins.webviewflutter.PigeonApiWebResourceRequest;
import io.flutter.plugins.webviewflutter.PigeonApiWebResourceResponse;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import io.flutter.plugins.webviewflutter.PigeonApiWebStorage;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewPoint;
import io.flutter.plugins.webviewflutter.PigeonApiX509Certificate;
import kotlin.jvm.functions.Function1;
/* renamed from: CR  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class CR implements BasicMessageChannel.Reply {
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ CR(int i, Function1 function1) {
        this.b = i;
        this.c = function1;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        switch (this.b) {
            case 0:
                PigeonApiWebResourceError.a(this.c, obj);
                return;
            case 1:
                PigeonApiWebResourceErrorCompat.a(this.c, obj);
                return;
            case 2:
                PigeonApiWebResourceRequest.a(this.c, obj);
                return;
            case 3:
                PigeonApiWebResourceResponse.a(this.c, obj);
                return;
            case 4:
                PigeonApiWebSettings.a(this.c, obj);
                return;
            case 5:
                PigeonApiWebStorage.a(this.c, obj);
                return;
            case 6:
                PigeonApiWebView.a(this.c, obj);
                return;
            case 7:
                PigeonApiWebView.b(this.c, obj);
                return;
            case 8:
                PigeonApiWebViewClient.r(this.c, obj);
                return;
            case 9:
                PigeonApiWebViewClient.p(this.c, obj);
                return;
            case 10:
                PigeonApiWebViewClient.l(this.c, obj);
                return;
            case 11:
                PigeonApiWebViewClient.h(this.c, obj);
                return;
            case 12:
                PigeonApiWebViewClient.b(this.c, obj);
                return;
            case 13:
                PigeonApiWebViewClient.m(this.c, obj);
                return;
            case 14:
                PigeonApiWebViewClient.a(this.c, obj);
                return;
            case 15:
                PigeonApiWebViewClient.q(this.c, obj);
                return;
            case 16:
                PigeonApiWebViewClient.f(this.c, obj);
                return;
            case 17:
                PigeonApiWebViewClient.k(this.c, obj);
                return;
            case 18:
                PigeonApiWebViewClient.c(this.c, obj);
                return;
            case 19:
                PigeonApiWebViewClient.j(this.c, obj);
                return;
            case 20:
                PigeonApiWebViewClient.n(this.c, obj);
                return;
            case 21:
                PigeonApiWebViewClient.o(this.c, obj);
                return;
            case 22:
                PigeonApiWebViewClient.d(this.c, obj);
                return;
            case 23:
                PigeonApiWebViewClient.g(this.c, obj);
                return;
            case 24:
                PigeonApiWebViewClient.i(this.c, obj);
                return;
            case 25:
                PigeonApiWebViewClient.e(this.c, obj);
                return;
            case 26:
                PigeonApiWebViewPoint.a(this.c, obj);
                return;
            default:
                PigeonApiX509Certificate.a(this.c, obj);
                return;
        }
    }
}
