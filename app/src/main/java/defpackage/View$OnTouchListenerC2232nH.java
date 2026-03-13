package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
/* renamed from: nH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC2232nH implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ View$OnTouchListenerC2232nH(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1327f4 c1327f4;
        switch (this.b) {
            case 0:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                AbstractC2318oH abstractC2318oH = (AbstractC2318oH) this.c;
                if (action == 0 && (c1327f4 = abstractC2318oH.x) != null && c1327f4.isShowing() && x >= 0 && x < abstractC2318oH.x.getWidth() && y >= 0 && y < abstractC2318oH.x.getHeight()) {
                    abstractC2318oH.t.postDelayed(abstractC2318oH.p, 250L);
                    return false;
                } else if (action == 1) {
                    abstractC2318oH.t.removeCallbacks(abstractC2318oH.p);
                    return false;
                } else {
                    return false;
                }
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.c).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
