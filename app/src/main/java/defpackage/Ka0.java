package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: Ka0  reason: default package */
/* loaded from: classes2.dex */
public abstract class Ka0 {
    public static double b;
    public static int c;
    public static String d;
    public static final C2741tB a = new C2741tB(Ka0.class.getSimpleName(), 8);
    public static String e = null;
    public static String f = null;
    public static String g = null;

    public static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!l(uri) && !k(uri) && !o(uri)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("_android_dl");
        if (queryParameter != null) {
            return queryParameter;
        }
        return uri.getQueryParameter("_dl");
    }

    public static String b(String str) {
        if (!m(str) && !m("_sl") && str.length() >= 3 && str.endsWith("_sl")) {
            return str.substring(0, str.length() - 3);
        }
        return str;
    }

    public static String c(Throwable th) {
        StringBuilder sb = new StringBuilder("Exception: \n");
        sb.append(th.getMessage());
        sb.append("\nStack trace: \n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        return sb.toString();
    }

    public static String d(Application application) {
        C2741tB c2741tB = a;
        try {
            c2741tB.a("Utils: trying to fetch app set id");
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(application).getAppSetIdInfo();
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            appSetIdInfo.addOnSuccessListener(new C2257nd(linkedBlockingQueue, System.currentTimeMillis(), 6));
            appSetIdInfo.addOnFailureListener(new C3279zX(linkedBlockingQueue, 9));
            String str = (String) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
            c2741tB.a("Utils: fetched app set id value: " + str);
            if (m(str)) {
                return null;
            }
            return str;
        } catch (Throwable th) {
            c2741tB.c("Utils: caught exception in fetching app set id: " + c(th));
            b = -2.0d;
            return null;
        }
    }

    public static String e(Application application) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) application.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 0) {
            return "wwan";
        }
        NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) application.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
            activeNetworkInfo2.getType();
        }
        return "wifi";
    }

    public static long f(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref-event-index", 0);
        long j = sharedPreferences.getLong("event-index", -1L) + 1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("event-index", j);
        edit.commit();
        return j;
    }

    public static HashSet g() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        hashSet.add("0000-0000");
        return hashSet;
    }

    public static String h(C2811u20 c2811u20) {
        String str;
        String str2 = c2811u20.f.u;
        String str3 = e;
        if (str3 != null && (str = f) != null) {
            return str2 + "-" + str3 + "/" + str;
        }
        return str2;
    }

    public static UUID i(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref-singular-id", 0);
        String string = sharedPreferences.getString("singular-id", null);
        if (string != null) {
            return UUID.fromString(string);
        }
        UUID randomUUID = UUID.randomUUID();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("singular-id", randomUUID.toString());
        edit.commit();
        return randomUUID;
    }

    public static void j(C3112xb c3112xb) {
        if (VX.b().b.booleanValue()) {
            a.a("Push notifications: app was opened with push notification link, skipping deeplink handler invocation.");
            return;
        }
        C2407pK c2407pK = C2811u20.q.d.m;
        if (((String) c3112xb.b) != null && c2407pK != null) {
            new RunnableC1881jA(23, c2407pK, c3112xb).run();
        }
    }

    public static boolean k(Uri uri) {
        C2741tB c2741tB = a;
        c2741tB.a("Checking if link is branded link");
        if (uri == null) {
            c2741tB.a("link is null");
            return false;
        }
        C2811u20 c2811u20 = C2811u20.q;
        if (c2811u20 == null) {
            c2741tB.c("Singular instance is null. cannot check branded links");
            return false;
        }
        C2468q20 c2468q20 = c2811u20.d;
        if (c2468q20 == null) {
            c2741tB.a("singular config is null. cannot check branded links");
            return false;
        }
        ArrayList arrayList = c2468q20.s;
        if (arrayList != null && arrayList.size() != 0) {
            if (uri.getScheme() == null) {
                uri = Uri.parse("https://" + uri.toString());
            }
            return p(uri, C2811u20.q.d.s);
        }
        c2741tB.a("branded domains is null or empty");
        return false;
    }

    public static boolean l(Uri uri) {
        C2811u20 c2811u20;
        C2468q20 c2468q20;
        ArrayList arrayList;
        if (uri != null && (c2811u20 = C2811u20.q) != null && (c2468q20 = c2811u20.d) != null && (arrayList = c2468q20.r) != null && arrayList.size() != 0) {
            if (uri.getScheme() == null) {
                uri = Uri.parse("https://" + uri.toString());
            }
            return p(uri, C2811u20.q.d.r);
        }
        return false;
    }

    public static boolean m(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean n(String str) {
        if (m(str)) {
            return false;
        }
        Matcher matcher = Pattern.compile("^[0-]+$").matcher(str);
        if (!g().contains(str) && !matcher.matches()) {
            return false;
        }
        return true;
    }

    public static boolean o(Uri uri) {
        if (uri == null || uri.getHost() == null || !uri.getHost().endsWith("sng.link")) {
            return false;
        }
        return true;
    }

    public static boolean p(Uri uri, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (uri.getHost() != null && uri.getHost().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static double q(long j) {
        return (System.currentTimeMillis() - j) * 0.001d;
    }

    public static String r(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str2.getBytes("UTF-8"));
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] digest = messageDigest.digest();
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[digest.length * 2];
            for (int i = 0; i < digest.length; i++) {
                byte b2 = digest[i];
                int i2 = i * 2;
                cArr2[i2] = cArr[(b2 & 255) >>> 4];
                cArr2[i2 + 1] = cArr[b2 & Ascii.SI];
            }
            return new String(cArr2);
        } catch (Throwable th) {
            a.d("error in sha1Hash()", th);
            return null;
        }
    }

    public static String s(String str) {
        try {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            byte[] bArr2 = new byte[4];
            int length2 = bArr.length - 4;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            System.arraycopy(bArr, 4, bArr3, 0, length2);
            byte[] bArr4 = new byte[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                bArr4[i2] = (byte) (bArr3[i2] ^ bArr2[i2 % 4]);
            }
            return new String(bArr4);
        }
    }
}
