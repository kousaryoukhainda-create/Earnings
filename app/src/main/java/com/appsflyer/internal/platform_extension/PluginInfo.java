package com.appsflyer.internal.platform_extension;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class PluginInfo {
    @NotNull
    private final String AFKeystoreWrapper;
    @NotNull
    private final Map<String, String> valueOf;
    @NotNull
    private final Plugin values;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            plugin = pluginInfo.values;
        }
        if ((i & 2) != 0) {
            str = pluginInfo.AFKeystoreWrapper;
        }
        if ((i & 4) != 0) {
            map = pluginInfo.valueOf;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    @NotNull
    public final Plugin component1() {
        return this.values;
    }

    @NotNull
    public final String component2() {
        return this.AFKeystoreWrapper;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.valueOf;
    }

    @NotNull
    public final PluginInfo copy(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, str, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginInfo) {
            PluginInfo pluginInfo = (PluginInfo) obj;
            return this.values == pluginInfo.values && Intrinsics.a(this.AFKeystoreWrapper, pluginInfo.AFKeystoreWrapper) && Intrinsics.a(this.valueOf, pluginInfo.valueOf);
        }
        return false;
    }

    @NotNull
    public final Map<String, String> getAdditionalParams() {
        return this.valueOf;
    }

    @NotNull
    public final Plugin getPlugin() {
        return this.values;
    }

    @NotNull
    public final String getVersion() {
        return this.AFKeystoreWrapper;
    }

    public final int hashCode() {
        int hashCode = this.AFKeystoreWrapper.hashCode();
        return this.valueOf.hashCode() + ((hashCode + (this.values.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginInfo(plugin=");
        sb.append(this.values);
        sb.append(", version=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", additionalParams=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }

    public PluginInfo(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.values = plugin;
        this.AFKeystoreWrapper = str;
        this.valueOf = map;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i & 4) != 0 ? C3054wr.b : map);
    }
}
