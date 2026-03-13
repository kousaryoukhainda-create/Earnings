package com.fyber.fairbid;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class jb implements hb {
    @NotNull
    public final String a;
    @NotNull
    public final String b;

    public jb(@NotNull String networkName, @NotNull String instanceId) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.a = networkName;
        this.b = instanceId;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        return C2148mJ.e(new JQ("instance_id", this.b), new JQ("network_name", this.a));
    }
}
