package defpackage;

import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.r5;
/* renamed from: yE  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3174yE implements r5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ShowOptions c;

    public /* synthetic */ C3174yE(ShowOptions showOptions, int i) {
        this.b = i;
        this.c = showOptions;
    }

    @Override // com.fyber.fairbid.r5
    public final void accept(Object obj) {
        int i = this.b;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                Interstitial.a(this.c, intValue);
                return;
            default:
                Rewarded.a(this.c, intValue);
                return;
        }
    }
}
