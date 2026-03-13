package com.fyber.fairbid.plugin.adtransparency.mediation;

import com.fyber.fairbid.plugin.MediationNetwork;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public abstract class Injector {
    @NotNull
    private final InterfaceC0652Tz logger;
    @NotNull
    private final Set<String> transformedClasses;

    public Injector(@NotNull InterfaceC0652Tz logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.transformedClasses = new LinkedHashSet();
    }

    @NotNull
    public abstract Set<String> getClassesToTransform();

    @NotNull
    public final InterfaceC0652Tz getLogger() {
        return this.logger;
    }

    @NotNull
    public abstract MediationNetwork getNetwork();

    @NotNull
    public final Set<String> getTransformedClasses() {
        return this.transformedClasses;
    }

    public boolean isNetworkFullyTransformed() {
        return this.transformedClasses.containsAll(getClassesToTransform());
    }

    @NotNull
    public abstract List<AbstractC2013kk> transform(@NotNull C0397Kd c0397Kd, @NotNull List<String> list);
}
