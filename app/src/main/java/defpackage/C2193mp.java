package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata
/* renamed from: mp  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2193mp implements FlutterPlugin {
    public MethodChannel b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = applicationContext.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        Object systemService = applicationContext.getSystemService("window");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        OM om = new OM(packageManager, (WindowManager) systemService);
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(om);
        } else {
            Intrinsics.f("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            Intrinsics.f("methodChannel");
            throw null;
        }
    }
}
