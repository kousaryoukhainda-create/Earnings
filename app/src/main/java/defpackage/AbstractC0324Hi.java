package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.internal.zzib;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Hi */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0324Hi {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static /* synthetic */ int A(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] B(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return DevicePublicKeyStringDef.NONE;
                        }
                        throw null;
                    }
                    return "network";
                }
                return "incent";
            }
            return "affiliate";
        }
        return "organic";
    }

    public static Object c(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String d(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String e(int i, String str) {
        return str + i;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder i(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder j(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder k(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap n(Class cls, E5 e5) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, e5);
        return hashMap;
    }

    public static HashMap o(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static Map p(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void q(int i, int i2, int i3, int i4, int i5) {
        Ha0.H(i);
        Ha0.H(i2);
        Ha0.H(i3);
        Ha0.H(i4);
        Ha0.H(i5);
    }

    public static void r(int i, SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
        spannableStringBuilder.setSpan(new StyleSpan(i), i2, i3, i4);
    }

    public static void s(int i, String str, String str2) {
        HMSLog.i(str2, str + i);
    }

    public static void t(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void u(zzib zzibVar, String str) {
        zzibVar.zzaV().zzb().zza(str);
    }

    public static void v(String str, String str2, String str3) {
        Log.e(str3, str + str2);
    }

    public static void w(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void x(Throwable th, StringBuilder sb, String str) {
        sb.append(th.getMessage());
        HMSLog.e(str, sb.toString());
    }

    public static void y(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static void z(zzib zzibVar, String str) {
        zzibVar.zzaV().zze().zza(str);
    }
}
