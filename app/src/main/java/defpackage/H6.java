package defpackage;
/* renamed from: H6  reason: default package */
/* loaded from: classes.dex */
public final class H6 implements InterfaceC2154mP {
    public static final H6 a = new Object();
    public static final C0980bu b = C0980bu.a("eventTimeMs");
    public static final C0980bu c = C0980bu.a("eventCode");
    public static final C0980bu d = C0980bu.a("complianceData");
    public static final C0980bu e = C0980bu.a("eventUptimeMs");
    public static final C0980bu f = C0980bu.a("sourceExtension");
    public static final C0980bu g = C0980bu.a("sourceExtensionJsonProto3");
    public static final C0980bu h = C0980bu.a("timezoneOffsetSeconds");
    public static final C0980bu i = C0980bu.a("networkConnectionInfo");
    public static final C0980bu j = C0980bu.a("experimentIds");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        J8 j8 = (J8) ((AbstractC3006wI) obj);
        interfaceC2240nP.g(b, j8.a);
        interfaceC2240nP.a(c, j8.b);
        interfaceC2240nP.a(d, j8.c);
        interfaceC2240nP.g(e, j8.d);
        interfaceC2240nP.a(f, j8.e);
        interfaceC2240nP.a(g, j8.f);
        interfaceC2240nP.g(h, j8.g);
        interfaceC2240nP.a(i, j8.h);
        interfaceC2240nP.a(j, j8.i);
    }
}
