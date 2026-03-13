package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.C1079u;
import com.applovin.impl.j8;
import com.applovin.impl.n8;
import com.applovin.impl.o2;
import com.applovin.impl.q4;
import com.applovin.impl.r3;
import com.applovin.impl.sd;
import com.applovin.impl.u8;
import com.applovin.impl.ud;
import com.applovin.impl.uo;
import com.applovin.impl.ve;
import com.applovin.impl.wa;
import com.applovin.impl.xc;
import com.applovin.impl.xe;
import com.applovin.impl.xq;
import com.applovin.impl.z6;
import com.applovin.impl.z7;
import java.util.Map;
/* renamed from: Fk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Fk0 implements o2.a, n8, q4, wa.a, ve.a {
    public final /* synthetic */ int b;

    public /* synthetic */ Fk0(int i) {
        this.b = i;
    }

    @Override // com.applovin.impl.o2.a
    public o2 a(Bundle bundle) {
        r3 a;
        switch (this.b) {
            case 0:
                a = r3.a(bundle);
                return a;
            case 1:
                return sd.b(bundle);
            case 2:
                return sd.d.b(bundle);
            case 3:
                return sd.f.b(bundle);
            case 4:
                return C1079u.b(bundle);
            case 5:
                return C1079u.a.b(bundle);
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                return z7.c(bundle);
            case 7:
                return ud.b(bundle);
            case 8:
                return uo.c(bundle);
            case 15:
                return xq.b(bundle);
        }
    }

    @Override // com.applovin.impl.q4
    public void accept(Object obj) {
        z6.a aVar = (z6.a) obj;
        switch (this.b) {
            case 9:
                aVar.c();
                return;
            case 10:
                aVar.b();
                return;
            default:
                aVar.a();
                return;
        }
    }

    @Override // com.applovin.impl.ve.a
    public Object a(Object obj) {
        return xe.b((Long) obj);
    }

    @Override // com.applovin.impl.wa.a
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return wa.c(i, i2, i3, i4, i5);
    }

    @Override // com.applovin.impl.n8
    /* renamed from: a */
    public j8[] mo45a() {
        switch (this.b) {
            case 6:
                return u8.d();
            default:
                return xc.i();
        }
    }

    @Override // com.applovin.impl.n8
    public /* synthetic */ j8[] a(Uri uri, Map map) {
        int i = this.b;
        return Mj0.a(this, uri, map);
    }
}
