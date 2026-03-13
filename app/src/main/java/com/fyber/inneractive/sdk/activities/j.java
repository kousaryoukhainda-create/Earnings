package com.fyber.inneractive.sdk.activities;

import android.view.View;
/* loaded from: classes.dex */
public class j implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public j(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.finish();
    }
}
