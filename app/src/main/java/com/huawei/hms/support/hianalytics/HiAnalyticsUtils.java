package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.HiAnalyticsOfCpUtils;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AnalyticsSwitchHolder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class HiAnalyticsUtils {
    private static final Object c = new Object();
    private static final Object d = new Object();
    private static HiAnalyticsUtils e;
    private int a = 0;
    private final boolean b = HianalyticsExist.isHianalyticsExist();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ Map c;

        public a(Context context, String str, Map map) {
            this.a = context;
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent(this.a, this.b, this.c);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        public b(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent2(this.a, this.b, this.c);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ Map c;

        public c(Context context, String str, Map map) {
            this.a = context;
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.a, this.b, this.c);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ Map c;
        final /* synthetic */ int d;

        public d(Context context, String str, Map map, int i) {
            this.a = context;
            this.b = str;
            this.c = map;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.a, this.b, this.c, this.d);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ Map c;

        public e(Context context, String str, Map map) {
            this.a = context;
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.a, this.b, this.c);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ Map c;
        final /* synthetic */ int d;

        public f(Context context, String str, Map map, int i) {
            this.a = context;
            this.b = str;
            this.c = map;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.a, this.b, this.c, this.d);
        }
    }

    private HiAnalyticsUtils() {
    }

    private static LinkedHashMap<String, String> a(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private void b(Context context) {
        synchronized (d) {
            try {
                int i = this.a;
                if (i < 60) {
                    this.a = i + 1;
                } else {
                    this.a = 0;
                    if (!this.b) {
                        HmsHiAnalyticsUtils.onReport();
                    } else {
                        HiAnalyticsOfCpUtils.onReport(context, 0);
                        HiAnalyticsOfCpUtils.onReport(context, 1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c(Context context, String str, Map map) {
        try {
            com.huawei.hms.stats.a.c().a(new e(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("<addOnReportToCache> failed. "), "HiAnalyticsUtils");
        }
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (c) {
            try {
                if (e == null) {
                    e = new HiAnalyticsUtils();
                }
                hiAnalyticsUtils = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void enableLog(Context context) {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (!this.b) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HiAnalyticTools.enableLog(context);
        }
    }

    public boolean getInitFlag() {
        if (!this.b) {
            return HmsHiAnalyticsUtils.getInitFlag();
        }
        return HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public int getOobeAnalyticsState(Context context) {
        if (context == null) {
            return 0;
        }
        int a2 = a(context);
        if (a2 == 1) {
            return a2;
        }
        try {
            Bundle call = context.getApplicationContext().getContentResolver().call(Uri.parse("content://com.huawei.hms.contentprovider"), "getAnalyticsState", (String) null, Kh0.c("hms_cp_bundle_key", "content://com.huawei.hms.contentprovider/com.huawei.hms.privacy.HmsAnalyticsStateProvider"));
            if (call != null) {
                a2 = call.getInt("SWITCH_IS_CHECKED");
                HMSLog.i("HiAnalyticsUtils", "get hms analyticsOobe state " + a2);
                return a2;
            }
            return a2;
        } catch (IllegalArgumentException unused) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState IllegalArgumentException ");
            return a2;
        } catch (SecurityException unused2) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState SecurityException ");
            return a2;
        } catch (Exception unused3) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState Exception ");
            return a2;
        }
    }

    public boolean hasError(Context context) {
        return AnalyticsSwitchHolder.isAnalyticsDisabled(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        onEvent2(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        boolean z;
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (andRefreshAnalyticsState != 2) {
                z = true;
            } else {
                z = false;
            }
            if (a(initFlag, z, map)) {
                a(context, str, map);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.b) {
                    HmsHiAnalyticsUtils.onEvent(0, str, a(map));
                    HmsHiAnalyticsUtils.onEvent(1, str, a(map));
                } else {
                    HiAnalyticsOfCpUtils.onEvent(context, 0, str, a(map));
                    HiAnalyticsOfCpUtils.onEvent(context, 1, str, a(map));
                }
                b(context);
                return;
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onEvent> map or context is null, state: " + andRefreshAnalyticsState);
    }

    public void onEvent2(Context context, String str, String str2) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onEvent2> context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (!initFlag && andRefreshAnalyticsState != 2 && a(str2)) {
            a(context, str, str2);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (!this.b) {
                HmsHiAnalyticsUtils.onEvent(context, str, str2);
            } else {
                HiAnalyticsOfCpUtils.onEvent(context, str, str2);
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (a(initFlag, andRefreshAnalyticsState != 2, map)) {
                b(context, str, map);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.b) {
                    HmsHiAnalyticsUtils.onEvent(0, str, a(map));
                    HmsHiAnalyticsUtils.onEvent(1, str, a(map));
                } else {
                    HiAnalyticsOfCpUtils.onEvent(context, 0, str, a(map));
                    HiAnalyticsOfCpUtils.onEvent(context, 1, str, a(map));
                }
                b(context);
                return;
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onNewEvent> map or context is null, state: " + andRefreshAnalyticsState);
    }

    public void onReport(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (a(initFlag, andRefreshAnalyticsState != 2, map)) {
                c(context, str, map);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.b) {
                    HmsHiAnalyticsUtils.onStreamEvent(0, str, a(map));
                    HmsHiAnalyticsUtils.onStreamEvent(1, str, a(map));
                    return;
                }
                HiAnalyticsOfCpUtils.onStreamEvent(context, 0, str, a(map));
                HiAnalyticsOfCpUtils.onStreamEvent(context, 1, str, a(map));
                return;
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onReport> map or context is null, state: " + andRefreshAnalyticsState);
    }

    public void enableLog() {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (!this.b) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HMSLog.i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        }
    }

    private int a(Context context) {
        int i = 0;
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state");
            HMSLog.i("HiAnalyticsUtils", "getOobeStateForSettings value is " + i);
            return i;
        } catch (Settings.SettingNotFoundException e2) {
            HMSLog.i("HiAnalyticsUtils", "Settings.SettingNotFoundException " + e2.getMessage());
            return i;
        }
    }

    private boolean a(boolean z, boolean z2, Map<?, ?> map) {
        return !z && z2 && b(map);
    }

    private boolean b(Map<?, ?> map) {
        try {
            long j = 0;
            for (Object obj : map.values()) {
                if (obj instanceof String) {
                    j += ((String) obj).getBytes(Charset.forName("UTF-8")).length;
                }
            }
            return j <= 512;
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("<isValidSize map> Exception: "), "HiAnalyticsUtils");
            return false;
        }
    }

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return str.getBytes(Charset.forName("UTF-8")).length <= 512;
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("<isValidSize String> Exception: "), "HiAnalyticsUtils");
            return false;
        }
    }

    public void onReport(Context context, String str, Map map, int i) {
        if (i != 0 && i != 1) {
            HMSLog.e("HiAnalyticsUtils", "<onReport with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (a(initFlag, andRefreshAnalyticsState != 2, map)) {
                b(context, str, map, i);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.b) {
                    HmsHiAnalyticsUtils.onStreamEvent(i, str, a(map));
                    return;
                } else {
                    HiAnalyticsOfCpUtils.onStreamEvent(context, i, str, a(map));
                    return;
                }
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onReport with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    public void onNewEvent(Context context, String str, Map map, int i) {
        if (i != 0 && i != 1) {
            HMSLog.e("HiAnalyticsUtils", "<onNewEvent with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (a(initFlag, andRefreshAnalyticsState != 2, map)) {
                a(context, str, map, i);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.b) {
                    HmsHiAnalyticsUtils.onEvent(i, str, a(map));
                } else {
                    HiAnalyticsOfCpUtils.onEvent(context, i, str, a(map));
                }
                b(context);
                return;
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onNewEvent with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    private void a(Context context, String str, Map<String, String> map) {
        try {
            com.huawei.hms.stats.a.c().a(new a(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("<addOnEventToCache> failed. "), "HiAnalyticsUtils");
        }
    }

    private void b(Context context, String str, Map map) {
        try {
            com.huawei.hms.stats.a.c().a(new c(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("<addOnNewEventToCache> failed. "), "HiAnalyticsUtils");
        }
    }

    private void a(Context context, String str, String str2) {
        try {
            com.huawei.hms.stats.a.c().a(new b(context.getApplicationContext(), str, str2));
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("<addOnEvent2ToCache> Failed. "), "HiAnalyticsUtils");
        }
    }

    private void b(Context context, String str, Map map, int i) {
        try {
            com.huawei.hms.stats.a.c().a(new f(context.getApplicationContext(), str, map, i));
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("<addOnReportToCache with type> failed. "), "HiAnalyticsUtils");
        }
    }

    private void a(Context context, String str, Map map, int i) {
        try {
            com.huawei.hms.stats.a.c().a(new d(context.getApplicationContext(), str, map, i));
        } catch (Throwable th) {
            AbstractC0324Hi.x(th, new StringBuilder("<addOnNewEventToCache with type> failed. "), "HiAnalyticsUtils");
        }
    }
}
