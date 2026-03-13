package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata
/* renamed from: M4  reason: default package */
/* loaded from: classes2.dex */
public final class M4 implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public MethodChannel b;
    public Context c;

    public final HashMap a(PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        Context context = this.c;
        if (context != null) {
            hashMap.put("app_name", applicationInfo.loadLabel(context.getPackageManager()).toString());
            hashMap.put("package_name", packageInfo.packageName);
            hashMap.put("version_name", packageInfo.versionName);
            boolean z = true;
            if ((packageInfo.applicationInfo.flags & 1) == 0) {
                z = false;
            }
            hashMap.put("system_app", Boolean.valueOf(z));
            return hashMap;
        }
        Intrinsics.f("context");
        throw null;
    }

    public final PackageInfo b(String str) {
        Context context = this.c;
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(str, 1);
            } catch (PackageManager.NameNotFoundException e) {
                String message = e.getMessage();
                if (message != null) {
                    Log.e("getAppPackageInfo (" + str + ')', message);
                }
                return null;
            }
        }
        Intrinsics.f("context");
        throw null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.yashgarg/appcheck");
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.c = flutterPluginBinding.getApplicationContext();
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
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -756546941:
                    if (str.equals("checkAvailability")) {
                        String valueOf = String.valueOf(call.argument("uri"));
                        PackageInfo b = b(valueOf);
                        if (b != null) {
                            result.success(a(b));
                            return;
                        } else {
                            result.error("400", "App not found ".concat(valueOf), null);
                            return;
                        }
                    }
                    break;
                case -675127954:
                    if (str.equals("launchApp")) {
                        String valueOf2 = String.valueOf(call.argument("uri"));
                        if (b(valueOf2) != null) {
                            Context context = this.c;
                            if (context != null) {
                                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(valueOf2);
                                if (launchIntentForPackage != null) {
                                    launchIntentForPackage.addFlags(268435456);
                                    Context context2 = this.c;
                                    if (context2 != null) {
                                        context2.startActivity(launchIntentForPackage);
                                        result.success(null);
                                        return;
                                    }
                                    Intrinsics.f("context");
                                    throw null;
                                }
                            } else {
                                Intrinsics.f("context");
                                throw null;
                            }
                        }
                        result.error("400", "App not found ".concat(valueOf2), null);
                        return;
                    }
                    break;
                case 1694183082:
                    if (str.equals("isAppEnabled")) {
                        String valueOf3 = String.valueOf(call.argument("uri"));
                        try {
                            Context context3 = this.c;
                            if (context3 != null) {
                                ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo(valueOf3, 0);
                                Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
                                result.success(Boolean.valueOf(applicationInfo.enabled));
                                return;
                            }
                            Intrinsics.f("context");
                            throw null;
                        } catch (PackageManager.NameNotFoundException e) {
                            result.error("400", e.getMessage() + ' ' + valueOf3, e);
                            return;
                        }
                    }
                    break;
                case 2004739414:
                    if (str.equals("getInstalledApps")) {
                        Context context4 = this.c;
                        if (context4 != null) {
                            PackageManager packageManager = context4.getPackageManager();
                            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
                            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                            Intrinsics.checkNotNullExpressionValue(installedPackages, "getInstalledPackages(...)");
                            ArrayList arrayList = new ArrayList(installedPackages.size());
                            for (PackageInfo packageInfo : installedPackages) {
                                Intrinsics.b(packageInfo);
                                arrayList.add(a(packageInfo));
                            }
                            result.success(arrayList);
                            return;
                        }
                        Intrinsics.f("context");
                        throw null;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
