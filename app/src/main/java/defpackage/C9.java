package defpackage;

import com.fyber.fairbid.ads.banner.internal.BannerView;
/* renamed from: C9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class C9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ BannerView c;

    public /* synthetic */ C9(BannerView bannerView, int i) {
        this.b = i;
        this.c = bannerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                BannerView.b(this.c);
                return;
            case 1:
                BannerView.a(this.c);
                return;
            default:
                BannerView.c(this.c);
                return;
        }
    }
}
