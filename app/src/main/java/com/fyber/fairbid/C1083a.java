package com.fyber.fairbid;

import com.fyber.fairbid.adapters.APSAdapter;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: com.fyber.fairbid.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083a extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1083a(String str, int i, int i2) {
        super(0);
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        APSAdapter aPSAdapter = APSAdapter.INSTANCE;
        String slot = this.a;
        int i = this.b;
        int i2 = this.c;
        aPSAdapter.getClass();
        Intrinsics.checkNotNullParameter(slot, "slot");
        APSAdapter.SlotLoader slotLoader = APSAdapter.c;
        if (slotLoader != null) {
            slotLoader.loadAPSBannerSlot(slot, i, i2);
        }
        return B90.a;
    }
}
