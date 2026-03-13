package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
/* renamed from: hr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567hr implements InputFilter {
    public final TextView a;
    public C1481gr b;

    public C1567hr(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b = C0773Yq.a().b();
        if (b != 0) {
            if (b != 1) {
                if (b != 3) {
                    return charSequence;
                }
            } else if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0773Yq.a().e(charSequence, 0, charSequence.length());
            } else {
                return charSequence;
            }
        }
        C0773Yq a = C0773Yq.a();
        if (this.b == null) {
            this.b = new C1481gr(textView, this);
        }
        a.f(this.b);
        return charSequence;
    }
}
