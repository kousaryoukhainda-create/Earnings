package defpackage;
/* renamed from: s7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2648s7 implements InterfaceC2154mP {
    public static final C2648s7 a = new Object();
    public static final C0980bu b = new C0980bu("currentCacheSizeBytes", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(1))));
    public static final C0980bu c = new C0980bu("maxCacheSizeBytes", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(2))));

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        C2128m40 c2128m40 = (C2128m40) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.g(b, c2128m40.a);
        interfaceC2240nP.g(c, c2128m40.b);
    }
}
