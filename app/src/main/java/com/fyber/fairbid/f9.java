package com.fyber.fairbid;

import android.widget.HeaderViewListAdapter;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f9 extends HeaderViewListAdapter {
    public f9(ArrayList arrayList, t4 t4Var) {
        super(arrayList, new ArrayList(), t4Var);
    }

    @Override // android.widget.HeaderViewListAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        if (getWrappedAdapter() == null) {
            return 1;
        }
        return getWrappedAdapter().getViewTypeCount() + 1;
    }

    @Override // android.widget.HeaderViewListAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }

    public f9(ArrayList arrayList, ArrayList arrayList2, id idVar) {
        super(arrayList, arrayList2, idVar);
    }
}
