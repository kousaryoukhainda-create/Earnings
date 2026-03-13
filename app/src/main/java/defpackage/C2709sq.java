package defpackage;

import android.widget.AutoCompleteTextView;
/* renamed from: sq  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2709sq implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ C2795tq a;

    public C2709sq(C2795tq c2795tq) {
        this.a = c2795tq;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        C2795tq c2795tq = this.a;
        c2795tq.j = true;
        c2795tq.l = System.currentTimeMillis();
        c2795tq.g(false);
    }
}
