package defpackage;
/* renamed from: fH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346fH {
    public static void a(long j, Object obj) {
        AbstractC1319f0 abstractC1319f0 = (AbstractC1319f0) ((InterfaceC2572rE) AbstractC1033ca0.c.h(j, obj));
        if (abstractC1319f0.b) {
            abstractC1319f0.b = false;
        }
    }

    public static InterfaceC2572rE b(long j, Object obj) {
        int i;
        InterfaceC2572rE interfaceC2572rE = (InterfaceC2572rE) AbstractC1033ca0.c.h(j, obj);
        if (!((AbstractC1319f0) interfaceC2572rE).b) {
            UT ut = (UT) interfaceC2572rE;
            int i2 = ut.d;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            UT g = ut.g(i);
            AbstractC1033ca0.o(obj, j, g);
            return g;
        }
        return interfaceC2572rE;
    }
}
