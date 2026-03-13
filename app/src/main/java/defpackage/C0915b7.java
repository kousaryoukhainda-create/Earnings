package defpackage;
/* renamed from: b7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915b7 implements InterfaceC2154mP {
    public static final C0915b7 a = new Object();
    public static final C0980bu b = C0980bu.a("processName");
    public static final C0980bu c = C0980bu.a("pid");
    public static final C0980bu d = C0980bu.a("importance");
    public static final C0980bu e = C0980bu.a("defaultProcess");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        C1963k8 c1963k8 = (C1963k8) ((AbstractC0221Dj) obj);
        interfaceC2240nP.a(b, c1963k8.a);
        interfaceC2240nP.e(c, c1963k8.b);
        interfaceC2240nP.e(d, c1963k8.c);
        interfaceC2240nP.d(e, c1963k8.d);
    }
}
