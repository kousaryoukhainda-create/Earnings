package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
/* renamed from: i10  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1580i10 extends AbstractC2122m10 {
    public final C1950k10 b;
    public final float c;
    public final float d;

    public C1580i10(C1950k10 c1950k10, float f, float f2) {
        this.b = c1950k10;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.AbstractC2122m10
    public final void a(Matrix matrix, C0989c10 c0989c10, int i, Canvas canvas) {
        C1950k10 c1950k10 = this.b;
        float f = c1950k10.c;
        float f2 = this.d;
        float f3 = c1950k10.b;
        float f4 = this.c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        c0989c10.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C0989c10.i;
        iArr[0] = c0989c10.c;
        iArr[1] = c0989c10.b;
        iArr[2] = c0989c10.a;
        Paint paint = (Paint) c0989c10.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C0989c10.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        C1950k10 c1950k10 = this.b;
        return (float) Math.toDegrees(Math.atan((c1950k10.c - this.d) / (c1950k10.b - this.c)));
    }
}
