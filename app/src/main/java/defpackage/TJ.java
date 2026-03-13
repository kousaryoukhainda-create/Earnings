package defpackage;

import android.view.View;
import com.applovin.impl.o9;
import com.applovin.impl.t6;
import com.applovin.impl.x4;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.fyber.fairbid.tj;
/* renamed from: TJ  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class TJ implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ TJ(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((MaxNativeAd) this.c).performClick();
                return;
            case 1:
                tj.b((tj) this.c, view);
                return;
            case 2:
                ((o9) this.c).b(view);
                return;
            case 3:
                t6.a((t6) this.c, view);
                return;
            default:
                ((x4) this.c).a(view);
                return;
        }
    }
}
