package com.fyber.fairbid.http.connection.sniffer;

import com.fyber.fairbid.http.responses.HttpResponse;
import com.fyber.fairbid.http.sniffer.RequestSniffer;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class NoOpRequestSniffer implements RequestSniffer {
    @Override // com.fyber.fairbid.http.sniffer.RequestSniffer
    public void sniff(@NotNull URL url, @NotNull String requestMethod, String str, @NotNull Map<String, String> headers, String str2, @NotNull HttpResponse<?> httpResponse) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(httpResponse, "httpResponse");
    }
}
