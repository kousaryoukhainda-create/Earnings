package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.C1068i;
import com.applovin.impl.C1071l;
import com.applovin.impl.a9;
import com.applovin.impl.fh;
import com.applovin.impl.fo;
import com.applovin.impl.gc;
import com.applovin.impl.gg;
import com.applovin.impl.i9;
import com.applovin.impl.ii;
import com.applovin.impl.j0;
import com.applovin.impl.j8;
import com.applovin.impl.ki;
import com.applovin.impl.l1;
import com.applovin.impl.l6;
import com.applovin.impl.lr;
import com.applovin.impl.ma;
import com.applovin.impl.n8;
import com.applovin.impl.nf;
import com.applovin.impl.nh;
import com.applovin.impl.o2;
import com.applovin.impl.oe;
import com.applovin.impl.of;
import com.applovin.impl.oo;
import com.applovin.impl.ph;
import com.applovin.impl.po;
import com.applovin.impl.q0;
import com.applovin.impl.q6;
import com.applovin.impl.qh;
import com.applovin.impl.r0;
import com.applovin.impl.s0;
import com.applovin.impl.tl;
import com.applovin.impl.wa;
import java.util.Map;
/* renamed from: Jh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Jh0 implements o2.a, n8, wa.a, InterfaceC1006cA, gc.b {
    public final /* synthetic */ int b;

    public /* synthetic */ Jh0(int i) {
        this.b = i;
    }

    @Override // com.applovin.impl.o2.a
    public o2 a(Bundle bundle) {
        q6 a;
        switch (this.b) {
            case 0:
                return fh.d(bundle);
            case 1:
                return fo.b(bundle);
            case 2:
                return fo.b.b(bundle);
            case 3:
                return fo.d.b(bundle);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 14:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 25:
            default:
                return qh.f.b(bundle);
            case 9:
                return ki.c(bundle);
            case 11:
                return l1.b(bundle);
            case 12:
                return l6.d.d(bundle);
            case 13:
                return l6.f.b(bundle);
            case 15:
                return ma.d(bundle);
            case 19:
                return new nh(bundle);
            case 22:
                return oo.b(bundle);
            case 23:
                return ph.b(bundle);
            case 24:
                return po.b(bundle);
            case 26:
                a = q6.a(bundle);
                return a;
            case 27:
                return qh.b.b(bundle);
        }
    }

    @Override // defpackage.InterfaceC1006cA
    public Object apply(Object obj) {
        return oe.i((tl) obj);
    }

    @Override // com.applovin.impl.gc.b
    public void a(Object obj, a9 a9Var) {
        r0.w((s0) obj, a9Var);
    }

    @Override // com.applovin.impl.wa.a
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return nf.f(i, i2, i3, i4, i5);
    }

    @Override // com.applovin.impl.n8
    /* renamed from: a */
    public j8[] mo45a() {
        switch (this.b) {
            case 4:
                return gg.c();
            case 5:
                return C1068i.c();
            case 6:
                return i9.e();
            case 7:
                return ii.c();
            case 8:
                return j0.c();
            case 9:
            case 11:
            case 12:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            default:
                return q0.e();
            case 10:
                return C1071l.c();
            case 14:
                return lr.d();
            case 16:
                return Mj0.b();
            case 17:
                return nf.e();
            case 21:
                return of.h();
        }
    }

    @Override // com.applovin.impl.n8
    public /* synthetic */ j8[] a(Uri uri, Map map) {
        int i = this.b;
        return Mj0.a(this, uri, map);
    }
}
