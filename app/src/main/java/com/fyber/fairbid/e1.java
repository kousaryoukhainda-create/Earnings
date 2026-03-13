package com.fyber.fairbid;

import com.fyber.fairbid.mediation.abstr.CachedAd;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class e1<DTBAd> implements CachedAd {
    public final double a;
    public final DTBAd b;
    @NotNull
    public final InterfaceC2059lG c = C2231nG.a(new a(this));

    /* loaded from: classes.dex */
    public static final class a extends AbstractC1431gG implements InterfaceC0263Ez {
        public final /* synthetic */ e1<DTBAd> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1<DTBAd> e1Var) {
            super(0);
            this.a = e1Var;
        }

        @Override // defpackage.InterfaceC0263Ez
        public final Object invoke() {
            return Double.valueOf(this.a.a / 1000);
        }
    }

    public e1(double d, DTBAd dtbad) {
        this.a = d;
        this.b = dtbad;
    }

    @Override // com.fyber.fairbid.mediation.abstr.CachedAd
    public final boolean isAvailable() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
