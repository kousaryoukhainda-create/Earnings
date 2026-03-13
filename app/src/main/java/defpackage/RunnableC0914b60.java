package defpackage;

import com.google.android.material.textfield.TextInputLayout;
/* renamed from: b60  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0914b60 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ TextInputLayout c;

    public /* synthetic */ RunnableC0914b60(TextInputLayout textInputLayout, int i) {
        this.b = i;
        this.c = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                TextInputLayout textInputLayout = this.c;
                textInputLayout.k0.performClick();
                textInputLayout.k0.jumpDrawablesToCurrentState();
                return;
            default:
                this.c.g.requestLayout();
                return;
        }
    }
}
