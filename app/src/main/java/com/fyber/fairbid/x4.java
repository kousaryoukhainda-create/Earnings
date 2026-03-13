package com.fyber.fairbid;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class x4 extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(@NotNull Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@NotNull ViewGroup.LayoutParams lp) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        ViewGroup.LayoutParams generateLayoutParams = super.generateLayoutParams(lp);
        Intrinsics.c(generateLayoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }
}
