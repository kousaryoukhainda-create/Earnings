package defpackage;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.applovin.exoplayer2.common.base.Ascii;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata
/* renamed from: BQ  reason: default package */
/* loaded from: classes2.dex */
public final class BQ implements MethodChannel.MethodCallHandler, FlutterPlugin {
    public Context b;
    public MethodChannel c;

    public static String b(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        Intrinsics.b(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i = 0; i < length; i++) {
            byte b = digest[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b & 255) >>> 4];
            cArr2[i2 + 1] = cArr[b & Ascii.SI];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.b;
                Intrinsics.b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    Intrinsics.checkNotNullExpressionValue(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((Signature) C2215n5.h(apkContentsSigners)).toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    str = b(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    Intrinsics.checkNotNullExpressionValue(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((Signature) C2215n5.h(signingCertificateHistory)).toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
                    str = b(byteArray2);
                }
            } else {
                Context context2 = this.b;
                Intrinsics.b(context2);
                Signature[] signatures = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatures != null && signatures.length != 0) {
                    Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                    if (C2215n5.h(signatures) != null) {
                        byte[] byteArray3 = ((Signature) C2215n5.h(signatures)).toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray3, "toByteArray(...)");
                        str = b(byteArray3);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return str;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.b = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.b = null;
        MethodChannel methodChannel = this.c;
        Intrinsics.b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.c = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        String installerPackageName;
        long j;
        InstallSourceInfo installSourceInfo;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            if (Intrinsics.a(call.method, "getAll")) {
                Context context = this.b;
                Intrinsics.b(context);
                PackageManager packageManager = context.getPackageManager();
                Context context2 = this.b;
                Intrinsics.b(context2);
                PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                String a = a(packageManager);
                Context context3 = this.b;
                Intrinsics.b(context3);
                PackageManager packageManager2 = context3.getPackageManager();
                Context context4 = this.b;
                Intrinsics.b(context4);
                String packageName = context4.getPackageName();
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    installSourceInfo = packageManager2.getInstallSourceInfo(packageName);
                    installerPackageName = installSourceInfo.getInitiatingPackageName();
                } else {
                    installerPackageName = packageManager2.getInstallerPackageName(packageName);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                Context context5 = this.b;
                Intrinsics.b(context5);
                hashMap.put("packageName", context5.getPackageName());
                hashMap.put("version", packageInfo.versionName);
                if (i >= 28) {
                    j = packageInfo.getLongVersionCode();
                } else {
                    j = packageInfo.versionCode;
                }
                hashMap.put("buildNumber", String.valueOf(j));
                if (a != null) {
                    hashMap.put("buildSignature", a);
                }
                if (installerPackageName != null) {
                    hashMap.put("installerStore", installerPackageName);
                }
                result.success(hashMap);
                return;
            }
            result.notImplemented();
        } catch (PackageManager.NameNotFoundException e) {
            result.error("Name not found", e.getMessage(), null);
        }
    }
}
