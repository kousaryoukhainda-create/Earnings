package defpackage;
/* renamed from: dH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175dH extends AbstractC1260eH {
    @Override // defpackage.AbstractC1260eH
    public final void a(long j, Object obj) {
        AbstractC1233e0 abstractC1233e0 = (AbstractC1233e0) ((InterfaceC2487qE) AbstractC0948ba0.c.i(j, obj));
        if (abstractC1233e0.b) {
            abstractC1233e0.b = false;
        }
    }

    @Override // defpackage.AbstractC1260eH
    public final void b(Object obj, long j, Object obj2) {
        Z90 z90 = AbstractC0948ba0.c;
        InterfaceC2487qE interfaceC2487qE = (InterfaceC2487qE) z90.i(j, obj);
        InterfaceC2487qE interfaceC2487qE2 = (InterfaceC2487qE) z90.i(j, obj2);
        int size = interfaceC2487qE.size();
        int size2 = interfaceC2487qE2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1233e0) interfaceC2487qE).b) {
                interfaceC2487qE = interfaceC2487qE.i(size2 + size);
            }
            interfaceC2487qE.addAll(interfaceC2487qE2);
        }
        if (size > 0) {
            interfaceC2487qE2 = interfaceC2487qE;
        }
        AbstractC0948ba0.o(obj, j, interfaceC2487qE2);
    }
}
