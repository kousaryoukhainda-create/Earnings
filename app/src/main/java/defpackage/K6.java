package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: K6  reason: default package */
/* loaded from: classes.dex */
public final class K6 implements InterfaceC2154mP {
    public static final K6 a = new Object();
    public static final C0980bu b = C0980bu.a("arch");
    public static final C0980bu c = C0980bu.a("libraryName");
    public static final C0980bu d = C0980bu.a(Constants.BUILD_ID);

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        P7 p7 = (P7) ((AbstractC2441pj) obj);
        interfaceC2240nP.a(b, p7.a);
        interfaceC2240nP.a(c, p7.b);
        interfaceC2240nP.a(d, p7.c);
    }
}
