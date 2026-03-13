package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: Pd  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0526Pd implements TextWatcher {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0526Pd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.b) {
            case 0:
                C0708Wd c0708Wd = (C0708Wd) this.c;
                if (c0708Wd.a.getSuffixText() == null) {
                    c0708Wd.e(C0708Wd.d(c0708Wd));
                    return;
                }
                return;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.c;
                textInputLayout.s(!textInputLayout.O0, false);
                if (textInputLayout.l) {
                    textInputLayout.n(editable.length());
                }
                if (textInputLayout.s) {
                    textInputLayout.t(editable.length());
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.b;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.b;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
