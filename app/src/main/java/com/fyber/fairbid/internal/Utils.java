package com.fyber.fairbid.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fyber.fairbid.ik;
import com.fyber.fairbid.o8;
import com.fyber.fairbid.s6;
import com.fyber.fairbid.tg;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Utils {
    public static final HashSet d;
    public static final Pattern a = Pattern.compile("[1-9][0-9]*");
    public static Pattern SEMVER_PATTERN = Pattern.compile("^([0-9]+)(?:\\.([0-9]+))?(?:\\.([0-9]+))?(?:\\.([0-9]+))?(?:-([0-9A-Za-z-]+(?:\\.[0-9A-Za-z-]+)*))?(?:\\+[0-9A-Za-z-]+)?$");
    public static Boolean b = null;
    public static String c = "unknown";

    /* loaded from: classes.dex */
    public static class ClockHelper {
        public long getCurrentTimeMillis() {
            return System.currentTimeMillis();
        }

        public final double getUnixTimestamp() {
            return getCurrentTimeMillis() * 0.001d;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add("vbox86tp");
        hashSet.add("vbox86p");
        hashSet.add("google_sdk");
        hashSet.add("sdk");
    }

    public static int a(String str, String str2) throws IllegalArgumentException {
        Matcher matcher = SEMVER_PATTERN.matcher(str);
        Matcher matcher2 = SEMVER_PATTERN.matcher(str2);
        if (matcher.matches() && matcher2.matches()) {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            for (int i = 1; i <= 4; i++) {
                String group = matcher.group(i);
                if (!TextUtils.isEmpty(group)) {
                    iArr[i - 1] = Integer.parseInt(group);
                }
                String group2 = matcher2.group(i);
                if (!TextUtils.isEmpty(group2)) {
                    iArr2[i - 1] = Integer.parseInt(group2);
                }
            }
            return a(iArr, iArr2);
        }
        throw new IllegalArgumentException(AbstractC2437ph.i("Non semantic version provided: ", str, " - ", str2));
    }

    public static boolean activityExistsInPackage(Context context, Class cls) {
        return new Intent(context, cls).resolveActivityInfo(context.getPackageManager(), 0) != null;
    }

    @NonNull
    public static Boolean classExists(String str) {
        try {
            Class.forName(str);
            return Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @NonNull
    public static JSONObject createJsonObjectFromString(String str) {
        if (str == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            Logger.error("Cannot create JSONObject from string - ".concat(str));
            return new JSONObject();
        }
    }

    @NonNull
    public static Map<String, Object> createMapFromJsonObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }

    public static String generateDigestForString(@NonNull String str, String str2) {
        try {
            byte[] digest = MessageDigest.getInstance(str2).digest(str.getBytes());
            Formatter formatter = new Formatter();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                formatter.format("%02x", Byte.valueOf(digest[i]));
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (NoSuchAlgorithmException unused) {
            return "nosignature";
        }
    }

    public static String generateSignature(@NonNull String str) {
        try {
            byte[] bytes = str.getBytes(Charset.defaultCharset());
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            Locale locale = Locale.US;
            return String.format(locale, "%0" + (digest.length << 1) + "x", bigInteger);
        } catch (NoSuchAlgorithmException e) {
            Logger.error("Error while creating signature", e);
            return null;
        }
    }

    public static String getAppName(Context context) {
        if (c.equals("unknown") && context != null) {
            c = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        }
        return c;
    }

    public static <T> T getClassFieldValue(@NonNull Class<?> cls, String str) {
        return (T) getClassFieldValue(cls.getName(), str);
    }

    public static String getCountryIso(@NonNull Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(io.flutter.plugins.firebase.auth.Constants.SIGN_IN_METHOD_PHONE)).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int[] getIntArrayFromJSONArray(JSONArray jSONArray) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = jSONArray.optInt(i);
            }
            return iArr;
        }
        return null;
    }

    @NonNull
    public static JSONObject getJSONEntryOrEmpty(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getJSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    public static Locale getLocale(@NonNull Context context) {
        LocaleList locales;
        Locale locale;
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            locale = locales.get(0);
            return locale;
        }
        return configuration.locale;
    }

    public static long[] getLongArrayFromJSONArray(JSONArray jSONArray) {
        return getLongArrayFromJSONArray(jSONArray, null);
    }

    @NonNull
    public static String getMapAsUrlParams(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            return "";
        }
        return encodedQuery;
    }

    public static Map<String, String> getMapFromJsonString(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            Log.e(Logger.TAG, "unable to convert the json dictionary: ".concat(str));
            return null;
        }
    }

    public static String getValueWithoutInlining(String str, String str2, String str3) {
        try {
            return getValueWithoutInlining(Class.forName(str), str2, str3);
        } catch (ClassNotFoundException unused) {
            return str3;
        }
    }

    public static Boolean isDebug(Context context) {
        boolean z;
        if (b == null) {
            if (!tg.a(context, Constants.TEST_APP_PACKAGE) && !tg.a(context, Constants.TEST_APP_PACKAGE_RELEASE)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Log.i("FairbidUtils", "debugging logging turned on because test app is present on the device");
            }
            setDebug(z);
        }
        return b;
    }

    public static boolean isExpired(long j, int i) {
        if (i < System.currentTimeMillis() - j) {
            return true;
        }
        return false;
    }

    public static ik isSemVersionEqualOrGreaterThan(@NonNull String str, @NonNull String str2) {
        try {
            int a2 = a(str, str2);
            boolean z = true;
            if (a2 != 0 && a2 != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf.equals(Boolean.TRUE)) {
                return ik.TRUE;
            }
            if (valueOf.equals(Boolean.FALSE)) {
                return ik.FALSE;
            }
            return ik.UNDEFINED;
        } catch (IllegalArgumentException unused) {
            return ik.UNDEFINED;
        }
    }

    public static boolean methodExists(@NonNull String str, @NonNull String str2, o8<Class[], Boolean> o8Var, o8<Class, Boolean> o8Var2) {
        if (classExists(str).booleanValue()) {
            Method[] methodArr = new Method[0];
            try {
                methodArr = Class.forName(str).getMethods();
            } catch (ClassNotFoundException unused) {
            }
            for (Method method : methodArr) {
                if (str2.equals(method.getName()) && ((o8Var == null || o8Var.apply(method.getParameterTypes()).booleanValue()) && (o8Var2 == null || o8Var2.apply(method.getReturnType()).booleanValue()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int parseId(String str) {
        if (str == null || !a.matcher(str).matches()) {
            return -1;
        }
        try {
            int parseInt = Integer.parseInt(str, 10);
            if (parseInt <= 0) {
                return -1;
            }
            return parseInt;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String safeJsonPrettyPrint(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.toString(2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void setDebug(boolean z) {
        b = Boolean.valueOf(z);
    }

    public Boolean _classExists(String str) {
        return classExists(str);
    }

    public String _getValueWithoutInlining(String str, String str2, String str3) {
        return getValueWithoutInlining(str, str2, str3);
    }

    public boolean isEmulator() {
        String str = Build.PRODUCT;
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return Build.DEVICE.startsWith("generic");
    }

    public boolean isRunningOnAmazonDevice() {
        return Build.MANUFACTURER.equals("Amazon");
    }

    public boolean packageHasPermissions(Activity activity, @NonNull List<String> list) {
        for (String permission : list) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(permission, "permission");
            if (activity.getPackageManager().checkPermission(permission, activity.getPackageName()) != 0) {
                return false;
            }
        }
        return true;
    }

    public static <T> T getClassFieldValue(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            return (T) declaredField.get(null);
        } catch (ClassNotFoundException unused) {
            Logger.warn("Utils - Error when accessing '" + str2 + "' in '" + str + "'");
            return null;
        } catch (IllegalAccessException unused2) {
            Logger.warn("Utils - Error when accessing '" + str2 + "' in '" + str + "'");
            return null;
        } catch (NoSuchFieldException unused3) {
            Logger.warn("Utils - Error when accessing '" + str2 + "' in '" + str + "'");
            return null;
        }
    }

    public static long[] getLongArrayFromJSONArray(JSONArray jSONArray, s6<Long> s6Var) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            long[] jArr = new long[length];
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                long optLong = jSONArray.optLong(i2, Long.MIN_VALUE);
                if (optLong == Long.MIN_VALUE || !(s6Var == null || s6Var.a(Long.valueOf(optLong)))) {
                    i++;
                } else {
                    jArr[i2 - i] = optLong;
                }
            }
            return Arrays.copyOfRange(jArr, 0, length - i);
        }
        return null;
    }

    public static String getValueWithoutInlining(@NonNull Class cls, String str, String str2) {
        try {
            return cls.getDeclaredField(str).get(null).toString();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return str2;
        }
    }

    public static boolean activityExistsInPackage(Context context, String str) {
        try {
            return activityExistsInPackage(context, Class.forName(str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static int a(int[] iArr, int[] iArr2) {
        if (iArr.length == 0) {
            return 0;
        }
        int i = iArr[0];
        int i2 = iArr2[0];
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        return a(Arrays.copyOfRange(iArr, 1, iArr.length), Arrays.copyOfRange(iArr2, 1, iArr2.length));
    }
}
