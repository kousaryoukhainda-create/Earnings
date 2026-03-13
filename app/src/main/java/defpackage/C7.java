package defpackage;
/* renamed from: C7  reason: default package */
/* loaded from: classes.dex */
public final class C7 implements InterfaceC2154mP {
    public static final C7 a = new Object();
    public static final C0980bu b = C0980bu.a("sessionId");
    public static final C0980bu c = C0980bu.a("firstSessionId");
    public static final C0980bu d = C0980bu.a("sessionIndex");
    public static final C0980bu e = C0980bu.a("eventTimestampUs");
    public static final C0980bu f = C0980bu.a("dataCollectionStatus");
    public static final C0980bu g = C0980bu.a("firebaseInstallationId");
    public static final C0980bu h = C0980bu.a("firebaseAuthenticationToken");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        C3065x00 c3065x00 = (C3065x00) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.a(b, c3065x00.a);
        interfaceC2240nP.a(c, c3065x00.b);
        interfaceC2240nP.e(d, c3065x00.c);
        interfaceC2240nP.g(e, c3065x00.d);
        interfaceC2240nP.a(f, c3065x00.e);
        interfaceC2240nP.a(g, c3065x00.f);
        interfaceC2240nP.a(h, c3065x00.g);
    }
}
