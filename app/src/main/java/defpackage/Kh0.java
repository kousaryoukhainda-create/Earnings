package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.applovin.impl.mediation.g;
import com.applovin.impl.oc;
import com.applovin.impl.sj;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zzgww;
import com.google.android.gms.internal.gtm.zzuq;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.play_billing.zzgr;
import com.google.android.recaptcha.internal.zzln;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* renamed from: Kh0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class Kh0 {
    public static int a(int i, int i2, int i3) {
        return zzuq.zzD(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static Bundle c(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static sj d(long j, TimeUnit timeUnit, String str) {
        return sj.a(str, Long.valueOf(timeUnit.toMillis(j)));
    }

    public static IObjectWrapper e(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static Object f(zzbk zzbkVar, int i, List list, int i2) {
        zzh.zza(zzbkVar.name(), i, list);
        return list.get(i2);
    }

    public static String g(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String h(g gVar, StringBuilder sb, String str, Bundle bundle) {
        sb.append(gVar.f);
        sb.append(str);
        sb.append(bundle);
        return sb.toString();
    }

    public static void i(int i, String str, String str2) {
        oc.d(str2, str + i);
    }

    public static void j(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void k(Bundle bundle, String str) {
        bundle.putLong(str, zzv.zzC().currentTimeMillis());
    }

    public static void l(String str, String str2, String str3) {
        zzdo.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static int m(int i, int i2, int i3) {
        return zzgww.zzD(i) + i2 + i3;
    }

    public static void n(int i, String str, String str2) {
        zzdo.zzf(str2, str + i);
    }

    public static int o(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    public static int p(int i, int i2, int i3) {
        return zzgr.zzz(i) + i2 + i3;
    }

    public static int q(int i, int i2, int i3) {
        return zzll.zzz(i) + i2 + i3;
    }

    public static int r(int i, int i2, int i3) {
        return zzln.zzA(i) + i2 + i3;
    }
}
