package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.ykapps.earnings.R;
import java.util.Arrays;
/* loaded from: classes3.dex */
class ClockFaceView extends AbstractC3190yU implements InterfaceC1545he {
    public final SparseArray A;
    public final c B;
    public final int[] C;
    public final float[] D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final String[] I;
    public float J;
    public final ColorStateList K;
    public final ClockHandView x;
    public final Rect y;
    public final RectF z;

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new Rect();
        this.z = new RectF();
        SparseArray sparseArray = new SparseArray();
        this.A = sparseArray;
        this.D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3018wU.d, R.attr.materialClockStyle, 2131952718);
        Resources resources = getResources();
        ColorStateList x = AbstractC1522hL.x(context, obtainStyledAttributes, 1);
        this.K = x;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.x = clockHandView;
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = x.getColorForState(new int[]{16842913}, x.getDefaultColor());
        this.C = new int[]{colorForState, colorForState, x.getDefaultColor()};
        clockHandView.b.add(this);
        int defaultColor = AbstractC2525qi.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList x2 = AbstractC1522hL.x(context, obtainStyledAttributes, 0);
        setBackgroundColor(x2 != null ? x2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.B = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.I.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.I.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.I[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                Sb0.l(textView, this.B);
                textView.setTextColor(this.K);
            }
        }
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.H = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void n() {
        RadialGradient radialGradient;
        RectF rectF = this.x.g;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A;
            if (i < sparseArray.size()) {
                TextView textView = (TextView) sparseArray.get(i);
                if (textView != null) {
                    Rect rect = this.y;
                    textView.getDrawingRect(rect);
                    rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                    offsetDescendantRectToMyCoords(textView, rect);
                    RectF rectF2 = this.z;
                    rectF2.set(rect);
                    if (!RectF.intersects(rectF, rectF2)) {
                        radialGradient = null;
                    } else {
                        radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.C, this.D, Shader.TileMode.CLAMP);
                    }
                    textView.getPaint().setShader(radialGradient);
                    textView.invalidate();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.I.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.H / Math.max(Math.max(this.F / displayMetrics.heightPixels, this.G / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
