package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* renamed from: h10  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1494h10 extends AbstractC2122m10 {
    public final C1864j10 b;

    public C1494h10(C1864j10 c1864j10) {
        this.b = c1864j10;
    }

    @Override // defpackage.AbstractC2122m10
    public final void a(Matrix matrix, C0989c10 c0989c10, int i, Canvas canvas) {
        boolean z;
        C1864j10 c1864j10 = this.b;
        float f = c1864j10.f;
        float f2 = c1864j10.g;
        RectF rectF = new RectF(c1864j10.b, c1864j10.c, c1864j10.d, c1864j10.e);
        c0989c10.getClass();
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = (Path) c0989c10.h;
        int[] iArr = C0989c10.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c0989c10.c;
            iArr[2] = c0989c10.b;
            iArr[3] = c0989c10.a;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c0989c10.a;
            iArr[2] = c0989c10.b;
            iArr[3] = c0989c10.c;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (i / width);
            float[] fArr = C0989c10.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = (Paint) c0989c10.e;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, (Paint) c0989c10.g);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}
