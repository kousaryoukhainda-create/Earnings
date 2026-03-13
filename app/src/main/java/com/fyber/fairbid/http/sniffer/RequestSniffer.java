package com.fyber.fairbid.http.sniffer;

import com.fyber.fairbid.http.responses.HttpResponse;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface RequestSniffer {
    void sniff(@NotNull URL url, @NotNull String str, String str2, @NotNull Map<String, String> map, String str3, @NotNull HttpResponse<?> httpResponse);
}
