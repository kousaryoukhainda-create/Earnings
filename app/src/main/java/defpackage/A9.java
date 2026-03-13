package defpackage;

import com.fyber.fairbid.ads.Banner;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.LossNotificationReason;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.r5;
/* renamed from: A9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class A9 implements r5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LossNotificationReason c;

    public /* synthetic */ A9(LossNotificationReason lossNotificationReason, int i) {
        this.b = i;
        this.c = lossNotificationReason;
    }

    @Override // com.fyber.fairbid.r5
    public final void accept(Object obj) {
        int i = this.b;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                Banner.a(this.c, intValue);
                return;
            case 1:
                Interstitial.a(this.c, intValue);
                return;
            default:
                Rewarded.a(this.c, intValue);
                return;
        }
    }
}
