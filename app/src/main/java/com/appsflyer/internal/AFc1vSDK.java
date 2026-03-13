package com.appsflyer.internal;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface AFc1vSDK {
    boolean AFInAppEventParameterName(@NotNull String... strArr);

    int AFInAppEventType();

    @NotNull
    List<AFc1zSDK> AFKeystoreWrapper();

    String values(@NotNull Throwable th, @NotNull String str);

    boolean values();
}
