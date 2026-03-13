package defpackage;

import android.os.Handler;
import android.widget.AbsListView;
/* renamed from: mH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2146mH implements AbsListView.OnScrollListener {
    public final /* synthetic */ AbstractC2318oH a;

    public C2146mH(AbstractC2318oH abstractC2318oH) {
        this.a = abstractC2318oH;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            AbstractC2318oH abstractC2318oH = this.a;
            if (abstractC2318oH.x.getInputMethodMode() != 2 && abstractC2318oH.x.getContentView() != null) {
                Handler handler = abstractC2318oH.t;
                RunnableC1974kH runnableC1974kH = abstractC2318oH.p;
                handler.removeCallbacks(runnableC1974kH);
                runnableC1974kH.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
