package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC2294o10 {
    public static final int[] s = {16842911};
    public static final int[] t = {16842912};
    public final GJ f;
    public final LinkedHashSet g;
    public FJ h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.d = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        super(AbstractC0957bf.t0(context, attributeSet, R.attr.materialButtonStyle, 2131952627), attributeSet, R.attr.materialButtonStyle);
        this.g = new LinkedHashSet();
        this.p = false;
        this.q = false;
        Context context2 = getContext();
        TypedArray W = AbstractC0957bf.W(context2, attributeSet, AbstractC3018wU.j, R.attr.materialButtonStyle, 2131952627, new int[0]);
        this.o = W.getDimensionPixelSize(12, 0);
        int i = W.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.i = B10.V(i, mode);
        this.j = AbstractC1522hL.x(getContext(), W, 14);
        this.k = AbstractC1522hL.z(getContext(), W, 10);
        this.r = W.getInteger(11, 1);
        this.l = W.getDimensionPixelSize(13, 0);
        GJ gj = new GJ(this, C1236e10.b(context2, attributeSet, R.attr.materialButtonStyle, 2131952627).a());
        this.f = gj;
        gj.c = W.getDimensionPixelOffset(1, 0);
        gj.d = W.getDimensionPixelOffset(2, 0);
        gj.e = W.getDimensionPixelOffset(3, 0);
        gj.f = W.getDimensionPixelOffset(4, 0);
        if (W.hasValue(8)) {
            int dimensionPixelSize = W.getDimensionPixelSize(8, -1);
            gj.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            C1151d10 e = gj.b.e();
            e.e = new C2462q(f);
            e.f = new C2462q(f);
            e.g = new C2462q(f);
            e.h = new C2462q(f);
            gj.c(e.a());
            gj.p = true;
        }
        gj.h = W.getDimensionPixelSize(20, 0);
        gj.i = B10.V(W.getInt(7, -1), mode);
        gj.j = AbstractC1522hL.x(getContext(), W, 6);
        gj.k = AbstractC1522hL.x(getContext(), W, 19);
        gj.l = AbstractC1522hL.x(getContext(), W, 16);
        gj.q = W.getBoolean(5, false);
        gj.s = W.getDimensionPixelSize(9, 0);
        Field field = Sb0.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (W.hasValue(0)) {
            gj.o = true;
            setSupportBackgroundTintList(gj.j);
            setSupportBackgroundTintMode(gj.i);
        } else {
            gj.e();
        }
        setPaddingRelative(paddingStart + gj.c, paddingTop + gj.e, paddingEnd + gj.d, paddingBottom + gj.f);
        W.recycle();
        setCompoundDrawablePadding(this.o);
        d(this.k != null);
    }

    @NonNull
    private String getA11yClassName() {
        Class cls;
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        GJ gj = this.f;
        if (gj != null && gj.q) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        GJ gj = this.f;
        if (gj != null && !gj.o) {
            return true;
        }
        return false;
    }

    public final void c() {
        int i = this.r;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.k, null, null, null);
        } else if (i != 3 && i != 4) {
            if (i == 16 || i == 32) {
                setCompoundDrawablesRelative(null, this.k, null, null);
            }
        } else {
            setCompoundDrawablesRelative(null, null, this.k, null);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.k;
        if (drawable != null) {
            Drawable mutate = AbstractC2870uj.g0(drawable).mutate();
            this.k = mutate;
            AbstractC0746Xp.h(mutate, this.j);
            PorterDuff.Mode mode = this.i;
            if (mode != null) {
                AbstractC0746Xp.i(this.k, mode);
            }
            int i = this.l;
            if (i == 0) {
                i = this.k.getIntrinsicWidth();
            }
            int i2 = this.l;
            if (i2 == 0) {
                i2 = this.k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.k;
            int i3 = this.m;
            int i4 = this.n;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.k.setVisible(true, z);
        }
        if (z) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.r;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.k) || (((i5 == 3 || i5 == 4) && drawable5 != this.k) || ((i5 == 16 || i5 == 32) && drawable4 != this.k))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        boolean z;
        boolean z2;
        if (this.k != null && getLayout() != null) {
            int i3 = this.r;
            boolean z3 = true;
            if (i3 != 1 && i3 != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!z && i3 != 3 && i3 != 4) {
                if (i3 == 16 || i3 == 32) {
                    this.m = 0;
                    if (i3 == 16) {
                        this.n = 0;
                        d(false);
                        return;
                    }
                    int i4 = this.l;
                    if (i4 == 0) {
                        i4 = this.k.getIntrinsicHeight();
                    }
                    int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.o) - getPaddingBottom()) / 2;
                    if (this.n != textHeight) {
                        this.n = textHeight;
                        d(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.n = 0;
            if (i3 != 1 && i3 != 3) {
                int i5 = this.l;
                if (i5 == 0) {
                    i5 = this.k.getIntrinsicWidth();
                }
                int textWidth = i - getTextWidth();
                Field field = Sb0.a;
                int paddingEnd = ((((textWidth - getPaddingEnd()) - i5) - this.o) - getPaddingStart()) / 2;
                if (getLayoutDirection() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.r != 4) {
                    z3 = false;
                }
                if (z2 != z3) {
                    paddingEnd = -paddingEnd;
                }
                if (this.m != paddingEnd) {
                    this.m = paddingEnd;
                    d(false);
                    return;
                }
                return;
            }
            this.m = 0;
            d(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.k;
    }

    public int getIconGravity() {
        return this.r;
    }

    public int getIconPadding() {
        return this.o;
    }

    public int getIconSize() {
        return this.l;
    }

    public ColorStateList getIconTint() {
        return this.j;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.i;
    }

    public int getInsetBottom() {
        return this.f.f;
    }

    public int getInsetTop() {
        return this.f.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f.l;
        }
        return null;
    }

    @NonNull
    public C1236e10 getShapeAppearanceModel() {
        if (b()) {
            return this.f.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f.j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.p;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            AbstractC1906jZ.K(this, this.f.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, s);
        }
        if (this.p) {
            View.mergeDrawableStates(onCreateDrawableState, t);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.p);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        GJ gj;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (gj = this.f) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = gj.m;
            if (drawable != null) {
                drawable.setBounds(gj.c, gj.e, i6 - gj.d, i5 - gj.f);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        setChecked(savedState.d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, com.google.android.material.button.MaterialButton$SavedState] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.d = this.p;
        return absSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.k != null) {
            if (this.k.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (b()) {
            GJ gj = this.f;
            if (gj.b(false) != null) {
                gj.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (b()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                GJ gj = this.f;
                gj.o = true;
                ColorStateList colorStateList = gj.j;
                MaterialButton materialButton = gj.a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(gj.i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AbstractC1522hL.y(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.f.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        if (a() && isEnabled() && this.p != z) {
            this.p = z;
            refreshDrawableState();
            if (this.q) {
                return;
            }
            this.q = true;
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                boolean z2 = this.p;
                MaterialButtonToggleGroup materialButtonToggleGroup = ((IJ) it.next()).a;
                if (!materialButtonToggleGroup.i) {
                    if (materialButtonToggleGroup.j) {
                        if (z2) {
                            i = getId();
                        } else {
                            i = -1;
                        }
                        materialButtonToggleGroup.l = i;
                    }
                    if (materialButtonToggleGroup.d(getId(), z2)) {
                        materialButtonToggleGroup.b(getId(), this.p);
                    }
                    materialButtonToggleGroup.invalidate();
                }
            }
            this.q = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            GJ gj = this.f;
            if (!gj.p || gj.g != i) {
                gj.g = i;
                gj.p = true;
                float f = i;
                C1151d10 e = gj.b.e();
                e.e = new C2462q(f);
                e.f = new C2462q(f);
                e.g = new C2462q(f);
                e.h = new C2462q(f);
                gj.c(e.a());
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (b()) {
            this.f.b(false).i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.k != drawable) {
            this.k = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.r != i) {
            this.r = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.o != i) {
            this.o = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AbstractC1522hL.y(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.l != i) {
                this.l = i;
                d(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC2525qi.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        GJ gj = this.f;
        gj.d(gj.e, i);
    }

    public void setInsetTop(int i) {
        GJ gj = this.f;
        gj.d(i, gj.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(FJ fj) {
        this.h = fj;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        FJ fj = this.h;
        if (fj != null) {
            ((MaterialButtonToggleGroup) ((VA) fj).c).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            GJ gj = this.f;
            if (gj.l != colorStateList) {
                gj.l = colorStateList;
                boolean z = GJ.t;
                MaterialButton materialButton = gj.a;
                if (z && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(TW.a(colorStateList));
                } else if (!z && (materialButton.getBackground() instanceof SW)) {
                    ((SW) materialButton.getBackground()).setTintList(TW.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(AbstractC2525qi.getColorStateList(getContext(), i));
        }
    }

    @Override // defpackage.InterfaceC2294o10
    public void setShapeAppearanceModel(@NonNull C1236e10 c1236e10) {
        if (b()) {
            this.f.c(c1236e10);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            GJ gj = this.f;
            gj.n = z;
            gj.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            GJ gj = this.f;
            if (gj.k != colorStateList) {
                gj.k = colorStateList;
                gj.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(AbstractC2525qi.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            GJ gj = this.f;
            if (gj.h != i) {
                gj.h = i;
                gj.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            GJ gj = this.f;
            if (gj.j != colorStateList) {
                gj.j = colorStateList;
                if (gj.b(false) != null) {
                    AbstractC0746Xp.h(gj.b(false), gj.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            GJ gj = this.f;
            if (gj.i != mode) {
                gj.i = mode;
                if (gj.b(false) != null && gj.i != null) {
                    AbstractC0746Xp.i(gj.b(false), gj.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.p);
    }
}
