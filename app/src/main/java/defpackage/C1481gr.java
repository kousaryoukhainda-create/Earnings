package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* renamed from: gr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481gr extends AbstractC0721Wq {
    public final WeakReference a;
    public final WeakReference b;

    public C1481gr(TextView textView, C1567hr c1567hr) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(c1567hr);
    }

    @Override // defpackage.AbstractC0721Wq
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        C0773Yq a = C0773Yq.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a.getClass();
                            length = text.length();
                        }
                        CharSequence e = a.e(text, 0, length);
                        if (text == e) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(e);
                        int selectionEnd = Selection.getSelectionEnd(e);
                        textView.setText(e);
                        if (e instanceof Spannable) {
                            Spannable spannable = (Spannable) e;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
