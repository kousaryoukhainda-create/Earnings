package defpackage;
/* renamed from: S6  reason: default package */
/* loaded from: classes.dex */
public final class S6 implements InterfaceC2154mP {
    public static final S6 a = new Object();
    public static final C0980bu b = C0980bu.a("arch");
    public static final C0980bu c = C0980bu.a("model");
    public static final C0980bu d = C0980bu.a("cores");
    public static final C0980bu e = C0980bu.a("ram");
    public static final C0980bu f = C0980bu.a("diskSpace");
    public static final C0980bu g = C0980bu.a("simulator");
    public static final C0980bu h = C0980bu.a("state");
    public static final C0980bu i = C0980bu.a("manufacturer");
    public static final C0980bu j = C0980bu.a("modelClass");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        Y7 y7 = (Y7) ((AbstractC3042wj) obj);
        interfaceC2240nP.e(b, y7.a);
        interfaceC2240nP.a(c, y7.b);
        interfaceC2240nP.e(d, y7.c);
        interfaceC2240nP.g(e, y7.d);
        interfaceC2240nP.g(f, y7.e);
        interfaceC2240nP.d(g, y7.f);
        interfaceC2240nP.e(h, y7.g);
        interfaceC2240nP.a(i, y7.h);
        interfaceC2240nP.a(j, y7.i);
    }
}
