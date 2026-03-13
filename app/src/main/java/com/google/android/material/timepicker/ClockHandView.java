package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {
    public final ArrayList b;
    public final int c;
    public final float d;
    public final Paint f;
    public final RectF g;
    public final int h;
    public float i;
    public boolean j;
    public double k;
    public int l;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.b = new ArrayList();
        Paint paint = new Paint();
        this.f = paint;
        this.g = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3018wU.e, R.attr.materialClockStyle, 2131952718);
        this.l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.d = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = Sb0.a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f) {
        float f2 = f % 360.0f;
        this.i = f2;
        this.k = Math.toRadians(f2 - 90.0f);
        float cos = (this.l * ((float) Math.cos(this.k))) + (getWidth() / 2);
        float sin = (this.l * ((float) Math.sin(this.k))) + (getHeight() / 2);
        float f3 = this.c;
        this.g.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC1545he) it.next());
            if (Math.abs(clockFaceView.J - f2) > 0.001f) {
                clockFaceView.J = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        Paint paint = this.f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((this.l * ((float) Math.cos(this.k))) + width2, (this.l * ((float) Math.sin(this.k))) + f, this.c, paint);
        double sin = Math.sin(this.k);
        double cos = Math.cos(this.k);
        paint.setStrokeWidth(this.h);
        canvas.drawLine(width2, f, width + ((int) (cos * r11)), height + ((int) (r11 * sin)), paint);
        canvas.drawCircle(width2, f, this.d, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z = false;
            } else {
                z = this.j;
            }
            z2 = false;
        } else {
            this.j = false;
            z = false;
            z2 = true;
        }
        boolean z5 = this.j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        if (this.i != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || !z3) {
            if (z3 || z) {
                a(f);
            }
            this.j = z5 | z4;
            return true;
        }
        z4 = true;
        this.j = z5 | z4;
        return true;
    }
}
