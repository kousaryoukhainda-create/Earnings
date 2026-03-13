package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: oc  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC2341oc implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ RL c;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC2341oc(RL rl, int i) {
        this.b = i;
        this.c = rl;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.b) {
            case 0:
                View$OnKeyListenerC2684sc view$OnKeyListenerC2684sc = (View$OnKeyListenerC2684sc) this.c;
                if (view$OnKeyListenerC2684sc.d()) {
                    ArrayList arrayList = view$OnKeyListenerC2684sc.j;
                    if (arrayList.size() > 0 && !((C2598rc) arrayList.get(0)).a.w) {
                        View view = view$OnKeyListenerC2684sc.q;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C2598rc) it.next()).a.show();
                            }
                            return;
                        }
                        view$OnKeyListenerC2684sc.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                Y30 y30 = (Y30) this.c;
                if (y30.d()) {
                    XL xl = y30.j;
                    if (!xl.w) {
                        View view2 = y30.o;
                        if (view2 != null && view2.isShown()) {
                            xl.show();
                            return;
                        } else {
                            y30.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
