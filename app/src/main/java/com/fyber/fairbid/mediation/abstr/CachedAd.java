package com.fyber.fairbid.mediation.abstr;

import com.fyber.fairbid.common.lifecycle.AdDisplay;
/* loaded from: classes.dex */
public interface CachedAd {
    boolean isAvailable();

    AdDisplay show();
}
