package com.fyber.fairbid.mediation.request;

import androidx.annotation.NonNull;
import com.fyber.fairbid.ads.banner.internal.InternalBannerOptions;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.internal.Constants;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class MediationRequest {
    public final SettableFuture<Boolean> a;
    public final int b;
    public final Constants.AdType c;
    public final String d;
    public final long e;
    public ExecutorService f;
    public InternalBannerOptions g;
    public boolean h;
    public boolean i;
    public int j;
    public String k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;

    public MediationRequest(Constants.AdType adType, int i) {
        this.a = SettableFuture.create();
        this.h = false;
        this.i = false;
        this.l = false;
        this.n = false;
        this.o = 0;
        this.p = false;
        this.q = false;
        this.b = i;
        this.c = adType;
        this.e = System.currentTimeMillis();
        this.d = UUID.randomUUID().toString();
        if (adType == Constants.AdType.BANNER) {
            this.g = new InternalBannerOptions();
        }
    }

    public void addImpressionStoreUpdatedListener(SettableFuture.Listener<Boolean> listener, Executor executor) {
        this.a.addListener(listener, executor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && ((MediationRequest) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public Constants.AdType getAdType() {
        return this.c;
    }

    public int getAdUnitId() {
        return this.o;
    }

    public int getBannerRefreshInterval() {
        return this.j;
    }

    public int getBannerRefreshLimit() {
        return this.m;
    }

    public ExecutorService getExecutorService() {
        return this.f;
    }

    public InternalBannerOptions getInternalBannerOptions() {
        return this.g;
    }

    public String getMediationSessionId() {
        return this.k;
    }

    public int getPlacementId() {
        return this.b;
    }

    public String getRequestId() {
        return this.d;
    }

    public long getTimeStartedAt() {
        return this.e;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.b;
    }

    public boolean isAutoRequest() {
        return this.l;
    }

    public boolean isCancelled() {
        return this.h;
    }

    public boolean isFallbackFillReplacer() {
        return this.q;
    }

    public boolean isFastFirstRequest() {
        return this.p;
    }

    public boolean isRefresh() {
        return this.i;
    }

    public boolean isTestSuiteRequest() {
        return this.n;
    }

    public void setAdUnitId(int i) {
        this.o = i;
    }

    public void setAutoRequest() {
        this.l = true;
    }

    public void setBannerRefreshInterval(int i) {
        this.j = i;
    }

    public void setBannerRefreshLimit(int i) {
        this.m = i;
    }

    public void setCancelled(boolean z) {
        this.h = z;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.f = executorService;
    }

    public void setFallbackFillReplacer() {
        this.l = true;
        this.q = true;
    }

    public void setFastFirstRequest(boolean z) {
        this.p = z;
    }

    public void setImpressionStoreUpdated(boolean z) {
        this.a.set(Boolean.valueOf(z));
    }

    public void setInternalBannerOptions(InternalBannerOptions internalBannerOptions) {
        this.g = internalBannerOptions;
    }

    public void setMediationSessionId(String str) {
        this.k = str;
    }

    public void setRefresh() {
        this.i = true;
        this.l = true;
    }

    public void setTestSuiteRequest() {
        this.n = true;
    }

    public MediationRequest(@NonNull MediationRequest mediationRequest) {
        this.a = SettableFuture.create();
        this.h = false;
        this.i = false;
        this.l = false;
        this.n = false;
        this.o = 0;
        this.p = false;
        this.q = false;
        this.e = System.currentTimeMillis();
        this.d = UUID.randomUUID().toString();
        this.h = false;
        this.q = false;
        this.l = false;
        this.b = mediationRequest.b;
        this.c = mediationRequest.c;
        this.f = mediationRequest.f;
        this.g = mediationRequest.g;
        this.i = mediationRequest.i;
        this.j = mediationRequest.j;
        this.k = mediationRequest.k;
        this.m = mediationRequest.m;
        this.n = mediationRequest.n;
        this.o = mediationRequest.o;
    }
}
