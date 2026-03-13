package com.fyber.fairbid;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class cd {
    @NotNull
    public final List<bf> a;

    public cd(@NotNull LinkedList relevantNetworks) {
        Intrinsics.checkNotNullParameter(relevantNetworks, "relevantNetworks");
        this.a = relevantNetworks;
    }
}
