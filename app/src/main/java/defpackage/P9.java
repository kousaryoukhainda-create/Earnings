package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: P9  reason: default package */
/* loaded from: classes.dex */
public abstract class P9 {
    public final ArrayList b = new ArrayList(1);
    public final HashSet c = new HashSet(1);
    public final C1394fq d = new C1394fq(new CopyOnWriteArrayList(), 0, null);
    public final C1394fq f = new C1394fq(new CopyOnWriteArrayList(), 0, null);
    public Looper g;
    public E60 h;
    public C1615iS i;

    public final C1394fq a(C1892jL c1892jL) {
        return new C1394fq(this.d.c, 0, c1892jL);
    }

    public abstract InterfaceC1179dL b(C1892jL c1892jL, C0172Bm c0172Bm, long j);

    public final void c(InterfaceC1978kL interfaceC1978kL) {
        HashSet hashSet = this.c;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC1978kL);
        if (!isEmpty && hashSet.isEmpty()) {
            d();
        }
    }

    public final void e(InterfaceC1978kL interfaceC1978kL) {
        this.g.getClass();
        HashSet hashSet = this.c;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC1978kL);
        if (isEmpty) {
            f();
        }
    }

    public E60 h() {
        return null;
    }

    public abstract VK i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void m(InterfaceC1978kL interfaceC1978kL, U70 u70, C1615iS c1615iS) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.g;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        B10.j(z);
        this.i = c1615iS;
        E60 e60 = this.h;
        this.b.add(interfaceC1978kL);
        if (this.g == null) {
            this.g = myLooper;
            this.c.add(interfaceC1978kL);
            n(u70);
        } else if (e60 != null) {
            e(interfaceC1978kL);
            interfaceC1978kL.a(this, e60);
        }
    }

    public abstract void n(U70 u70);

    public final void o(E60 e60) {
        this.h = e60;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1978kL) it.next()).a(this, e60);
        }
    }

    public abstract void p(InterfaceC1179dL interfaceC1179dL);

    public final void q(InterfaceC1978kL interfaceC1978kL) {
        ArrayList arrayList = this.b;
        arrayList.remove(interfaceC1978kL);
        if (arrayList.isEmpty()) {
            this.g = null;
            this.h = null;
            this.i = null;
            this.c.clear();
            r();
            return;
        }
        c(interfaceC1978kL);
    }

    public abstract void r();

    public final void s(InterfaceC1480gq interfaceC1480gq) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1308eq c1308eq = (C1308eq) it.next();
            if (c1308eq.a == interfaceC1480gq) {
                copyOnWriteArrayList.remove(c1308eq);
            }
        }
    }

    public final void t(InterfaceC2322oL interfaceC2322oL) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C2236nL c2236nL = (C2236nL) it.next();
            if (c2236nL.b == interfaceC2322oL) {
                copyOnWriteArrayList.remove(c2236nL);
            }
        }
    }

    public abstract void u(VK vk);

    public void d() {
    }

    public void f() {
    }
}
