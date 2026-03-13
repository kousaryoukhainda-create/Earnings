package com.fyber.fairbid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public final class a8 extends AbstractC1431gG implements Function1 {
    public static final a8 a = new a8();

    public a8() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bk it = (bk) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return C0346Ie.c(it.f, it.b);
    }
}
