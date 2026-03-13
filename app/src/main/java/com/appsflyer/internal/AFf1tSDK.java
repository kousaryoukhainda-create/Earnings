package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface AFf1tSDK {
    void AFInAppEventParameterName(@NotNull PluginInfo pluginInfo);

    @NotNull
    Map<String, Object> AFKeystoreWrapper();
}
