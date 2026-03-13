package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;
/* renamed from: Xx  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754Xx implements InterfaceC1416g50 {
    public static final C0754Xx d = new C0754Xx("NONE", 0);
    public static final C0754Xx f = new C0754Xx("FULL", 0);
    public final /* synthetic */ int b;
    public String c;

    public static void c(C3244z4 c3244z4, C0904b10 c0904b10) {
        d(c3244z4, "X-CRASHLYTICS-GOOGLE-APP-ID", c0904b10.a);
        d(c3244z4, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        d(c3244z4, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        d(c3244z4, "Accept", "application/json");
        d(c3244z4, "X-CRASHLYTICS-DEVICE-MODEL", c0904b10.b);
        d(c3244z4, "X-CRASHLYTICS-OS-BUILD-VERSION", c0904b10.c);
        d(c3244z4, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c0904b10.d);
        d(c3244z4, "X-CRASHLYTICS-INSTALLATION-ID", c0904b10.e.c().a);
    }

    public static void d(C3244z4 c3244z4, String str, String str2) {
        if (str2 != null) {
            ((HashMap) c3244z4.f).put(str, str2);
        }
    }

    public static HashMap e(C0904b10 c0904b10) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c0904b10.h);
        hashMap.put("display_version", c0904b10.g);
        hashMap.put("source", Integer.toString(c0904b10.i));
        String str = c0904b10.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static C0754Xx g(NQ nq) {
        String str;
        nq.H(2);
        int u = nq.u();
        int i = u >> 1;
        int u2 = ((nq.u() >> 3) & 31) | ((u & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (u2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u2);
        return new C0754Xx(sb.toString(), 2);
    }

    @Override // defpackage.InterfaceC1416g50
    public String b() {
        return this.c;
    }

    public JSONObject f(C0264Fa c0264Fa) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i = c0264Fa.a;
        sb.append(i);
        String sb2 = sb.toString();
        C2999wB c2999wB = C2999wB.j;
        c2999wB.z(sb2);
        String str = this.c;
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String k = BK.k(i, "Settings request failed; (status: ", ") from ", str);
            if (!c2999wB.l(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", k, null);
            return null;
        }
        String str2 = c0264Fa.b;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            c2999wB.A("Failed to parse settings JSON from " + str, e);
            c2999wB.A("Settings response " + str2, null);
            return null;
        }
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return this.c;
            case 7:
                return "<" + this.c + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0754Xx(C2741tB c2741tB) {
        this.b = 5;
        this.c = c2741tB.c;
    }

    public /* synthetic */ C0754Xx(String str, int i) {
        this.b = i;
        this.c = str;
    }

    public C0754Xx(String str, C1314ew c1314ew) {
        this.b = 1;
        if (str != null) {
            this.c = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    @Override // defpackage.InterfaceC1416g50
    public void a(C3148xz c3148xz) {
    }
}
