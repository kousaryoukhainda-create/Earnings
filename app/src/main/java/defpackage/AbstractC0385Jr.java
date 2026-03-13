package defpackage;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: Jr  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0385Jr {
    public final TextInputLayout a;
    public final Context b;
    public final CheckableImageButton c;
    public final int d;

    public AbstractC0385Jr(TextInputLayout textInputLayout, int i) {
        this.a = textInputLayout;
        this.b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
        this.d = i;
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public void c(boolean z) {
    }
}
