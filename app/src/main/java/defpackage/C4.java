package defpackage;

import com.applovin.applovin_max.AppLovinMAX;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin;
import io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin;
/* renamed from: C4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class C4 implements AppLovinCmpService.OnCompletedListener, OnCompleteListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ MethodChannel.Result c;

    public /* synthetic */ C4(int i, MethodChannel.Result result) {
        this.b = i;
        this.c = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.b) {
            case 1:
                FirebaseRemoteConfigPlugin.b(this.c, task);
                return;
            case 2:
                FlutterFirebaseCrashlyticsPlugin.lambda$onMethodCall$10(this.c, task);
                return;
            case 3:
                FlutterFirebaseDynamicLinksPlugin.lambda$onMethodCall$2(this.c, task);
                return;
            case 4:
                FlutterFirebasePerformancePlugin.lambda$onMethodCall$6(this.c, task);
                return;
            default:
                this.c.success(null);
                return;
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService.OnCompletedListener
    public void onCompleted(AppLovinCmpError appLovinCmpError) {
        AppLovinMAX.a(this.c, appLovinCmpError);
    }
}
