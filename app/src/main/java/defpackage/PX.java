package defpackage;

import java.util.ArrayList;
/* renamed from: PX  reason: default package */
/* loaded from: classes.dex */
public final class PX {
    public AbstractC2773td0 a;
    public ArrayList b;

    public static long a(C1307ep c1307ep, long j) {
        AbstractC2773td0 abstractC2773td0 = c1307ep.d;
        if (abstractC2773td0 instanceof AB) {
            return j;
        }
        ArrayList arrayList = c1307ep.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0975bp interfaceC0975bp = (InterfaceC0975bp) arrayList.get(i);
            if (interfaceC0975bp instanceof C1307ep) {
                C1307ep c1307ep2 = (C1307ep) interfaceC0975bp;
                if (c1307ep2.d != abstractC2773td0) {
                    j2 = Math.min(j2, a(c1307ep2, c1307ep2.f + j));
                }
            }
        }
        if (c1307ep == abstractC2773td0.i) {
            long j3 = abstractC2773td0.j();
            C1307ep c1307ep3 = abstractC2773td0.h;
            long j4 = j - j3;
            return Math.min(Math.min(j2, a(c1307ep3, j4)), j4 - c1307ep3.f);
        }
        return j2;
    }

    public static long b(C1307ep c1307ep, long j) {
        AbstractC2773td0 abstractC2773td0 = c1307ep.d;
        if (abstractC2773td0 instanceof AB) {
            return j;
        }
        ArrayList arrayList = c1307ep.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0975bp interfaceC0975bp = (InterfaceC0975bp) arrayList.get(i);
            if (interfaceC0975bp instanceof C1307ep) {
                C1307ep c1307ep2 = (C1307ep) interfaceC0975bp;
                if (c1307ep2.d != abstractC2773td0) {
                    j2 = Math.max(j2, b(c1307ep2, c1307ep2.f + j));
                }
            }
        }
        if (c1307ep == abstractC2773td0.h) {
            long j3 = abstractC2773td0.j();
            C1307ep c1307ep3 = abstractC2773td0.i;
            long j4 = j + j3;
            return Math.max(Math.max(j2, b(c1307ep3, j4)), j4 - c1307ep3.f);
        }
        return j2;
    }
}
