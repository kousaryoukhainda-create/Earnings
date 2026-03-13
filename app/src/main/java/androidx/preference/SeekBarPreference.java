package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.ykapps.earnings.R;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public final int j;
    public final int k;

    public SeekBarPreference(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2846uU.i, R.attr.seekBarPreferenceStyle, 0);
        int i = obtainStyledAttributes.getInt(3, 0);
        int i2 = obtainStyledAttributes.getInt(1, 100);
        i2 = i2 < i ? i : i2;
        if (i2 != this.j) {
            this.j = i2;
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.k) {
            this.k = Math.min(this.j - i, Math.abs(i3));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object g(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
