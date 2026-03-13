package com.appsflyer.internal;

import android.content.pm.PackageManager;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface AFe1vSDK {
    @NotNull
    String AFInAppEventParameterName();

    void AFInAppEventParameterName(@NotNull Map<String, Object> map);

    String AFInAppEventType();

    void AFInAppEventType(@NotNull Map<String, Object> map);

    void AFInAppEventType(boolean z, @NotNull Map<String, Object> map, int i);

    String AFKeystoreWrapper() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException;

    void AFKeystoreWrapper(@NotNull Map<String, Object> map, boolean z);

    String AFLogger();

    boolean afDebugLog();

    boolean afErrorLog();

    String afInfoLog();

    boolean afRDLog();

    long valueOf();

    void valueOf(@NotNull Map<String, ? extends Object> map);

    void valueOf(@NotNull Map<String, Object> map, @NotNull String str);

    long values();

    String values(@NotNull SimpleDateFormat simpleDateFormat);

    void values(@NotNull Map<String, Object> map);

    void values(@NotNull Map<String, Object> map, String str);
}
