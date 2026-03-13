package com.fyber.fairbid;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class i3 extends Exception {
    public static final /* synthetic */ int c = 0;
    @NotNull
    public final String a;
    @NotNull
    public final q7 b;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static i3 a(Throwable th) {
            if (th instanceof i3) {
                return (i3) th;
            }
            if (th instanceof t2) {
                return new j();
            }
            if (th instanceof ExecutionException) {
                return a(th.getCause());
            }
            return new m(th);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i3 {
        public b() {
            super("Exchange won, but it is disabled in config. Falling back to mediation, if possible.", q7.EXCHANGE, 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends i3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String message) {
            super(message, q7.EXCHANGE, 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends i3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String message) {
            super(message, q7.AUCTION, 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends i3 {
        public e() {
            super("Exchange adapter is missing", q7.EXCHANGE, 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends i3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull String pmnId) {
            super("The programmatic adapter for `" + pmnId + "` could not be found", q7.PMN, 0);
            Intrinsics.checkNotNullParameter(pmnId, "pmnId");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends i3 {
        public g() {
            super("No fill", q7.AUCTION, 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends i3 {
        public h() {
            super("Auction replied with a TMN fill but there is no local TMN fill", q7.AUCTION, 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends i3 {
        public i() {
            super("The waterfall doesn't contain this network as a programmatic one", q7.PMN, 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends i3 {
        public j() {
            super("There was a problem parsing the json for a programmatic response", q7.AUCTION, 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends i3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@NotNull String message) {
            super(message, q7.PMN, 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends i3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@NotNull TimeoutException exception) {
            super("Timeout: " + exception.getMessage(), q7.AUCTION, 0);
            Intrinsics.checkNotNullParameter(exception, "exception");
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends i3 {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public m(java.lang.Throwable r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L7
                java.lang.String r3 = r3.getMessage()
                goto L8
            L7:
                r3 = 0
            L8:
                if (r3 != 0) goto Lc
                java.lang.String r3 = ""
            Lc:
                com.fyber.fairbid.q7 r0 = com.fyber.fairbid.q7.AUCTION
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.i3.m.<init>(java.lang.Throwable):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends i3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@NotNull String message) {
            super(message, q7.PMN, 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends i3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@NotNull String message) {
            super(message, q7.AUCTION, 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public /* synthetic */ i3(String str, q7 q7Var, int i2) {
        this(str, q7Var);
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.a;
    }

    public i3(String str, q7 q7Var) {
        super(str);
        this.a = str;
        this.b = q7Var;
    }
}
