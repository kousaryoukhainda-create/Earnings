package com.fyber.fairbid.http.responses;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface ResponseHandler<V> {
    void onError(int i, @NotNull Map<String, ? extends List<String>> map, V v, String str);

    void onSuccess(int i, @NotNull Map<String, ? extends List<String>> map, V v);

    V process(int i, String str, @NotNull InputStream inputStream) throws Exception;
}
