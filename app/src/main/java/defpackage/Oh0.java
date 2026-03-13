package defpackage;

import android.content.SharedPreferences;
import android.media.MediaCodec;
import com.applovin.impl.C1074o;
import com.applovin.impl.hl;
import com.applovin.impl.mediation.g;
import com.applovin.impl.o9;
import com.applovin.impl.r0;
import com.applovin.impl.rk;
import com.applovin.impl.sdk.k;
import com.applovin.impl.se;
import com.applovin.impl.u0;
import com.applovin.impl.vm;
import com.applovin.impl.w4;
import com.applovin.impl.wm;
import com.applovin.impl.xm;
/* renamed from: Oh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Oh0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Oh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                g.l((g) this.c);
                return;
            case 1:
                ((MediaCodec) this.c).start();
                return;
            case 2:
                ((hl) this.c).c();
                return;
            case 3:
                k.b((k) this.c);
                return;
            case 4:
                o9.e((o9) this.c);
                return;
            case 5:
                r0.P((r0) this.c);
                return;
            case 6:
                rk.a((rk) this.c);
                return;
            case 7:
                ((se) this.c).notifyDataSetChanged();
                return;
            case 8:
                u0.k((u0) this.c);
                return;
            case 9:
                ((C1074o) this.c).b();
                return;
            case 10:
                ((SharedPreferences.Editor) this.c).commit();
                return;
            case 11:
                vm.e((vm) this.c);
                return;
            case 12:
                ((w4) this.c).notifyDataSetChanged();
                return;
            case 13:
                wm.l((wm) this.c);
                return;
            default:
                xm.h((xm) this.c);
                return;
        }
    }
}
