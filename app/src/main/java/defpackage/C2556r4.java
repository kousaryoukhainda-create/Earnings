package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* renamed from: r4  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2556r4 extends TextView implements O60 {
    public final C1262eJ b;
    public final C2213n4 c;
    public final C0750Xt d;
    public C0994c4 f;
    public boolean g;
    public WC h;
    public Future i;

    public C2556r4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @NonNull
    private C0994c4 getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new C0994c4(this);
        }
        return this.f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.a();
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    public final void g() {
        Future future = this.i;
        if (future != null) {
            try {
                this.i = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    Wh0.G(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC2084lc0.a) {
            return super.getAutoSizeMaxTextSize();
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            return Math.round(c2213n4.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC2084lc0.a) {
            return super.getAutoSizeMinTextSize();
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            return Math.round(c2213n4.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC2084lc0.a) {
            return super.getAutoSizeStepGranularity();
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            return Math.round(c2213n4.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC2084lc0.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            return c2213n4.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC2084lc0.a) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 == null) {
            return 0;
        }
        return c2213n4.i.a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Wh0.m0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC2299o4 getSuperCaller() {
        if (this.h == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.h = new C2471q4(this);
            } else if (i >= 28) {
                this.h = new C2385p4(this);
            } else if (i >= 26) {
                this.h = new WC(this, 5);
            }
        }
        return this.h;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            return c1262eJ.A();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            return c1262eJ.B();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        M60 m60 = this.c.h;
        if (m60 != null) {
            return (ColorStateList) m60.c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        M60 m60 = this.c.h;
        if (m60 != null) {
            return (PorterDuff.Mode) m60.d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C0750Xt c0750Xt;
        if (Build.VERSION.SDK_INT < 28 && (c0750Xt = this.d) != null) {
            TextClassifier textClassifier = (TextClassifier) c0750Xt.d;
            if (textClassifier == null) {
                return AbstractC1499h4.a((TextView) c0750Xt.c);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @NonNull
    public CS getTextMetricsParamsCompat() {
        return Wh0.G(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.c.getClass();
        C2213n4.f(editorInfo, onCreateInputConnection, this);
        AbstractC2618rm.E(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null && !AbstractC2084lc0.a) {
            c2213n4.i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null && !AbstractC2084lc0.a) {
            C2986w4 c2986w4 = c2213n4.i;
            if (c2986w4.f()) {
                c2986w4.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((Wh0) getEmojiTextViewHelper().b.c).c0(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC2084lc0.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.g(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC2084lc0.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.h(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC2084lc0.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.J();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.K(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Wh0.q0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((Wh0) getEmojiTextViewHelper().b.c).d0(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(((Wh0) getEmojiTextViewHelper().b.c).E(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().r(i);
        } else {
            Wh0.e0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i);
        } else {
            Wh0.f0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        Wh0.g0(this, i);
    }

    public void setPrecomputedText(@NonNull DS ds) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        Wh0.G(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.T(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.U(mode);
        }
    }

    @Override // defpackage.O60
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2213n4 c2213n4 = this.c;
        c2213n4.j(colorStateList);
        c2213n4.b();
    }

    @Override // defpackage.O60
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2213n4 c2213n4 = this.c;
        c2213n4.k(mode);
        c2213n4.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0750Xt c0750Xt;
        if (Build.VERSION.SDK_INT < 28 && (c0750Xt = this.d) != null) {
            c0750Xt.d = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<DS> future) {
        this.i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull CS cs) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cs.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        int i2 = Build.VERSION.SDK_INT;
        TextPaint textPaint = cs.a;
        if (i2 < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        AbstractC1332f60.e(this, cs.c);
        AbstractC1332f60.h(this, cs.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC2084lc0.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null && !z) {
            C2986w4 c2986w4 = c2213n4.i;
            if (!c2986w4.f()) {
                c2986w4.g(f, i);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.g) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            AbstractC2870uj abstractC2870uj = AbstractC1596i90.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.g = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.g = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2556r4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        L60.a(context);
        this.g = false;
        this.h = null;
        AbstractC2390p60.a(this, getContext());
        C1262eJ c1262eJ = new C1262eJ(this);
        this.b = c1262eJ;
        c1262eJ.D(attributeSet, i);
        C2213n4 c2213n4 = new C2213n4(this);
        this.c = c2213n4;
        c2213n4.d(attributeSet, i);
        c2213n4.b();
        C0750Xt c0750Xt = new C0750Xt(6, (char) 0);
        c0750Xt.c = this;
        this.d = c0750Xt;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().u(i, f);
        } else if (i2 >= 34) {
            AbstractC1590i60.a(this, i, f);
        } else {
            Wh0.g0(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC1522hL.y(context, i) : null, i2 != 0 ? AbstractC1522hL.y(context, i2) : null, i3 != 0 ? AbstractC1522hL.y(context, i3) : null, i4 != 0 ? AbstractC1522hL.y(context, i4) : null);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC1522hL.y(context, i) : null, i2 != 0 ? AbstractC1522hL.y(context, i2) : null, i3 != 0 ? AbstractC1522hL.y(context, i3) : null, i4 != 0 ? AbstractC1522hL.y(context, i4) : null);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }
}
