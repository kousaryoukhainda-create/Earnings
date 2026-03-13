package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class i implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.e.reload();
        int i = IAlog.a;
        IAlog.a(1, null, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.a.e.getUrl());
    }
}
