package defpackage;
/* renamed from: kH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1974kH implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC2318oH c;

    public /* synthetic */ RunnableC1974kH(AbstractC2318oH abstractC2318oH, int i) {
        this.b = i;
        this.c = abstractC2318oH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                WL wl = this.c.d;
                if (wl != null) {
                    wl.setListSelectionHidden(true);
                    wl.requestLayout();
                    return;
                }
                return;
            default:
                AbstractC2318oH abstractC2318oH = this.c;
                WL wl2 = abstractC2318oH.d;
                if (wl2 != null && wl2.isAttachedToWindow() && abstractC2318oH.d.getCount() > abstractC2318oH.d.getChildCount() && abstractC2318oH.d.getChildCount() <= Integer.MAX_VALUE) {
                    abstractC2318oH.x.setInputMethodMode(2);
                    abstractC2318oH.show();
                    return;
                }
                return;
        }
    }
}
