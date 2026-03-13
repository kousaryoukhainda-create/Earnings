package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* renamed from: hH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518hH implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ AbstractC2318oH b;

    public C1518hH(AbstractC2318oH abstractC2318oH) {
        this.b = abstractC2318oH;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        WL wl;
        if (i != -1 && (wl = this.b.d) != null) {
            wl.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
