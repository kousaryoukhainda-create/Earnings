package com.fyber.fairbid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ye implements xe {
    public final List<String> a;
    public final List<String> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    @NotNull
    public final String g;
    public final boolean h;
    public final boolean i;
    @NotNull
    public final String j;
    public final boolean k;
    @NotNull
    public final List<String> l;
    @NotNull
    public final List<String> m;
    @NotNull
    public final String n;
    public final Boolean o;

    public ye(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, boolean z3, boolean z4, @NotNull String name, boolean z5, boolean z6, @NotNull String sdkVersion, boolean z7, @NotNull ArrayList interceptedMetadataAdTypes, @NotNull ArrayList interceptedScreenshotAdTypes, @NotNull String sdkMinimumVersion, Boolean bool) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(interceptedMetadataAdTypes, "interceptedMetadataAdTypes");
        Intrinsics.checkNotNullParameter(interceptedScreenshotAdTypes, "interceptedScreenshotAdTypes");
        Intrinsics.checkNotNullParameter(sdkMinimumVersion, "sdkMinimumVersion");
        this.a = arrayList;
        this.b = arrayList2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = name;
        this.h = z5;
        this.i = z6;
        this.j = sdkVersion;
        this.k = z7;
        this.l = interceptedMetadataAdTypes;
        this.m = interceptedScreenshotAdTypes;
        this.n = sdkMinimumVersion;
        this.o = bool;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        Boolean bool;
        List<String> list = this.a;
        List<String> list2 = C2968vr.b;
        if (list == null) {
            list = list2;
        }
        JQ jq = new JQ("adapter_traditional_types", list);
        List<String> list3 = this.b;
        if (list3 != null) {
            list2 = list3;
        }
        JQ jq2 = new JQ("adapter_programmatic_types", list2);
        JQ jq3 = new JQ("network_sdk_integrated", Boolean.valueOf(this.d));
        JQ jq4 = new JQ("network_configured", Boolean.valueOf(this.e));
        JQ jq5 = new JQ("network_credentials_received", Boolean.valueOf(this.f));
        JQ jq6 = new JQ("network_name", this.g);
        JQ jq7 = new JQ("network_version", this.j);
        JQ jq8 = new JQ("network_activities_found", Boolean.valueOf(this.c));
        JQ jq9 = new JQ("network_permissions_found", Boolean.valueOf(this.h));
        JQ jq10 = new JQ("network_security_config_found", Boolean.valueOf(this.i));
        JQ jq11 = new JQ("network_started", Boolean.valueOf(this.k));
        JQ jq12 = new JQ("interceptor_enabled_metadata_types", this.l);
        JQ jq13 = new JQ("interceptor_enabled_screenshot_types", this.m);
        JQ jq14 = new JQ("adapter_minimum_version", this.n);
        Boolean bool2 = this.o;
        if (bool2 != null) {
            bool = Boolean.valueOf(!bool2.booleanValue());
        } else {
            bool = null;
        }
        return C2148mJ.e(jq, jq2, jq3, jq4, jq5, jq6, jq7, jq8, jq9, jq10, jq11, jq12, jq13, jq14, new JQ("network_version_compatible", bool));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ye) {
            ye yeVar = (ye) obj;
            return Intrinsics.a(this.a, yeVar.a) && Intrinsics.a(this.b, yeVar.b) && this.c == yeVar.c && this.d == yeVar.d && this.e == yeVar.e && this.f == yeVar.f && Intrinsics.a(this.g, yeVar.g) && this.h == yeVar.h && this.i == yeVar.i && Intrinsics.a(this.j, yeVar.j) && this.k == yeVar.k && Intrinsics.a(this.l, yeVar.l) && Intrinsics.a(this.m, yeVar.m) && Intrinsics.a(this.n, yeVar.n) && Intrinsics.a(this.o, yeVar.o);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        List<String> list = this.a;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<String> list2 = this.b;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.c;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        boolean z2 = this.d;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z3 = this.e;
        int i9 = z3;
        if (z3 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z4 = this.f;
        int i11 = z4;
        if (z4 != 0) {
            i11 = 1;
        }
        int a = fm.a(this.g, (i10 + i11) * 31, 31);
        boolean z5 = this.h;
        int i12 = z5;
        if (z5 != 0) {
            i12 = 1;
        }
        int i13 = (a + i12) * 31;
        boolean z6 = this.i;
        int i14 = z6;
        if (z6 != 0) {
            i14 = 1;
        }
        int a2 = fm.a(this.j, (i13 + i14) * 31, 31);
        boolean z7 = this.k;
        if (!z7) {
            i4 = z7 ? 1 : 0;
        }
        int hashCode3 = this.l.hashCode();
        int hashCode4 = this.m.hashCode();
        int a3 = fm.a(this.n, (hashCode4 + ((hashCode3 + ((a2 + i4) * 31)) * 31)) * 31, 31);
        Boolean bool = this.o;
        if (bool != null) {
            i = bool.hashCode();
        }
        return a3 + i;
    }

    @NotNull
    public final String toString() {
        return "NetworkInfoWithAdapterStatusParams(adapterTraditionalTypes=" + this.a + ", adapterProgrammaticTypes=" + this.b + ", activitiesFound=" + this.c + ", sdkIntegrated=" + this.d + ", configured=" + this.e + ", credentialsReceived=" + this.f + ", name=" + this.g + ", permissionsFound=" + this.h + ", securityConfigFound=" + this.i + ", sdkVersion=" + this.j + ", adapterStarted=" + this.k + ", interceptedMetadataAdTypes=" + this.l + ", interceptedScreenshotAdTypes=" + this.m + ", sdkMinimumVersion=" + this.n + ", isBelowMinimumSdkVersion=" + this.o + ')';
    }
}
