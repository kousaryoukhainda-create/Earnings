package com.fyber.fairbid;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class u2 implements f7 {
    public final long a;

    /* loaded from: classes.dex */
    public static final class a extends u2 {
        @NotNull
        public final mk b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final double g;
        public final boolean h;
        public final JSONObject i;
        @NotNull
        public final b j;
        @NotNull
        public final String k;
        @NotNull
        public final Map<String, String> l;
        public final Long m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull mk trackingUrls, String str, String str2, String str3, String str4, double d, boolean z, JSONObject jSONObject, @NotNull b demandSourceType, @NotNull String markup, @NotNull Map<String, String> auctionHeaders, Long l, long j) {
            super(j, 0);
            Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
            Intrinsics.checkNotNullParameter(demandSourceType, "demandSourceType");
            Intrinsics.checkNotNullParameter(markup, "markup");
            Intrinsics.checkNotNullParameter(auctionHeaders, "auctionHeaders");
            this.b = trackingUrls;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = d;
            this.h = z;
            this.i = jSONObject;
            this.j = demandSourceType;
            this.k = markup;
            this.l = auctionHeaders;
            this.m = l;
        }

        @Override // com.fyber.fairbid.u2
        public final String e() {
            return this.c;
        }

        @Override // com.fyber.fairbid.u2
        public final JSONObject f() {
            return this.i;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final Map<String, String> g() {
            return this.l;
        }

        @Override // com.fyber.fairbid.u2
        public final String h() {
            return this.e;
        }

        @Override // com.fyber.fairbid.u2
        public final String i() {
            return this.d;
        }

        @Override // com.fyber.fairbid.u2
        public final String j() {
            return this.f;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final b k() {
            return this.j;
        }

        @Override // com.fyber.fairbid.u2
        public final boolean l() {
            return this.h;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final String n() {
            return this.k;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ JSONObject o() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final double p() {
            return this.g;
        }

        @Override // com.fyber.fairbid.u2
        public final Long q() {
            return this.m;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final mk r() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        a,
        b,
        c,
        d;

        b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u2 {
        @NotNull
        public final mk b;
        @NotNull
        public final JSONObject c;
        public final double d;
        public final boolean e;
        public final JSONObject f;
        @NotNull
        public final b g;
        @NotNull
        public final String h;
        @NotNull
        public final Map<String, String> i;
        public final Long j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull mk trackingUrls, @NotNull JSONObject pmnEntry, double d, boolean z, JSONObject jSONObject, @NotNull b demandSourceType, @NotNull String markup, @NotNull Map<String, String> auctionHeaders, Long l, long j) {
            super(j, 0);
            Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
            Intrinsics.checkNotNullParameter(pmnEntry, "pmnEntry");
            Intrinsics.checkNotNullParameter(demandSourceType, "demandSourceType");
            Intrinsics.checkNotNullParameter(markup, "markup");
            Intrinsics.checkNotNullParameter(auctionHeaders, "auctionHeaders");
            this.b = trackingUrls;
            this.c = pmnEntry;
            this.d = d;
            this.e = z;
            this.f = jSONObject;
            this.g = demandSourceType;
            this.h = markup;
            this.i = auctionHeaders;
            this.j = l;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String e() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final JSONObject f() {
            return this.f;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final Map<String, String> g() {
            return this.i;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String h() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String i() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String j() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final b k() {
            return this.g;
        }

        @Override // com.fyber.fairbid.u2
        public final boolean l() {
            return this.e;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final String n() {
            return this.h;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final JSONObject o() {
            return this.c;
        }

        @Override // com.fyber.fairbid.u2
        public final double p() {
            return this.d;
        }

        @Override // com.fyber.fairbid.u2
        public final Long q() {
            return this.j;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final mk r() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends u2 {
        @NotNull
        public final mk b;
        public final double c;
        @NotNull
        public final b d;
        @NotNull
        public final Map<String, String> e;
        public final Long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull mk trackingUrls, double d, @NotNull b demandSourceType, @NotNull Map<String, String> auctionHeaders, Long l, long j) {
            super(j, 0);
            Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
            Intrinsics.checkNotNullParameter(demandSourceType, "demandSourceType");
            Intrinsics.checkNotNullParameter(auctionHeaders, "auctionHeaders");
            this.b = trackingUrls;
            this.c = d;
            this.d = demandSourceType;
            this.e = auctionHeaders;
            this.f = l;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String e() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ JSONObject f() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final Map<String, String> g() {
            return this.e;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String h() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String i() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String j() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final b k() {
            return this.d;
        }

        @Override // com.fyber.fairbid.u2
        public final boolean l() {
            return false;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ String n() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final /* bridge */ /* synthetic */ JSONObject o() {
            return null;
        }

        @Override // com.fyber.fairbid.u2
        public final double p() {
            return this.c;
        }

        @Override // com.fyber.fairbid.u2
        public final Long q() {
            return this.f;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final mk r() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements g {
        @NotNull
        public final String a;

        public f(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.a = message;
        }

        @Override // com.fyber.fairbid.u2.g
        public final boolean a() {
            return false;
        }

        @Override // com.fyber.fairbid.u2.g
        @NotNull
        public final String getMessage() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        boolean a();

        @NotNull
        String getMessage();
    }

    /* loaded from: classes.dex */
    public static final class h implements g {
        @Override // com.fyber.fairbid.u2.g
        public final boolean a() {
            return true;
        }

        @Override // com.fyber.fairbid.u2.g
        @NotNull
        public final String getMessage() {
            return "Validation Success";
        }
    }

    public /* synthetic */ u2(long j, int i) {
        this(j);
    }

    @Override // com.fyber.fairbid.f7
    public final long a() {
        return this.a;
    }

    @Override // com.fyber.fairbid.f7
    @NotNull
    public final void b() {
    }

    @Override // com.fyber.fairbid.f7
    public final long c() {
        Long q = q();
        if (q != null) {
            return TimeUnit.MINUTES.toMillis(q.longValue());
        }
        return -1L;
    }

    @Override // com.fyber.fairbid.f7
    public final long d() {
        return c() + this.a;
    }

    public abstract String e();

    public abstract JSONObject f();

    @NotNull
    public abstract Map<String, String> g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    @NotNull
    public abstract b k();

    public abstract boolean l();

    public final boolean m() {
        boolean z;
        String n = n();
        if (n != null && n.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public abstract String n();

    public abstract JSONObject o();

    public abstract double p();

    public abstract Long q();

    @NotNull
    public abstract mk r();

    @NotNull
    public final g s() {
        int ordinal = k().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return new f("There was an error retrieving the ad type from the response");
                    }
                }
            } else {
                String str = r().a;
                Intrinsics.checkNotNullExpressionValue(str, "trackingUrls.impressionUrl");
                if (str.length() == 0) {
                    return new f("Missing tracking impression url");
                }
                String str2 = r().b;
                Intrinsics.checkNotNullExpressionValue(str2, "trackingUrls.clickUrl");
                if (str2.length() == 0) {
                    return new f("Missing tracking click url");
                }
            }
            return new h();
        }
        if (!l()) {
            return new f("Missing 'ad' key from the response");
        }
        if (!m()) {
            return new f("Missing 'markup' key from the response");
        }
        if (f() != null) {
            if (k() == b.a && o() == null) {
                return new f("Missing 'pmn' key from the response");
            }
            return new h();
        }
        return new f("Missing 'auction' key from the response");
    }

    public u2(long j) {
        this.a = j;
    }

    /* loaded from: classes.dex */
    public static final class c extends u2 {
        public final double b;
        @NotNull
        public final b c;
        @NotNull
        public final mk d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final boolean i;
        public final JSONObject j;
        public final String k;
        public final JSONObject l;
        @NotNull
        public final Map<String, String> m;
        public final Long n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ c(long r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                com.fyber.fairbid.u2$b r5 = com.fyber.fairbid.u2.b.d
                com.fyber.fairbid.mk r3 = com.fyber.fairbid.mk.d
                r6 = r3
                java.lang.String r4 = "NO_TRACKING"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                wr r15 = defpackage.C3054wr.b
                r16 = 0
                r3 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.u2.c.<init>(long):void");
        }

        @Override // com.fyber.fairbid.u2
        public final String e() {
            return this.f;
        }

        @Override // com.fyber.fairbid.u2
        public final JSONObject f() {
            return this.j;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final Map<String, String> g() {
            return this.m;
        }

        @Override // com.fyber.fairbid.u2
        public final String h() {
            return this.h;
        }

        @Override // com.fyber.fairbid.u2
        public final String i() {
            return this.g;
        }

        @Override // com.fyber.fairbid.u2
        public final String j() {
            return this.e;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final b k() {
            return this.c;
        }

        @Override // com.fyber.fairbid.u2
        public final boolean l() {
            return this.i;
        }

        @Override // com.fyber.fairbid.u2
        public final String n() {
            return this.k;
        }

        @Override // com.fyber.fairbid.u2
        public final JSONObject o() {
            return this.l;
        }

        @Override // com.fyber.fairbid.u2
        public final double p() {
            return this.b;
        }

        @Override // com.fyber.fairbid.u2
        public final Long q() {
            return this.n;
        }

        @Override // com.fyber.fairbid.u2
        @NotNull
        public final mk r() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, double d, @NotNull b demandSourceType, @NotNull mk trackingUrls, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, String str5, JSONObject jSONObject2, @NotNull Map<String, String> auctionHeaders, Long l) {
            super(j, 0);
            Intrinsics.checkNotNullParameter(demandSourceType, "demandSourceType");
            Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
            Intrinsics.checkNotNullParameter(auctionHeaders, "auctionHeaders");
            this.b = d;
            this.c = demandSourceType;
            this.d = trackingUrls;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = z;
            this.j = jSONObject;
            this.k = str5;
            this.l = jSONObject2;
            this.m = auctionHeaders;
            this.n = l;
        }
    }
}
