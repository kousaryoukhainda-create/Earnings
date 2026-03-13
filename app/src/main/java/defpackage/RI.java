package defpackage;

import com.fyber.fairbid.ads.offerwall.OfferWallError;
import com.fyber.fairbid.ads.offerwall.OfferWallListener;
import crypto.bitcoin.ethereum.litecoin.cloud.mining.eth.btc.ltc.hash.pool.cloud_mining.MainActivity;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: RI  reason: default package */
/* loaded from: classes2.dex */
public final class RI implements OfferWallListener {
    public final /* synthetic */ MainActivity a;

    public RI(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // com.fyber.fairbid.ads.offerwall.OfferWallListener
    public final void onClose(String str) {
        this.a.a(C2148mJ.d(new JQ("eventType", "onClose"), new JQ("placementId", str)));
    }

    @Override // com.fyber.fairbid.ads.offerwall.OfferWallListener
    public final void onShow(String str) {
        this.a.a(C2148mJ.d(new JQ("eventType", "onShow"), new JQ("placementId", str)));
    }

    @Override // com.fyber.fairbid.ads.offerwall.OfferWallListener
    public final void onShowError(String str, OfferWallError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(C2148mJ.d(new JQ("eventType", "onShowError"), new JQ("placementId", str), new JQ("error", error.name())));
    }
}
