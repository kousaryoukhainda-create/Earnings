package com.fyber.fairbid.http;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.fyber.fairbid.http.connection.HttpConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class FairBidHttpUtils {
    @NotNull
    public static final FairBidHttpUtils INSTANCE = new FairBidHttpUtils();

    @NotNull
    public static final Map<String, String> concatenateListIntoString(@NotNull Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
            String join = TextUtils.join(",", entry.getValue());
            Intrinsics.checkNotNullExpressionValue(join, "join(\",\", value)");
            linkedHashMap.put(entry.getKey(), join);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final URL urlBuilder(@NotNull String url, @NotNull Map<String, String> requestParams, @NotNull String scheme) throws MalformedURLException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Uri.Builder buildUpon = Uri.parse(url).buildUpon();
        for (Map.Entry<String, String> entry : requestParams.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Uri build = buildUpon.build();
        if (build.isRelative()) {
            build = build.buildUpon().scheme(scheme).build();
        }
        return new URL(build.toString());
    }

    @NotNull
    public final String getContentType(@NotNull Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        List<String> list = headers.get(HttpConnection.CONTENT_TYPE_HEADER);
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(list.get(0))) {
            return list.get(0);
        }
        return "";
    }

    @TargetApi(23)
    public final boolean isCleartextPermitted() {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        if (Build.VERSION.SDK_INT >= 23) {
            networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted();
            return isCleartextTrafficPermitted;
        }
        return true;
    }

    @TargetApi(23)
    public final boolean isCleartextPermitted(String str) {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        if (Build.VERSION.SDK_INT >= 24) {
            networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted(str);
            return isCleartextTrafficPermitted;
        }
        return isCleartextPermitted();
    }
}
