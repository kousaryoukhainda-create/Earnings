package com.fyber.fairbid.mediation.pmn;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class ProgrammaticNetworkInfo {
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    @NotNull
    public final String c;
    @NotNull
    public final String d;
    public final String e;
    @NotNull
    public final Map<String, Object> f;

    public ProgrammaticNetworkInfo(@NotNull String networkName, @NotNull String programmaticName, @NotNull String appId, @NotNull String placementId, String str, @NotNull Map<String, ? extends Object> instanceData) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(programmaticName, "programmaticName");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        this.a = networkName;
        this.b = programmaticName;
        this.c = appId;
        this.d = placementId;
        this.e = str;
        this.f = instanceData;
    }

    @NotNull
    public final String getAppId() {
        return this.c;
    }

    @NotNull
    public final Map<String, Object> getInstanceData() {
        return this.f;
    }

    @NotNull
    public final String getNetworkName() {
        return this.a;
    }

    @NotNull
    public final String getPlacementId() {
        return this.d;
    }

    @NotNull
    public final String getProgrammaticName() {
        return this.b;
    }

    public final String getSessionId() {
        return this.e;
    }

    @NotNull
    public String toString() {
        return "PMNNetworkInfo{networkName=" + this.a + " ,programmaticName=" + this.b + " ,appId=" + this.c + " ,placementId=" + this.d + ", sessionId=" + this.e + ", instanceData=" + this.f + '}';
    }
}
