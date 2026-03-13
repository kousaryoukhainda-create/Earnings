package defpackage;

import com.applovin.sdk.AppLovinEventTypes;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
/* renamed from: A6  reason: default package */
/* loaded from: classes.dex */
public final class A6 implements InterfaceC2154mP {
    public static final A6 a = new Object();
    public static final C0980bu b = C0980bu.a("sdkVersion");
    public static final C0980bu c = C0980bu.a("model");
    public static final C0980bu d = C0980bu.a("hardware");
    public static final C0980bu e = C0980bu.a("device");
    public static final C0980bu f = C0980bu.a(AppLovinEventTypes.USER_VIEWED_PRODUCT);
    public static final C0980bu g = C0980bu.a("osBuild");
    public static final C0980bu h = C0980bu.a("manufacturer");
    public static final C0980bu i = C0980bu.a(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
    public static final C0980bu j = C0980bu.a("locale");
    public static final C0980bu k = C0980bu.a(HwPayConstant.KEY_COUNTRY);
    public static final C0980bu l = C0980bu.a("mccMnc");
    public static final C0980bu m = C0980bu.a("applicationBuild");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        E7 e7 = (E7) ((W2) obj);
        interfaceC2240nP.a(b, e7.a);
        interfaceC2240nP.a(c, e7.b);
        interfaceC2240nP.a(d, e7.c);
        interfaceC2240nP.a(e, e7.d);
        interfaceC2240nP.a(f, e7.e);
        interfaceC2240nP.a(g, e7.f);
        interfaceC2240nP.a(h, e7.g);
        interfaceC2240nP.a(i, e7.h);
        interfaceC2240nP.a(j, e7.i);
        interfaceC2240nP.a(k, e7.j);
        interfaceC2240nP.a(l, e7.k);
        interfaceC2240nP.a(m, e7.l);
    }
}
