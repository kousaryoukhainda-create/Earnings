package com.fyber.fairbid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ji {
    @NotNull
    public final a a;
    @NotNull
    public final String b;
    @NotNull
    public final String c;

    /* loaded from: classes.dex */
    public enum a {
        a,
        b,
        c,
        d,
        e;

        a() {
        }
    }

    public ji(@NotNull a status, @NotNull String networkName, @NotNull String networkInstanceId) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.a = status;
        this.b = networkName;
        this.c = networkInstanceId;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PmnLoadStatus{status=");
        sb.append(this.a);
        sb.append(", networkName='");
        sb.append(this.b);
        sb.append("', networkInstanceId='");
        return AbstractC0324Hi.h(sb, this.c, "'}");
    }
}
