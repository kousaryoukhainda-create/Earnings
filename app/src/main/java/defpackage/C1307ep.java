package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: ep  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1307ep implements InterfaceC0975bp {
    public final AbstractC2773td0 d;
    public int f;
    public int g;
    public AbstractC2773td0 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public C3224yp i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public C1307ep(AbstractC2773td0 abstractC2773td0) {
        this.d = abstractC2773td0;
    }

    @Override // defpackage.InterfaceC0975bp
    public final void a(InterfaceC0975bp interfaceC0975bp) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1307ep) it.next()).j) {
                return;
            }
        }
        this.c = true;
        AbstractC2773td0 abstractC2773td0 = this.a;
        if (abstractC2773td0 != null) {
            abstractC2773td0.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C1307ep c1307ep = null;
        int i = 0;
        while (it2.hasNext()) {
            C1307ep c1307ep2 = (C1307ep) it2.next();
            if (!(c1307ep2 instanceof C3224yp)) {
                i++;
                c1307ep = c1307ep2;
            }
        }
        if (c1307ep != null && i == 1 && c1307ep.j) {
            C3224yp c3224yp = this.i;
            if (c3224yp != null) {
                if (c3224yp.j) {
                    this.f = this.h * c3224yp.g;
                } else {
                    return;
                }
            }
            d(c1307ep.g + this.f);
        }
        AbstractC2773td0 abstractC2773td02 = this.a;
        if (abstractC2773td02 != null) {
            abstractC2773td02.a(this);
        }
    }

    public final void b(AbstractC2773td0 abstractC2773td0) {
        this.k.add(abstractC2773td0);
        if (this.j) {
            abstractC2773td0.a(abstractC2773td0);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
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

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
