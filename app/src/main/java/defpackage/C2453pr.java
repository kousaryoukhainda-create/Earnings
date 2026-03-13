package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* renamed from: pr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2453pr implements TransformationMethod {
    public final TransformationMethod a;

    public C2453pr(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && C0773Yq.a().b() == 1) {
            C0773Yq a = C0773Yq.a();
            a.getClass();
            return a.e(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
