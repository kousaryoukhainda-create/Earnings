package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
/* renamed from: da  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1194da extends FrameLayout {
    public static final View$OnTouchListenerC1032ca l = new Object();
    public InterfaceC0947ba b;
    public InterfaceC0856aa c;
    public int d;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public ColorStateList j;
    public PorterDuff.Mode k;

    public AbstractC1194da(Context context, AttributeSet attributeSet) {
        super(AbstractC0957bf.t0(context, attributeSet, 0, 0), attributeSet);
        Drawable g0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC3018wU.u);
        if (obtainStyledAttributes.hasValue(6)) {
            Field field = Sb0.a;
            Hb0.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC1522hL.x(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(B10.V(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.g = obtainStyledAttributes.getFloat(1, 1.0f);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(l);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(AbstractC2618rm.C(getBackgroundOverlayColorAlpha(), AbstractC2618rm.v(R.attr.colorSurface, this), AbstractC2618rm.v(R.attr.colorOnSurface, this)));
            if (this.j != null) {
                g0 = AbstractC2870uj.g0(gradientDrawable);
                AbstractC0746Xp.h(g0, this.j);
            } else {
                g0 = AbstractC2870uj.g0(gradientDrawable);
            }
            Field field2 = Sb0.a;
            setBackground(g0);
        }
    }

    public float getActionTextColorAlpha() {
        return this.g;
    }

    public int getAnimationMode() {
        return this.d;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f;
    }

    public int getMaxInlineActionWidth() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        InterfaceC0856aa interfaceC0856aa = this.c;
        if (interfaceC0856aa != null) {
            Oc0 oc0 = (Oc0) interfaceC0856aa;
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC1279ea abstractC1279ea = (AbstractC1279ea) oc0.c;
                rootWindowInsets = abstractC1279ea.c.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                    i = mandatorySystemGestureInsets.bottom;
                    abstractC1279ea.k = i;
                    abstractC1279ea.e();
                }
            }
        }
        Field field = Sb0.a;
        Fb0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        boolean z2;
        super.onDetachedFromWindow();
        InterfaceC0856aa interfaceC0856aa = this.c;
        if (interfaceC0856aa != null) {
            Oc0 oc0 = (Oc0) interfaceC0856aa;
            C0811a00 h = C0811a00.h();
            Z9 z9 = ((AbstractC1279ea) oc0.c).m;
            synchronized (h.b) {
                z = true;
                if (!h.l(z9)) {
                    T20 t20 = (T20) h.f;
                    if (t20 != null && t20.a.get() == z9) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z = false;
                    }
                }
            }
            if (z) {
                AbstractC1279ea.n.post(new DH(oc0, 4));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC0947ba interfaceC0947ba = this.b;
        if (interfaceC0947ba != null) {
            AbstractC1279ea abstractC1279ea = (AbstractC1279ea) ((VA) interfaceC0947ba).c;
            abstractC1279ea.c.setOnLayoutChangeListener(null);
            abstractC1279ea.d();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.h;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.d = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.j != null) {
            drawable = AbstractC2870uj.g0(drawable.mutate());
            AbstractC0746Xp.h(drawable, this.j);
            AbstractC0746Xp.i(drawable, this.k);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        if (getBackground() != null) {
            Drawable g0 = AbstractC2870uj.g0(getBackground().mutate());
            AbstractC0746Xp.h(g0, colorStateList);
            AbstractC0746Xp.i(g0, this.k);
            if (g0 != getBackground()) {
                super.setBackgroundDrawable(g0);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        if (getBackground() != null) {
            Drawable g0 = AbstractC2870uj.g0(getBackground().mutate());
            AbstractC0746Xp.i(g0, mode);
            if (g0 != getBackground()) {
                super.setBackgroundDrawable(g0);
            }
        }
    }

    public void setOnAttachStateChangeListener(InterfaceC0856aa interfaceC0856aa) {
        this.c = interfaceC0856aa;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View$OnTouchListenerC1032ca view$OnTouchListenerC1032ca;
        if (onClickListener != null) {
            view$OnTouchListenerC1032ca = null;
        } else {
            view$OnTouchListenerC1032ca = l;
        }
        setOnTouchListener(view$OnTouchListenerC1032ca);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(InterfaceC0947ba interfaceC0947ba) {
        this.b = interfaceC0947ba;
    }
}
