package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
/* renamed from: Ac  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136Ac {
    public static final R9 c = new R9(2);
    public final C2786tk a;
    public final int b;

    public C0136Ac(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        boolean z2;
        int i5;
        if (z) {
            i5 = i3;
            z2 = true;
        } else {
            z2 = false;
            i5 = -16777216;
        }
        this.a = new C2786tk(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z2, i5, Integer.MIN_VALUE, 0.0f);
        this.b = i4;
    }
}
