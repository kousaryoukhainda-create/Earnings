package defpackage;

import android.content.DialogInterface;
import com.applovin.impl.AbstractActivityC1082x;
import com.applovin.impl.adview.a;
import com.applovin.impl.sb;
/* renamed from: ff0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterface$OnDismissListenerC1376ff0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ DialogInterface$OnDismissListenerC1376ff0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                a.s((a) this.c, dialogInterface);
                return;
            case 1:
                sb.b((Runnable) this.c, dialogInterface);
                return;
            default:
                AbstractActivityC1082x.a((AbstractActivityC1082x) this.c, dialogInterface);
                return;
        }
    }
}
