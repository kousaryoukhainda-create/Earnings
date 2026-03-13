package com.applovin.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class zc extends FrameLayout implements View.OnClickListener {
    private a a;

    /* loaded from: classes.dex */
    public interface a {
        void a(zc zcVar);
    }

    public zc(bd bdVar, Context context) {
        super(context);
        setOnClickListener(this);
        com.applovin.impl.adview.i iVar = new com.applovin.impl.adview.i(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, bdVar.e());
        iVar.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        iVar.a(dpToPx);
        addView(iVar);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, (bdVar.c() * 2) + bdVar.e());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, bdVar.f());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, bdVar.d());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.a(this);
    }

    public void setListener(a aVar) {
        this.a = aVar;
    }
}
