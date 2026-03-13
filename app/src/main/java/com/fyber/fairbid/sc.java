package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.DisplayableFetchResult;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class sc implements CachedAd {
    public abstract void a(@NotNull SettableFuture<DisplayableFetchResult> settableFuture, @NotNull JSONObject jSONObject, @NotNull Map<String, String> map);
}
