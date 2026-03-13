package com.fyber.fairbid;

import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.NetworkResult;
import com.fyber.fairbid.mediation.request.MediationRequest;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.WaterfallAuditResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public interface ia {

    /* loaded from: classes.dex */
    public static abstract class a {
        public final boolean a;
        @NotNull
        public final String b;
        public final String c;
        public final q7 d;

        /* renamed from: com.fyber.fairbid.ia$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0047a extends a {
            @NotNull
            public static final C0047a e = new C0047a();

            public C0047a() {
                super(false, "Auction", null, null, 0);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull q7 fallbackReason) {
                super(true, "DtxFallback", "exchange", fallbackReason, 0);
                Intrinsics.checkNotNullParameter(fallbackReason, "fallbackReason");
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            @NotNull
            public static final c e = new c();

            public c() {
                super(false, "Waterfall", null, null, 0);
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends a {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d() {
                /*
                    r6 = this;
                    com.fyber.fairbid.q7 r4 = com.fyber.fairbid.q7.EXCHANGE_FALLBACK
                    java.lang.String r0 = "fallbackReason"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.String r3 = "waterfall"
                    r5 = 0
                    r1 = 1
                    java.lang.String r2 = "WaterfallDtxFallback"
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.ia.a.d.<init>():void");
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@NotNull q7 fallbackReason) {
                super(true, "WaterfallFallback", "waterfall", fallbackReason, 0);
                Intrinsics.checkNotNullParameter(fallbackReason, "fallbackReason");
            }
        }

        public /* synthetic */ a(boolean z, String str, String str2, q7 q7Var, int i) {
            this(z, str, str2, q7Var);
        }

        public a(boolean z, String str, String str2, q7 q7Var) {
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = q7Var;
        }
    }

    @NotNull
    MediationRequest a();

    boolean a(long j);

    b3 b();

    long c();

    WaterfallAuditResult d();

    @NotNull
    Constants.AdType e();

    @NotNull
    C1116p0 f();

    boolean g();

    int getPlacementId();

    long h();

    NetworkResult i();

    @NotNull
    Placement j();

    @NotNull
    u2 k();

    x6 l();

    int m();

    a n();

    a o();
}
