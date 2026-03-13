package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* renamed from: QD  reason: default package */
/* loaded from: classes3.dex */
public final class QD implements View.OnTouchListener {
    public final Dialog b;
    public final int c;
    public final int d;
    public final int f;

    public QD(Dialog dialog, Rect rect) {
        this.b = dialog;
        this.c = rect.left;
        this.d = rect.top;
        this.f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.c;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.d;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.b.onTouchEvent(obtain);
    }
}
