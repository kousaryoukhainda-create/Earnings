package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: Q6  reason: default package */
/* loaded from: classes.dex */
public final class Q6 implements InterfaceC2154mP {
    public static final Q6 a = new Object();
    public static final C0980bu b = C0980bu.a(Constants.IDENTIFIER);
    public static final C0980bu c = C0980bu.a("version");
    public static final C0980bu d = C0980bu.a("displayVersion");
    public static final C0980bu e = C0980bu.a("organization");
    public static final C0980bu f = C0980bu.a("installationUuid");
    public static final C0980bu g = C0980bu.a("developmentPlatform");
    public static final C0980bu h = C0980bu.a("developmentPlatformVersion");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        V7 v7 = (V7) ((AbstractC2956vj) obj);
        interfaceC2240nP.a(b, v7.a);
        interfaceC2240nP.a(c, v7.b);
        interfaceC2240nP.a(d, v7.c);
        interfaceC2240nP.a(e, null);
        interfaceC2240nP.a(f, v7.d);
        interfaceC2240nP.a(g, v7.e);
        interfaceC2240nP.a(h, v7.f);
    }
}
