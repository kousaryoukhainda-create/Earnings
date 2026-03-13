package defpackage;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiAndroidMessage;
import io.flutter.plugins.webviewflutter.PigeonApiCertificate;
import io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest;
import io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import io.flutter.plugins.webviewflutter.PigeonApiCustomViewCallback;
import io.flutter.plugins.webviewflutter.PigeonApiDownloadListener;
import io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams;
import io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager;
import io.flutter.plugins.webviewflutter.PigeonApiGeolocationPermissionsCallback;
import io.flutter.plugins.webviewflutter.PigeonApiHttpAuthHandler;
import io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel;
import io.flutter.plugins.webviewflutter.PigeonApiPermissionRequest;
import io.flutter.plugins.webviewflutter.PigeonApiPrivateKey;
import io.flutter.plugins.webviewflutter.PigeonApiSslCertificate;
import io.flutter.plugins.webviewflutter.PigeonApiSslCertificateDName;
import io.flutter.plugins.webviewflutter.PigeonApiSslError;
import io.flutter.plugins.webviewflutter.PigeonApiSslErrorHandler;
import io.flutter.plugins.webviewflutter.PigeonApiView;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import kotlin.jvm.functions.Function1;
/* renamed from: qR  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2500qR implements BasicMessageChannel.Reply {
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ C2500qR(int i, Function1 function1) {
        this.b = i;
        this.c = function1;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        switch (this.b) {
            case 0:
                PigeonApiAndroidMessage.a(this.c, obj);
                return;
            case 1:
                PigeonApiCertificate.a(this.c, obj);
                return;
            case 2:
                PigeonApiClientCertRequest.a(this.c, obj);
                return;
            case 3:
                PigeonApiConsoleMessage.a(this.c, obj);
                return;
            case 4:
                PigeonApiCookieManager.a(this.c, obj);
                return;
            case 5:
                PigeonApiCustomViewCallback.a(this.c, obj);
                return;
            case 6:
                PigeonApiDownloadListener.a(this.c, obj);
                return;
            case 7:
                PigeonApiFileChooserParams.a(this.c, obj);
                return;
            case 8:
                PigeonApiFlutterAssetManager.a(this.c, obj);
                return;
            case 9:
                PigeonApiGeolocationPermissionsCallback.a(this.c, obj);
                return;
            case 10:
                PigeonApiHttpAuthHandler.a(this.c, obj);
                return;
            case 11:
                PigeonApiJavaScriptChannel.a(this.c, obj);
                return;
            case 12:
                PigeonApiPermissionRequest.a(this.c, obj);
                return;
            case 13:
                PigeonApiPrivateKey.a(this.c, obj);
                return;
            case 14:
                PigeonApiSslCertificate.a(this.c, obj);
                return;
            case 15:
                PigeonApiSslCertificateDName.a(this.c, obj);
                return;
            case 16:
                PigeonApiSslError.a(this.c, obj);
                return;
            case 17:
                PigeonApiSslErrorHandler.a(this.c, obj);
                return;
            case 18:
                PigeonApiView.a(this.c, obj);
                return;
            case 19:
                PigeonApiWebChromeClient.j(this.c, obj);
                return;
            case 20:
                PigeonApiWebChromeClient.a(this.c, obj);
                return;
            case 21:
                PigeonApiWebChromeClient.g(this.c, obj);
                return;
            case 22:
                PigeonApiWebChromeClient.e(this.c, obj);
                return;
            case 23:
                PigeonApiWebChromeClient.c(this.c, obj);
                return;
            case 24:
                PigeonApiWebChromeClient.h(this.c, obj);
                return;
            case 25:
                PigeonApiWebChromeClient.b(this.c, obj);
                return;
            case 26:
                PigeonApiWebChromeClient.k(this.c, obj);
                return;
            case 27:
                PigeonApiWebChromeClient.f(this.c, obj);
                return;
            case 28:
                PigeonApiWebChromeClient.d(this.c, obj);
                return;
            default:
                PigeonApiWebChromeClient.i(this.c, obj);
                return;
        }
    }
}
