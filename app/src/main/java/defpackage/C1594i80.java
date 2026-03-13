package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: i80  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1594i80 extends AbstractC1165d80 {
    public int B;
    public ArrayList z = new ArrayList();
    public boolean A = true;
    public boolean C = false;
    public int D = 0;

    @Override // defpackage.AbstractC1165d80
    public final void A(View view) {
        for (int i = 0; i < this.z.size(); i++) {
            ((AbstractC1165d80) this.z.get(i)).A(view);
        }
        this.h.remove(view);
    }

    @Override // defpackage.AbstractC1165d80
    public final void B(View view) {
        super.B(view);
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1165d80) this.z.get(i)).B(view);
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void C() {
        if (this.z.isEmpty()) {
            J();
            p();
            return;
        }
        C0464Mt c0464Mt = new C0464Mt();
        c0464Mt.b = this;
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((AbstractC1165d80) it.next()).a(c0464Mt);
        }
        this.B = this.z.size();
        if (!this.A) {
            for (int i = 1; i < this.z.size(); i++) {
                ((AbstractC1165d80) this.z.get(i - 1)).a(new C0464Mt((AbstractC1165d80) this.z.get(i), 1));
            }
            AbstractC1165d80 abstractC1165d80 = (AbstractC1165d80) this.z.get(0);
            if (abstractC1165d80 != null) {
                abstractC1165d80.C();
                return;
            }
            return;
        }
        Iterator it2 = this.z.iterator();
        while (it2.hasNext()) {
            ((AbstractC1165d80) it2.next()).C();
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void D(long j) {
        ArrayList arrayList;
        this.d = j;
        if (j >= 0 && (arrayList = this.z) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1165d80) this.z.get(i)).D(j);
            }
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void E(B10 b10) {
        this.u = b10;
        this.D |= 8;
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1165d80) this.z.get(i)).E(b10);
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void F(LinearInterpolator linearInterpolator) {
        this.D |= 1;
        ArrayList arrayList = this.z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1165d80) this.z.get(i)).F(linearInterpolator);
            }
        }
        this.f = linearInterpolator;
    }

    @Override // defpackage.AbstractC1165d80
    public final void G(C1314ew c1314ew) {
        super.G(c1314ew);
        this.D |= 4;
        if (this.z != null) {
            for (int i = 0; i < this.z.size(); i++) {
                ((AbstractC1165d80) this.z.get(i)).G(c1314ew);
            }
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void H() {
        this.D |= 2;
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1165d80) this.z.get(i)).H();
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void I(long j) {
        this.c = j;
    }

    @Override // defpackage.AbstractC1165d80
    public final String K(String str) {
        String K = super.K(str);
        for (int i = 0; i < this.z.size(); i++) {
            StringBuilder p = BK.p(K, "\n");
            p.append(((AbstractC1165d80) this.z.get(i)).K(str + "  "));
            K = p.toString();
        }
        return K;
    }

    public final void L(AbstractC1165d80 abstractC1165d80) {
        this.z.add(abstractC1165d80);
        abstractC1165d80.k = this;
        long j = this.d;
        if (j >= 0) {
            abstractC1165d80.D(j);
        }
        if ((this.D & 1) != 0) {
            abstractC1165d80.F(this.f);
        }
        if ((this.D & 2) != 0) {
            abstractC1165d80.H();
        }
        if ((this.D & 4) != 0) {
            abstractC1165d80.G(this.v);
        }
        if ((this.D & 8) != 0) {
            abstractC1165d80.E(this.u);
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void c(View view) {
        for (int i = 0; i < this.z.size(); i++) {
            ((AbstractC1165d80) this.z.get(i)).c(view);
        }
        this.h.add(view);
    }

    @Override // defpackage.AbstractC1165d80
    public final void e() {
        super.e();
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1165d80) this.z.get(i)).e();
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void g(C1964k80 c1964k80) {
        if (w(c1964k80.b)) {
            Iterator it = this.z.iterator();
            while (it.hasNext()) {
                AbstractC1165d80 abstractC1165d80 = (AbstractC1165d80) it.next();
                if (abstractC1165d80.w(c1964k80.b)) {
                    abstractC1165d80.g(c1964k80);
                    c1964k80.c.add(abstractC1165d80);
                }
            }
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void i(C1964k80 c1964k80) {
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1165d80) this.z.get(i)).i(c1964k80);
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void j(C1964k80 c1964k80) {
        if (w(c1964k80.b)) {
            Iterator it = this.z.iterator();
            while (it.hasNext()) {
                AbstractC1165d80 abstractC1165d80 = (AbstractC1165d80) it.next();
                if (abstractC1165d80.w(c1964k80.b)) {
                    abstractC1165d80.j(c1964k80);
                    c1964k80.c.add(abstractC1165d80);
                }
            }
        }
    }

    @Override // defpackage.AbstractC1165d80
    /* renamed from: m */
    public final AbstractC1165d80 clone() {
        C1594i80 c1594i80 = (C1594i80) super.clone();
        c1594i80.z = new ArrayList();
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            AbstractC1165d80 clone = ((AbstractC1165d80) this.z.get(i)).clone();
            c1594i80.z.add(clone);
            clone.k = c1594i80;
        }
        return c1594i80;
    }

    @Override // defpackage.AbstractC1165d80
    public final void o(ViewGroup viewGroup, R70 r70, R70 r702, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.c;
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            AbstractC1165d80 abstractC1165d80 = (AbstractC1165d80) this.z.get(i);
            if (j > 0 && (this.A || i == 0)) {
                long j2 = abstractC1165d80.c;
                if (j2 > 0) {
                    abstractC1165d80.I(j2 + j);
                } else {
                    abstractC1165d80.I(j);
                }
            }
            abstractC1165d80.o(viewGroup, r70, r702, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC1165d80
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1165d80) this.z.get(i)).y(viewGroup);
        }
    }
}
