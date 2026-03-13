package com.fyber.fairbid.mediation.display;

import com.fyber.fairbid.C1112n0;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.pa;
import com.fyber.fairbid.v4;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class NetworkModel {
    @NotNull
    public final String a;
    public final int b;
    @NotNull
    public final Constants.AdType c;
    @NotNull
    public final int d;
    public final int e;
    @NotNull
    public final String f;
    @NotNull
    public final List<v4> g;
    @NotNull
    public final Map<String, Object> h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    @NotNull
    public final C1112n0 m;
    public final int n;

    public /* synthetic */ NetworkModel() {
        throw null;
    }

    public final boolean a(@NotNull pa impressionsStore) {
        Intrinsics.checkNotNullParameter(impressionsStore, "impressionsStore");
        List<v4> list = this.g;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (v4 v4Var : list) {
                if (v4Var.a(this.b, impressionsStore)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b() {
        if (this.d == 2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkModel)) {
            return false;
        }
        NetworkModel networkModel = (NetworkModel) obj;
        if (this.b != networkModel.b) {
            return false;
        }
        return Intrinsics.a(this.a, networkModel.a);
    }

    @NotNull
    public final String getInstanceId() {
        return this.f;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @NotNull
    public final String toString() {
        String format = String.format(Locale.ENGLISH, "+-- Network name: %s\n\t|\t+-- id: %d\n\t|\t+-- data: %s", Arrays.copyOf(new Object[]{this.a, Integer.valueOf(this.b), this.h}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;ILcom/fyber/fairbid/internal/Constants$AdType;Ljava/lang/Object;ILjava/lang/String;Ljava/util/List<+Lcom/fyber/fairbid/v4;>;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;DDDDLcom/fyber/fairbid/n0;I)V */
    public NetworkModel(String str, int i, Constants.AdType adType, int i2, int i3, String str2, List list, Map map, double d, double d2, double d3, double d4, C1112n0 c1112n0, int i4) {
        this.a = str;
        this.b = i;
        this.c = adType;
        this.d = i2;
        this.e = i3;
        this.f = str2;
        this.g = list;
        this.h = map;
        this.i = d;
        this.j = d2;
        this.k = d3;
        this.l = d4;
        this.m = c1112n0;
        this.n = i4;
    }

    public final int a() {
        if (this.d == 1) {
            return ((Number) this.m.get$fairbid_sdk_release("tmn_timeout", 10)).intValue();
        }
        return ((Number) this.m.get$fairbid_sdk_release("pmn_timeout", 10)).intValue();
    }
}
