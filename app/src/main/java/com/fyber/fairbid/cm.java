package com.fyber.fairbid;

import android.widget.Toast;
/* loaded from: classes.dex */
public final class cm extends g6 {
    public final /* synthetic */ String a;
    public final /* synthetic */ dm b;

    public cm(dm dmVar, String str) {
        this.b = dmVar;
        this.a = str;
    }

    @Override // com.fyber.fairbid.g6
    public final void b() {
        Toast.makeText(this.b.g, this.a, 1).show();
    }
}
