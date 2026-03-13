package defpackage;

import android.graphics.Matrix;
import android.view.View;
/* renamed from: mc0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2170mc0 extends AbstractC1424g90 {
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = true;

    public float t0(View view) {
        float transitionAlpha;
        if (t) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                t = false;
            }
        }
        return view.getAlpha();
    }

    public void u0(View view, float f) {
        if (t) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                t = false;
            }
        }
        view.setAlpha(f);
    }

    public void v0(View view, Matrix matrix) {
        if (u) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                u = false;
            }
        }
    }

    public void w0(View view, Matrix matrix) {
        if (v) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                v = false;
            }
        }
    }
}
