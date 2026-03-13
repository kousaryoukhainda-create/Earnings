package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* renamed from: Uk  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0663Uk extends OJ {
    public final RectF A;
    public int B;
    public final Paint z;

    public C0663Uk(C1236e10 c1236e10) {
        super(c1236e10 == null ? new C1236e10() : c1236e10);
        Paint paint = new Paint(1);
        this.z = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A = new RectF();
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.B);
        }
    }

    @Override // defpackage.OJ
    public final void e(Canvas canvas) {
        RectF rectF = this.A;
        if (rectF.isEmpty()) {
            super.e(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.e(canvas2);
        canvas2.drawRect(rectF, this.z);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void n(float f, float f2, float f3, float f4) {
        RectF rectF = this.A;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
