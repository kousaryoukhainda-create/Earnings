package com.fyber.fairbid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fyber.fairbid.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class wj extends t4<vj> {
    public List<vj> b;

    public wj(@NonNull LayoutInflater layoutInflater, @NonNull ArrayList arrayList) {
        super(layoutInflater);
        this.b = arrayList;
    }

    @Override // com.fyber.fairbid.t4
    public final void a(@NonNull View view, @NonNull vj vjVar) {
        int i;
        String str;
        vj vjVar2 = vjVar;
        TextView textView = (TextView) view.findViewById(R.id.text_first_line);
        textView.setText(vjVar2.e);
        int a = l8.a(vjVar2.g);
        if (a == 1) {
            i = R.color.fb_ts_troubled;
        } else if (a != 2) {
            i = R.color.fb_ts_list_primary;
        } else {
            i = R.color.fb_ts_sad_stroke;
        }
        textView.setTextColor(textView.getResources().getColor(i));
        TextView textView2 = (TextView) view.findViewById(R.id.text_second_line);
        if (vjVar2.d) {
            Context context = view.getContext();
            String str2 = vjVar2.b;
            if (str2 == null) {
                str2 = context.getString(vjVar2.c);
            }
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        int a2 = l8.a(vjVar2.a);
        if (a2 == 0) {
            str = "TestSuite_Network_Permissions";
        } else if (a2 == 1) {
            str = "TestSuite_Network_Activities";
        } else if (a2 == 2) {
            str = "TestSuite_Network_Configuration";
        } else if (a2 == 3) {
            str = "TestSuite_Network_Credentials";
        } else if (a2 != 4) {
            str = a2 != 5 ? "" : "TestSuite_Network_Start_State";
        } else {
            str = "TestSuite_Network_SDK";
        }
        textView.setContentDescription(str);
        textView2.setContentDescription(vjVar2.a == 5 ? "TestSuite_Network_SDK_Version" : "");
        ((ImageView) view.findViewById(R.id.primary_icon)).setImageResource(vjVar2.f);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // com.fyber.fairbid.t4
    public final View a(@NonNull LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fb_row_info_two_lines, viewGroup, false);
    }

    @Override // com.fyber.fairbid.t4
    public final vj a(int i) {
        return this.b.get(i);
    }
}
