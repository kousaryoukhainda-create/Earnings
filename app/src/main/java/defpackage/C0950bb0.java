package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: bb0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950bb0 extends Sa0 {
    public static final PorterDuff.Mode l = PorterDuff.Mode.SRC_IN;
    public Za0 c;
    public PorterDuffColorFilter d;
    public ColorFilter f;
    public boolean g;
    public boolean h;
    public final float[] i;
    public final Matrix j;
    public final Rect k;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, Za0] */
    public C0950bb0() {
        this.h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = l;
        constantState.b = new Ya0();
        this.c = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            AbstractC0746Xp.b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.k;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            Matrix matrix = this.j;
            canvas.getMatrix(matrix);
            float[] fArr = this.i;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && AbstractC2870uj.B(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                Za0 za0 = this.c;
                Bitmap bitmap = za0.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != za0.f.getHeight()) {
                    za0.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    za0.k = true;
                }
                if (!this.h) {
                    Za0 za02 = this.c;
                    za02.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(za02.f);
                    Ya0 ya0 = za02.b;
                    ya0.a(ya0.g, Ya0.p, canvas2, min, min2);
                } else {
                    Za0 za03 = this.c;
                    if (za03.k || za03.g != za03.c || za03.h != za03.d || za03.j != za03.e || za03.i != za03.b.getRootAlpha()) {
                        Za0 za04 = this.c;
                        za04.f.eraseColor(0);
                        Canvas canvas3 = new Canvas(za04.f);
                        Ya0 ya02 = za04.b;
                        ya02.a(ya02.g, Ya0.p, canvas3, min, min2);
                        Za0 za05 = this.c;
                        za05.g = za05.c;
                        za05.h = za05.d;
                        za05.i = za05.b.getRootAlpha();
                        za05.j = za05.e;
                        za05.k = false;
                    }
                }
                Za0 za06 = this.c;
                if (za06.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (za06.l == null) {
                        Paint paint2 = new Paint();
                        za06.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    za06.l.setAlpha(za06.b.getRootAlpha());
                    za06.l.setColorFilter(colorFilter);
                    paint = za06.l;
                }
                canvas.drawBitmap(za06.f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.c.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return AbstractC0746Xp.c(drawable);
        }
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.b != null && Build.VERSION.SDK_INT >= 24) {
            return new C0859ab0(this.b.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.c.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.c.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            Za0 za0 = this.c;
            if (za0 != null) {
                Ya0 ya0 = za0.b;
                if (ya0.n == null) {
                    ya0.n = Boolean.valueOf(ya0.g.a());
                }
                if (ya0.n.booleanValue() || ((colorStateList = this.c.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, Za0] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            Za0 za0 = this.c;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = l;
            if (za0 != null) {
                constantState.a = za0.a;
                Ya0 ya0 = new Ya0(za0.b);
                constantState.b = ya0;
                if (za0.b.e != null) {
                    ya0.e = new Paint(za0.b.e);
                }
                if (za0.b.d != null) {
                    constantState.b.d = new Paint(za0.b.d);
                }
                constantState.c = za0.c;
                constantState.d = za0.d;
                constantState.e = za0.e;
            }
            this.c = constantState;
            this.g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Za0 za0 = this.c;
        ColorStateList colorStateList = za0.c;
        if (colorStateList != null && (mode = za0.d) != null) {
            this.d = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        Ya0 ya0 = za0.b;
        if (ya0.n == null) {
            ya0.n = Boolean.valueOf(ya0.g.a());
        }
        if (ya0.n.booleanValue()) {
            boolean b = za0.b.g.b(iArr);
            za0.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.c.b.getRootAlpha() != i) {
            this.c.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            AbstractC2870uj.X(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            AbstractC0746Xp.h(drawable, colorStateList);
            return;
        }
        Za0 za0 = this.c;
        if (za0.c != colorStateList) {
            za0.c = colorStateList;
            this.d = a(colorStateList, za0.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            AbstractC0746Xp.i(drawable, mode);
            return;
        }
        Za0 za0 = this.c;
        if (za0.d != mode) {
            za0.d = mode;
            this.d = a(za0.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [Ua0, Xa0, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Ya0 ya0;
        int i;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.b;
        if (drawable != null) {
            AbstractC0746Xp.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        Za0 za0 = this.c;
        za0.b = new Ya0();
        TypedArray V = AbstractC0957bf.V(resources, theme, attributeSet, B10.c);
        Za0 za02 = this.c;
        Ya0 ya02 = za02.b;
        int i2 = !AbstractC0957bf.K(xmlPullParser, "tintMode") ? -1 : V.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        za02.d = mode;
        int i3 = 1;
        ColorStateList colorStateList = null;
        if (AbstractC0957bf.K(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            V.getValue(1, typedValue);
            int i4 = typedValue.type;
            if (i4 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i4 >= 28 && i4 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = V.getResources();
                int resourceId = V.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0657Ue.a;
                try {
                    colorStateList = AbstractC0657Ue.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            za02.c = colorStateList2;
        }
        boolean z = za02.e;
        if (AbstractC0957bf.K(xmlPullParser, "autoMirrored")) {
            z = V.getBoolean(5, z);
        }
        za02.e = z;
        float f = ya02.j;
        if (AbstractC0957bf.K(xmlPullParser, "viewportWidth")) {
            f = V.getFloat(7, f);
        }
        ya02.j = f;
        float f2 = ya02.k;
        if (AbstractC0957bf.K(xmlPullParser, "viewportHeight")) {
            f2 = V.getFloat(8, f2);
        }
        ya02.k = f2;
        if (ya02.j <= 0.0f) {
            throw new XmlPullParserException(V.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            ya02.h = V.getDimension(3, ya02.h);
            float dimension = V.getDimension(2, ya02.i);
            ya02.i = dimension;
            if (ya02.h <= 0.0f) {
                throw new XmlPullParserException(V.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = ya02.getAlpha();
                if (AbstractC0957bf.K(xmlPullParser, "alpha")) {
                    alpha = V.getFloat(4, alpha);
                }
                ya02.setAlpha(alpha);
                String string = V.getString(0);
                if (string != null) {
                    ya02.m = string;
                    ya02.o.put(string, ya02);
                }
                V.recycle();
                za0.a = getChangingConfigurations();
                za0.k = true;
                Za0 za03 = this.c;
                Ya0 ya03 = za03.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(ya03.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                for (int i5 = 3; eventType != i3 && (xmlPullParser.getDepth() >= depth || eventType != i5); i5 = 3) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        Va0 va0 = (Va0) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        C1243e5 c1243e5 = ya03.o;
                        if (equals) {
                            ?? xa0 = new Xa0();
                            xa0.e = 0.0f;
                            xa0.g = 1.0f;
                            xa0.h = 1.0f;
                            xa0.i = 0.0f;
                            xa0.j = 1.0f;
                            xa0.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            xa0.l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            xa0.m = join3;
                            ya0 = ya03;
                            xa0.n = 4.0f;
                            TypedArray V2 = AbstractC0957bf.V(resources, theme, attributeSet, B10.e);
                            if (AbstractC0957bf.K(xmlPullParser, "pathData")) {
                                String string2 = V2.getString(0);
                                if (string2 != null) {
                                    xa0.b = string2;
                                }
                                String string3 = V2.getString(2);
                                if (string3 != null) {
                                    xa0.a = AbstractC1281eb.p(string3);
                                }
                                xa0.f = AbstractC0957bf.B(V2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = xa0.h;
                                if (AbstractC0957bf.K(xmlPullParser, "fillAlpha")) {
                                    f3 = V2.getFloat(12, f3);
                                }
                                xa0.h = f3;
                                int i6 = !AbstractC0957bf.K(xmlPullParser, "strokeLineCap") ? -1 : V2.getInt(8, -1);
                                Paint.Cap cap3 = xa0.l;
                                if (i6 != 0) {
                                    join = join3;
                                    if (i6 != 1) {
                                        cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                xa0.l = cap;
                                int i7 = !AbstractC0957bf.K(xmlPullParser, "strokeLineJoin") ? -1 : V2.getInt(9, -1);
                                Paint.Join join4 = xa0.m;
                                if (i7 == 0) {
                                    join2 = join;
                                } else if (i7 != 1) {
                                    join2 = i7 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                xa0.m = join2;
                                float f4 = xa0.n;
                                if (AbstractC0957bf.K(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = V2.getFloat(10, f4);
                                }
                                xa0.n = f4;
                                xa0.d = AbstractC0957bf.B(V2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = xa0.g;
                                if (AbstractC0957bf.K(xmlPullParser, "strokeAlpha")) {
                                    f5 = V2.getFloat(11, f5);
                                }
                                xa0.g = f5;
                                float f6 = xa0.e;
                                if (AbstractC0957bf.K(xmlPullParser, "strokeWidth")) {
                                    f6 = V2.getFloat(4, f6);
                                }
                                xa0.e = f6;
                                float f7 = xa0.j;
                                if (AbstractC0957bf.K(xmlPullParser, "trimPathEnd")) {
                                    f7 = V2.getFloat(6, f7);
                                }
                                xa0.j = f7;
                                float f8 = xa0.k;
                                if (AbstractC0957bf.K(xmlPullParser, "trimPathOffset")) {
                                    f8 = V2.getFloat(7, f8);
                                }
                                xa0.k = f8;
                                float f9 = xa0.i;
                                if (AbstractC0957bf.K(xmlPullParser, "trimPathStart")) {
                                    f9 = V2.getFloat(5, f9);
                                }
                                xa0.i = f9;
                                int i8 = xa0.c;
                                if (AbstractC0957bf.K(xmlPullParser, "fillType")) {
                                    i8 = V2.getInt(13, i8);
                                }
                                xa0.c = i8;
                            }
                            V2.recycle();
                            va0.b.add(xa0);
                            if (xa0.getPathName() != null) {
                                c1243e5.put(xa0.getPathName(), xa0);
                            }
                            za03.a = za03.a;
                            z2 = false;
                        } else {
                            ya0 = ya03;
                            if ("clip-path".equals(name)) {
                                Xa0 xa02 = new Xa0();
                                if (AbstractC0957bf.K(xmlPullParser, "pathData")) {
                                    TypedArray V3 = AbstractC0957bf.V(resources, theme, attributeSet, B10.f);
                                    String string4 = V3.getString(0);
                                    if (string4 != null) {
                                        xa02.b = string4;
                                    }
                                    String string5 = V3.getString(1);
                                    if (string5 != null) {
                                        xa02.a = AbstractC1281eb.p(string5);
                                    }
                                    xa02.c = !AbstractC0957bf.K(xmlPullParser, "fillType") ? 0 : V3.getInt(2, 0);
                                    V3.recycle();
                                }
                                va0.b.add(xa02);
                                if (xa02.getPathName() != null) {
                                    c1243e5.put(xa02.getPathName(), xa02);
                                }
                                za03.a = za03.a;
                            } else if ("group".equals(name)) {
                                Va0 va02 = new Va0();
                                TypedArray V4 = AbstractC0957bf.V(resources, theme, attributeSet, B10.d);
                                float f10 = va02.c;
                                if (AbstractC0957bf.K(xmlPullParser, "rotation")) {
                                    f10 = V4.getFloat(5, f10);
                                }
                                va02.c = f10;
                                va02.d = V4.getFloat(1, va02.d);
                                va02.e = V4.getFloat(2, va02.e);
                                float f11 = va02.f;
                                if (AbstractC0957bf.K(xmlPullParser, "scaleX")) {
                                    f11 = V4.getFloat(3, f11);
                                }
                                va02.f = f11;
                                float f12 = va02.g;
                                if (AbstractC0957bf.K(xmlPullParser, "scaleY")) {
                                    f12 = V4.getFloat(4, f12);
                                }
                                va02.g = f12;
                                float f13 = va02.h;
                                if (AbstractC0957bf.K(xmlPullParser, "translateX")) {
                                    f13 = V4.getFloat(6, f13);
                                }
                                va02.h = f13;
                                float f14 = va02.i;
                                if (AbstractC0957bf.K(xmlPullParser, "translateY")) {
                                    f14 = V4.getFloat(7, f14);
                                }
                                va02.i = f14;
                                String string6 = V4.getString(0);
                                if (string6 != null) {
                                    va02.k = string6;
                                }
                                va02.c();
                                V4.recycle();
                                va0.b.add(va02);
                                arrayDeque.push(va02);
                                if (va02.getGroupName() != null) {
                                    c1243e5.put(va02.getGroupName(), va02);
                                }
                                za03.a = za03.a;
                            }
                        }
                    } else {
                        ya0 = ya03;
                        i = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i;
                    ya03 = ya0;
                    i3 = 1;
                }
                if (!z2) {
                    this.d = a(za0.c, za0.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(V.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(V.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public C0950bb0(Za0 za0) {
        this.h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.c = za0;
        this.d = a(za0.c, za0.d);
    }
}
