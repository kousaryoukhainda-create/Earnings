package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.mediation.Network;
import com.fyber.fairbid.sdk.mediation.data.AdapterStatusRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class bf {
    public final boolean a;
    public final int b;
    @NotNull
    public final Network c;
    public final EnumC1118q0 d;
    public final int e;
    @NotNull
    public final String f;
    @NotNull
    public final InterfaceC0263Ez g;
    public final boolean h;
    @NotNull
    public final List<String> i;
    @NotNull
    public final List<String> j;
    public final boolean k;
    @NotNull
    public final List<String> l;
    public final boolean m;
    public final boolean n;
    @NotNull
    public final SettableFuture<Boolean> o;
    public final boolean p;
    public final boolean q;
    @NotNull
    public final String r;
    @NotNull
    public final InterfaceC0263Ez s;
    public final boolean t;

    public bf(boolean z, int i, @NotNull Network network, EnumC1118q0 enumC1118q0, int i2, @NotNull String name, @NotNull AdapterStatusRepository.b sdkVersion, boolean z2, @NotNull ArrayList missingPermissions, @NotNull ArrayList missingActivities, boolean z3, @NotNull List credentialsInfo, boolean z4, boolean z5, @NotNull SettableFuture adapterStarted, boolean z6, boolean z7, @NotNull String minimumSupportedVersion, @NotNull AdapterStatusRepository.c isBelowMinimumVersion, boolean z8) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(missingPermissions, "missingPermissions");
        Intrinsics.checkNotNullParameter(missingActivities, "missingActivities");
        Intrinsics.checkNotNullParameter(credentialsInfo, "credentialsInfo");
        Intrinsics.checkNotNullParameter(adapterStarted, "adapterStarted");
        Intrinsics.checkNotNullParameter(minimumSupportedVersion, "minimumSupportedVersion");
        Intrinsics.checkNotNullParameter(isBelowMinimumVersion, "isBelowMinimumVersion");
        this.a = z;
        this.b = i;
        this.c = network;
        this.d = enumC1118q0;
        this.e = i2;
        this.f = name;
        this.g = sdkVersion;
        this.h = z2;
        this.i = missingPermissions;
        this.j = missingActivities;
        this.k = z3;
        this.l = credentialsInfo;
        this.m = z4;
        this.n = z5;
        this.o = adapterStarted;
        this.p = z6;
        this.q = z7;
        this.r = minimumSupportedVersion;
        this.s = isBelowMinimumVersion;
        this.t = z8;
    }

    public final boolean a() {
        return !this.i.isEmpty();
    }

    public final boolean b() {
        return this.n;
    }

    public final boolean c() {
        if (this.h && this.a && this.j.isEmpty() && this.k && this.s.invoke() != ik.TRUE) {
            return true;
        }
        return false;
    }
}
