package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: yk  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3216yk extends AbstractC0385Jr {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3216yk(TextInputLayout textInputLayout, int i, int i2) {
        super(textInputLayout, i);
        this.e = i2;
    }

    @Override // defpackage.AbstractC0385Jr
    public final void a() {
        switch (this.e) {
            case 0:
                int i = this.d;
                TextInputLayout textInputLayout = this.a;
                textInputLayout.setEndIconDrawable(i);
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                return;
            default:
                TextInputLayout textInputLayout2 = this.a;
                textInputLayout2.setEndIconOnClickListener(null);
                textInputLayout2.setEndIconDrawable((Drawable) null);
                textInputLayout2.setEndIconContentDescription((CharSequence) null);
                return;
        }
    }
}
