package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import com.ykapps.earnings.R;
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter l;

    public DropDownPreference(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.l = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.j;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void f() {
        ArrayAdapter arrayAdapter = this.l;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
