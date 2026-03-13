package defpackage;

import android.graphics.Matrix;
import android.view.View;
/* renamed from: pc0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2428pc0 extends C2342oc0 {
    @Override // defpackage.C2256nc0, defpackage.AbstractC1424g90
    public final void f0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.C2342oc0, defpackage.AbstractC1424g90
    public final void g0(int i, View view) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.C2170mc0
    public final float t0(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.C2170mc0
    public final void u0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.C2170mc0
    public final void v0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.C2170mc0
    public final void w0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
