package defpackage;

import io.flutter.plugins.webviewflutter.DownloadListenerProxyApi;
import io.flutter.plugins.webviewflutter.JavaScriptChannel;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Up  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0668Up implements Function1 {
    public final /* synthetic */ int b;

    public /* synthetic */ C0668Up(int i) {
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B90 lambda$onReceivedError$8;
        B90 lambda$onScaleChanged$30;
        B90 lambda$shouldOverrideUrlLoading$10;
        B90 lambda$onPageFinished$2;
        B90 lambda$onReceivedSslError$28;
        B90 lambda$onReceivedHttpError$4;
        B90 lambda$onReceivedClientCertRequest$24;
        B90 lambda$onPageStarted$0;
        B90 lambda$onReceivedLoginRequest$26;
        B90 lambda$doUpdateVisitedHistory$14;
        B90 lambda$onLoadResource$20;
        B90 lambda$onPageCommitVisible$22;
        B90 lambda$shouldOverrideUrlLoading$12;
        B90 lambda$onFormResubmission$18;
        B90 lambda$onReceivedHttpAuthRequest$16;
        B90 lambda$onReceivedError$6;
        B90 lambda$onPageCommitVisible$222;
        B90 lambda$onReceivedError$82;
        switch (this.b) {
            case 0:
                return DownloadListenerProxyApi.DownloadListenerImpl.a((JW) obj);
            case 1:
                return JavaScriptChannel.b((JW) obj);
            case 2:
                NZ it = (NZ) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.iterator();
            case 3:
                Iterable it2 = (Iterable) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.iterator();
            case 4:
                return obj;
            case 5:
                return WebChromeClientProxyApi.WebChromeClientImpl.i((JW) obj);
            case 6:
                return WebChromeClientProxyApi.WebChromeClientImpl.d((JW) obj);
            case 7:
                return WebChromeClientProxyApi.WebChromeClientImpl.e((JW) obj);
            case 8:
                return WebChromeClientProxyApi.WebChromeClientImpl.j((JW) obj);
            case 9:
                return WebChromeClientProxyApi.WebChromeClientImpl.c((JW) obj);
            case 10:
                return WebChromeClientProxyApi.WebChromeClientImpl.g((JW) obj);
            case 11:
                return WebChromeClientProxyApi.WebChromeClientImpl.h((JW) obj);
            case 12:
                lambda$onReceivedError$8 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedError$8((JW) obj);
                return lambda$onReceivedError$8;
            case 13:
                lambda$onScaleChanged$30 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onScaleChanged$30((JW) obj);
                return lambda$onScaleChanged$30;
            case 14:
                lambda$shouldOverrideUrlLoading$10 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$shouldOverrideUrlLoading$10((JW) obj);
                return lambda$shouldOverrideUrlLoading$10;
            case 15:
                lambda$onPageFinished$2 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageFinished$2((JW) obj);
                return lambda$onPageFinished$2;
            case 16:
                lambda$onReceivedSslError$28 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedSslError$28((JW) obj);
                return lambda$onReceivedSslError$28;
            case 17:
                lambda$onReceivedHttpError$4 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedHttpError$4((JW) obj);
                return lambda$onReceivedHttpError$4;
            case 18:
                lambda$onReceivedClientCertRequest$24 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedClientCertRequest$24((JW) obj);
                return lambda$onReceivedClientCertRequest$24;
            case 19:
                lambda$onPageStarted$0 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageStarted$0((JW) obj);
                return lambda$onPageStarted$0;
            case 20:
                lambda$onReceivedLoginRequest$26 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedLoginRequest$26((JW) obj);
                return lambda$onReceivedLoginRequest$26;
            case 21:
                lambda$doUpdateVisitedHistory$14 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$doUpdateVisitedHistory$14((JW) obj);
                return lambda$doUpdateVisitedHistory$14;
            case 22:
                lambda$onLoadResource$20 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onLoadResource$20((JW) obj);
                return lambda$onLoadResource$20;
            case 23:
                lambda$onPageCommitVisible$22 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onPageCommitVisible$22((JW) obj);
                return lambda$onPageCommitVisible$22;
            case 24:
                lambda$shouldOverrideUrlLoading$12 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$shouldOverrideUrlLoading$12((JW) obj);
                return lambda$shouldOverrideUrlLoading$12;
            case 25:
                lambda$onFormResubmission$18 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onFormResubmission$18((JW) obj);
                return lambda$onFormResubmission$18;
            case 26:
                lambda$onReceivedHttpAuthRequest$16 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedHttpAuthRequest$16((JW) obj);
                return lambda$onReceivedHttpAuthRequest$16;
            case 27:
                lambda$onReceivedError$6 = WebViewClientProxyApi.WebViewClientCompatImpl.lambda$onReceivedError$6((JW) obj);
                return lambda$onReceivedError$6;
            case 28:
                lambda$onPageCommitVisible$222 = WebViewClientProxyApi.WebViewClientImpl.lambda$onPageCommitVisible$22((JW) obj);
                return lambda$onPageCommitVisible$222;
            default:
                lambda$onReceivedError$82 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedError$8((JW) obj);
                return lambda$onReceivedError$82;
        }
    }
}
