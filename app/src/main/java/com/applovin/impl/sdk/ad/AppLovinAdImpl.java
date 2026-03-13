package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.h0;
import com.applovin.impl.i8;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tl;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, i8 {
    private final Bundle a;
    private h0 b;
    private boolean c;
    private c d;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.a = new Bundle();
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(sj.d1)).longValue());
    }

    public boolean canExpire() {
        if (getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        AppLovinAd c;
        if ((obj instanceof c) && (c = ((c) obj).c()) != null) {
            obj = c;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public h0 getAdZone() {
        h0 h0Var = this.b;
        if (h0Var != null) {
            if (h0Var.f() != null && this.b.g() != null) {
                return this.b;
            }
            if (getSize() == null && getType() == null) {
                return this.b;
            }
        }
        h0 a = h0.a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.b = a;
        return a;
    }

    public c getDummyAd() {
        return this.d;
    }

    public Bundle getMAXAdValues() {
        return this.a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.toString();
        }
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.i8
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.I();
        if (n.a()) {
            this.sdk.I().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.c;
    }

    public boolean isVideoAd() {
        if (this.adObject.has("is_video_ad")) {
            return getBooleanFromAdObject("is_video_ad", Boolean.FALSE);
        }
        return hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.d = cVar;
    }

    @Override // com.applovin.impl.i8
    public void setExpired() {
        this.c = true;
    }

    public void setHasShown(boolean z) {
        try {
            tl tlVar = this.synchronizedAdObject;
            if (tlVar != null) {
                tlVar.a("shown", (Object) Boolean.valueOf(z));
            } else {
                synchronized (this.adObjectLock) {
                    this.adObject.put("shown", z);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.a);
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
