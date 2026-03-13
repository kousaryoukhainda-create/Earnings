package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public final class f<S> extends AbstractC2328oR {
    public int c;
    public CalendarConstraints d;
    public Month f;
    public int g;
    public C3244z4 h;
    public RecyclerView i;
    public RecyclerView j;
    public View k;
    public View l;

    public final void f(Month month) {
        boolean z;
        l lVar = (l) this.j.getAdapter();
        int g = lVar.j.b.g(month);
        int g2 = g - lVar.j.b.g(this.f);
        boolean z2 = false;
        if (Math.abs(g2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (g2 > 0) {
            z2 = true;
        }
        this.f = month;
        if (z && z2) {
            this.j.Z(g - 3);
            this.j.post(new RunnableC0758Yb(g, 2, this));
        } else if (z) {
            this.j.Z(g + 3);
            this.j.post(new RunnableC0758Yb(g, 2, this));
        } else {
            this.j.post(new RunnableC0758Yb(g, 2, this));
        }
    }

    public final void g(int i) {
        this.g = i;
        if (i == 2) {
            this.i.getLayoutManager().i0(this.f.d - ((m) this.i.getAdapter()).i.d.b.d);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
        } else if (i == 1) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            f(this.f);
        }
    }

    @Override // androidx.fragment.app.n
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            this.f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
            return;
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x018b, code lost:
        r13 = new defpackage.FQ();
     */
    @Override // androidx.fragment.app.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.f.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.n
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.c);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f);
    }
}
