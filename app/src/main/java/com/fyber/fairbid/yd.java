package com.fyber.fairbid;

import com.mbridge.msdk.newinterstitial.out.MBBidInterstitialVideoHandler;
/* loaded from: classes.dex */
public final class yd extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ ae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(ae aeVar) {
        super(0);
        this.a = aeVar;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        ae aeVar = this.a;
        MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = new MBBidInterstitialVideoHandler(aeVar.b, (String) null, aeVar.a);
        mBBidInterstitialVideoHandler.playVideoMute(this.a.c);
        return mBBidInterstitialVideoHandler;
    }
}
