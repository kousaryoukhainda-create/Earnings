package defpackage;
/* renamed from: B7  reason: default package */
/* loaded from: classes.dex */
public final class B7 implements InterfaceC2154mP {
    public static final B7 a = new Object();
    public static final C0980bu b = C0980bu.a("eventType");
    public static final C0980bu c = C0980bu.a("sessionData");
    public static final C0980bu d = C0980bu.a("applicationInfo");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        C2378p00 c2378p00 = (C2378p00) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        c2378p00.getClass();
        interfaceC2240nP.a(b, EnumC1653is.SESSION_START);
        interfaceC2240nP.a(c, c2378p00.a);
        interfaceC2240nP.a(d, c2378p00.b);
    }
}
