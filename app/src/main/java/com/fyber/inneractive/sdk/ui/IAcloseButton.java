package com.fyber.inneractive.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.p;
/* loaded from: classes.dex */
public class IAcloseButton extends View {
    public Paint a;
    public Path b;

    public IAcloseButton(Context context, int i, boolean z) {
        super(context);
        int i2;
        int a = p.a(10);
        if (z) {
            i2 = (i - (a * 2)) / 4;
        } else {
            i2 = 0;
        }
        int i3 = i2 + a;
        Point point = new Point(i3, i3);
        int i4 = i - i3;
        Point point2 = new Point(i3, i4);
        Point point3 = new Point(i4, i4);
        Point point4 = new Point(i4, i3);
        Path path = new Path();
        this.b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.b.moveTo(point.x, point.y);
        this.b.lineTo(point3.x, point3.y);
        this.b.moveTo(point2.x, point2.y);
        this.b.lineTo(point4.x, point4.y);
        this.b.close();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStrokeWidth(p.a(2));
        this.a.setColor(-1);
        this.a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.a.setAntiAlias(true);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-1436657061);
            gradientDrawable.setStroke(p.a(2), -1);
            p.a(this, gradientDrawable);
        }
        setPadding(a, a, a, a);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.b, this.a);
    }
}
