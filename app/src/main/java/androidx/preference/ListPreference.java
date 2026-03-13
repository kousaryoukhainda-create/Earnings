package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import com.ykapps.earnings.R;
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] j;
    public final String k;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2846uU.d, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.j = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C1314ew.c == null) {
                C1314ew.c = new C1314ew(5);
            }
            this.i = C1314ew.c;
            f();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2846uU.f, i, 0);
        this.k = AbstractC0957bf.I(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence e() {
        GS gs = this.i;
        if (gs != null) {
            return gs.i(this);
        }
        CharSequence e = super.e();
        String str = this.k;
        if (str == null) {
            return e;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, e)) {
            return e;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object g(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0957bf.y(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
