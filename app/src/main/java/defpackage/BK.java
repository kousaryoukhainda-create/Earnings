package defpackage;

import android.graphics.Color;
import androidx.media3.common.b;
import com.applovin.impl.oc;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.fyber.fairbid.internal.Logger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: BK */
/* loaded from: classes.dex */
public abstract /* synthetic */ class BK {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static C3130xk a(R40 r40, byte[] bArr, int i) {
        C2314oD p = AbstractC2571rD.p();
        r40.k(bArr, 0, i, Q40.c, new C3318zx(p, 25));
        return new C3130xk(p.h());
    }

    public static void b(L70 l70, NQ nq, int i) {
        l70.b(nq, i, 0);
    }

    public static final boolean c(int i) {
        if (i != 3 && i != 4 && i != 6) {
            return false;
        }
        return true;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | UserVerificationMethods.USER_VERIFY_PATTERN | i4;
    }

    public static int e(int i) {
        return i & 384;
    }

    public static int f(int i) {
        return i & 64;
    }

    public static /* synthetic */ long g(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return 1L;
                        }
                        throw null;
                    }
                    return 1024L;
                }
                return 1048576L;
            }
            return 1073741824L;
        }
        return 1099511627776L;
    }

    public static boolean h(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4 && (!z || i2 != 3)) {
            return false;
        }
        return true;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static IW j(String str, String str2, String str3) {
        return AbstractC1522hL.k(new AndroidWebKitError(str, str2, str3));
    }

    public static String k(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String l(long j, String str) {
        return str + j;
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String n(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder p(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static JSONArray r(String str, JSONObject jSONObject) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static void s(int i, int i2, int i3, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void t(int i, String str, String str2) {
        Wh0.o0(str2, str + i);
    }

    public static void u(C2717sy c2717sy, L70 l70) {
        l70.f(new b(c2717sy));
    }

    public static void v(String str, String str2, n nVar, String str3) {
        nVar.a(str3, str + str2);
    }

    public static void w(String str, String str2, String str3) {
        Wh0.o0(str3, str + str2);
    }

    public static void x(StringBuilder sb, String str) {
        sb.append(str);
        Logger.debug(sb.toString());
    }

    public static int y(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static void z(String str, String str2, String str3) {
        oc.d(str3, str + str2);
    }
}
