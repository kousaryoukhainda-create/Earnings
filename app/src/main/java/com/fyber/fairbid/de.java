package com.fyber.fairbid;

import com.mbridge.msdk.out.MBBidRewardVideoHandler;
/* loaded from: classes.dex */
public final class de extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ ee a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ee eeVar) {
        super(0);
        this.a = eeVar;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        MBBidRewardVideoHandler mBBidRewardVideoHandler = new MBBidRewardVideoHandler(this.a.b.getApplicationContext(), (String) null, this.a.a);
        mBBidRewardVideoHandler.playVideoMute(this.a.c);
        return mBBidRewardVideoHandler;
    }
}
