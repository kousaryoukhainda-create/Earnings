package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes3.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0142Ai {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // defpackage.AbstractC0142Ai
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.AbstractC0142Ai
    public final void c(C0220Di c0220Di) {
        if (c0220Di.h == 0) {
            c0220Di.h = 80;
        }
    }

    @Override // defpackage.AbstractC0142Ai
    public final boolean d(View view, View view2) {
        throw new ClassCastException();
    }

    @Override // defpackage.AbstractC0142Ai
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3018wU.g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
