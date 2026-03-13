package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
/* renamed from: Mn  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458Mn extends e {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((i) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [Kn, java.lang.Object] */
    @Override // androidx.recyclerview.widget.e
    public final boolean a(i iVar, i iVar2, C1901jU c1901jU, C1901jU c1901jU2) {
        int i;
        int i2;
        int i3 = c1901jU.b;
        int i4 = c1901jU.c;
        if (iVar2.shouldIgnore()) {
            int i5 = c1901jU.b;
            i2 = c1901jU.c;
            i = i5;
        } else {
            i = c1901jU2.b;
            i2 = c1901jU2.c;
        }
        if (iVar == iVar2) {
            return g(iVar, i3, i4, i, i2);
        }
        float translationX = iVar.itemView.getTranslationX();
        float translationY = iVar.itemView.getTranslationY();
        float alpha = iVar.itemView.getAlpha();
        l(iVar);
        iVar.itemView.setTranslationX(translationX);
        iVar.itemView.setTranslationY(translationY);
        iVar.itemView.setAlpha(alpha);
        l(iVar2);
        iVar2.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        iVar2.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        iVar2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ?? obj = new Object();
        obj.a = iVar;
        obj.b = iVar2;
        obj.c = i3;
        obj.d = i4;
        obj.e = i;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    @Override // androidx.recyclerview.widget.e
    public final void d(i iVar) {
        View view = iVar.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0433Ln) arrayList.get(size)).a == iVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(iVar);
                arrayList.remove(size);
            }
        }
        j(this.k, iVar);
        if (this.h.remove(iVar)) {
            view.setAlpha(1.0f);
            c(iVar);
        }
        if (this.i.remove(iVar)) {
            view.setAlpha(1.0f);
            c(iVar);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, iVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0433Ln) arrayList5.get(size4)).a == iVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(iVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(iVar)) {
                view.setAlpha(1.0f);
                c(iVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(iVar);
        this.o.remove(iVar);
        this.r.remove(iVar);
        this.p.remove(iVar);
        i();
    }

    @Override // androidx.recyclerview.widget.e
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0433Ln c0433Ln = (C0433Ln) arrayList.get(size);
            View view = c0433Ln.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0433Ln.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((i) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            i iVar = (i) arrayList3.get(size3);
            iVar.itemView.setAlpha(1.0f);
            c(iVar);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0407Kn c0407Kn = (C0407Kn) arrayList4.get(size4);
            i iVar2 = c0407Kn.a;
            if (iVar2 != null) {
                k(c0407Kn, iVar2);
            }
            i iVar3 = c0407Kn.b;
            if (iVar3 != null) {
                k(c0407Kn, iVar3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.m;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                C0433Ln c0433Ln2 = (C0433Ln) arrayList6.get(size6);
                View view2 = c0433Ln2.a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(c0433Ln2.a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.l;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                i iVar4 = (i) arrayList8.get(size8);
                iVar4.itemView.setAlpha(1.0f);
                c(iVar4);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.n;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                C0407Kn c0407Kn2 = (C0407Kn) arrayList10.get(size10);
                i iVar5 = c0407Kn2.a;
                if (iVar5 != null) {
                    k(c0407Kn2, iVar5);
                }
                i iVar6 = c0407Kn2.b;
                if (iVar6 != null) {
                    k(c0407Kn2, iVar6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        h(this.q);
        h(this.p);
        h(this.o);
        h(this.r);
        ArrayList arrayList11 = this.b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            arrayList11.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean f() {
        if (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [Ln, java.lang.Object] */
    public final boolean g(i iVar, int i, int i2, int i3, int i4) {
        View view = iVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) iVar.itemView.getTranslationY());
        l(iVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(iVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.a = iVar;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i3;
        obj.e = i4;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void j(ArrayList arrayList, i iVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0407Kn c0407Kn = (C0407Kn) arrayList.get(size);
            if (k(c0407Kn, iVar) && c0407Kn.a == null && c0407Kn.b == null) {
                arrayList.remove(c0407Kn);
            }
        }
    }

    public final boolean k(C0407Kn c0407Kn, i iVar) {
        if (c0407Kn.b == iVar) {
            c0407Kn.b = null;
        } else if (c0407Kn.a == iVar) {
            c0407Kn.a = null;
        } else {
            return false;
        }
        iVar.itemView.setAlpha(1.0f);
        iVar.itemView.setTranslationX(0.0f);
        iVar.itemView.setTranslationY(0.0f);
        c(iVar);
        return true;
    }

    public final void l(i iVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        iVar.itemView.animate().setInterpolator(s);
        d(iVar);
    }
}
