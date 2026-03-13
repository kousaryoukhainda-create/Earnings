package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
/* renamed from: OJ  reason: default package */
/* loaded from: classes3.dex */
public class OJ extends Drawable implements K60, InterfaceC2294o10 {
    public static final Paint y;
    public NJ b;
    public final AbstractC2122m10[] c;
    public final AbstractC2122m10[] d;
    public final BitSet f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public C1236e10 o;
    public final Paint p;
    public final Paint q;
    public final C0989c10 r;
    public final WC s;
    public final C2923vL t;
    public PorterDuffColorFilter u;
    public PorterDuffColorFilter v;
    public final RectF w;
    public final boolean x;

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public OJ() {
        this(new C1236e10());
    }

    public final void a(RectF rectF, Path path) {
        NJ nj = this.b;
        this.t.b(nj.a, nj.i, rectF, this.s, path);
        if (this.b.h != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    public final int b(int i) {
        float f;
        int i2;
        NJ nj = this.b;
        float f2 = nj.m + 0.0f + nj.l;
        C0643Tq c0643Tq = nj.b;
        if (c0643Tq != null && c0643Tq.a && AbstractC0683Ve.d(i, 255) == c0643Tq.d) {
            float f3 = c0643Tq.e;
            if (f3 > 0.0f && f2 > 0.0f) {
                f = Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f = 0.0f;
            }
            int alpha = Color.alpha(i);
            int C = AbstractC2618rm.C(f, AbstractC0683Ve.d(i, 255), c0643Tq.b);
            if (f > 0.0f && (i2 = c0643Tq.c) != 0) {
                C = AbstractC0683Ve.b(AbstractC0683Ve.d(i2, C0643Tq.f), C);
            }
            return AbstractC0683Ve.d(C, alpha);
        }
        return i;
    }

    public final void c(Canvas canvas) {
        if (this.f.cardinality() > 0) {
            Log.w("OJ", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.b.o;
        Path path = this.i;
        C0989c10 c0989c10 = this.r;
        if (i != 0) {
            canvas.drawPath(path, (Paint) c0989c10.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC2122m10 abstractC2122m10 = this.c[i2];
            int i3 = this.b.n;
            Matrix matrix = AbstractC2122m10.a;
            abstractC2122m10.a(matrix, c0989c10, i3, canvas);
            this.d[i2].a(matrix, c0989c10, this.b.n, canvas);
        }
        if (this.x) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.b.o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.b.o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, y);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, C1236e10 c1236e10, RectF rectF) {
        if (c1236e10.d(rectF)) {
            float a = c1236e10.f.a(rectF) * this.b.i;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        Paint paint = this.p;
        paint.setColorFilter(this.u);
        int alpha = paint.getAlpha();
        int i = this.b.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.q;
        paint2.setColorFilter(this.v);
        paint2.setStrokeWidth(this.b.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.b.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.g;
        Path path = this.i;
        if (z) {
            float f2 = 0.0f;
            if (g()) {
                f = paint2.getStrokeWidth() / 2.0f;
            } else {
                f = 0.0f;
            }
            float f3 = -f;
            C1236e10 c1236e10 = this.b.a;
            C1151d10 e = c1236e10.e();
            InterfaceC0298Gi interfaceC0298Gi = c1236e10.e;
            if (!(interfaceC0298Gi instanceof MV)) {
                interfaceC0298Gi = new C2896v2(f3, interfaceC0298Gi);
            }
            e.e = interfaceC0298Gi;
            InterfaceC0298Gi interfaceC0298Gi2 = c1236e10.f;
            if (!(interfaceC0298Gi2 instanceof MV)) {
                interfaceC0298Gi2 = new C2896v2(f3, interfaceC0298Gi2);
            }
            e.f = interfaceC0298Gi2;
            InterfaceC0298Gi interfaceC0298Gi3 = c1236e10.h;
            if (!(interfaceC0298Gi3 instanceof MV)) {
                interfaceC0298Gi3 = new C2896v2(f3, interfaceC0298Gi3);
            }
            e.h = interfaceC0298Gi3;
            InterfaceC0298Gi interfaceC0298Gi4 = c1236e10.g;
            if (!(interfaceC0298Gi4 instanceof MV)) {
                interfaceC0298Gi4 = new C2896v2(f3, interfaceC0298Gi4);
            }
            e.g = interfaceC0298Gi4;
            C1236e10 a = e.a();
            this.o = a;
            float f4 = this.b.i;
            RectF rectF = this.l;
            rectF.set(f());
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.t.b(a, f4, rectF, null, this.j);
            a(f(), path);
            this.g = false;
        }
        NJ nj = this.b;
        nj.getClass();
        if (nj.n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.b.a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.b.o), (int) (Math.cos(Math.toRadians(d)) * this.b.o));
                if (!this.x) {
                    c(canvas);
                    canvas.restore();
                } else {
                    RectF rectF2 = this.w;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width >= 0 && height >= 0) {
                        Bitmap createBitmap = Bitmap.createBitmap((this.b.n * 2) + ((int) rectF2.width()) + width, (this.b.n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f5 = (getBounds().left - this.b.n) - width;
                        float f6 = (getBounds().top - this.b.n) - height;
                        canvas2.translate(-f5, -f6);
                        c(canvas2);
                        canvas.drawBitmap(createBitmap, f5, f6, (Paint) null);
                        createBitmap.recycle();
                        canvas.restore();
                    } else {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                }
            }
        }
        NJ nj2 = this.b;
        Paint.Style style = nj2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, nj2.a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        float f;
        Paint paint = this.q;
        Path path = this.j;
        C1236e10 c1236e10 = this.o;
        RectF rectF = this.l;
        rectF.set(f());
        if (g()) {
            f = paint.getStrokeWidth() / 2.0f;
        } else {
            f = 0.0f;
        }
        rectF.inset(f, f);
        d(canvas, paint, path, c1236e10, rectF);
    }

    public final RectF f() {
        RectF rectF = this.k;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.b.p;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.q.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.b.getClass();
        if (this.b.a.d(f())) {
            outline.setRoundRect(getBounds(), this.b.a.e.a(f()) * this.b.i);
            return;
        }
        RectF f = f();
        Path path = this.i;
        a(f, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.g;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF f = f();
        Path path = this.i;
        a(f, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.b.b = new C0643Tq(context);
        m();
    }

    public final void i(float f) {
        NJ nj = this.b;
        if (nj.m != f) {
            nj.m = f;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.b.e) == null || !colorStateList.isStateful())) {
            this.b.getClass();
            ColorStateList colorStateList3 = this.b.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.b.c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        NJ nj = this.b;
        if (nj.c != colorStateList) {
            nj.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.c != null && color2 != (colorForState2 = this.b.c.getColorForState(iArr, (color2 = (paint2 = this.p).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.b.d != null && color != (colorForState = this.b.d.getColorForState(iArr, (color = (paint = this.q).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u;
        PorterDuffColorFilter porterDuffColorFilter4 = this.v;
        NJ nj = this.b;
        ColorStateList colorStateList = nj.e;
        PorterDuff.Mode mode = nj.f;
        Paint paint = this.p;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = paint.getColor();
            int b = b(color);
            if (b != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(b, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
            porterDuffColorFilter2 = porterDuffColorFilter;
        }
        this.u = porterDuffColorFilter2;
        this.b.getClass();
        this.v = null;
        this.b.getClass();
        if (!Objects.equals(porterDuffColorFilter3, this.u) || !Objects.equals(porterDuffColorFilter4, this.v)) {
            return true;
        }
        return false;
    }

    public final void m() {
        NJ nj = this.b;
        float f = nj.m + 0.0f;
        nj.n = (int) Math.ceil(0.75f * f);
        this.b.o = (int) Math.ceil(f * 0.25f);
        l();
        super.invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, NJ] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        NJ nj = this.b;
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = null;
        constantState.e = null;
        constantState.f = PorterDuff.Mode.SRC_IN;
        constantState.g = null;
        constantState.h = 1.0f;
        constantState.i = 1.0f;
        constantState.k = 255;
        constantState.l = 0.0f;
        constantState.m = 0.0f;
        constantState.n = 0;
        constantState.o = 0;
        constantState.p = Paint.Style.FILL_AND_STROKE;
        constantState.a = nj.a;
        constantState.b = nj.b;
        constantState.j = nj.j;
        constantState.c = nj.c;
        constantState.d = nj.d;
        constantState.f = nj.f;
        constantState.e = nj.e;
        constantState.k = nj.k;
        constantState.h = nj.h;
        constantState.o = nj.o;
        constantState.i = nj.i;
        constantState.l = nj.l;
        constantState.m = nj.m;
        constantState.n = nj.n;
        constantState.p = nj.p;
        if (nj.g != null) {
            constantState.g = new Rect(nj.g);
        }
        this.b = constantState;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.g = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean k = k(iArr);
        boolean l = l();
        if (!k && !l) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        NJ nj = this.b;
        if (nj.k != i) {
            nj.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.InterfaceC2294o10
    public final void setShapeAppearanceModel(C1236e10 c1236e10) {
        this.b.a = c1236e10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        NJ nj = this.b;
        if (nj.f != mode) {
            nj.f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public OJ(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C1236e10.b(context, attributeSet, i, i2).a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, NJ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OJ(defpackage.C1236e10 r4) {
        /*
            r3 = this;
            NJ r0 = new NJ
            r0.<init>()
            r1 = 0
            r0.c = r1
            r0.d = r1
            r0.e = r1
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.f = r2
            r0.g = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.h = r2
            r0.i = r2
            r2 = 255(0xff, float:3.57E-43)
            r0.k = r2
            r2 = 0
            r0.l = r2
            r0.m = r2
            r2 = 0
            r0.n = r2
            r0.o = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.p = r2
            r0.a = r4
            r0.b = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OJ.<init>(e10):void");
    }

    public OJ(NJ nj) {
        C2923vL c2923vL;
        this.c = new AbstractC2122m10[4];
        this.d = new AbstractC2122m10[4];
        this.f = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.p = paint;
        Paint paint2 = new Paint(1);
        this.q = paint2;
        this.r = new C0989c10();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c2923vL = AbstractC1322f10.a;
        } else {
            c2923vL = new C2923vL();
        }
        this.t = c2923vL;
        this.w = new RectF();
        this.x = true;
        this.b = nj;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.s = new WC(this, 23);
    }
}
