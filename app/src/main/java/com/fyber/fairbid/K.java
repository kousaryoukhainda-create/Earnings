package com.fyber.fairbid;

import android.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
/* loaded from: classes.dex */
public final /* synthetic */ class K implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Fragment c;

    public /* synthetic */ K(Fragment fragment, int i) {
        this.b = i;
        this.c = fragment;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.b) {
            case 0:
                ff.c((ff) this.c, adapterView, view, i, j);
                return;
            case 1:
                fi.a((fi) this.c, adapterView, view, i, j);
                return;
            default:
                ph.a((ph) this.c, adapterView, view, i, j);
                return;
        }
    }
}
