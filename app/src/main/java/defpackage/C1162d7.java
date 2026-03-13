package defpackage;

import io.flutter.plugins.firebase.crashlytics.Constants;
/* renamed from: d7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162d7 implements InterfaceC2154mP {
    public static final C1162d7 a = new Object();
    public static final C0980bu b = C0980bu.a(Constants.TIMESTAMP);
    public static final C0980bu c = C0980bu.a("type");
    public static final C0980bu d = C0980bu.a("app");
    public static final C0980bu e = C0980bu.a("device");
    public static final C0980bu f = C0980bu.a("log");
    public static final C0980bu g = C0980bu.a("rollouts");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        C0826a8 c0826a8 = (C0826a8) ((AbstractC0403Kj) obj);
        interfaceC2240nP.g(b, c0826a8.a);
        interfaceC2240nP.a(c, c0826a8.b);
        interfaceC2240nP.a(d, c0826a8.c);
        interfaceC2240nP.a(e, c0826a8.d);
        interfaceC2240nP.a(f, c0826a8.e);
        interfaceC2240nP.a(g, c0826a8.f);
    }
}
