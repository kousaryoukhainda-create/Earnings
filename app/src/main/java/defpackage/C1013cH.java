package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: cH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013cH extends AbstractC1260eH {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // defpackage.AbstractC1260eH
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) AbstractC0948ba0.c.i(j, obj);
        if (list instanceof InterfaceC2489qG) {
            unmodifiableList = ((InterfaceC2489qG) list).q();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof ZS) && (list instanceof InterfaceC2487qE)) {
                AbstractC1233e0 abstractC1233e0 = (AbstractC1233e0) ((InterfaceC2487qE) list);
                boolean z = abstractC1233e0.b;
                if (z && z) {
                    abstractC1233e0.b = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC0948ba0.o(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC1260eH
    public final void b(Object obj, long j, Object obj2) {
        C2403pG c2403pG;
        Z90 z90 = AbstractC0948ba0.c;
        List list = (List) z90.i(j, obj2);
        int size = list.size();
        List list2 = (List) z90.i(j, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC2489qG) {
                list2 = new C2403pG(size);
            } else if ((list2 instanceof ZS) && (list2 instanceof InterfaceC2487qE)) {
                list2 = ((InterfaceC2487qE) list2).i(size);
            } else {
                list2 = new ArrayList(size);
            }
            AbstractC0948ba0.o(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC0948ba0.o(obj, j, arrayList);
                c2403pG = arrayList;
            } else if (list2 instanceof K90) {
                C2403pG c2403pG2 = new C2403pG(list2.size() + size);
                c2403pG2.addAll((K90) list2);
                AbstractC0948ba0.o(obj, j, c2403pG2);
                c2403pG = c2403pG2;
            } else if ((list2 instanceof ZS) && (list2 instanceof InterfaceC2487qE)) {
                InterfaceC2487qE interfaceC2487qE = (InterfaceC2487qE) list2;
                if (!((AbstractC1233e0) interfaceC2487qE).b) {
                    list2 = interfaceC2487qE.i(list2.size() + size);
                    AbstractC0948ba0.o(obj, j, list2);
                }
            }
            list2 = c2403pG;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC0948ba0.o(obj, j, list);
    }
}
