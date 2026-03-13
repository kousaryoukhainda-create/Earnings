package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: d80  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1165d80 implements Cloneable {
    public static final int[] w = {2, 1, 3, 4};
    public static final C1314ew x = new C1314ew(18);
    public static final ThreadLocal y = new ThreadLocal();
    public ArrayList m;
    public ArrayList n;
    public B10 u;
    public final String b = getClass().getName();
    public long c = -1;
    public long d = -1;
    public LinearInterpolator f = null;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public R70 i = new R70(8);
    public R70 j = new R70(8);
    public C1594i80 k = null;
    public final int[] l = w;
    public final ArrayList o = new ArrayList();
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public ArrayList s = null;
    public ArrayList t = new ArrayList();
    public C1314ew v = x;

    public static void d(R70 r70, View view, C1964k80 c1964k80) {
        ((C1243e5) r70.c).put(view, c1964k80);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) r70.d;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = Sb0.a;
        String k = Hb0.k(view);
        if (k != null) {
            C1243e5 c1243e5 = (C1243e5) r70.g;
            if (c1243e5.containsKey(k)) {
                c1243e5.put(k, null);
            } else {
                c1243e5.put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                LI li = (LI) r70.f;
                if (li.b) {
                    li.e();
                }
                if (AbstractC1906jZ.h(li.c, li.f, itemIdAtPosition) >= 0) {
                    View view2 = (View) li.g(null, itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        li.h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                li.h(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [e5, Z10, java.lang.Object] */
    public static C1243e5 r() {
        ThreadLocal threadLocal = y;
        C1243e5 c1243e5 = (C1243e5) threadLocal.get();
        if (c1243e5 == null) {
            ?? z10 = new Z10();
            threadLocal.set(z10);
            return z10;
        }
        return c1243e5;
    }

    public static boolean x(C1964k80 c1964k80, C1964k80 c1964k802, String str) {
        Object obj = c1964k80.a.get(str);
        Object obj2 = c1964k802.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    public void A(View view) {
        this.h.remove(view);
    }

    public void B(View view) {
        if (this.q) {
            if (!this.r) {
                ArrayList arrayList = this.o;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.s;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.s.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((InterfaceC1003c80) arrayList3.get(i)).e();
                    }
                }
            }
            this.q = false;
        }
    }

    public void C() {
        J();
        C1243e5 r = r();
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (r.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new C0827a80(this, r));
                    long j = this.d;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.c;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    LinearInterpolator linearInterpolator = this.f;
                    if (linearInterpolator != null) {
                        animator.setInterpolator(linearInterpolator);
                    }
                    animator.addListener(new C1407g1(this, 3));
                    animator.start();
                }
            }
        }
        this.t.clear();
        p();
    }

    public void D(long j) {
        this.d = j;
    }

    public void E(B10 b10) {
        this.u = b10;
    }

    public void F(LinearInterpolator linearInterpolator) {
        this.f = linearInterpolator;
    }

    public void G(C1314ew c1314ew) {
        if (c1314ew == null) {
            this.v = x;
        } else {
            this.v = c1314ew;
        }
    }

    public void I(long j) {
        this.c = j;
    }

    public final void J() {
        if (this.p == 0) {
            ArrayList arrayList = this.s;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.s.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1003c80) arrayList2.get(i)).a(this);
                }
            }
            this.r = false;
        }
        this.p++;
    }

    public String K(String str) {
        StringBuilder l = AbstractC0324Hi.l(str);
        l.append(getClass().getSimpleName());
        l.append("@");
        l.append(Integer.toHexString(hashCode()));
        l.append(": ");
        String sb = l.toString();
        if (this.d != -1) {
            sb = BK.n(BK.p(sb, "dur("), this.d, ") ");
        }
        if (this.c != -1) {
            sb = BK.n(BK.p(sb, "dly("), this.c, ") ");
        }
        if (this.f != null) {
            StringBuilder p = BK.p(sb, "interp(");
            p.append(this.f);
            p.append(") ");
            sb = p.toString();
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        if (size > 0 || arrayList2.size() > 0) {
            String f = AbstractC0324Hi.f(sb, "tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        f = AbstractC0324Hi.f(f, ", ");
                    }
                    StringBuilder l2 = AbstractC0324Hi.l(f);
                    l2.append(arrayList.get(i));
                    f = l2.toString();
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        f = AbstractC0324Hi.f(f, ", ");
                    }
                    StringBuilder l3 = AbstractC0324Hi.l(f);
                    l3.append(arrayList2.get(i2));
                    f = l3.toString();
                }
            }
            return AbstractC0324Hi.f(f, ")");
        }
        return sb;
    }

    public void a(InterfaceC1003c80 interfaceC1003c80) {
        if (this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(interfaceC1003c80);
    }

    public void c(View view) {
        this.h.add(view);
    }

    public void e() {
        ArrayList arrayList = this.o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.s;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.s.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((InterfaceC1003c80) arrayList3.get(i)).d();
            }
        }
    }

    public abstract void g(C1964k80 c1964k80);

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1964k80 c1964k80 = new C1964k80(view);
            if (z) {
                j(c1964k80);
            } else {
                g(c1964k80);
            }
            c1964k80.c.add(this);
            i(c1964k80);
            if (z) {
                d(this.i, view, c1964k80);
            } else {
                d(this.j, view, c1964k80);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void j(C1964k80 c1964k80);

    public final void k(ViewGroup viewGroup, boolean z) {
        l(z);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        if (size <= 0 && arrayList2.size() <= 0) {
            h(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C1964k80 c1964k80 = new C1964k80(findViewById);
                if (z) {
                    j(c1964k80);
                } else {
                    g(c1964k80);
                }
                c1964k80.c.add(this);
                i(c1964k80);
                if (z) {
                    d(this.i, findViewById, c1964k80);
                } else {
                    d(this.j, findViewById, c1964k80);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C1964k80 c1964k802 = new C1964k80(view);
            if (z) {
                j(c1964k802);
            } else {
                g(c1964k802);
            }
            c1964k802.c.add(this);
            i(c1964k802);
            if (z) {
                d(this.i, view, c1964k802);
            } else {
                d(this.j, view, c1964k802);
            }
        }
    }

    public final void l(boolean z) {
        if (z) {
            ((C1243e5) this.i.c).clear();
            ((SparseArray) this.i.d).clear();
            ((LI) this.i.f).c();
            return;
        }
        ((C1243e5) this.j.c).clear();
        ((SparseArray) this.j.d).clear();
        ((LI) this.j.f).c();
    }

    @Override // 
    /* renamed from: m */
    public AbstractC1165d80 clone() {
        try {
            AbstractC1165d80 abstractC1165d80 = (AbstractC1165d80) super.clone();
            abstractC1165d80.t = new ArrayList();
            abstractC1165d80.i = new R70(8);
            abstractC1165d80.j = new R70(8);
            abstractC1165d80.m = null;
            abstractC1165d80.n = null;
            return abstractC1165d80;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, C1964k80 c1964k80, C1964k80 c1964k802) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, b80] */
    public void o(ViewGroup viewGroup, R70 r70, R70 r702, ArrayList arrayList, ArrayList arrayList2) {
        Animator n;
        int i;
        View view;
        C1964k80 c1964k80;
        Animator animator;
        C1243e5 r = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C1964k80 c1964k802 = (C1964k80) arrayList.get(i2);
            C1964k80 c1964k803 = (C1964k80) arrayList2.get(i2);
            C1964k80 c1964k804 = null;
            if (c1964k802 != null && !c1964k802.c.contains(this)) {
                c1964k802 = null;
            }
            if (c1964k803 != null && !c1964k803.c.contains(this)) {
                c1964k803 = null;
            }
            if ((c1964k802 == null && c1964k803 == null) || ((c1964k802 != null && c1964k803 != null && !v(c1964k802, c1964k803)) || (n = n(viewGroup, c1964k802, c1964k803)) == null)) {
                i = size;
            } else {
                String str = this.b;
                if (c1964k803 != null) {
                    String[] s = s();
                    view = c1964k803.b;
                    if (s != null && s.length > 0) {
                        c1964k80 = new C1964k80(view);
                        C1964k80 c1964k805 = (C1964k80) ((C1243e5) r702.c).getOrDefault(view, null);
                        i = size;
                        if (c1964k805 != null) {
                            int i3 = 0;
                            while (i3 < s.length) {
                                HashMap hashMap = c1964k80.a;
                                String str2 = s[i3];
                                hashMap.put(str2, c1964k805.a.get(str2));
                                i3++;
                                s = s;
                            }
                        }
                        int i4 = r.d;
                        for (int i5 = 0; i5 < i4; i5++) {
                            animator = null;
                            C0918b80 c0918b80 = (C0918b80) r.getOrDefault((Animator) r.h(i5), null);
                            if (c0918b80.c != null && c0918b80.a == view && c0918b80.b.equals(str) && c0918b80.c.equals(c1964k80)) {
                                break;
                            }
                        }
                    } else {
                        i = size;
                        c1964k80 = null;
                    }
                    animator = n;
                    n = animator;
                    c1964k804 = c1964k80;
                } else {
                    i = size;
                    view = c1964k802.b;
                }
                if (n != null) {
                    C2170mc0 c2170mc0 = AbstractC1998kc0.a;
                    C3031wd0 c3031wd0 = new C3031wd0(viewGroup);
                    ?? obj = new Object();
                    obj.a = view;
                    obj.b = str;
                    obj.c = c1964k804;
                    obj.d = c3031wd0;
                    obj.e = this;
                    r.put(n, obj);
                    this.t.add(n);
                }
            }
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator2 = (Animator) this.t.get(sparseIntArray.keyAt(i6));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void p() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            ArrayList arrayList = this.s;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.s.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC1003c80) arrayList2.get(i2)).c(this);
                }
            }
            for (int i3 = 0; i3 < ((LI) this.i.f).i(); i3++) {
                View view = (View) ((LI) this.i.f).j(i3);
                if (view != null) {
                    Field field = Sb0.a;
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((LI) this.j.f).i(); i4++) {
                View view2 = (View) ((LI) this.j.f).j(i4);
                if (view2 != null) {
                    Field field2 = Sb0.a;
                    view2.setHasTransientState(false);
                }
            }
            this.r = true;
        }
    }

    public final C1964k80 q(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1594i80 c1594i80 = this.k;
        if (c1594i80 != null) {
            return c1594i80.q(view, z);
        }
        if (z) {
            arrayList = this.m;
        } else {
            arrayList = this.n;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C1964k80 c1964k80 = (C1964k80) arrayList.get(i);
                if (c1964k80 == null) {
                    return null;
                }
                if (c1964k80.b == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.n;
        } else {
            arrayList2 = this.m;
        }
        return (C1964k80) arrayList2.get(i);
    }

    public String[] s() {
        return null;
    }

    public final String toString() {
        return K("");
    }

    public final C1964k80 u(View view, boolean z) {
        R70 r70;
        C1594i80 c1594i80 = this.k;
        if (c1594i80 != null) {
            return c1594i80.u(view, z);
        }
        if (z) {
            r70 = this.i;
        } else {
            r70 = this.j;
        }
        return (C1964k80) ((C1243e5) r70.c).getOrDefault(view, null);
    }

    public boolean v(C1964k80 c1964k80, C1964k80 c1964k802) {
        if (c1964k80 == null || c1964k802 == null) {
            return false;
        }
        String[] s = s();
        if (s != null) {
            for (String str : s) {
                if (!x(c1964k80, c1964k802, str)) {
                }
            }
            return false;
        }
        for (String str2 : c1964k80.a.keySet()) {
            if (x(c1964k80, c1964k802, str2)) {
            }
        }
        return false;
        return true;
    }

    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public void y(ViewGroup viewGroup) {
        if (!this.r) {
            ArrayList arrayList = this.o;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Animator) arrayList.get(size)).pause();
            }
            ArrayList arrayList2 = this.s;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) this.s.clone();
                int size2 = arrayList3.size();
                for (int i = 0; i < size2; i++) {
                    ((InterfaceC1003c80) arrayList3.get(i)).b();
                }
            }
            this.q = true;
        }
    }

    public void z(InterfaceC1003c80 interfaceC1003c80) {
        ArrayList arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC1003c80);
        if (this.s.size() == 0) {
            this.s = null;
        }
    }

    public void H() {
    }

    public void i(C1964k80 c1964k80) {
    }
}
