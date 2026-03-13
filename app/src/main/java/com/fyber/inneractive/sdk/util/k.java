package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
/* loaded from: classes.dex */
public class k {
    public static boolean a(UnitDisplayType unitDisplayType, com.fyber.inneractive.sdk.config.i iVar) {
        if ((unitDisplayType != null && !unitDisplayType.isFullscreenUnit()) || iVar.a("use_fraud_detection_fullscreen", true)) {
            return true;
        }
        return false;
    }
}
