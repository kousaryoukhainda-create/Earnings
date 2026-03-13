package com.fyber.fairbid;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class y4 {
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    @NotNull
    public final String c;
    @NotNull
    public final String d;
    @NotNull
    public final String e;
    @NotNull
    public final String f;
    @NotNull
    public final Map<String, com.chartboost.sdk.impl.r0> g;
    @NotNull
    public final String h;
    @NotNull
    public final String i;
    @NotNull
    public final String j;
    @NotNull
    public final String k;
    @NotNull
    public final String l;
    public final int m;
    @NotNull
    public final String n;
    @NotNull
    public final String o;
    public final com.chartboost.sdk.impl.n0 p;
    @NotNull
    public final com.chartboost.sdk.impl.r0 q;
    @NotNull
    public final Map<String, String> r;
    @NotNull
    public final Map<String, List<String>> s;
    @NotNull
    public final String t;
    @NotNull
    public final String u;

    public y4(@NotNull String name, @NotNull String adId, @NotNull String impressionId, @NotNull String cgn, @NotNull String creative, @NotNull String mediaType, @NotNull Map<String, com.chartboost.sdk.impl.r0> assets, @NotNull String videoUrl, @NotNull String videoFilename, @NotNull String link, @NotNull String deepLink, @NotNull String to, int i, @NotNull String rewardCurrency, @NotNull String template, com.chartboost.sdk.impl.n0 n0Var, @NotNull com.chartboost.sdk.impl.r0 body, @NotNull Map<String, String> parameters, @NotNull Map<String, List<String>> events, @NotNull String adm, @NotNull String templateParams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(templateParams, "templateParams");
        this.a = name;
        this.b = adId;
        this.c = impressionId;
        this.d = cgn;
        this.e = creative;
        this.f = mediaType;
        this.g = assets;
        this.h = videoUrl;
        this.i = videoFilename;
        this.j = link;
        this.k = deepLink;
        this.l = to;
        this.m = i;
        this.n = rewardCurrency;
        this.o = template;
        this.p = n0Var;
        this.q = body;
        this.r = parameters;
        this.s = events;
        this.t = adm;
        this.u = templateParams;
        if (videoUrl.length() > 0) {
            videoFilename.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y4) {
            y4 y4Var = (y4) obj;
            return Intrinsics.a(this.a, y4Var.a) && Intrinsics.a(this.b, y4Var.b) && Intrinsics.a(this.c, y4Var.c) && Intrinsics.a(this.d, y4Var.d) && Intrinsics.a(this.e, y4Var.e) && Intrinsics.a(this.f, y4Var.f) && Intrinsics.a(this.g, y4Var.g) && Intrinsics.a(this.h, y4Var.h) && Intrinsics.a(this.i, y4Var.i) && Intrinsics.a(this.j, y4Var.j) && Intrinsics.a(this.k, y4Var.k) && Intrinsics.a(this.l, y4Var.l) && this.m == y4Var.m && Intrinsics.a(this.n, y4Var.n) && Intrinsics.a(this.o, y4Var.o) && this.p == y4Var.p && Intrinsics.a(this.q, y4Var.q) && Intrinsics.a(this.r, y4Var.r) && Intrinsics.a(this.s, y4Var.s) && Intrinsics.a(this.t, y4Var.t) && Intrinsics.a(this.u, y4Var.u);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = fm.a(this.f, fm.a(this.e, fm.a(this.d, fm.a(this.c, fm.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        int a2 = fm.a(this.l, fm.a(this.k, fm.a(this.j, fm.a(this.i, fm.a(this.h, (this.g.hashCode() + a) * 31, 31), 31), 31), 31), 31);
        int a3 = fm.a(this.o, fm.a(this.n, (this.m + a2) * 31, 31), 31);
        com.chartboost.sdk.impl.n0 n0Var = this.p;
        if (n0Var == null) {
            hashCode = 0;
        } else {
            hashCode = n0Var.hashCode();
        }
        int hashCode2 = this.q.hashCode();
        int hashCode3 = this.r.hashCode();
        int hashCode4 = this.s.hashCode();
        return this.u.hashCode() + fm.a(this.t, (hashCode4 + ((hashCode3 + ((hashCode2 + ((a3 + hashCode) * 31)) * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "ChartboostAdUnit(name=" + this.a + ", adId=" + this.b + ", impressionId=" + this.c + ", cgn=" + this.d + ", creative=" + this.e + ", mediaType=" + this.f + ", assets=" + this.g + ", videoUrl=" + this.h + ", videoFilename=" + this.i + ", link=" + this.j + ", deepLink=" + this.k + ", to=" + this.l + ", rewardAmount=" + this.m + ", rewardCurrency=" + this.n + ", template=" + this.o + ", animation=" + this.p + ", body=" + this.q + ", parameters=" + this.r + ", events=" + this.s + ", adm=" + this.t + ", templateParams=" + this.u + ')';
    }
}
