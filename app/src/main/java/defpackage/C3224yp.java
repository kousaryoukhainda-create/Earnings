package defpackage;

import java.util.Iterator;
/* renamed from: yp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3224yp extends C1307ep {
    public int m;

    public C3224yp(AbstractC2773td0 abstractC2773td0) {
        super(abstractC2773td0);
        if (abstractC2773td0 instanceof C1599iC) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.C1307ep
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            InterfaceC0975bp interfaceC0975bp = (InterfaceC0975bp) it.next();
            interfaceC0975bp.a(interfaceC0975bp);
        }
    }
}
