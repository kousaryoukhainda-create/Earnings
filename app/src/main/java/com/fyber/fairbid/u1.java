package com.fyber.fairbid;

import android.content.Context;
import com.fyber.fairbid.internal.Utils;
import com.fyber.fairbid.sdk.session.UserSessionManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class u1 implements u6 {
    @NotNull
    public final b4 a;
    public ii b;
    public hb c;
    public x9 d;
    public yc e;
    public List<? extends xe> f;
    public a6 g;
    public ni h;
    public ab i;
    public cc j;
    @NotNull
    public final HashMap k;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public final gj a;
        @NotNull
        public final s1 b;
        @NotNull
        public final Utils.ClockHelper c;
        @NotNull
        public final com.fyber.fairbid.internal.c d;
        @NotNull
        public final com.fyber.fairbid.internal.d e;
        @NotNull
        public final UserSessionManager f;
        @NotNull
        public final Context g;

        public a(@NotNull Context context, @NotNull gj module, @NotNull s1 dataHolder, @NotNull Utils.ClockHelper clockHelper, @NotNull com.fyber.fairbid.internal.c fairBidTrackingIDsUtils, @NotNull com.fyber.fairbid.internal.d offerWallTrackingIDsUtils, @NotNull UserSessionManager userSessionManager) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(dataHolder, "dataHolder");
            Intrinsics.checkNotNullParameter(clockHelper, "clockHelper");
            Intrinsics.checkNotNullParameter(fairBidTrackingIDsUtils, "fairBidTrackingIDsUtils");
            Intrinsics.checkNotNullParameter(offerWallTrackingIDsUtils, "offerWallTrackingIDsUtils");
            Intrinsics.checkNotNullParameter(userSessionManager, "userSessionManager");
            this.a = module;
            this.b = dataHolder;
            this.c = clockHelper;
            this.d = fairBidTrackingIDsUtils;
            this.e = offerWallTrackingIDsUtils;
            this.f = userSessionManager;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.g = applicationContext;
        }

        @NotNull
        public final u1 a(@NotNull w1 event) {
            b4 j7Var;
            Intrinsics.checkNotNullParameter(event, "event");
            int i = event.a;
            int i2 = event.b;
            int ordinal = this.a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    long currentTimeMillis = this.c.getCurrentTimeMillis();
                    long c = this.b.c();
                    String str = this.e.b;
                    String a = q5.a(this.g);
                    Intrinsics.checkNotNullExpressionValue(a, "connectionType(context)");
                    j7Var = new sf(i, currentTimeMillis, i2, c, str, a, this.e.b);
                } else {
                    throw new RuntimeException();
                }
            } else {
                long currentTimeMillis2 = this.c.getCurrentTimeMillis();
                s1 s1Var = this.b;
                String str2 = this.d.b;
                String a2 = q5.a(this.g);
                Intrinsics.checkNotNullExpressionValue(a2, "connectionType(context)");
                j7Var = new j7(i, currentTimeMillis2, i2, s1Var, str2, a2, this.f.getCurrentSession().getId());
            }
            return new u1(j7Var, null, null, null, null, null, null, null, null, null);
        }
    }

    public u1(@NotNull b4 baseParams, ii iiVar, hb hbVar, x9 x9Var, yc ycVar, List<? extends xe> list, a6 a6Var, ni niVar, ab abVar, cc ccVar) {
        Intrinsics.checkNotNullParameter(baseParams, "baseParams");
        this.a = baseParams;
        this.b = iiVar;
        this.c = hbVar;
        this.d = x9Var;
        this.e = ycVar;
        this.f = list;
        this.g = a6Var;
        this.h = niVar;
        this.i = abVar;
        this.j = ccVar;
        this.k = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.fyber.fairbid.x9] */
    public static u1 a(u1 u1Var, hb hbVar, C1096f0 c1096f0, yc ycVar, int i) {
        b4 baseParams = (i & 1) != 0 ? u1Var.a : null;
        ii iiVar = (i & 2) != 0 ? u1Var.b : null;
        hb hbVar2 = (i & 4) != 0 ? u1Var.c : hbVar;
        C1096f0 c1096f02 = (i & 8) != 0 ? u1Var.d : c1096f0;
        yc ycVar2 = (i & 16) != 0 ? u1Var.e : ycVar;
        List<? extends xe> list = (i & 32) != 0 ? u1Var.f : null;
        a6 a6Var = (i & 64) != 0 ? u1Var.g : null;
        ni niVar = (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? u1Var.h : null;
        ab abVar = (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? u1Var.i : null;
        cc ccVar = (i & 512) != 0 ? u1Var.j : null;
        Intrinsics.checkNotNullParameter(baseParams, "baseParams");
        return new u1(baseParams, iiVar, hbVar2, c1096f02, ycVar2, list, a6Var, niVar, abVar, ccVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            return Intrinsics.a(this.a, u1Var.a) && Intrinsics.a(this.b, u1Var.b) && Intrinsics.a(this.c, u1Var.c) && Intrinsics.a(this.d, u1Var.d) && Intrinsics.a(this.e, u1Var.e) && Intrinsics.a(this.f, u1Var.f) && Intrinsics.a(this.g, u1Var.g) && Intrinsics.a(this.h, u1Var.h) && Intrinsics.a(this.i, u1Var.i) && Intrinsics.a(this.j, u1Var.j);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ii iiVar = this.b;
        int hashCode2 = (hashCode + (iiVar == null ? 0 : iiVar.hashCode())) * 31;
        hb hbVar = this.c;
        int hashCode3 = (hashCode2 + (hbVar == null ? 0 : hbVar.hashCode())) * 31;
        x9 x9Var = this.d;
        int hashCode4 = (hashCode3 + (x9Var == null ? 0 : x9Var.hashCode())) * 31;
        yc ycVar = this.e;
        int hashCode5 = (hashCode4 + (ycVar == null ? 0 : ycVar.hashCode())) * 31;
        List<? extends xe> list = this.f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        a6 a6Var = this.g;
        int hashCode7 = (hashCode6 + (a6Var == null ? 0 : a6Var.hashCode())) * 31;
        ni niVar = this.h;
        int hashCode8 = (hashCode7 + (niVar == null ? 0 : niVar.hashCode())) * 31;
        ab abVar = this.i;
        int hashCode9 = (hashCode8 + (abVar == null ? 0 : abVar.hashCode())) * 31;
        cc ccVar = this.j;
        return hashCode9 + (ccVar != null ? ccVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AnalyticsEvent(baseParams=" + this.a + ", pluginParams=" + this.b + ", instanceParams=" + this.c + ", adRequestParams=" + this.d + ", marketplaceParams=" + this.e + ", networks=" + this.f + ", customParams=" + this.g + ", privacyParams=" + this.h + ", installMetrics=" + this.i + ", adMetadataParams=" + this.j + ')';
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        HashMap hashMap = new HashMap(this.k);
        hashMap.put("base_params", this.a.a());
        ii iiVar = this.b;
        if (iiVar != null) {
            hashMap.put("plugin_params", iiVar.a());
        }
        x9 x9Var = this.d;
        if (x9Var != null) {
            hashMap.put("ad_request_params", x9Var.a());
        }
        hb hbVar = this.c;
        if (hbVar != null) {
            hashMap.put("instance_params", hbVar.a());
        }
        List<? extends xe> list = this.f;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C0372Je.f(list));
            for (xe xeVar : list) {
                arrayList.add(xeVar.a());
            }
            hashMap.put("networks", arrayList);
        }
        yc ycVar = this.e;
        if (ycVar != null) {
            hashMap.put("marketplace_params", ycVar.a());
        }
        a6 a6Var = this.g;
        if (a6Var != null) {
            hashMap.put("custom_params", a6Var.a);
        }
        ni niVar = this.h;
        if (niVar != null) {
            hashMap.put("privacy_params", niVar.a);
        }
        ab abVar = this.i;
        if (abVar != null) {
            hashMap.put("install_metrics", abVar.a());
        }
        cc ccVar = this.j;
        if (ccVar != null) {
            hashMap.put("metadata", ccVar.a());
        }
        return hashMap;
    }
}
