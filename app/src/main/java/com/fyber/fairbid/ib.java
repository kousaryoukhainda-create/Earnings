package com.fyber.fairbid;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ib implements hb {
    @NotNull
    public final String a;

    public ib(@NotNull String networkName) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        this.a = networkName;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        return C2062lJ.b(new JQ("network_name", this.a));
    }
}
