package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: L6  reason: default package */
/* loaded from: classes.dex */
public final class L6 implements InterfaceC2154mP {
    public static final L6 a = new Object();
    public static final C0980bu b = C0980bu.a("pid");
    public static final C0980bu c = C0980bu.a("processName");
    public static final C0980bu d = C0980bu.a("reasonCode");
    public static final C0980bu e = C0980bu.a("importance");
    public static final C0980bu f = C0980bu.a("pss");
    public static final C0980bu g = C0980bu.a("rss");
    public static final C0980bu h = C0980bu.a(Constants.TIMESTAMP);
    public static final C0980bu i = C0980bu.a("traceFile");
    public static final C0980bu j = C0980bu.a("buildIdMappingForArch");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        O7 o7 = (O7) ((AbstractC2527qj) obj);
        interfaceC2240nP.e(b, o7.a);
        interfaceC2240nP.a(c, o7.b);
        interfaceC2240nP.e(d, o7.c);
        interfaceC2240nP.e(e, o7.d);
        interfaceC2240nP.g(f, o7.e);
        interfaceC2240nP.g(g, o7.f);
        interfaceC2240nP.g(h, o7.g);
        interfaceC2240nP.a(i, o7.h);
        interfaceC2240nP.a(j, o7.i);
    }
}
