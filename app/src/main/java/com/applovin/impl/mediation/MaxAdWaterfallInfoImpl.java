package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.fe;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    private final fe a;
    private final String b;
    private final String c;
    private final List d;
    private final long e;
    private final List f;
    private final String g;

    public MaxAdWaterfallInfoImpl(fe feVar, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(feVar, feVar.V(), feVar.W(), j, list, feVar.U(), str);
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.a;
    }

    public String getMCode() {
        return this.g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public List<String> getPostbackUrls() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + '}';
    }

    public MaxAdWaterfallInfoImpl(fe feVar, String str, String str2, long j, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.a = feVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = j;
        this.f = list2;
        this.g = str3;
    }
}
