package defpackage;
/* renamed from: I6  reason: default package */
/* loaded from: classes.dex */
public final class I6 implements InterfaceC2154mP {
    public static final I6 a = new Object();
    public static final C0980bu b = C0980bu.a("requestTimeMs");
    public static final C0980bu c = C0980bu.a("requestUptimeMs");
    public static final C0980bu d = C0980bu.a("clientInfo");
    public static final C0980bu e = C0980bu.a("logSource");
    public static final C0980bu f = C0980bu.a("logSourceName");
    public static final C0980bu g = C0980bu.a("logEvent");
    public static final C0980bu h = C0980bu.a("qosTier");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        K8 k8 = (K8) ((AbstractC3264zI) obj);
        interfaceC2240nP.g(b, k8.a);
        interfaceC2240nP.g(c, k8.b);
        interfaceC2240nP.a(d, k8.c);
        interfaceC2240nP.a(e, k8.d);
        interfaceC2240nP.a(f, k8.e);
        interfaceC2240nP.a(g, k8.f);
        interfaceC2240nP.a(h, EnumC1359fU.b);
    }
}
