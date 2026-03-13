package defpackage;
/* renamed from: x7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3078x7 implements InterfaceC2154mP {
    public static final C3078x7 a = new Object();
    public static final C0980bu b = C0980bu.a("packageName");
    public static final C0980bu c = C0980bu.a("versionName");
    public static final C0980bu d = C0980bu.a("appBuildVersion");
    public static final C0980bu e = C0980bu.a("deviceManufacturer");
    public static final C0980bu f = C0980bu.a("currentProcessDetails");
    public static final C0980bu g = C0980bu.a("appProcessDetails");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        U2 u2 = (U2) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.a(b, u2.a);
        interfaceC2240nP.a(c, u2.b);
        interfaceC2240nP.a(d, u2.c);
        interfaceC2240nP.a(e, u2.d);
        interfaceC2240nP.a(f, u2.e);
        interfaceC2240nP.a(g, u2.f);
    }
}
