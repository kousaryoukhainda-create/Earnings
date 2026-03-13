package io.flutter.plugins.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingUtils {
    static final String EXTRA_REMOTE_MESSAGE = "notification";
    static final String IS_AUTO_INIT_ENABLED = "isAutoInitEnabled";
    static final int JOB_ID = 2020;
    private static final String KEY_COLLAPSE_KEY = "collapseKey";
    private static final String KEY_DATA = "data";
    private static final String KEY_FROM = "from";
    private static final String KEY_MESSAGE_ID = "messageId";
    private static final String KEY_MESSAGE_TYPE = "messageType";
    private static final String KEY_SENT_TIME = "sentTime";
    private static final String KEY_TO = "to";
    private static final String KEY_TTL = "ttl";
    static final String SHARED_PREFERENCES_KEY = "io.flutter.firebase.messaging.callback";

    public static FirebaseMessaging getFirebaseMessagingForArguments(Map<String, Object> map) {
        return FirebaseMessaging.c();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e5, Z10] */
    public static RemoteMessage getRemoteMessageForArguments(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get(KEY_TO);
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        Bundle bundle = new Bundle();
        ?? z10 = new Z10();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("google.to", str);
            String str2 = (String) map2.get(KEY_COLLAPSE_KEY);
            String str3 = (String) map2.get(KEY_MESSAGE_ID);
            String str4 = (String) map2.get(KEY_MESSAGE_TYPE);
            Integer num = (Integer) map2.get(KEY_TTL);
            Map map3 = (Map) map2.get(KEY_DATA);
            if (str2 != null) {
                bundle.putString("collapse_key", str2);
            }
            if (str4 != null) {
                bundle.putString("message_type", str4);
            }
            if (str3 != null) {
                bundle.putString("google.message_id", str3);
            }
            if (num != null) {
                bundle.putString("google.ttl", String.valueOf(num.intValue()));
            }
            if (map3 != null) {
                z10.clear();
                z10.putAll(map3);
            }
            Bundle bundle2 = new Bundle();
            Iterator it = ((Z4) z10.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle2.putAll(bundle);
            bundle.remove(KEY_FROM);
            return new RemoteMessage(bundle2);
        }
        throw new IllegalArgumentException(AbstractC2437ph.g("Invalid to: ", str));
    }

    public static Map<String, Object> getRemoteMessageNotificationForArguments(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get(EXTRA_REMOTE_MESSAGE) == null) {
            return null;
        }
        return (Map) map2.get(EXTRA_REMOTE_MESSAGE);
    }

    public static boolean isApplicationForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, Object> remoteMessageNotificationToMap(VV vv) {
        Uri uri;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String str = vv.a;
        if (str != null) {
            hashMap.put("title", str);
        }
        String str2 = vv.b;
        if (str2 != null) {
            hashMap.put("titleLocKey", str2);
        }
        String[] strArr = vv.c;
        if (strArr != null) {
            hashMap.put("titleLocArgs", Arrays.asList(strArr));
        }
        String str3 = vv.d;
        if (str3 != null) {
            hashMap.put("body", str3);
        }
        String str4 = vv.e;
        if (str4 != null) {
            hashMap.put("bodyLocKey", str4);
        }
        String[] strArr2 = vv.f;
        if (strArr2 != null) {
            hashMap.put("bodyLocArgs", Arrays.asList(strArr2));
        }
        String str5 = vv.m;
        if (str5 != null) {
            hashMap2.put("channelId", str5);
        }
        String str6 = vv.l;
        if (str6 != null) {
            hashMap2.put("clickAction", str6);
        }
        String str7 = vv.k;
        if (str7 != null) {
            hashMap2.put("color", str7);
        }
        String str8 = vv.g;
        if (str8 != null) {
            hashMap2.put("smallIcon", str8);
        }
        Uri uri2 = null;
        String str9 = vv.h;
        if (str9 != null) {
            uri = Uri.parse(str9);
        } else {
            uri = null;
        }
        if (uri != null) {
            if (str9 != null) {
                uri2 = Uri.parse(str9);
            }
            hashMap2.put("imageUrl", uri2.toString());
        }
        Uri uri3 = vv.n;
        if (uri3 != null) {
            hashMap2.put("link", uri3.toString());
        }
        Integer num = vv.r;
        if (num != null) {
            hashMap2.put("count", num);
        }
        Integer num2 = vv.p;
        if (num2 != null) {
            hashMap2.put("priority", num2);
        }
        String str10 = vv.i;
        if (str10 != null) {
            hashMap2.put("sound", str10);
        }
        String str11 = vv.o;
        if (str11 != null) {
            hashMap2.put("ticker", str11);
        }
        Integer num3 = vv.q;
        if (num3 != null) {
            hashMap2.put("visibility", num3);
        }
        String str12 = vv.j;
        if (str12 != null) {
            hashMap2.put("tag", str12);
        }
        hashMap.put("android", hashMap2);
        return hashMap;
    }

    public static Map<String, Object> remoteMessageToMap(RemoteMessage remoteMessage) {
        int parseInt;
        long parseLong;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (remoteMessage.b.getString("collapse_key") != null) {
            hashMap.put(KEY_COLLAPSE_KEY, remoteMessage.b.getString("collapse_key"));
        }
        if (remoteMessage.b.getString(KEY_FROM) != null) {
            hashMap.put(KEY_FROM, remoteMessage.b.getString(KEY_FROM));
        }
        if (remoteMessage.b.getString("google.to") != null) {
            hashMap.put(KEY_TO, remoteMessage.b.getString("google.to"));
        }
        if (remoteMessage.getMessageId() != null) {
            hashMap.put(KEY_MESSAGE_ID, remoteMessage.getMessageId());
        }
        if (remoteMessage.b.getString("message_type") != null) {
            hashMap.put(KEY_MESSAGE_TYPE, remoteMessage.b.getString("message_type"));
        }
        if (!((Z10) remoteMessage.getData()).isEmpty()) {
            for (Map.Entry entry : ((C1243e5) remoteMessage.getData()).entrySet()) {
                hashMap2.put((String) entry.getKey(), entry.getValue());
            }
        }
        hashMap.put(KEY_DATA, hashMap2);
        Bundle bundle = remoteMessage.b;
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            parseInt = ((Integer) obj).intValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseInt = Integer.parseInt((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                }
            }
            parseInt = 0;
        }
        hashMap.put(KEY_TTL, Integer.valueOf(parseInt));
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            parseLong = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused2) {
                    Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                }
            }
            parseLong = 0;
        }
        hashMap.put(KEY_SENT_TIME, Long.valueOf(parseLong));
        if (remoteMessage.w() != null) {
            hashMap.put(EXTRA_REMOTE_MESSAGE, remoteMessageNotificationToMap(remoteMessage.w()));
        }
        return hashMap;
    }
}
