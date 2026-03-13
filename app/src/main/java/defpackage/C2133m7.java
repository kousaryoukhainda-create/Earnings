package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: m7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2133m7 implements InterfaceC2154mP {
    public static final C2133m7 a = new Object();
    public static final C0980bu b = new C0980bu("eventsDroppedCount", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(1))));
    public static final C0980bu c = new C0980bu(Constants.REASON, AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(3))));

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        C3178yI c3178yI = (C3178yI) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.g(b, c3178yI.a);
        interfaceC2240nP.a(c, c3178yI.b);
    }
}
