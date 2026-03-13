package defpackage;
/* renamed from: n7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219n7 implements InterfaceC2154mP {
    public static final C2219n7 a = new Object();
    public static final C0980bu b = new C0980bu("logSource", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(1))));
    public static final C0980bu c = new C0980bu("logEventDropped", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(2))));

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        AI ai = (AI) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.a(b, ai.a);
        interfaceC2240nP.a(c, ai.b);
    }
}
