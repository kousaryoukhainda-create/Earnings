package defpackage;

import com.appsflyer.AppsFlyerProperties;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata
/* renamed from: hp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1565hp implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public MethodChannel b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "desktop_webview_auth");
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            Intrinsics.f(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        result.notImplemented();
    }
}
