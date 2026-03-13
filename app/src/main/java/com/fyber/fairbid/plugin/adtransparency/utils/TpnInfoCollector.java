package com.fyber.fairbid.plugin.adtransparency.utils;

import com.fyber.fairbid.plugin.MediationNetwork;
import com.fyber.fairbid.plugin.adtransparency.utils.TpnInfoCollector;
import j$.util.Map;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class TpnInfoCollector implements Serializable {
    @NotNull
    private final Map<MediationNetwork, Set<TpnInfo>> tpnInfoMap = new LinkedHashMap();

    @Metadata
    /* loaded from: classes.dex */
    public static final class TpnInfo implements Serializable {
        @NotNull
        private final String group;
        @NotNull
        private final String name;
        @NotNull
        private final String version;

        public TpnInfo(@NotNull String group, @NotNull String name, @NotNull String version) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(version, "version");
            this.group = group;
            this.name = name;
            this.version = version;
        }

        public static /* synthetic */ TpnInfo copy$default(TpnInfo tpnInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tpnInfo.group;
            }
            if ((i & 2) != 0) {
                str2 = tpnInfo.name;
            }
            if ((i & 4) != 0) {
                str3 = tpnInfo.version;
            }
            return tpnInfo.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.group;
        }

        @NotNull
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final String component3() {
            return this.version;
        }

        @NotNull
        public final TpnInfo copy(@NotNull String group, @NotNull String name, @NotNull String version) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(version, "version");
            return new TpnInfo(group, name, version);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TpnInfo) {
                    TpnInfo tpnInfo = (TpnInfo) obj;
                    return Intrinsics.a(this.group, tpnInfo.group) && Intrinsics.a(this.name, tpnInfo.name) && Intrinsics.a(this.version, tpnInfo.version);
                }
                return false;
            }
            return true;
        }

        @NotNull
        public final String getGroup() {
            return this.group;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.group;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.version;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("TpnInfo(group=");
            sb.append(this.group);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", version=");
            return AbstractC0324Hi.h(sb, this.version, ")");
        }
    }

    public final void addTpnInfo(@NotNull MediationNetwork mediationNetwork, @NotNull TpnInfo tpnInfo) {
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(tpnInfo, "tpnInfo");
        Map.EL.merge(this.tpnInfoMap, mediationNetwork, S00.b(tpnInfo), new BiFunction() { // from class: com.fyber.fairbid.plugin.adtransparency.utils.TpnInfoCollector$addTpnInfo$1
            @Override // j$.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Set<TpnInfoCollector.TpnInfo> apply(@NotNull Set<TpnInfoCollector.TpnInfo> oldSet, @NotNull Set<TpnInfoCollector.TpnInfo> newSet) {
                Intrinsics.checkNotNullParameter(oldSet, "oldSet");
                Intrinsics.checkNotNullParameter(newSet, "newSet");
                oldSet.addAll(newSet);
                return oldSet;
            }
        });
    }

    @NotNull
    public final List<TpnInfo> getTpnInfoFor(@NotNull MediationNetwork mediationNetwork) {
        List<TpnInfo> A;
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Set<TpnInfo> set = this.tpnInfoMap.get(mediationNetwork);
        if (set == null || (A = C0553Qe.A(set)) == null) {
            return C2968vr.b;
        }
        return A;
    }

    @NotNull
    public final java.util.Map<MediationNetwork, Set<TpnInfo>> getTpnInfoMap() {
        return this.tpnInfoMap;
    }
}
