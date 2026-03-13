package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
/* renamed from: com.applovin.impl.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1074o extends RelativeLayout {
    private final ProgressBar a;

    public C1074o(Context context, int i, int i2) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i2);
        this.a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i != -2 && i != -1) {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
