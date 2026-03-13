package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: W6  reason: default package */
/* loaded from: classes.dex */
public final class W6 implements InterfaceC2154mP {
    public static final W6 a = new Object();
    public static final C0980bu b = C0980bu.a("threads");
    public static final C0980bu c = C0980bu.a(Constants.EXCEPTION);
    public static final C0980bu d = C0980bu.a("appExitInfo");
    public static final C0980bu e = C0980bu.a("signal");
    public static final C0980bu f = C0980bu.a("binaries");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        C1002c8 c1002c8 = (C1002c8) ((AbstractC0195Cj) obj);
        interfaceC2240nP.a(b, c1002c8.a);
        interfaceC2240nP.a(c, c1002c8.b);
        interfaceC2240nP.a(d, c1002c8.c);
        interfaceC2240nP.a(e, c1002c8.d);
        interfaceC2240nP.a(f, c1002c8.e);
    }
}
