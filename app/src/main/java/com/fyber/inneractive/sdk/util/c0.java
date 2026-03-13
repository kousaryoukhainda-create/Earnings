package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
/* loaded from: classes.dex */
public class c0 {
    public static boolean a(UnitDisplayType unitDisplayType) {
        if (!UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !UnitDisplayType.REWARDED.equals(unitDisplayType) && !UnitDisplayType.VERTICAL.equals(unitDisplayType)) {
            return false;
        }
        return true;
    }
}
