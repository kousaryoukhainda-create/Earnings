package com.fyber.fairbid.ads.mediation;

import com.fyber.fairbid.mediation.Network;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class MediatedNetworkKt {
    @NotNull
    public static final String renamedNetworks(@NotNull String str) {
        Network network;
        String marketingName;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Network[] values = Network.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                network = values[i];
                if (Intrinsics.a(network.getCanonicalName(), str)) {
                    break;
                }
                i++;
            } else {
                network = null;
                break;
            }
        }
        if (network != null && (marketingName = network.getMarketingName()) != null) {
            return marketingName;
        }
        return str;
    }
}
