package defpackage;

import com.google.android.gms.tagmanager.DataLayer;
/* renamed from: o7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2305o7 implements InterfaceC2154mP {
    public static final C2305o7 a = new Object();
    public static final C0980bu b = new C0980bu("projectNumber", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(1))));
    public static final C0980bu c = new C0980bu("messageId", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(2))));
    public static final C0980bu d = new C0980bu("instanceId", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(3))));
    public static final C0980bu e = new C0980bu("messageType", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(4))));
    public static final C0980bu f = new C0980bu("sdkPlatform", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(5))));
    public static final C0980bu g = new C0980bu("packageName", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(6))));
    public static final C0980bu h = new C0980bu("collapseKey", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(7))));
    public static final C0980bu i = new C0980bu("priority", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(8))));
    public static final C0980bu j = new C0980bu("ttl", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(9))));
    public static final C0980bu k = new C0980bu("topic", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(10))));
    public static final C0980bu l = new C0980bu("bulkId", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(11))));
    public static final C0980bu m = new C0980bu(DataLayer.EVENT_KEY, AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(12))));
    public static final C0980bu n = new C0980bu("analyticsLabel", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(13))));
    public static final C0980bu o = new C0980bu("campaignId", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(14))));
    public static final C0980bu p = new C0980bu("composerLabel", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(15))));

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        AM am = (AM) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.g(b, am.a);
        interfaceC2240nP.a(c, am.b);
        interfaceC2240nP.a(d, am.c);
        interfaceC2240nP.a(e, am.d);
        interfaceC2240nP.a(f, EnumC3268zM.ANDROID);
        interfaceC2240nP.a(g, am.e);
        interfaceC2240nP.a(h, am.f);
        interfaceC2240nP.e(i, am.g);
        interfaceC2240nP.e(j, am.h);
        interfaceC2240nP.a(k, am.i);
        interfaceC2240nP.g(l, 0L);
        interfaceC2240nP.a(m, EnumC3096xM.MESSAGE_DELIVERED);
        interfaceC2240nP.a(n, am.j);
        interfaceC2240nP.g(o, 0L);
        interfaceC2240nP.a(p, am.k);
    }
}
