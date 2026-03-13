package com.fyber.fairbid;

import com.fyber.fairbid.adapters.APSAdapter;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: com.fyber.fairbid.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089c extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1089c(String str) {
        super(0);
        this.a = str;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        APSAdapter aPSAdapter = APSAdapter.INSTANCE;
        String slot = this.a;
        aPSAdapter.getClass();
        Intrinsics.checkNotNullParameter(slot, "slot");
        APSAdapter.SlotLoader slotLoader = APSAdapter.c;
        if (slotLoader != null) {
            slotLoader.loadAPSRewardedSlot(slot);
        }
        return B90.a;
    }
}
