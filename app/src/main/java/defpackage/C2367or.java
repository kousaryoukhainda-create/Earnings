package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
/* renamed from: or  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2367or implements TextWatcher {
    public final EditText b;
    public C2281nr c;
    public boolean d = true;

    public C2367or(EditText editText) {
        this.b = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0773Yq a = C0773Yq.a();
            if (editableText == null) {
                length = 0;
            } else {
                a.getClass();
                length = editableText.length();
            }
            a.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.b;
        if (!editText.isInEditMode() && this.d && C0773Yq.k != null && i2 <= i3 && (charSequence instanceof Spannable)) {
            int b = C0773Yq.a().b();
            if (b != 0) {
                if (b != 1) {
                    if (b != 3) {
                        return;
                    }
                } else {
                    C0773Yq.a().e((Spannable) charSequence, i, i3 + i);
                    return;
                }
            }
            C0773Yq a = C0773Yq.a();
            if (this.c == null) {
                this.c = new C2281nr(editText);
            }
            a.f(this.c);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
