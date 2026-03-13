package defpackage;

import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import io.flutter.plugins.webviewflutter.WebViewProxyApi;
import kotlin.jvm.functions.Function1;
/* renamed from: Xc0  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class Xc0 implements Function1 {
    public final /* synthetic */ int b;

    public /* synthetic */ Xc0(int i) {
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B90 lambda$onLoadResource$20;
        B90 lambda$onFormResubmission$18;
        B90 lambda$doUpdateVisitedHistory$14;
        B90 lambda$onPageStarted$0;
        B90 lambda$onReceivedError$6;
        B90 lambda$onReceivedSslError$28;
        B90 lambda$shouldOverrideUrlLoading$12;
        B90 lambda$onReceivedLoginRequest$26;
        B90 lambda$shouldOverrideUrlLoading$10;
        B90 lambda$onReceivedHttpAuthRequest$16;
        B90 lambda$onReceivedClientCertRequest$24;
        B90 lambda$onReceivedHttpError$4;
        B90 lambda$onScaleChanged$30;
        B90 lambda$onPageFinished$2;
        B90 lambda$onScrollChanged$0;
        JW jw = (JW) obj;
        switch (this.b) {
            case 0:
                lambda$onLoadResource$20 = WebViewClientProxyApi.WebViewClientImpl.lambda$onLoadResource$20(jw);
                return lambda$onLoadResource$20;
            case 1:
                lambda$onFormResubmission$18 = WebViewClientProxyApi.WebViewClientImpl.lambda$onFormResubmission$18(jw);
                return lambda$onFormResubmission$18;
            case 2:
                lambda$doUpdateVisitedHistory$14 = WebViewClientProxyApi.WebViewClientImpl.lambda$doUpdateVisitedHistory$14(jw);
                return lambda$doUpdateVisitedHistory$14;
            case 3:
                lambda$onPageStarted$0 = WebViewClientProxyApi.WebViewClientImpl.lambda$onPageStarted$0(jw);
                return lambda$onPageStarted$0;
            case 4:
                lambda$onReceivedError$6 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedError$6(jw);
                return lambda$onReceivedError$6;
            case 5:
                lambda$onReceivedSslError$28 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedSslError$28(jw);
                return lambda$onReceivedSslError$28;
            case 6:
                lambda$shouldOverrideUrlLoading$12 = WebViewClientProxyApi.WebViewClientImpl.lambda$shouldOverrideUrlLoading$12(jw);
                return lambda$shouldOverrideUrlLoading$12;
            case 7:
                lambda$onReceivedLoginRequest$26 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedLoginRequest$26(jw);
                return lambda$onReceivedLoginRequest$26;
            case 8:
                lambda$shouldOverrideUrlLoading$10 = WebViewClientProxyApi.WebViewClientImpl.lambda$shouldOverrideUrlLoading$10(jw);
                return lambda$shouldOverrideUrlLoading$10;
            case 9:
                lambda$onReceivedHttpAuthRequest$16 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedHttpAuthRequest$16(jw);
                return lambda$onReceivedHttpAuthRequest$16;
            case 10:
                lambda$onReceivedClientCertRequest$24 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedClientCertRequest$24(jw);
                return lambda$onReceivedClientCertRequest$24;
            case 11:
                lambda$onReceivedHttpError$4 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedHttpError$4(jw);
                return lambda$onReceivedHttpError$4;
            case 12:
                lambda$onScaleChanged$30 = WebViewClientProxyApi.WebViewClientImpl.lambda$onScaleChanged$30(jw);
                return lambda$onScaleChanged$30;
            case 13:
                lambda$onPageFinished$2 = WebViewClientProxyApi.WebViewClientImpl.lambda$onPageFinished$2(jw);
                return lambda$onPageFinished$2;
            default:
                lambda$onScrollChanged$0 = WebViewProxyApi.WebViewPlatformView.lambda$onScrollChanged$0(jw);
                return lambda$onScrollChanged$0;
        }
    }
}
