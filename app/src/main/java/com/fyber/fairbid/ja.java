package com.fyber.fairbid;

import com.fyber.fairbid.internal.Utils;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public final /* synthetic */ class ja {
    public static boolean a(String str, String str2) {
        Boolean classExists = Utils.classExists(str);
        Intrinsics.checkNotNullExpressionValue(classExists, str2);
        return classExists.booleanValue();
    }
}
