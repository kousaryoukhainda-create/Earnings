package com.fyber.fairbid.plugin.adtransparency;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
@Metadata
/* loaded from: classes.dex */
public final class VersionNumber$AbstractScheme$Scanner$oneOf$1 extends AbstractC1431gG implements Function1 {
    final /* synthetic */ char[] $separators;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionNumber$AbstractScheme$Scanner$oneOf$1(char[] cArr) {
        super(1);
        this.$separators = cArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Character.valueOf(invoke(((Number) obj).intValue()));
    }

    public final char invoke(int i) {
        return this.$separators[i];
    }
}
