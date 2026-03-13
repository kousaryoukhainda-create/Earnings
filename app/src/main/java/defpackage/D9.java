package defpackage;

import android.app.Activity;
import com.fyber.fairbid.ads.banner.internal.BannerView;
import com.fyber.fairbid.ki;
/* renamed from: D9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class D9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ ki c;
    public final /* synthetic */ BannerView d;
    public final /* synthetic */ Activity f;

    public /* synthetic */ D9(ki kiVar, BannerView bannerView, Activity activity, int i) {
        this.b = i;
        this.c = kiVar;
        this.d = bannerView;
        this.f = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                BannerView.a(this.c, this.d, this.f);
                return;
            default:
                BannerView.b(this.c, this.d, this.f);
                return;
        }
    }
}
