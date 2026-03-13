package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.common.lifecycle.AdDisplay;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class gg implements CachedAd {
    @NotNull
    public final String a;
    @NotNull
    public final AdDisplay b;
    public final boolean c;

    public /* synthetic */ gg(String str, Context context, AdDisplay adDisplay) {
        this(str, context, adDisplay, false);
    }

    public final void onClick() {
        this.b.clickEventStream.sendEvent(Boolean.TRUE);
    }

    public final void onClose() {
        if (this.c && !this.b.closeListener.isDone()) {
            this.b.rewardListener.set(Boolean.FALSE);
        }
        this.b.closeListener.set(Boolean.TRUE);
    }

    public gg(@NotNull String adUnitId, @NotNull Context context, @NotNull AdDisplay adDisplay, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adDisplay, "adDisplay");
        this.a = adUnitId;
        this.b = adDisplay;
        this.c = z;
    }
}
