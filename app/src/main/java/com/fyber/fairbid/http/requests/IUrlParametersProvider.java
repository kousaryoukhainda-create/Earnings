package com.fyber.fairbid.http.requests;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface IUrlParametersProvider {
    void addCustomParameter(@NotNull String str, String str2);

    void addCustomParameters(@NotNull Map<String, String> map);

    @NotNull
    Map<String, String> extraParams(@NotNull Context context);

    @NotNull
    Map<String, String> getExtraCustomParams();

    void removeCustomParameter(@NotNull String str);
}
