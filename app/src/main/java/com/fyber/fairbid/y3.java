package com.fyber.fairbid;

import com.fyber.fairbid.ads.banner.internal.BannerView;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.xi;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class y3 implements xi.c {
    @NotNull
    public final BannerView a;
    public final int b;
    public final int c;
    @NotNull
    public final AtomicInteger d;

    public y3(@NotNull BannerView bannerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.a = bannerView;
        this.b = i;
        this.c = i2;
        this.d = new AtomicInteger(1);
    }

    @Override // com.fyber.fairbid.xi.c
    public final void a() {
    }

    @Override // com.fyber.fairbid.xi.c
    public final long b() {
        return TimeUnit.SECONDS.toMillis(this.b);
    }

    @Override // com.fyber.fairbid.xi.c
    public final boolean c() {
        boolean z;
        if (this.d.get() > this.c) {
            z = true;
        } else {
            z = false;
        }
        if (this.a.i.get()) {
            Logger.debug("BannerView - The banner has already been destroyed, not refreshing it...");
        } else if (z) {
            Logger.debug("BannerView - The banner refresh attempts have reached their max value - " + this.c + ", not scheduling a new refresh...");
        }
        if (!z && !this.a.i.get()) {
            return false;
        }
        return true;
    }

    @Override // com.fyber.fairbid.xi.c
    public final void reset() {
        this.d.set(1);
    }
}
