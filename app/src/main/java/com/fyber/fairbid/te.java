package com.fyber.fairbid;

import com.fyber.fairbid.common.lifecycle.AdDisplay;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public final /* synthetic */ class te {
    public static AdDisplay a(String str) {
        AdDisplay build = AdDisplay.newBuilder().build();
        Intrinsics.checkNotNullExpressionValue(build, str);
        return build;
    }
}
