package defpackage;

import android.widget.PopupWindow;
/* renamed from: SL  reason: default package */
/* loaded from: classes.dex */
public final class SL implements PopupWindow.OnDismissListener {
    public final /* synthetic */ TL b;

    public SL(TL tl) {
        this.b = tl;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.b.c();
    }
}
