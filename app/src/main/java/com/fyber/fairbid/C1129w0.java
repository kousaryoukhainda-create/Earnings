package com.fyber.fairbid;

import com.fyber.fairbid.sdk.mediation.adapter.amazon.AmazonAdapter;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: com.fyber.fairbid.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129w0 extends AbstractC1431gG implements Function1 {
    public final /* synthetic */ AmazonAdapter a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129w0(AmazonAdapter amazonAdapter) {
        super(1);
        this.a = amazonAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        String encodedPricePoint = (String) obj;
        Intrinsics.checkNotNullParameter(encodedPricePoint, "encodedPricePoint");
        Map<String, Double> map = this.a.v;
        if (map != null) {
            Double d2 = map.get(encodedPricePoint);
            if (d2 != null) {
                d = d2.doubleValue();
            } else {
                d = -1.0d;
            }
            return Double.valueOf(d);
        }
        Intrinsics.f("pricePoints");
        throw null;
    }
}
