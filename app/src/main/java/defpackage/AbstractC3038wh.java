package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: wh  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3038wh {
    public final ArrayList a = new ArrayList();
    public Object b;
    public final AbstractC0401Kh c;
    public C2432pe0 d;

    public AbstractC3038wh(AbstractC0401Kh abstractC0401Kh) {
        this.c = abstractC0401Kh;
    }

    public abstract boolean a(Fe0 fe0);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fe0 fe0 = (Fe0) it.next();
            if (a(fe0)) {
                this.a.add(fe0.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            AbstractC0401Kh abstractC0401Kh = this.c;
            synchronized (abstractC0401Kh.c) {
                try {
                    if (abstractC0401Kh.d.add(this)) {
                        if (abstractC0401Kh.d.size() == 1) {
                            abstractC0401Kh.e = abstractC0401Kh.a();
                            EI.c().a(AbstractC0401Kh.f, String.format("%s: initial state = %s", abstractC0401Kh.getClass().getSimpleName(), abstractC0401Kh.e), new Throwable[0]);
                            abstractC0401Kh.d();
                        }
                        Object obj = abstractC0401Kh.e;
                        this.b = obj;
                        d(this.d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.d, this.b);
    }

    public final void d(C2432pe0 c2432pe0, Object obj) {
        if (!this.a.isEmpty() && c2432pe0 != null) {
            if (obj != null && !b(obj)) {
                ArrayList arrayList = this.a;
                synchronized (c2432pe0.c) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (c2432pe0.a(str)) {
                                EI c = EI.c();
                                String str2 = C2432pe0.d;
                                c.a(str2, "Constraints met for " + str, new Throwable[0]);
                                arrayList2.add(str);
                            }
                        }
                        InterfaceC2346oe0 interfaceC2346oe0 = c2432pe0.a;
                        if (interfaceC2346oe0 != null) {
                            interfaceC2346oe0.f(arrayList2);
                        }
                    } finally {
                    }
                }
                return;
            }
            c2432pe0.b(this.a);
        }
    }
}
