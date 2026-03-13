package defpackage;
/* renamed from: z7  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3250z7 implements InterfaceC2154mP {
    public static final C3250z7 a = new Object();
    public static final C0980bu b = C0980bu.a("performance");
    public static final C0980bu c = C0980bu.a("crashlytics");
    public static final C0980bu d = C0980bu.a("sessionSamplingRate");

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        C2616rl c2616rl = (C2616rl) obj;
        InterfaceC2240nP interfaceC2240nP = (InterfaceC2240nP) obj2;
        interfaceC2240nP.a(b, c2616rl.a);
        interfaceC2240nP.a(c, c2616rl.b);
        interfaceC2240nP.f(d, c2616rl.c);
    }
}
