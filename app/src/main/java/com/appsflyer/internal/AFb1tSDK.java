package com.appsflyer.internal;

import android.content.pm.PackageManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface AFb1tSDK {
    void AFInAppEventParameterName();

    void AFInAppEventParameterName(String str);

    void AFInAppEventParameterName(@NotNull String str, int i, @NotNull String str2);

    void AFInAppEventParameterName(@NotNull String str, @NotNull String str2);

    void AFInAppEventParameterName(@NotNull String str, @NotNull String... strArr);

    void AFInAppEventType();

    void AFInAppEventType(@NotNull Throwable th);

    void AFKeystoreWrapper();

    boolean afInfoLog();

    void valueOf();

    void valueOf(String str, PackageManager packageManager, AFc1xSDK aFc1xSDK);

    void valueOf(@NotNull String str, @NotNull String str2);

    void values();
}
