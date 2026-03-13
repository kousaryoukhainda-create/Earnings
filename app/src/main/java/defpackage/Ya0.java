package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
/* renamed from: Ya0  reason: default package */
/* loaded from: classes.dex */
public final class Ya0 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final Va0 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final C1243e5 o;

    /* JADX WARN: Type inference failed for: r0v4, types: [e5, Z10] */
    public Ya0() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new Z10();
        this.g = new Va0();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
        if (r0.j != 1.0f) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.Va0 r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Ya0.a(Va0, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [e5, Z10] */
    public Ya0(Ya0 ya0) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        ?? z10 = new Z10();
        this.o = z10;
        this.g = new Va0(ya0.g, z10);
        this.a = new Path(ya0.a);
        this.b = new Path(ya0.b);
        this.h = ya0.h;
        this.i = ya0.i;
        this.j = ya0.j;
        this.k = ya0.k;
        this.l = ya0.l;
        this.m = ya0.m;
        String str = ya0.m;
        if (str != null) {
            z10.put(str, this);
        }
        this.n = ya0.n;
    }
}
