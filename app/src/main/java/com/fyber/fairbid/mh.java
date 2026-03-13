package com.fyber.fairbid;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class mh {
    @NotNull
    public final Handler a;
    @NotNull
    public final InterfaceC2059lG b;
    @NotNull
    public final InterfaceC2059lG c;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC1431gG implements InterfaceC0263Ez {
        public a() {
            super(0);
        }

        @Override // defpackage.InterfaceC0263Ez
        public final Object invoke() {
            return new nh(mh.this.a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends AbstractC1431gG implements InterfaceC0263Ez {
        public b() {
            super(0);
        }

        @Override // defpackage.InterfaceC0263Ez
        public final Object invoke() {
            return new ij(mh.this.a);
        }
    }

    public mh(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = handler;
        this.b = C2231nG.a(new a());
        this.c = C2231nG.a(new b());
    }
}
