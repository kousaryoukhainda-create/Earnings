package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* renamed from: yg0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3209yg0 extends FrameLayout {
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) super.generateLayoutParams(layoutParams);
        layoutParams2.gravity = 17;
        return layoutParams2;
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
