package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AFf1sSDK implements AFf1tSDK {
    @NotNull
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.2", null, 4, null);

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFInAppEventParameterName(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @NotNull
    public final Map<String, Object> AFKeystoreWrapper() {
        LinkedHashMap f = C2148mJ.f(new JQ("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), new JQ("version", this.AFInAppEventParameterName.getVersion()));
        if (!this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            f.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return f;
    }
}
