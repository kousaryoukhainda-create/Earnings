package defpackage;

import android.os.Build;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.analytics.GeneratedAndroidFirebaseAnalyticsPigeonCodec;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
/* renamed from: cv  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1142cv implements InterfaceC0263Ez {
    public final /* synthetic */ int b;

    public /* synthetic */ C1142cv(int i) {
        this.b = i;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        GeneratedAndroidFirebaseAnalyticsPigeonCodec codec_delegate$lambda$0;
        int i;
        switch (this.b) {
            case 0:
                codec_delegate$lambda$0 = FirebaseAnalyticsHostApi.Companion.codec_delegate$lambda$0();
                return codec_delegate$lambda$0;
            case 1:
                if (Build.VERSION.SDK_INT >= 23) {
                    i = 33554432;
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            default:
                return SharedPreferencesAsyncApi.Companion.h();
        }
    }
}
