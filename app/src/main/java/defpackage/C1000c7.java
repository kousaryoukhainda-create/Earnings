package defpackage;
/* renamed from: c7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000c7 implements InterfaceC2154mP {
    public static final C1000c7 a = new Object();
    public static final C0980bu b = C0980bu.a("batteryLevel");
    public static final C0980bu c = C0980bu.a("batteryVelocity");
    public static final C0980bu d = C0980bu.a("proximityOn");
    public static final C0980bu e = C0980bu.a("orientation");
    public static final C0980bu f = C0980bu.a("ramUsed");
    public static final C0980bu g = C0980bu.a("diskUsed");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        C2135m8 c2135m8 = (C2135m8) ((AbstractC0273Fj) obj);
        interfaceC2240nP.a(b, c2135m8.a);
        interfaceC2240nP.e(c, c2135m8.b);
        interfaceC2240nP.d(d, c2135m8.c);
        interfaceC2240nP.e(e, c2135m8.d);
        interfaceC2240nP.g(f, c2135m8.e);
        interfaceC2240nP.g(g, c2135m8.f);
    }
}
