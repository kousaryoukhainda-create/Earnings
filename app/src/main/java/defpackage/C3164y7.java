package defpackage;
/* renamed from: y7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3164y7 implements InterfaceC2154mP {
    public static final C3164y7 a = new Object();
    public static final C0980bu b = C0980bu.a("appId");
    public static final C0980bu c = C0980bu.a("deviceModel");
    public static final C0980bu d = C0980bu.a("sessionSdkVersion");
    public static final C0980bu e = C0980bu.a("osVersion");
    public static final C0980bu f = C0980bu.a("logEnvironment");
    public static final C0980bu g = C0980bu.a("androidAppInfo");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        P4 p4 = (P4) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.a(b, p4.a);
        interfaceC2240nP.a(c, p4.b);
        interfaceC2240nP.a(d, "2.1.2");
        interfaceC2240nP.a(e, p4.c);
        interfaceC2240nP.a(f, EnumC2920vI.LOG_ENVIRONMENT_PROD);
        interfaceC2240nP.a(g, p4.d);
    }
}
