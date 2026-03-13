package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: T6  reason: default package */
/* loaded from: classes.dex */
public final class T6 implements InterfaceC2154mP {
    public static final T6 a = new Object();
    public static final C0980bu b = C0980bu.a("generator");
    public static final C0980bu c = C0980bu.a(Constants.IDENTIFIER);
    public static final C0980bu d = C0980bu.a("appQualitySessionId");
    public static final C0980bu e = C0980bu.a("startedAt");
    public static final C0980bu f = C0980bu.a("endedAt");
    public static final C0980bu g = C0980bu.a("crashed");
    public static final C0980bu h = C0980bu.a("app");
    public static final C0980bu i = C0980bu.a(io.flutter.plugins.firebase.auth.Constants.USER);
    public static final C0980bu j = C0980bu.a("os");
    public static final C0980bu k = C0980bu.a("device");
    public static final C0980bu l = C0980bu.a("events");
    public static final C0980bu m = C0980bu.a("generatorType");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        U7 u7 = (U7) ((AbstractC0480Nj) obj);
        interfaceC2240nP.a(b, u7.a);
        interfaceC2240nP.a(c, u7.b.getBytes(AbstractC0506Oj.a));
        interfaceC2240nP.a(d, u7.c);
        interfaceC2240nP.g(e, u7.d);
        interfaceC2240nP.a(f, u7.e);
        interfaceC2240nP.d(g, u7.f);
        interfaceC2240nP.a(h, u7.g);
        interfaceC2240nP.a(i, u7.h);
        interfaceC2240nP.a(j, u7.i);
        interfaceC2240nP.a(k, u7.j);
        interfaceC2240nP.a(l, u7.k);
        interfaceC2240nP.e(m, u7.l);
    }
}
