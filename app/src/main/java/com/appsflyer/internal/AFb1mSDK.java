package com.appsflyer.internal;

import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class AFb1mSDK extends AFe1jSDK {
    private static String AFLogger$LogLevel = "https://%sdlsdk.%s/v1.0/android/";
    private final AFe1mSDK AFVersionDeclaration;
    private final ExecutorService AppsFlyer2dXConversionCallback;
    private final CountDownLatch afWarnLog;
    private final List<AFf1pSDK> getLevel;
    private final AFe1wSDK init;
    private final AFb1tSDK onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private boolean onConversionDataSuccess;
    private final AFb1sSDK onDeepLinkingNative;
    private final AFb1gSDK onInstallConversionDataLoadedNative;
    private final AFf1oSDK onInstallConversionFailureNative;
    private int onResponseErrorNative;
    private int onResponseNative;

    /* renamed from: com.appsflyer.internal.AFb1mSDK$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFf1pSDK.AFa1zSDK.values().length];
            values = iArr;
            try {
                iArr[AFf1pSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AFf1pSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFb1mSDK(AFc1xSDK aFc1xSDK) {
        super(null, AFLogger$LogLevel, Boolean.FALSE, Boolean.TRUE, null);
        this.getLevel = new ArrayList();
        this.afWarnLog = new CountDownLatch(1);
        this.AFVersionDeclaration = aFc1xSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.AFInAppEventParameterName();
        this.init = aFc1xSDK.afWarnLog();
        this.onInstallConversionFailureNative = aFc1xSDK.AFLogger$LogLevel();
        this.AppsFlyer2dXConversionCallback = aFc1xSDK.AFInAppEventType();
        this.onAppOpenAttributionNative = aFc1xSDK.afErrorLogForExcManagerOnly();
        this.onDeepLinkingNative = aFc1xSDK.AppsFlyer2dXConversionCallback();
    }

    private static boolean AFInAppEventParameterName(AFf1pSDK aFf1pSDK) {
        Long l = (Long) aFf1pSDK.AFInAppEventParameterName.get("click_ts");
        if (l == null || System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) >= TimeUnit.DAYS.toMillis(1L)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFLogger$LogLevel() {
        String[] strArr;
        boolean z = true;
        this.onResponseNative++;
        StringBuilder sb = new StringBuilder("[DDL] Preparing request ");
        sb.append(this.onResponseNative);
        AFLogger.afDebugLog(sb.toString());
        if (this.onResponseNative == 1) {
            AFa1eSDK valueOf = AFa1eSDK.valueOf();
            Map<String, Object> map = this.AFKeystoreWrapper;
            if (this.onInstallConversionDataLoadedNative.AFInAppEventType.values("appsFlyerCount", 0) != 0) {
                z = false;
            }
            map.put("is_first", Boolean.valueOf(z));
            Map<String, Object> map2 = this.AFKeystoreWrapper;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("-");
            sb2.append(Locale.getDefault().getCountry());
            map2.put("lang", sb2.toString());
            this.AFKeystoreWrapper.put("os", Build.VERSION.RELEASE);
            this.AFKeystoreWrapper.put("type", Build.MODEL);
            Map<String, Object> map3 = this.AFKeystoreWrapper;
            AFb1gSDK aFb1gSDK = this.onInstallConversionDataLoadedNative;
            map3.put("request_id", AFb1zSDK.valueOf(aFb1gSDK.valueOf, aFb1gSDK.AFInAppEventType));
            AFa1cSDK aFa1cSDK = valueOf.afInfoLog;
            if (aFa1cSDK != null && (strArr = aFa1cSDK.AFInAppEventType) != null) {
                this.AFKeystoreWrapper.put("sharing_filter", strArr);
            }
            Map<String, Object> values = values(AFa1cSDK.values(this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType, new HashMap()));
            Map<String, Object> values2 = values(AFa1cSDK.values(this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType));
            if (values != null) {
                this.AFKeystoreWrapper.put("gaid", values);
            }
            if (values2 != null) {
                this.AFKeystoreWrapper.put("oaid", values2);
            }
        }
        Map<String, Object> map4 = this.AFKeystoreWrapper;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        map4.put(Constants.TIMESTAMP, simpleDateFormat.format(new Date(currentTimeMillis)));
        this.AFKeystoreWrapper.put("request_count", Integer.valueOf(this.onResponseNative));
        ArrayList arrayList = new ArrayList();
        for (AFf1pSDK aFf1pSDK : this.getLevel) {
            Map<String, String> valueOf2 = valueOf(aFf1pSDK);
            if (valueOf2 != null) {
                arrayList.add(valueOf2);
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFKeystoreWrapper.put("referrers", arrayList);
        }
        AFKeystoreWrapper(AppsFlyer2dXConversionCallback());
    }

    private String AppsFlyer2dXConversionCallback() {
        String str;
        String str2 = this.init.AFInAppEventParameterName;
        String packageName = this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType.getPackageName();
        String values = this.onInstallConversionDataLoadedNative.values();
        if (values != null && !values.trim().isEmpty()) {
            str = "-".concat(values);
        } else {
            str = "";
        }
        Uri.Builder buildUpon = Uri.parse(String.format(AFLogger$LogLevel, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName())).buildUpon();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(str);
        Uri.Builder appendPath = buildUpon.appendPath(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.AFKeystoreWrapper.get(Constants.TIMESTAMP));
        sb2.append(str2);
        return appendPath.appendQueryParameter("af_sig", AFc1nSDK.valueOf(sb2.toString(), str2)).appendQueryParameter(HianalyticsBaseData.SDK_VERSION, AFa1eSDK.AFKeystoreWrapper).build().toString();
    }

    private boolean afWarnLog() {
        int i;
        List list = (List) this.AFKeystoreWrapper.get("referrers");
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i >= this.onAttributionFailureNative || this.AFKeystoreWrapper.containsKey("referrers")) {
            return false;
        }
        return true;
    }

    private static Map<String, String> valueOf(AFf1pSDK aFf1pSDK) {
        if (aFf1pSDK.afDebugLog == AFf1pSDK.AFa1zSDK.FINISHED) {
            HashMap hashMap = new HashMap();
            String str = (String) aFf1pSDK.AFInAppEventParameterName.get("referrer");
            if (str != null) {
                hashMap.put("source", (String) aFf1pSDK.AFInAppEventParameterName.get("source"));
                hashMap.put("value", str);
                return hashMap;
            }
            return null;
        }
        return null;
    }

    private Map<String, Object> values(final AFc1uSDK.AFa1wSDK aFa1wSDK) {
        if (aFa1wSDK != null && aFa1wSDK.valueOf != null) {
            Boolean bool = aFa1wSDK.AFInAppEventType;
            if (bool == null || !bool.booleanValue()) {
                return new HashMap<String, Object>() { // from class: com.appsflyer.internal.AFb1mSDK.2
                    {
                        put("type", "unhashed");
                        put("value", aFa1wSDK.valueOf);
                    }
                };
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.deeplink.DeepLinkResult AFLogger() {
        /*
            r5 = this;
            java.lang.String r0 = "[DDL] start"
            com.appsflyer.AFLogger.afDebugLog(r0)
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            com.appsflyer.internal.AFb1mSDK$4 r1 = new com.appsflyer.internal.AFb1mSDK$4
            r1.<init>()
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r1 = r5.AppsFlyer2dXConversionCallback
            r1.execute(r0)
            r1 = 0
            com.appsflyer.internal.AFb1sSDK r2 = r5.onDeepLinkingNative     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            long r2 = r2.afInfoLog     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            java.lang.Object r0 = r0.get(r2, r4)     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            com.appsflyer.deeplink.DeepLinkResult r0 = (com.appsflyer.deeplink.DeepLinkResult) r0     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            com.appsflyer.internal.AFe1mSDK r2 = r5.AFVersionDeclaration     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            com.appsflyer.internal.AFb1sSDK r3 = r5.onDeepLinkingNative     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            long r3 = r3.afInfoLog     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            r2.values(r0, r3)     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            com.appsflyer.internal.AFb1sSDK r2 = r5.onDeepLinkingNative     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            r2.AFInAppEventType(r0)     // Catch: java.util.concurrent.TimeoutException -> L30 java.lang.InterruptedException -> L32 java.util.concurrent.ExecutionException -> L34
            return r0
        L30:
            r0 = move-exception
            goto L36
        L32:
            r0 = move-exception
            goto L75
        L34:
            r0 = move-exception
            goto L75
        L36:
            java.lang.String r2 = "[DDL] Timeout"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[DDL] Timeout, didn't manage to find deferred deep link after "
            r0.<init>(r2)
            int r2 = r5.onResponseNative
            r0.append(r2)
            java.lang.String r2 = " attempt(s) within "
            r0.append(r2)
            com.appsflyer.internal.AFb1sSDK r2 = r5.onDeepLinkingNative
            long r2 = r2.afInfoLog
            r0.append(r2)
            java.lang.String r2 = " milliseconds"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afDebugLog(r0)
            com.appsflyer.deeplink.DeepLinkResult r0 = new com.appsflyer.deeplink.DeepLinkResult
            com.appsflyer.deeplink.DeepLinkResult$Error r2 = com.appsflyer.deeplink.DeepLinkResult.Error.TIMEOUT
            r0.<init>(r1, r2)
            com.appsflyer.internal.AFe1mSDK r1 = r5.AFVersionDeclaration
            com.appsflyer.internal.AFb1sSDK r2 = r5.onDeepLinkingNative
            long r2 = r2.afInfoLog
            r1.values(r0, r2)
            com.appsflyer.internal.AFb1sSDK r1 = r5.onDeepLinkingNative
            r1.AFInAppEventType(r0)
            goto L9c
        L75:
            java.lang.String r2 = "[DDL] Error occurred"
            r3 = 1
            com.appsflyer.AFLogger.afErrorLog(r2, r0, r3)
            com.appsflyer.deeplink.DeepLinkResult r2 = new com.appsflyer.deeplink.DeepLinkResult
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L88
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            goto L8a
        L88:
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.UNEXPECTED
        L8a:
            r2.<init>(r1, r0)
            com.appsflyer.internal.AFe1mSDK r0 = r5.AFVersionDeclaration
            com.appsflyer.internal.AFb1sSDK r1 = r5.onDeepLinkingNative
            long r3 = r1.afInfoLog
            r0.values(r2, r3)
            com.appsflyer.internal.AFb1sSDK r0 = r5.onDeepLinkingNative
            r0.AFInAppEventType(r2)
            r0 = r2
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1mSDK.AFLogger():com.appsflyer.deeplink.DeepLinkResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFKeystoreWrapper(AFf1pSDK aFf1pSDK) {
        if (AFInAppEventParameterName(aFf1pSDK)) {
            this.getLevel.add(aFf1pSDK);
            this.afWarnLog.countDown();
            AFLogger.afDebugLog("[DDL] Added non-organic ".concat(aFf1pSDK.getClass().getSimpleName()));
            return;
        }
        int i = this.onResponseErrorNative + 1;
        this.onResponseErrorNative = i;
        if (i == this.onAttributionFailureNative) {
            this.afWarnLog.countDown();
        }
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.DLSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.appsflyer.deeplink.DeepLinkResult AFInAppEventType(com.appsflyer.internal.AFb1mSDK r13) throws java.io.IOException, org.json.JSONException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1mSDK.AFInAppEventType(com.appsflyer.internal.AFb1mSDK):com.appsflyer.deeplink.DeepLinkResult");
    }

    public static /* synthetic */ void valueOf(AFb1mSDK aFb1mSDK) {
        AFf1pSDK[] valueOf;
        ArrayList arrayList = new ArrayList();
        for (AFf1pSDK aFf1pSDK : aFb1mSDK.onInstallConversionFailureNative.valueOf()) {
            if (aFf1pSDK != null && aFf1pSDK.afDebugLog != AFf1pSDK.AFa1zSDK.NOT_STARTED) {
                arrayList.add(aFf1pSDK);
            }
        }
        aFb1mSDK.onAttributionFailureNative = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final AFf1pSDK aFf1pSDK2 = (AFf1pSDK) it.next();
            int i = AnonymousClass1.values[aFf1pSDK2.afDebugLog.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(aFf1pSDK2.AFInAppEventParameterName.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.afDebugLog(sb.toString());
                aFb1mSDK.AFKeystoreWrapper(aFf1pSDK2);
            } else if (i == 2) {
                aFf1pSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.AFb1mSDK.3
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb2 = new StringBuilder("[DDL] ");
                        sb2.append(aFf1pSDK2.AFInAppEventParameterName.get("source"));
                        sb2.append(" referrer collected via observer");
                        AFLogger.afDebugLog(sb2.toString());
                        AFb1mSDK.this.AFKeystoreWrapper((AFf1pSDK) observable);
                    }
                });
            }
        }
    }
}
