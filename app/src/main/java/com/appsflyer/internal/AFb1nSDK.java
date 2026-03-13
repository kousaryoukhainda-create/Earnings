package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1kSDK;
import com.appsflyer.internal.AFb1eSDK;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class AFb1nSDK implements AFe1vSDK {
    @NotNull
    private final AFb1eSDK AFInAppEventParameterName;
    @NotNull
    private final Context AFInAppEventType;
    @NotNull
    private final AFa1iSDK AFKeystoreWrapper;
    @NotNull
    private final AFb1dSDK AFLogger;
    @NotNull
    private final AFe1wSDK afDebugLog;
    @NotNull
    private final AFa1kSDK afErrorLog;
    @NotNull
    private final AFb1gSDK afInfoLog;
    @NotNull
    private final AFe1mSDK afRDLog;
    @NotNull
    private final AFb1xSDK getLevel;
    @NotNull
    private final AFf1tSDK valueOf;
    @NotNull
    private final AFf1iSDK values;

    public AFb1nSDK() {
    }

    public static Uri AFInAppEventType(Activity activity) {
        Uri referrer;
        if (activity != null && activity.getIntent() != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                referrer = activity.getReferrer();
                return referrer;
            }
            Intent intent = activity.getIntent();
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
            if (uri != null) {
                return uri;
            }
            String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
            if (stringExtra != null) {
                return Uri.parse(stringExtra);
            }
        }
        return null;
    }

    private boolean AFLogger$LogLevel() {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (!appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) && !appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            AFa1eSDK.valueOf();
            if (AFa1eSDK.AFInAppEventParameterName(this.AFInAppEventType)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    @NotNull
    public final String AFInAppEventParameterName() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        double pow = Math.pow(2.0d, 20.0d);
        long blockCountLong = (long) ((statFs.getBlockCountLong() * blockSizeLong) / pow);
        StringBuilder sb = new StringBuilder();
        sb.append((long) ((statFs.getAvailableBlocksLong() * blockSizeLong) / pow));
        sb.append('/');
        sb.append(blockCountLong);
        return sb.toString();
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final String AFKeystoreWrapper() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        return AFa1fSDK.values(this.AFInAppEventType.getApplicationContext().getPackageManager(), this.AFInAppEventType.getApplicationContext().getPackageName());
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final String AFLogger() {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("preInstallName");
        if (string != null) {
            return string;
        }
        String str = null;
        if (this.AFLogger.values("preInstallName")) {
            string = this.AFLogger.values("preInstallName", (String) null);
        } else {
            if (afRDLog()) {
                File values = values(AFInAppEventParameterName("ro.appsflyer.preinstall.path"));
                if (valueOf(values)) {
                    values = values(this.afInfoLog.AFInAppEventType("AF_PRE_INSTALL_PATH"));
                }
                if (valueOf(values)) {
                    values = values("/data/local/tmp/pre_install.appsflyer");
                }
                if (valueOf(values)) {
                    values = values("/etc/pre_install.appsflyer");
                }
                if (!valueOf(values)) {
                    String packageName = this.AFInAppEventType.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "");
                    str = AFInAppEventType(values, packageName);
                }
                if (str == null) {
                    string = this.afInfoLog.AFInAppEventType("AF_PRE_INSTALL_NAME");
                } else {
                    string = str;
                }
            }
            if (string != null) {
                this.AFLogger.AFInAppEventParameterName("preInstallName", string);
            }
        }
        if (string != null) {
            appsFlyerProperties.set("preInstallName", string);
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final boolean afDebugLog() {
        return Boolean.parseBoolean(this.AFLogger.values("sentSuccessfully", (String) null));
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final boolean afErrorLog() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Object systemService = this.AFInAppEventType.getSystemService("connectivity");
                if (systemService != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    Intrinsics.checkNotNullExpressionValue(allNetworks, "");
                    for (Network network : allNetworks) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities != null && networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            } catch (Exception e) {
                AFLogger.afErrorLog("Failed collecting ivc data", e);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while (it.hasNext()) {
                    NetworkInterface networkInterface = (NetworkInterface) it.next();
                    if (networkInterface.isUp()) {
                        String name = networkInterface.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        arrayList.add(name);
                    }
                }
                return arrayList.contains("tun0");
            } catch (Exception e2) {
                AFLogger.afErrorLog("Failed collecting ivc data", e2);
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final String afInfoLog() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            return this.afInfoLog.AFInAppEventType("AF_STORE");
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final boolean afRDLog() {
        if (!this.AFLogger.values("appsFlyerCount")) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final long valueOf() {
        return System.currentTimeMillis();
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final long values() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public AFb1nSDK(Context context, AFf1tSDK aFf1tSDK, AFb1eSDK aFb1eSDK, AFf1iSDK aFf1iSDK, AFa1iSDK aFa1iSDK, AFe1mSDK aFe1mSDK, AFb1dSDK aFb1dSDK, AFb1gSDK aFb1gSDK, AFa1kSDK aFa1kSDK, AFe1wSDK aFe1wSDK, AFb1xSDK aFb1xSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFf1tSDK, "");
        Intrinsics.checkNotNullParameter(aFb1eSDK, "");
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        Intrinsics.checkNotNullParameter(aFa1iSDK, "");
        Intrinsics.checkNotNullParameter(aFe1mSDK, "");
        Intrinsics.checkNotNullParameter(aFb1dSDK, "");
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        Intrinsics.checkNotNullParameter(aFa1kSDK, "");
        Intrinsics.checkNotNullParameter(aFe1wSDK, "");
        Intrinsics.checkNotNullParameter(aFb1xSDK, "");
        this.AFInAppEventType = context;
        this.valueOf = aFf1tSDK;
        this.AFInAppEventParameterName = aFb1eSDK;
        this.values = aFf1iSDK;
        this.AFKeystoreWrapper = aFa1iSDK;
        this.afRDLog = aFe1mSDK;
        this.AFLogger = aFb1dSDK;
        this.afInfoLog = aFb1gSDK;
        this.afErrorLog = aFa1kSDK;
        this.afDebugLog = aFe1wSDK;
        this.getLevel = aFb1xSDK;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void AFKeystoreWrapper(Map<String, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        String AFInAppEventParameterName = this.getLevel.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        map.put("platformextension", AFInAppEventParameterName);
        if (z) {
            map.put("platform_extension_v2", this.valueOf.AFKeystoreWrapper());
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void valueOf(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFe1mSDK aFe1mSDK = this.afRDLog;
        HashMap hashMap = new HashMap(aFe1mSDK.AFKeystoreWrapper);
        aFe1mSDK.AFKeystoreWrapper.clear();
        this.afRDLog.valueOf.AFInAppEventType("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            return;
        }
        Map<String, Object> values = AFa1eSDK.values(map);
        Intrinsics.checkNotNullExpressionValue(values, "");
        values.put("gcd", hashMap);
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void values(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final String values(SimpleDateFormat simpleDateFormat) {
        String str = "";
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String values = this.AFLogger.values("appsFlyerFirstInstall", (String) null);
        if (values == null) {
            if (afRDLog()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            }
            this.AFLogger.AFInAppEventParameterName("appsFlyerFirstInstall", str);
            values = str;
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(values)));
        return values;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void AFInAppEventParameterName(Map<String, Object> map) {
        String str = "";
        Intrinsics.checkNotNullParameter(map, "");
        Object systemService = this.AFInAppEventType.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            return;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 0) {
            str = "p";
        } else if (rotation == 1) {
            str = "l";
        } else if (rotation == 2) {
            str = "pr";
        } else if (rotation == 3) {
            str = "lr";
        }
        map.put("sc_o", str);
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void AFInAppEventType(boolean z, Map<String, Object> map, int i) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFInAppEventParameterName("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFInAppEventParameterName("ro.product.cpu.abi2"));
        hashMap.put("arch", AFInAppEventParameterName("os.arch"));
        hashMap.put("build_display_id", AFInAppEventParameterName("ro.build.display.id"));
        if (z) {
            AFb1eSDK.AFa1ySDK AFInAppEventType = this.AFInAppEventParameterName.AFInAppEventType(this.AFInAppEventType);
            float f = AFInAppEventType.AFInAppEventParameterName;
            String str = AFInAppEventType.AFInAppEventType;
            hashMap.put("btl", String.valueOf(f));
            if (str != null) {
                hashMap.put("btch", str);
            }
            if (i <= 2) {
                hashMap.putAll(this.values.valueOf());
            }
        }
        hashMap.put("dim", this.AFKeystoreWrapper.valueOf(this.AFInAppEventType));
        map.put("deviceData", hashMap);
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void valueOf(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String values = this.AFLogger.values("prev_event_name", (String) null);
            if (values != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.AFLogger.valueOf("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", values);
                map.put("prev_event", jSONObject);
            }
            this.AFLogger.AFInAppEventParameterName("prev_event_name", str);
            this.AFLogger.AFInAppEventParameterName("prev_event_timestamp", System.currentTimeMillis());
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        if (r9 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1vSDK
    @android.annotation.SuppressLint({"HardwareIds"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void values(java.util.Map<java.lang.String, java.lang.Object> r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "use cached AndroidId: "
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r3 = "deviceTrackingDisabled"
            r4 = 0
            boolean r5 = r2.getBoolean(r3, r4)
            if (r5 == 0) goto L1a
            java.lang.String r9 = "true"
            r8.put(r3, r9)
            return
        L1a:
            com.appsflyer.internal.AFe1wSDK r3 = r7.afDebugLog
            com.appsflyer.internal.AFb1dSDK r5 = r7.AFLogger
            java.lang.String r3 = r3.valueOf(r5)
            if (r3 == 0) goto L30
            int r5 = r3.length()
            if (r5 != 0) goto L2b
            goto L30
        L2b:
            java.lang.String r5 = "imei"
            r8.put(r5, r3)
        L30:
            java.lang.String r3 = "collectAndroidId"
            boolean r2 = r2.getBoolean(r3, r4)
            com.appsflyer.internal.AFb1dSDK r3 = r7.AFLogger
            java.lang.String r4 = "androidIdCached"
            r5 = 0
            java.lang.String r3 = r3.values(r4, r5)
            java.lang.String r6 = "android_id"
            if (r2 == 0) goto L7d
            if (r9 == 0) goto L4b
            int r2 = r9.length()
            if (r2 != 0) goto L7d
        L4b:
            boolean r9 = r7.AFLogger$LogLevel()
            if (r9 == 0) goto L80
            android.content.Context r9 = r7.AFInAppEventType     // Catch: java.lang.Exception -> L69
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Exception -> L69
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r6)     // Catch: java.lang.Exception -> L69
            if (r9 == 0) goto L5e
            goto L81
        L5e:
            if (r3 == 0) goto L80
            java.lang.String r9 = r0.concat(r3)     // Catch: java.lang.Exception -> L69
            com.appsflyer.AFLogger.afDebugLog(r9)     // Catch: java.lang.Exception -> L69
        L67:
            r9 = r3
            goto L81
        L69:
            r9 = move-exception
            if (r3 == 0) goto L74
            java.lang.String r0 = r0.concat(r3)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L75
        L74:
            r3 = r5
        L75:
            java.lang.String r0 = r9.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r9)
            goto L67
        L7d:
            if (r9 == 0) goto L80
            goto L81
        L80:
            r9 = r5
        L81:
            if (r9 == 0) goto L8c
            com.appsflyer.internal.AFb1dSDK r0 = r7.AFLogger
            r0.AFInAppEventParameterName(r4, r9)
            r8.put(r6, r9)
            goto L91
        L8c:
            java.lang.String r9 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r9)
        L91:
            android.content.Context r9 = r7.AFInAppEventType
            com.appsflyer.internal.AFc1uSDK$AFa1wSDK r9 = com.appsflyer.internal.AFa1cSDK.values(r9)
            if (r9 == 0) goto Lc0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Boolean r2 = r9.values
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.lang.String r3 = "isManual"
            r0.put(r3, r2)
            java.lang.String r2 = r9.valueOf
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.lang.String r1 = "val"
            r0.put(r1, r2)
            java.lang.Boolean r9 = r9.AFInAppEventType
            if (r9 == 0) goto Lbb
            java.lang.String r1 = "isLat"
            r0.put(r1, r9)
        Lbb:
            java.lang.String r9 = "oaid"
            r8.put(r9, r0)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1nSDK.values(java.util.Map, java.lang.String):void");
    }

    @SuppressLint({"PrivateApi"})
    private static String AFInAppEventParameterName(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static boolean valueOf(File file) {
        return file == null || !file.exists();
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final String AFInAppEventType() {
        String str = null;
        if (this.AFLogger.values("INSTALL_STORE")) {
            return this.AFLogger.values("INSTALL_STORE", (String) null);
        }
        if (afRDLog()) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string == null) {
                string = this.afInfoLog.AFInAppEventType("AF_STORE");
            }
            str = string;
        }
        this.AFLogger.AFInAppEventParameterName("INSTALL_STORE", str);
        return str;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void AFInAppEventType(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
        AFa1kSDK.AFa1zSDK AFInAppEventParameterName = this.afErrorLog.AFInAppEventParameterName(this.AFInAppEventType);
        String str = AFInAppEventParameterName.AFInAppEventParameterName;
        Intrinsics.checkNotNullExpressionValue(str, "");
        map.put("network", str);
        if (z) {
            return;
        }
        String str2 = AFInAppEventParameterName.valueOf;
        if (str2 != null) {
            map.put("operator", str2);
        }
        String str3 = AFInAppEventParameterName.AFInAppEventType;
        if (str3 != null) {
            map.put("carrier", str3);
        }
    }

    private static String AFInAppEventType(File file, String str) {
        InputStreamReader inputStreamReader;
        try {
            try {
                if (file == null) {
                    return null;
                }
                try {
                    Properties properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                        }
                        return property;
                    } catch (FileNotFoundException unused) {
                        StringBuilder sb = new StringBuilder("PreInstall file wasn't found: ");
                        sb.append(file.getAbsolutePath());
                        AFLogger.afDebugLog(sb.toString());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
            } catch (Throwable th4) {
                AFLogger.afErrorLog(th4.getMessage(), th4);
            }
        } catch (Throwable th5) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    private static File values(String str) {
        if (str != null) {
            try {
                if (kotlin.text.d.K(str).toString().length() > 0) {
                    return new File(kotlin.text.d.K(str).toString());
                }
                return null;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
                return null;
            }
        }
        return null;
    }
}
