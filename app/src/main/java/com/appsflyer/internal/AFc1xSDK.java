package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public interface AFc1xSDK {
    @NonNull
    AFb1gSDK AFInAppEventParameterName();

    @NonNull
    ExecutorService AFInAppEventType();

    @NonNull
    AFc1oSDK AFKeystoreWrapper();

    @NonNull
    AFe1vSDK AFLogger();

    @NonNull
    AFf1oSDK AFLogger$LogLevel();

    @NonNull
    AFc1bSDK AFVersionDeclaration();

    @NonNull
    AFb1sSDK AppsFlyer2dXConversionCallback();

    @NonNull
    AFe1mSDK afDebugLog();

    @NonNull
    PurchaseHandler afErrorLog();

    @NonNull
    AFb1tSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFb1wSDK afRDLog();

    @NonNull
    AFe1wSDK afWarnLog();

    @NonNull
    AFf1iSDK getLevel();

    @NonNull
    AFb1bSDK init();

    @NonNull
    AFa1bSDK onAppOpenAttributionNative();

    @NonNull
    AFc1wSDK onConversionDataSuccess();

    @NonNull
    AFb1eSDK onDeepLinkingNative();

    @NonNull
    AFf1tSDK onInstallConversionDataLoadedNative();

    @NonNull
    AFc1dSDK onInstallConversionFailureNative();

    @NonNull
    AFf1vSDK onResponseErrorNative();

    @NonNull
    AFb1iSDK onResponseNative();

    @NonNull
    ScheduledExecutorService valueOf();

    @NonNull
    AFb1dSDK values();
}
