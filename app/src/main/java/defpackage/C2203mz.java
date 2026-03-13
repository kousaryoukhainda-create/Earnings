package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* renamed from: mz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2203mz extends AbstractC1575hz {
    @Override // defpackage.AbstractC1575hz
    public final void a(View view, Object obj) {
        ((AbstractC1165d80) obj).c(view);
    }

    @Override // defpackage.AbstractC1575hz
    public final void b(Object obj, ArrayList arrayList) {
        AbstractC1165d80 abstractC1165d80;
        AbstractC1165d80 abstractC1165d802 = (AbstractC1165d80) obj;
        if (abstractC1165d802 == null) {
            return;
        }
        int i = 0;
        if (abstractC1165d802 instanceof C1594i80) {
            C1594i80 c1594i80 = (C1594i80) abstractC1165d802;
            int size = c1594i80.z.size();
            while (i < size) {
                if (i >= 0 && i < c1594i80.z.size()) {
                    abstractC1165d80 = (AbstractC1165d80) c1594i80.z.get(i);
                } else {
                    abstractC1165d80 = null;
                }
                b(abstractC1165d80, arrayList);
                i++;
            }
        } else if (AbstractC1575hz.h(abstractC1165d802.g) && AbstractC1575hz.h(abstractC1165d802.h)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC1165d802.c((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.AbstractC1575hz
    public final void c(ViewGroup viewGroup, Object obj) {
        AbstractC1508h80.a(viewGroup, (AbstractC1165d80) obj);
    }

    @Override // defpackage.AbstractC1575hz
    public final boolean e(Object obj) {
        return obj instanceof AbstractC1165d80;
    }

    @Override // defpackage.AbstractC1575hz
    public final Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC1165d80) obj).clone();
        }
        return null;
    }

    @Override // defpackage.AbstractC1575hz
    public final Object j(Object obj, Object obj2, Object obj3) {
        AbstractC1165d80 abstractC1165d80 = (AbstractC1165d80) obj;
        AbstractC1165d80 abstractC1165d802 = (AbstractC1165d80) obj2;
        AbstractC1165d80 abstractC1165d803 = (AbstractC1165d80) obj3;
        if (abstractC1165d80 != null && abstractC1165d802 != null) {
            C1594i80 c1594i80 = new C1594i80();
            c1594i80.L(abstractC1165d80);
            c1594i80.L(abstractC1165d802);
            c1594i80.A = false;
            abstractC1165d80 = c1594i80;
        } else if (abstractC1165d80 == null) {
            if (abstractC1165d802 != null) {
                abstractC1165d80 = abstractC1165d802;
            } else {
                abstractC1165d80 = null;
            }
        }
        if (abstractC1165d803 != null) {
            C1594i80 c1594i802 = new C1594i80();
            if (abstractC1165d80 != null) {
                c1594i802.L(abstractC1165d80);
            }
            c1594i802.L(abstractC1165d803);
            return c1594i802;
        }
        return abstractC1165d80;
    }

    @Override // defpackage.AbstractC1575hz
    public final Object k(Object obj, Object obj2) {
        C1594i80 c1594i80 = new C1594i80();
        if (obj != null) {
            c1594i80.L((AbstractC1165d80) obj);
        }
        c1594i80.L((AbstractC1165d80) obj2);
        return c1594i80;
    }

    @Override // defpackage.AbstractC1575hz
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((AbstractC1165d80) obj).a(new C1945jz(view, arrayList));
    }

    @Override // defpackage.AbstractC1575hz
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC1165d80) obj).a(new C2031kz(this, obj2, arrayList, obj3, arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [B10, java.lang.Object] */
    @Override // defpackage.AbstractC1575hz
    public final void n(View view, Object obj) {
        if (view != null) {
            AbstractC1575hz.g(view, new Rect());
            ((AbstractC1165d80) obj).E(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [B10, java.lang.Object] */
    @Override // defpackage.AbstractC1575hz
    public final void o(Object obj, Rect rect) {
        ((AbstractC1165d80) obj).E(new Object());
    }

    @Override // defpackage.AbstractC1575hz
    public final void p(Object obj, C1997kc c1997kc, W1 w1) {
        AbstractC1165d80 abstractC1165d80 = (AbstractC1165d80) obj;
        Oc0 oc0 = new Oc0(abstractC1165d80, 18);
        synchronized (c1997kc) {
            while (c1997kc.c) {
                try {
                    try {
                        c1997kc.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (c1997kc.b != oc0) {
                c1997kc.b = oc0;
                if (c1997kc.a) {
                    ((AbstractC1165d80) oc0.c).e();
                }
            }
        }
        abstractC1165d80.a(new C2117lz(w1));
    }

    @Override // defpackage.AbstractC1575hz
    public final void q(Object obj, View view, ArrayList arrayList) {
        C1594i80 c1594i80 = (C1594i80) obj;
        ArrayList arrayList2 = c1594i80.h;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1575hz.d((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(c1594i80, arrayList);
    }

    @Override // defpackage.AbstractC1575hz
    public final void r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C1594i80 c1594i80 = (C1594i80) obj;
        if (c1594i80 != null) {
            ArrayList arrayList3 = c1594i80.h;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            t(c1594i80, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC1575hz
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        C1594i80 c1594i80 = new C1594i80();
        c1594i80.L((AbstractC1165d80) obj);
        return c1594i80;
    }

    public final void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        AbstractC1165d80 abstractC1165d80;
        AbstractC1165d80 abstractC1165d802 = (AbstractC1165d80) obj;
        int i = 0;
        if (abstractC1165d802 instanceof C1594i80) {
            C1594i80 c1594i80 = (C1594i80) abstractC1165d802;
            int size2 = c1594i80.z.size();
            while (i < size2) {
                if (i >= 0 && i < c1594i80.z.size()) {
                    abstractC1165d80 = (AbstractC1165d80) c1594i80.z.get(i);
                } else {
                    abstractC1165d80 = null;
                }
                t(abstractC1165d80, arrayList, arrayList2);
                i++;
            }
        } else if (AbstractC1575hz.h(abstractC1165d802.g)) {
            ArrayList arrayList3 = abstractC1165d802.h;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    abstractC1165d802.c((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC1165d802.A((View) arrayList.get(size3));
                }
            }
        }
    }
}
