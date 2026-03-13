package com.fyber.inneractive.sdk.activities;

import android.view.View;
/* loaded from: classes.dex */
public class h implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public h(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.a.e.canGoForward()) {
            this.a.e.goForward();
        }
    }
}
