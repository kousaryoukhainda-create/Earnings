package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
/* renamed from: rq  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class View$OnTouchListenerC2623rq implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView b;
    public final /* synthetic */ C2795tq c;

    public View$OnTouchListenerC2623rq(C2795tq c2795tq, AutoCompleteTextView autoCompleteTextView) {
        this.c = c2795tq;
        this.b = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C2795tq c2795tq = this.c;
            c2795tq.getClass();
            long currentTimeMillis = System.currentTimeMillis() - c2795tq.l;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                c2795tq.j = false;
            }
            C2795tq.d(c2795tq, this.b);
        }
        return false;
    }
}
