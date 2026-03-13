package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.ykapps.earnings.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: td  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2772td extends OJ implements Drawable.Callback, X50 {
    public static final int[] H0 = {16842910};
    public static final ShapeDrawable I0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public int[] A0;
    public float B;
    public ColorStateList B0;
    public float C;
    public WeakReference C0;
    public ColorStateList D;
    public TextUtils.TruncateAt D0;
    public float E;
    public boolean E0;
    public ColorStateList F;
    public int F0;
    public CharSequence G;
    public boolean G0;
    public boolean H;
    public Drawable I;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public RippleDrawable O;
    public ColorStateList P;
    public float Q;
    public SpannableStringBuilder R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public C1019cN W;
    public C1019cN X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public final Context g0;
    public final Paint h0;
    public final Paint.FontMetrics i0;
    public final RectF j0;
    public final PointF k0;
    public final Path l0;
    public final Y50 m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public ColorFilter w0;
    public PorterDuffColorFilter x0;
    public ColorStateList y0;
    public ColorStateList z;
    public PorterDuff.Mode z0;

    public C2772td(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131952641);
        this.C = -1.0f;
        this.h0 = new Paint(1);
        this.i0 = new Paint.FontMetrics();
        this.j0 = new RectF();
        this.k0 = new PointF();
        this.l0 = new Path();
        this.v0 = 255;
        this.z0 = PorterDuff.Mode.SRC_IN;
        this.C0 = new WeakReference(null);
        h(context);
        this.g0 = context;
        Y50 y50 = new Y50(this);
        this.m0 = y50;
        this.G = "";
        y50.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = H0;
        setState(iArr);
        if (!Arrays.equals(this.A0, iArr)) {
            this.A0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.E0 = true;
        int[] iArr2 = TW.a;
        I0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean t(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(float f) {
        if (this.C != f) {
            this.C = f;
            C1151d10 e = this.b.a.e();
            e.e = new C2462q(f);
            e.f = new C2462q(f);
            e.g = new C2462q(f);
            e.h = new C2462q(f);
            setShapeAppearanceModel(e.a());
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.I;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof Oe0) {
                drawable2 = ((Pe0) ((Oe0) drawable2)).h;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p = p();
            if (drawable != null) {
                drawable3 = AbstractC2870uj.g0(drawable).mutate();
            }
            this.I = drawable3;
            float p2 = p();
            U(drawable2);
            if (S()) {
                n(this.I);
            }
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void C(float f) {
        if (this.K != f) {
            float p = p();
            this.K = f;
            float p2 = p();
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (S()) {
                AbstractC0746Xp.h(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z) {
        if (this.H != z) {
            boolean S = S();
            this.H = z;
            boolean S2 = S();
            if (S != S2) {
                if (S2) {
                    n(this.I);
                } else {
                    U(this.I);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.G0) {
                NJ nj = this.b;
                if (nj.d != colorStateList) {
                    nj.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f) {
        if (this.E != f) {
            this.E = f;
            this.h0.setStrokeWidth(f);
            if (this.G0) {
                this.b.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.N;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof Oe0) {
                drawable2 = ((Pe0) ((Oe0) drawable2)).h;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q = q();
            if (drawable != null) {
                drawable3 = AbstractC2870uj.g0(drawable).mutate();
            }
            this.N = drawable3;
            int[] iArr = TW.a;
            this.O = new RippleDrawable(TW.a(this.F), this.N, I0);
            float q2 = q();
            U(drawable2);
            if (T()) {
                n(this.N);
            }
            invalidateSelf();
            if (q != q2) {
                u();
            }
        }
    }

    public final void I(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f) {
        if (this.Q != f) {
            this.Q = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (T()) {
                AbstractC0746Xp.h(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.M != z) {
            boolean T = T();
            this.M = z;
            boolean T2 = T();
            if (T != T2) {
                if (T2) {
                    n(this.N);
                } else {
                    U(this.N);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f) {
        if (this.a0 != f) {
            float p = p();
            this.a0 = f;
            float p2 = p();
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void O(float f) {
        if (this.Z != f) {
            float p = p();
            this.Z = f;
            float p2 = p();
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            this.B0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(V50 v50) {
        Y50 y50 = this.m0;
        if (y50.f != v50) {
            y50.f = v50;
            if (v50 != null) {
                TextPaint textPaint = y50.a;
                Context context = this.g0;
                C2429pd c2429pd = y50.b;
                v50.f(context, textPaint, c2429pd);
                X50 x50 = (X50) y50.e.get();
                if (x50 != null) {
                    textPaint.drawableState = x50.getState();
                }
                v50.e(context, textPaint, c2429pd);
                y50.d = true;
            }
            X50 x502 = (X50) y50.e.get();
            if (x502 != null) {
                C2772td c2772td = (C2772td) x502;
                c2772td.u();
                c2772td.invalidateSelf();
                c2772td.onStateChange(x502.getState());
            }
        }
    }

    public final boolean R() {
        if (this.T && this.U != null && this.t0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (this.H && this.I != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (this.M && this.N != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        ?? r11;
        RectF rectF;
        int i3;
        int i4;
        float f;
        boolean z;
        int i5;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.v0) != 0) {
            if (i < 255) {
                float f2 = bounds.left;
                float f3 = bounds.top;
                float f4 = bounds.right;
                float f5 = bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i2 = canvas.saveLayerAlpha(f2, f3, f4, f5, i);
                } else {
                    i2 = canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
                }
            } else {
                i2 = 0;
            }
            boolean z2 = this.G0;
            Paint paint = this.h0;
            RectF rectF2 = this.j0;
            if (!z2) {
                paint.setColor(this.n0);
                paint.setStyle(Paint.Style.FILL);
                rectF2.set(bounds);
                canvas.drawRoundRect(rectF2, r(), r(), paint);
            }
            if (!this.G0) {
                paint.setColor(this.o0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.w0;
                if (colorFilter == null) {
                    colorFilter = this.x0;
                }
                paint.setColorFilter(colorFilter);
                rectF2.set(bounds);
                canvas.drawRoundRect(rectF2, r(), r(), paint);
            }
            if (this.G0) {
                super.draw(canvas);
            }
            float f6 = 0.0f;
            if (this.E > 0.0f && !this.G0) {
                paint.setColor(this.q0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.G0) {
                    ColorFilter colorFilter2 = this.w0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.x0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f7 = this.E / 2.0f;
                rectF2.set(bounds.left + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
                float f8 = this.C - (this.E / 2.0f);
                canvas.drawRoundRect(rectF2, f8, f8, paint);
            }
            paint.setColor(this.r0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            if (!this.G0) {
                canvas.drawRoundRect(rectF2, r(), r(), paint);
                r11 = 0;
            } else {
                RectF rectF3 = new RectF(bounds);
                Path path = this.l0;
                NJ nj = this.b;
                this.t.b(nj.a, nj.i, rectF3, this.s, path);
                r11 = 0;
                d(canvas, paint, path, this.b.a, f());
            }
            if (S()) {
                o(bounds, rectF2);
                float f9 = rectF2.left;
                float f10 = rectF2.top;
                canvas.translate(f9, f10);
                this.I.setBounds(r11, r11, (int) rectF2.width(), (int) rectF2.height());
                this.I.draw(canvas);
                canvas.translate(-f9, -f10);
            }
            if (R()) {
                o(bounds, rectF2);
                float f11 = rectF2.left;
                float f12 = rectF2.top;
                canvas.translate(f11, f12);
                this.U.setBounds(r11, r11, (int) rectF2.width(), (int) rectF2.height());
                this.U.draw(canvas);
                canvas.translate(-f11, -f12);
            }
            if (this.E0 && this.G != null) {
                PointF pointF = this.k0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.G;
                Y50 y50 = this.m0;
                if (charSequence != null) {
                    float p = p() + this.Y + this.b0;
                    if (AbstractC2870uj.B(this) == 0) {
                        pointF.x = bounds.left + p;
                    } else {
                        pointF.x = bounds.right - p;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = y50.a;
                    Paint.FontMetrics fontMetrics = this.i0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF2.setEmpty();
                if (this.G != null) {
                    float p2 = p() + this.Y + this.b0;
                    float q = q() + this.f0 + this.c0;
                    if (AbstractC2870uj.B(this) == 0) {
                        rectF2.left = bounds.left + p2;
                        rectF2.right = bounds.right - q;
                    } else {
                        rectF2.left = bounds.left + q;
                        rectF2.right = bounds.right - p2;
                    }
                    rectF2.top = bounds.top;
                    rectF2.bottom = bounds.bottom;
                }
                V50 v50 = y50.f;
                TextPaint textPaint2 = y50.a;
                if (v50 != null) {
                    textPaint2.drawableState = getState();
                    y50.f.e(this.g0, textPaint2, y50.b);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.G.toString();
                if (!y50.d) {
                    f = y50.c;
                } else {
                    if (charSequence2 != null) {
                        f6 = textPaint2.measureText((CharSequence) charSequence2, (int) r11, charSequence2.length());
                    }
                    y50.c = f6;
                    y50.d = r11;
                    f = f6;
                }
                if (Math.round(f) > Math.round(rectF2.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i5 = canvas.save();
                    canvas.clipRect(rectF2);
                } else {
                    i5 = 0;
                }
                CharSequence charSequence3 = this.G;
                if (z && this.D0 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF2.width(), this.D0);
                }
                CharSequence charSequence4 = charSequence3;
                int length = charSequence4.length();
                float f13 = pointF.x;
                float f14 = pointF.y;
                i4 = 0;
                rectF = rectF2;
                i3 = i2;
                canvas.drawText(charSequence4, 0, length, f13, f14, textPaint2);
                if (z) {
                    canvas.restoreToCount(i5);
                }
            } else {
                rectF = rectF2;
                i3 = i2;
                i4 = 0;
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f15 = this.f0 + this.e0;
                    if (AbstractC2870uj.B(this) == 0) {
                        float f16 = bounds.right - f15;
                        rectF.right = f16;
                        rectF.left = f16 - this.Q;
                    } else {
                        float f17 = bounds.left + f15;
                        rectF.left = f17;
                        rectF.right = f17 + this.Q;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f18 = this.Q;
                    float f19 = exactCenterY - (f18 / 2.0f);
                    rectF.top = f19;
                    rectF.bottom = f19 + f18;
                }
                float f20 = rectF.left;
                float f21 = rectF.top;
                canvas.translate(f20, f21);
                this.N.setBounds(i4, i4, (int) rectF.width(), (int) rectF.height());
                int[] iArr = TW.a;
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                this.O.draw(canvas);
                canvas.translate(-f20, -f21);
            }
            if (this.v0 < 255) {
                canvas.restoreToCount(i3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float measureText;
        float p = p() + this.Y + this.b0;
        String charSequence = this.G.toString();
        Y50 y50 = this.m0;
        if (!y50.d) {
            measureText = y50.c;
        } else {
            if (charSequence == null) {
                measureText = 0.0f;
            } else {
                measureText = y50.a.measureText((CharSequence) charSequence, 0, charSequence.length());
            }
            y50.c = measureText;
            y50.d = false;
        }
        return Math.min(Math.round(q() + measureText + p + this.c0 + this.f0), this.F0);
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.G0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B, this.C);
        }
        outline.setAlpha(this.v0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        V50 v50;
        ColorStateList colorStateList;
        if (!s(this.z) && !s(this.A) && !s(this.D) && (((v50 = this.m0.f) == null || (colorStateList = v50.j) == null || !colorStateList.isStateful()) && ((!this.T || this.U == null || !this.S) && !t(this.I) && !t(this.U) && !s(this.y0)))) {
            return false;
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC2870uj.W(drawable, AbstractC2870uj.B(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(this.A0);
            }
            AbstractC0746Xp.h(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            AbstractC0746Xp.h(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (S() || R()) {
            float f = this.Y + this.Z;
            if (this.t0) {
                drawable = this.U;
            } else {
                drawable = this.I;
            }
            float f2 = this.K;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (AbstractC2870uj.B(this) == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.t0) {
                drawable2 = this.U;
            } else {
                drawable2 = this.I;
            }
            float f5 = this.K;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.g0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            onLayoutDirectionChanged |= AbstractC2870uj.W(this.I, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= AbstractC2870uj.W(this.U, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= AbstractC2870uj.W(this.N, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (S()) {
            onLevelChange |= this.I.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.G0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.A0);
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.Z;
        if (this.t0) {
            drawable = this.U;
        } else {
            drawable = this.I;
        }
        float f2 = this.K;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.a0;
    }

    public final float q() {
        if (T()) {
            return this.d0 + this.Q + this.e0;
        }
        return 0.0f;
    }

    public final float r() {
        if (this.G0) {
            return this.b.a.e.a(f());
        }
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.w0 != colorFilter) {
            this.w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.OJ, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.z0 != mode) {
            this.z0 = mode;
            ColorStateList colorStateList = this.y0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.x0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (S()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (R()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (T()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        InterfaceC2686sd interfaceC2686sd = (InterfaceC2686sd) this.C0.get();
        if (interfaceC2686sd != null) {
            Chip chip = (Chip) interfaceC2686sd;
            chip.b(chip.r);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2772td.v(int[], int[]):boolean");
    }

    public final void w(boolean z) {
        if (this.S != z) {
            this.S = z;
            float p = p();
            if (!z && this.t0) {
                this.t0 = false;
            }
            float p2 = p();
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.U != drawable) {
            float p = p();
            this.U = drawable;
            float p2 = p();
            U(this.U);
            n(this.U);
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.T && (drawable = this.U) != null && this.S) {
                AbstractC0746Xp.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z) {
        if (this.T != z) {
            boolean R = R();
            this.T = z;
            boolean R2 = R();
            if (R != R2) {
                if (R2) {
                    n(this.U);
                } else {
                    U(this.U);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
