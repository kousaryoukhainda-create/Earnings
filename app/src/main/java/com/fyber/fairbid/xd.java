package com.fyber.fairbid;

import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
/* loaded from: classes.dex */
public final class xd extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ ae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(ae aeVar) {
        super(0);
        this.a = aeVar;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        ae aeVar = this.a;
        MBNewInterstitialHandler mBNewInterstitialHandler = new MBNewInterstitialHandler(aeVar.b, (String) null, aeVar.a);
        mBNewInterstitialHandler.playVideoMute(this.a.c);
        return mBNewInterstitialHandler;
    }
}
