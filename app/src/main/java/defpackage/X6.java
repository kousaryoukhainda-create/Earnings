package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: X6  reason: default package */
/* loaded from: classes.dex */
public final class X6 implements InterfaceC2154mP {
    public static final X6 a = new Object();
    public static final C0980bu b = C0980bu.a("type");
    public static final C0980bu c = C0980bu.a(Constants.REASON);
    public static final C0980bu d = C0980bu.a("frames");
    public static final C0980bu e = C0980bu.a("causedBy");
    public static final C0980bu f = C0980bu.a("overflowCount");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        C1249e8 c1249e8 = (C1249e8) ((AbstractC3214yj) obj);
        interfaceC2240nP.a(b, c1249e8.a);
        interfaceC2240nP.a(c, c1249e8.b);
        interfaceC2240nP.a(d, c1249e8.c);
        interfaceC2240nP.a(e, c1249e8.d);
        interfaceC2240nP.e(f, c1249e8.e);
    }
}
