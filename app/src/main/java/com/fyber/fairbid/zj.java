package com.fyber.fairbid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fyber.fairbid.sdk.R;
/* loaded from: classes.dex */
public final class zj extends t4<JQ> {
    public final boolean b;
    public final CompoundButton.OnCheckedChangeListener c;
    public JQ d;

    public zj(@NonNull LayoutInflater layoutInflater, final Runnable runnable, boolean z) {
        super(layoutInflater);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        this.b = z;
        if (z) {
            onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.fyber.fairbid.B1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    runnable.run();
                }
            };
        } else {
            onCheckedChangeListener = null;
        }
        this.c = onCheckedChangeListener;
    }

    @Override // com.fyber.fairbid.t4
    public final void a(View view, JQ jq) {
        JQ jq2 = jq;
        TextView textView = (TextView) view.findViewById(R.id.text_further_info);
        Switch r3 = (Switch) view.findViewById(R.id.option_switch);
        r3.setOnCheckedChangeListener(null);
        if (jq2 != null) {
            r3.setChecked(((Boolean) jq2.c).booleanValue());
            r3.setEnabled(this.b);
            textView.setText((CharSequence) jq2.b);
        } else {
            r3.setChecked(false);
            r3.setEnabled(false);
            textView.setText("");
        }
        r3.setOnCheckedChangeListener(this.c);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // com.fyber.fairbid.t4
    public final View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fb_row_test_mode, viewGroup, false);
    }

    @Override // com.fyber.fairbid.t4
    public final JQ a(int i) {
        return this.d;
    }
}
