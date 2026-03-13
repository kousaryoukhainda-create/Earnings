package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.AppsFlyerProperties;
import com.fyber.fairbid.sdk.session.UserSessionStorage;
import com.google.android.gms.tagmanager.DataLayer;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: C20  reason: default package */
/* loaded from: classes2.dex */
public class C20 implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {
    public static Context f;
    public static int g;
    public static Map h;
    public static C2407pK i;
    public static C2468q20 j;
    public static String[][] k;
    public MethodChannel b;
    public Intent c;
    public final Handler d = new Handler(Looper.getMainLooper());

    public static void a(MethodChannel.Result result) {
        HashMap hashMap;
        try {
        } catch (Throwable th) {
            AbstractC2382p20.a.c(Ka0.c(th));
        }
        if (AbstractC2382p20.c()) {
            hashMap = AbstractC2382p20.b.g;
            result.success(hashMap);
        }
        hashMap = null;
        result.success(hashMap);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.c = activityPluginBinding.getActivity().getIntent();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "singular-api");
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(this);
        f = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.b = null;
        }
        f = null;
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [r20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v54 */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        boolean z;
        Boolean valueOf;
        ?? r1;
        String[][] strArr;
        int hashCode;
        String[][] strArr2;
        int i2;
        int i3;
        boolean z2;
        String str = methodCall.method;
        str.getClass();
        C2741tB c2741tB = C2811u20.o;
        char c = 65535;
        switch (str.hashCode()) {
            case -1982405460:
                if (str.equals("getGlobalProperties")) {
                    c = 0;
                    break;
                }
                break;
            case -1522679041:
                if (str.equals("setLimitAdvertisingIdentifiers")) {
                    c = 1;
                    break;
                }
                break;
            case -1382205811:
                if (str.equals("getLimitDataSharing")) {
                    c = 2;
                    break;
                }
                break;
            case -1317530993:
                if (str.equals("setDeviceCustomUserId")) {
                    c = 3;
                    break;
                }
                break;
            case -1313989991:
                if (str.equals("setCustomUserId")) {
                    c = 4;
                    break;
                }
                break;
            case -891119105:
                if (str.equals("isAllTrackingStopped")) {
                    c = 5;
                    break;
                }
                break;
            case -827741991:
                if (str.equals("registerDeviceTokenForUninstall")) {
                    c = 6;
                    break;
                }
                break;
            case -766231133:
                if (str.equals("clearGlobalProperties")) {
                    c = 7;
                    break;
                }
                break;
            case -763380469:
                if (str.equals("resumeAllTracking")) {
                    c = '\b';
                    break;
                }
                break;
            case -434716605:
                if (str.equals("trackingUnder13")) {
                    c = '\t';
                    break;
                }
                break;
            case -426967519:
                if (str.equals("unsetGlobalProperty")) {
                    c = '\n';
                    break;
                }
                break;
            case -67364965:
                if (str.equals("createReferrerShortLink")) {
                    c = 11;
                    break;
                }
                break;
            case 96784151:
                if (str.equals("limitDataSharing")) {
                    c = '\f';
                    break;
                }
                break;
            case 96891546:
                if (str.equals(DataLayer.EVENT_KEY)) {
                    c = '\r';
                    break;
                }
                break;
            case 109757538:
                if (str.equals(UserSessionStorage.START)) {
                    c = 14;
                    break;
                }
                break;
            case 354846749:
                if (str.equals("setWrapperNameAndVersion")) {
                    c = 15;
                    break;
                }
                break;
            case 540158728:
                if (str.equals("customRevenueWithAttributes")) {
                    c = 16;
                    break;
                }
                break;
            case 941143574:
                if (str.equals("stopAllTracking")) {
                    c = 17;
                    break;
                }
                break;
            case 1444855677:
                if (str.equals("eventWithArgs")) {
                    c = 18;
                    break;
                }
                break;
            case 1723687617:
                if (str.equals("trackingOptIn")) {
                    c = 19;
                    break;
                }
                break;
            case 1895770010:
                if (str.equals("setGlobalProperty")) {
                    c = 20;
                    break;
                }
                break;
            case 2021381333:
                if (str.equals("setFCMDeviceToken")) {
                    c = 21;
                    break;
                }
                break;
            case 2080237280:
                if (str.equals("unsetCustomUserId")) {
                    c = 22;
                    break;
                }
                break;
            case 2117255019:
                if (str.equals("customRevenue")) {
                    c = 23;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                a(result);
                return;
            case 1:
                Boolean bool = (Boolean) methodCall.argument("limitAdvertisingIdentifiers");
                boolean booleanValue = bool.booleanValue();
                if (!AbstractC2382p20.c()) {
                    AbstractC2382p20.a.a("setLimitAdvertisingIdentifiers: Singular SDK not initialized yet, ignoring. use SingularConfig instead.");
                    return;
                }
                C2811u20 c2811u20 = AbstractC2382p20.b;
                c2811u20.getClass();
                try {
                    C2811u20 c2811u202 = C2811u20.q;
                    if (c2811u202 == null) {
                        c2741tB.a("setLimitAdvertisingIdentifiers: instance null, returning.");
                    } else {
                        C2468q20 c2468q20 = c2811u20.d;
                        if (c2468q20 == null) {
                            c2741tB.a("setLimitAdvertisingIdentifiers: config null, returning.");
                        } else {
                            c2468q20.u = bool;
                            C2021kp c2021kp = c2811u202.f;
                            if (c2021kp == null) {
                                c2741tB.a("setLimitAdvertisingIdentifiers: deviceInfo null, returning.");
                            } else if (booleanValue) {
                                c2021kp.b = null;
                                c2021kp.a = null;
                                c2021kp.c = null;
                            } else if (c2811u202.a != null) {
                                c2811u20.g(new RunnableC1138cr(2));
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    c2741tB.a("setLimitAdvertisingIdentifiers failed with exception: " + Ka0.c(th));
                    return;
                }
            case 2:
                if (AbstractC2382p20.c()) {
                    SharedPreferences b = AbstractC2382p20.b.b();
                    if (b.contains("limit_data_sharing")) {
                        z = false;
                        valueOf = Boolean.valueOf(b.getBoolean("limit_data_sharing", false));
                    } else {
                        z = false;
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        z = valueOf.booleanValue();
                    }
                } else {
                    z = false;
                }
                result.success(Boolean.valueOf(z));
                return;
            case 3:
                String str2 = (String) methodCall.argument("customUserId");
                try {
                    if (AbstractC2382p20.c()) {
                        if (AbstractC2382p20.c()) {
                            AbstractC2382p20.b.h(str2);
                        }
                        C2811u20 c2811u203 = AbstractC2382p20.b;
                        if (c2811u203.b().getBoolean("stop_all_tracking", false)) {
                            c2741tB.a("Tracking was stopped! not logging event!");
                            return;
                        } else {
                            c2811u203.g(new RunnableC1138cr(1));
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    AbstractC2382p20.a.c(Ka0.c(th2));
                    return;
                }
            case 4:
                String str3 = (String) methodCall.argument("customUserId");
                try {
                    if (AbstractC2382p20.c()) {
                        AbstractC2382p20.b.h(str3);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    AbstractC2382p20.a.c(Ka0.c(th3));
                    return;
                }
            case 5:
                result.success(Boolean.valueOf(!AbstractC2382p20.c() ? false : AbstractC2382p20.b.b().getBoolean("stop_all_tracking", false)));
                return;
            case 6:
                AbstractC2382p20.d((String) methodCall.argument("deviceToken"));
                return;
            case 7:
                try {
                    if (AbstractC2382p20.c()) {
                        C2811u20 c2811u204 = AbstractC2382p20.b;
                        c2811u204.g = null;
                        c2811u204.i();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    AbstractC2382p20.a.c(Ka0.c(th4));
                    return;
                }
            case '\b':
                if (AbstractC2382p20.c()) {
                    C2811u20 c2811u205 = AbstractC2382p20.b;
                    c2811u205.getClass();
                    c2811u205.g(new RunnableC2725t20(c2811u205, false));
                    return;
                }
                return;
            case '\t':
                if (AbstractC2382p20.c()) {
                    C2811u20 c2811u206 = AbstractC2382p20.b;
                    c2811u206.getClass();
                    c2811u206.g(new RunnableC2639s20(c2811u206, c2811u206, 1));
                    return;
                }
                return;
            case '\n':
                String str4 = (String) methodCall.argument(Constants.KEY);
                C2741tB c2741tB2 = AbstractC2382p20.a;
                if (Ka0.m(str4)) {
                    return;
                }
                try {
                    if (AbstractC2382p20.c()) {
                        C2811u20 c2811u207 = AbstractC2382p20.b;
                        c2811u207.getClass();
                        if (!Ka0.m(str4) && c2811u207.g.containsKey(str4)) {
                            c2811u207.g.remove(str4);
                            c2811u207.i();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    AbstractC2382p20.a.c(Ka0.c(th5));
                    return;
                }
            case 11:
                String str5 = (String) methodCall.argument("baseLink");
                String str6 = (String) methodCall.argument("referrerName");
                String str7 = (String) methodCall.argument("referrerId");
                JSONObject jSONObject = new JSONObject((Map) methodCall.argument("args"));
                B20 b20 = new B20(this);
                if (AbstractC2382p20.c()) {
                    AbstractC2382p20.b.getClass();
                    C2741tB c2741tB3 = AbstractC2933vV.a;
                    try {
                        URL url = new URL(str5);
                        if (url.getProtocol() == null || url.getProtocol().trim().equals("") || url.getHost() == null || url.getHost().trim().equals("")) {
                            c2741tB3.a("ReferrerLinksService - Invalid url foramt: " + str5);
                        } else if (str6 != null && str6.length() > 256) {
                            c2741tB3.a("ReferrerLinksService - refName exceeds size");
                        } else if (str7 != null && str7.length() > 256) {
                            c2741tB3.a("ReferrerLinksService - refId exceeds size");
                        } else {
                            try {
                                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                if (str6 != null) {
                                    jSONObject2.put("referring_user_name", str6);
                                    str5 = AbstractC2933vV.b(str5, "referring_user_name", str6);
                                }
                                if (str7 != null) {
                                    jSONObject2.put("referring_user_id", str7);
                                    str5 = AbstractC2933vV.b(str5, "referring_user_id", str7);
                                }
                                String jSONObject3 = jSONObject2.toString();
                                if (jSONObject3.length() > 0) {
                                    str5 = AbstractC2933vV.b(str5, "_p", jSONObject3);
                                }
                                try {
                                    String str8 = "?a=" + C2811u20.q.d.a;
                                    String str9 = "https://sdk-api-v1.singular.net/api/v1/shorten_link" + (str8 + "&h=" + Ka0.r(str8, C2811u20.q.d.b));
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("long_link", str5);
                                    Executors.newSingleThreadExecutor().execute(new N3(str9, hashMap, b20));
                                    return;
                                } catch (Throwable th6) {
                                    AbstractC2933vV.a.b("Error: ", th6.getMessage());
                                    b20.a("Error sending request");
                                    return;
                                }
                            } catch (JSONException e) {
                                c2741tB.d("Error in JSON parsing ", e);
                                b20.a("Error sending request: could not unify params");
                                return;
                            }
                        }
                    } catch (MalformedURLException e2) {
                        c2741tB3.d("Error in forming URL ", e2);
                    }
                    b20.a("Error sending request: could not validate request params");
                    return;
                }
                return;
            case '\f':
                boolean booleanValue2 = ((Boolean) methodCall.argument("limitDataSharing")).booleanValue();
                if (AbstractC2382p20.c()) {
                    SharedPreferences.Editor edit = AbstractC2382p20.b.b().edit();
                    edit.putBoolean("limit_data_sharing", booleanValue2);
                    edit.commit();
                    return;
                }
                return;
            case '\r':
                String str10 = (String) methodCall.argument(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME);
                C2741tB c2741tB4 = AbstractC2382p20.a;
                try {
                    if (AbstractC2382p20.c()) {
                        if (Ka0.m(str10)) {
                            c2741tB4.c("Event name can not be null or empty");
                        } else {
                            AbstractC2382p20.b.f(str10, null);
                        }
                    }
                    return;
                } catch (Throwable th7) {
                    c2741tB4.c(Ka0.c(th7));
                    return;
                }
            case 14:
                Map map = (Map) methodCall.arguments;
                h = map;
                if (map != null) {
                    boolean booleanValue3 = ((Boolean) h.get(AppsFlyerProperties.COLLECT_OAID)).booleanValue();
                    boolean booleanValue4 = ((Boolean) h.get("enableLogging")).booleanValue();
                    boolean booleanValue5 = ((Boolean) h.get("limitAdvertisingIdentifiers")).booleanValue();
                    double doubleValue = ((Double) h.get("shortLinkResolveTimeOut")).doubleValue();
                    j = new C2468q20((String) map.get("apiKey"), (String) h.get("secretKey"));
                    String str11 = (String) h.get("customUserId");
                    if (str11 != null) {
                        j.e = str11;
                    }
                    if (booleanValue3) {
                        r1 = 1;
                        j.g = true;
                    } else {
                        r1 = 1;
                    }
                    if (booleanValue4) {
                        j.j = r1;
                    }
                    if (booleanValue5) {
                        j.u = Boolean.TRUE;
                    }
                    try {
                        int intValue = ((Integer) h.get("logLevel")).intValue();
                        if (intValue >= 0) {
                            j.k = intValue;
                        }
                    } catch (Throwable unused) {
                    }
                    double doubleValue2 = ((Double) h.get("sessionTimeout")).doubleValue();
                    if (doubleValue2 >= 0.0d) {
                        j.i = (long) doubleValue2;
                    }
                    Object obj = h.get("limitDataSharing");
                    if (obj != null) {
                        j.t = (Boolean) obj;
                    }
                    String str12 = (String) h.get("imei");
                    if (str12 != null) {
                        j.f = str12;
                    }
                    String str13 = (String) h.get("facebookAppId");
                    if (str13 != null) {
                        j.c = str13;
                    }
                    try {
                        ArrayList arrayList = (ArrayList) h.get("espDomains");
                        if (arrayList != null && arrayList.size() > 0) {
                            j.r = arrayList;
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        ArrayList arrayList2 = (ArrayList) h.get("brandedDomains");
                        if (arrayList2 != null && arrayList2.size() > 0) {
                            j.s = arrayList2;
                        }
                    } catch (Throwable unused3) {
                    }
                    try {
                        ArrayList arrayList3 = (ArrayList) h.get("globalProperties");
                        if (arrayList3 != null) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                Map map2 = (Map) it.next();
                                String str14 = (String) map2.get(Constants.KEY);
                                String str15 = (String) map2.get("value");
                                boolean booleanValue6 = ((Boolean) map2.get("overrideExisting")).booleanValue();
                                C2468q20 c2468q202 = j;
                                if (c2468q202.h.size() < 5) {
                                    ?? obj2 = new Object();
                                    obj2.a = str14;
                                    obj2.b = str15;
                                    obj2.c = booleanValue6;
                                    if (str14.length() > 200) {
                                        i2 = 0;
                                        obj2.a = str14.substring(0, 200);
                                    } else {
                                        i2 = 0;
                                    }
                                    if (str15.length() > 200) {
                                        obj2.b = str15.substring(i2, 200);
                                    }
                                    c2468q202.h.put(obj2.a, obj2);
                                }
                            }
                        }
                    } catch (Throwable unused4) {
                    }
                    i = new C2407pK(this, 11);
                    List list = (List) h.get("pushNotificationsLinkPaths");
                    if (list == null || list.isEmpty()) {
                        strArr = null;
                    } else {
                        strArr = new String[list.size()];
                        for (int i4 = 0; i4 < list.size(); i4 += r1) {
                            strArr[i4] = (String[]) ((List) list.get(i4)).toArray(new String[0]);
                        }
                    }
                    k = strArr;
                    Intent intent = this.c;
                    if (intent != null && (hashCode = intent.hashCode()) != g) {
                        g = hashCode;
                        if (this.c.getExtras() != null && this.c.getExtras().size() > 0 && (strArr2 = k) != null && strArr2.length > 0) {
                            C2468q20 c2468q203 = j;
                            c2468q203.x = this.c;
                            c2468q203.y = strArr2;
                        }
                        C2468q20 c2468q204 = j;
                        Intent intent2 = this.c;
                        C2407pK c2407pK = i;
                        long j2 = (long) doubleValue;
                        if (c2468q204.d == null) {
                            c2468q204.d = new C1486gw(14);
                        }
                        c2468q204.m = c2407pK;
                        c2468q204.o = j2;
                        if (intent2 != null) {
                            Uri data = intent2.getData();
                            c2468q204.l = data;
                            if (data != null && "android.intent.action.VIEW".equals(intent2.getAction())) {
                                c2468q204.p = r1;
                            }
                        }
                    }
                    j.n = new C0942bV(this, 7);
                    try {
                        C2468q20 c2468q205 = j;
                        C3279zX c3279zX = new C3279zX(this, 4);
                        c2468q205.v = (String) h.get("customSdid");
                        c2468q205.w = c3279zX;
                    } catch (Throwable unused5) {
                    }
                    Context context = f;
                    C2468q20 c2468q206 = j;
                    C2741tB c2741tB5 = AbstractC2382p20.a;
                    if (context == null || c2468q206 == null) {
                        return;
                    }
                    try {
                        String str16 = c2468q206.a;
                        AbstractC2382p20.c = AbstractC2382p20.b != null;
                        if (str16.endsWith("_sl")) {
                            Ka0.d = str16;
                        }
                        AbstractC2382p20.b = C2811u20.a(context, C2468q20.a(c2468q206));
                        if (AbstractC2382p20.c) {
                            if (VX.b().c(c2468q206.x, c2468q206.y).booleanValue()) {
                                VX.b().b = Boolean.TRUE;
                                C2811u20 c2811u208 = AbstractC2382p20.b;
                                c2811u208.getClass();
                                c2811u208.g(new A3(c2811u208, r1));
                            } else {
                                C2811u20 c2811u209 = AbstractC2382p20.b;
                                if (c2811u209.d.l != null) {
                                    c2811u209.g(new A3(c2811u209, 2));
                                }
                            }
                        } else {
                            c2741tB5.a("singular instance is not initialized. start will be sent from session manager.");
                        }
                    } catch (IOException e3) {
                        c2741tB5.a("Failed to init() Singular SDK");
                        c2741tB5.c(Ka0.c(e3));
                        AbstractC2382p20.b = null;
                    } catch (Throwable th8) {
                        c2741tB5.c(Ka0.c(th8));
                    }
                    AbstractC2382p20.c();
                    return;
                }
                break;
            case 15:
                String str17 = (String) methodCall.argument("name");
                String str18 = (String) methodCall.argument("version");
                C2741tB c2741tB6 = AbstractC2382p20.a;
                try {
                    Ka0.e = str17;
                    Ka0.f = str18;
                    break;
                } catch (Throwable th9) {
                    AbstractC2382p20.a.c(Ka0.c(th9));
                    break;
                }
            case 16:
                String str19 = (String) methodCall.argument("currency");
                String str20 = (String) methodCall.argument(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME);
                double doubleValue3 = ((Double) methodCall.argument("amount")).doubleValue();
                Map map3 = (Map) methodCall.argument("attributes");
                C2741tB c2741tB7 = AbstractC2382p20.a;
                if (map3 != null) {
                    try {
                        JSONObject jSONObject4 = new JSONObject(map3);
                        jSONObject4.put("pcc", str19);
                        jSONObject4.put("r", doubleValue3);
                        jSONObject4.put("is_revenue_event", true);
                        AbstractC2382p20.b(str20, jSONObject4);
                        break;
                    } catch (JSONException e4) {
                        AbstractC2382p20.a.c(Ka0.c(e4));
                    }
                }
                AbstractC2382p20.a(str20, str19, doubleValue3);
                break;
            case 17:
                if (AbstractC2382p20.c()) {
                    C2811u20 c2811u2010 = AbstractC2382p20.b;
                    c2811u2010.getClass();
                    c2811u2010.g(new RunnableC2725t20(c2811u2010, true));
                    break;
                }
                break;
            case 18:
                String str21 = (String) methodCall.argument(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME);
                String jSONObject5 = new JSONObject((Map) methodCall.argument("args")).toString();
                C2741tB c2741tB8 = AbstractC2382p20.a;
                try {
                    if (AbstractC2382p20.c()) {
                        if (Ka0.m(str21)) {
                            c2741tB8.c("Event name can not be null or empty");
                        } else {
                            AbstractC2382p20.b.f(str21, jSONObject5);
                        }
                    }
                    break;
                } catch (Throwable th10) {
                    c2741tB8.c(Ka0.c(th10));
                    break;
                }
            case 19:
                if (AbstractC2382p20.c()) {
                    C2811u20 c2811u2011 = AbstractC2382p20.b;
                    c2811u2011.getClass();
                    c2811u2011.g(new RunnableC2639s20(c2811u2011, c2811u2011, 0));
                    break;
                }
                break;
            case 20:
                String str22 = (String) methodCall.argument(Constants.KEY);
                String str23 = (String) methodCall.argument("value");
                boolean booleanValue7 = ((Boolean) methodCall.argument("overrideExisting")).booleanValue();
                C2741tB c2741tB9 = AbstractC2382p20.a;
                if (!Ka0.m(str22)) {
                    try {
                    } catch (Throwable th11) {
                        AbstractC2382p20.a.c(Ka0.c(th11));
                    }
                    if (AbstractC2382p20.c()) {
                        C2811u20 c2811u2012 = AbstractC2382p20.b;
                        if (str22.length() > 200) {
                            i3 = 0;
                            str22 = str22.substring(0, 200);
                        } else {
                            i3 = 0;
                        }
                        if (str23.length() > 200) {
                            str23 = str23.substring(i3, 200);
                        }
                        if (c2811u2012.g.containsKey(str22)) {
                            if (booleanValue7) {
                                c2811u2012.g.put(str22, str23);
                            }
                        } else if (c2811u2012.g.size() < 5) {
                            c2811u2012.g.put(str22, str23);
                        }
                        c2811u2012.i();
                        z2 = true;
                        result.success(Boolean.valueOf(z2));
                        break;
                    }
                }
                z2 = false;
                result.success(Boolean.valueOf(z2));
            case 21:
                AbstractC2382p20.d((String) methodCall.argument("fcmToken"));
                break;
            case 22:
                try {
                    if (AbstractC2382p20.c()) {
                        AbstractC2382p20.b.h("");
                        break;
                    } else {
                        break;
                    }
                } catch (Throwable th12) {
                    AbstractC2382p20.a.c(Ka0.c(th12));
                    break;
                }
            case 23:
                AbstractC2382p20.a((String) methodCall.argument(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME), (String) methodCall.argument("currency"), ((Double) methodCall.argument("amount")).doubleValue());
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.c = activityPluginBinding.getActivity().getIntent();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
    }
}
