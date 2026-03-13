package defpackage;
/* renamed from: A7  reason: default package */
/* loaded from: classes.dex */
public final class A7 implements InterfaceC2154mP {
    public static final A7 a = new Object();
    public static final C0980bu b = C0980bu.a("processName");
    public static final C0980bu c = C0980bu.a("pid");
    public static final C0980bu d = C0980bu.a("importance");
    public static final C0980bu e = C0980bu.a("defaultProcess");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        C1187dT c1187dT = (C1187dT) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.a(b, c1187dT.a);
        interfaceC2240nP.e(c, c1187dT.b);
        interfaceC2240nP.e(d, c1187dT.c);
        interfaceC2240nP.d(e, c1187dT.d);
    }
}
