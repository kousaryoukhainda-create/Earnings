package com.fyber.fairbid.sdk.placements;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.common.lifecycle.OnScreenAdTracker;
import com.fyber.fairbid.ia;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.display.NetworkModel;
import com.fyber.fairbid.mediation.request.MediationRequest;
import com.fyber.fairbid.o8;
import com.fyber.fairbid.sdk.session.UserSessionTracker;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface IPlacementsHandler {

    @Metadata
    /* loaded from: classes.dex */
    public static final class PlacementChangeEvent {
        @NotNull
        public final Map<Integer, Placement> a;
        public final boolean b;

        public PlacementChangeEvent(@NotNull Map<Integer, Placement> placements, boolean z) {
            Intrinsics.checkNotNullParameter(placements, "placements");
            this.a = placements;
            this.b = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PlacementChangeEvent copy$default(PlacementChangeEvent placementChangeEvent, Map map, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                map = placementChangeEvent.a;
            }
            if ((i & 2) != 0) {
                z = placementChangeEvent.b;
            }
            return placementChangeEvent.copy(map, z);
        }

        @NotNull
        public final Map<Integer, Placement> component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @NotNull
        public final PlacementChangeEvent copy(@NotNull Map<Integer, Placement> placements, boolean z) {
            Intrinsics.checkNotNullParameter(placements, "placements");
            return new PlacementChangeEvent(placements, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PlacementChangeEvent) {
                PlacementChangeEvent placementChangeEvent = (PlacementChangeEvent) obj;
                return Intrinsics.a(this.a, placementChangeEvent.a) && this.b == placementChangeEvent.b;
            }
            return false;
        }

        public final boolean getAllVariants() {
            return this.b;
        }

        @NotNull
        public final Map<Integer, Placement> getPlacements() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        @NotNull
        public String toString() {
            return "PlacementChangeEvent(placements=" + this.a + ", allVariants=" + this.b + ')';
        }
    }

    void addPlacementsListener(@NotNull ExecutorService executorService, @NotNull EventStream.EventListener<PlacementChangeEvent> eventListener);

    @NotNull
    List<NetworkModel> getAllNetworkModels();

    SettableFuture<ia> getAuditResultFuture(int i, @NotNull Constants.AdType adType);

    ia getAuditResultImmediately(@NotNull Constants.AdType adType, int i);

    @NotNull
    Map<String, List<NetworkModel>> getNetworkModelsByNetwork();

    @NotNull
    Placement getPlacementForId(int i);

    @NotNull
    Map<Integer, Placement> getPlacements();

    boolean isInstanceProgrammatic(@NotNull String str, @NotNull String str2);

    SettableFuture<ia> removeCachedPlacement(int i, @NotNull Constants.AdType adType);

    @NotNull
    Set<Integer> removeInvalidatedFills(@NotNull Constants.AdType adType);

    void removePlacementsListener(@NotNull EventStream.EventListener<PlacementChangeEvent> eventListener);

    void setPlacements(@NotNull Map<Integer, Placement> map, boolean z);

    @NotNull
    SettableFuture<ia> startPlacementRequest(int i, @NotNull Constants.AdType adType, @NotNull MediationRequest mediationRequest, @NotNull UserSessionTracker userSessionTracker, @NotNull AdapterPool adapterPool, @NotNull o8<Integer, Void> o8Var, @NotNull OnScreenAdTracker onScreenAdTracker);

    @NotNull
    String toString();
}
