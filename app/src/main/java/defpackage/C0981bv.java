package defpackage;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;
import kotlin.jvm.functions.Function1;
/* renamed from: bv  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0981bv implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ BasicMessageChannel.Reply c;

    public /* synthetic */ C0981bv(BasicMessageChannel.Reply reply, int i) {
        this.b = i;
        this.c = reply;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B90 upMessageHandlers$lambda$6$lambda$5$lambda$4;
        B90 upMessageHandlers$lambda$28$lambda$27$lambda$26;
        switch (this.b) {
            case 0:
                return FirebaseAnalyticsHostApi.Companion.n(this.c, (JW) obj);
            case 1:
                return FirebaseAnalyticsHostApi.Companion.q(this.c, (JW) obj);
            case 2:
                return FirebaseAnalyticsHostApi.Companion.c(this.c, (JW) obj);
            case 3:
                return FirebaseAnalyticsHostApi.Companion.r(this.c, (JW) obj);
            case 4:
                return FirebaseAnalyticsHostApi.Companion.k(this.c, (JW) obj);
            case 5:
                return FirebaseAnalyticsHostApi.Companion.h(this.c, (JW) obj);
            case 6:
                return FirebaseAnalyticsHostApi.Companion.t(this.c, (JW) obj);
            case 7:
                return FirebaseAnalyticsHostApi.Companion.i(this.c, (JW) obj);
            case 8:
                return FirebaseAnalyticsHostApi.Companion.b(this.c, (JW) obj);
            case 9:
                return FirebaseAnalyticsHostApi.Companion.l(this.c, (JW) obj);
            case 10:
                return FirebaseAnalyticsHostApi.Companion.f(this.c, (JW) obj);
            case 11:
                upMessageHandlers$lambda$6$lambda$5$lambda$4 = PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5$lambda$4(this.c, (JW) obj);
                return upMessageHandlers$lambda$6$lambda$5$lambda$4;
            default:
                upMessageHandlers$lambda$28$lambda$27$lambda$26 = PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27$lambda$26(this.c, (JW) obj);
                return upMessageHandlers$lambda$28$lambda$27$lambda$26;
        }
    }
}
