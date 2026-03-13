package com.fyber.fairbid;

import com.mbridge.msdk.out.MBRewardVideoHandler;
/* loaded from: classes.dex */
public final class ce extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ ee a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(ee eeVar) {
        super(0);
        this.a = eeVar;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        MBRewardVideoHandler mBRewardVideoHandler = new MBRewardVideoHandler(this.a.b.getApplicationContext(), (String) null, this.a.a);
        mBRewardVideoHandler.playVideoMute(this.a.c);
        return mBRewardVideoHandler;
    }
}
