package defpackage;

import android.database.DataSetObserver;
/* renamed from: lH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2060lH extends DataSetObserver {
    public final /* synthetic */ AbstractC2318oH a;

    public C2060lH(AbstractC2318oH abstractC2318oH) {
        this.a = abstractC2318oH;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC2318oH abstractC2318oH = this.a;
        if (abstractC2318oH.x.isShowing()) {
            abstractC2318oH.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
