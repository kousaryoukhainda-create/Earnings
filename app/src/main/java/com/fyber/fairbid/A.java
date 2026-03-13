package com.fyber.fairbid;

import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.sdk.placements.IPlacementsHandler;
/* loaded from: classes.dex */
public final /* synthetic */ class A implements EventStream.EventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.fyber.fairbid.common.lifecycle.EventStream.EventListener
    public final void onEvent(Object obj) {
        switch (this.a) {
            case 0:
                af.a((af) this.b, (IPlacementsHandler.PlacementChangeEvent) obj);
                return;
            case 1:
                hi.a((hi) this.b, (IPlacementsHandler.PlacementChangeEvent) obj);
                return;
            default:
                r3.a((r3) this.b, (AbstractC1117q) obj);
                return;
        }
    }
}
