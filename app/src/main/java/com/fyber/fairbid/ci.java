package com.fyber.fairbid;

import android.view.View;
import androidx.annotation.NonNull;
import com.fyber.fairbid.oh;
import com.fyber.fairbid.sdk.R;
/* loaded from: classes.dex */
public abstract class ci<VM extends oh> {
    public final VM a;
    public View b;
    public View c;
    public View d;
    public View e;
    public View f;

    public ci(VM vm) {
        this.a = vm;
    }

    public abstract void a();

    public final void a(@NonNull View view) {
        ci<VM> ciVar = (ci) view.getTag(R.id.fb_ts_traditional_placement_holder_key);
        if (ciVar != null && ciVar != this) {
            ciVar.b();
            ciVar.b = null;
            ciVar.c = null;
            ciVar.d = null;
            ciVar.e = null;
            ciVar.f = null;
        }
        this.b = view;
        this.c = view.findViewById(R.id.request);
        this.d = view.findViewById(R.id.show);
        this.e = view.findViewById(R.id.request_label);
        this.f = view.findViewById(R.id.instance_status);
        View view2 = this.c;
        view2.setContentDescription(this.a.a.b + " request button");
        View view3 = this.d;
        view3.setContentDescription(this.a.a.b + " show button");
        view.setTag(R.id.fb_ts_traditional_placement_holder_key, this);
        a();
        this.c.setEnabled(true);
        this.c.setBackgroundResource(R.drawable.fb_ts_button_background_default);
        a((ci<VM>) this.a);
    }

    public abstract void a(VM vm);

    public void b() {
    }

    public static void a(View view, boolean z) {
        if (z) {
            view.setBackgroundResource(R.drawable.fb_ts_button_background_default);
            view.setEnabled(true);
            return;
        }
        view.setBackgroundResource(R.drawable.fb_ts_button_background_disabled);
        view.setEnabled(false);
    }
}
