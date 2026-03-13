package com.fyber.fairbid.ads;

import kotlin.Metadata;
@Metadata
/* loaded from: classes.dex */
public enum PlacementType {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2);
    
    public final int a;

    PlacementType(int i) {
        this.a = i;
    }

    public final int getInternalCode() {
        return this.a;
    }
}
