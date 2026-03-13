package com.fyber.fairbid.plugin;

import com.fyber.fairbid.internal.DevLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public enum MediationNetwork {
    ADCOLONY("AdColony", "adcolony"),
    ADMOB("AdMob", "admob"),
    AMAZON("Amazon Publisher Services", "amazon"),
    BIGO_ADS("BigoAds", "bigoads"),
    APPLOVIN("AppLovin", "applovin"),
    CHARTBOOST("Chartboost", "chartboost"),
    FAIRBID(DevLogger.TAG, "fairbid"),
    FYBERMARKETPLACE("DT Exchange", "fyber"),
    GAM("Google Ad Manager", "gam"),
    HYPRMX("HyprMX", "hyprmx"),
    INMOBI("InMobi", "inmobi"),
    IRONSOURCE("IronSource", "iron_source"),
    META("Meta Audience Network", "facebook"),
    MINTEGRAL("Mintegral", "mintegral"),
    MYTARGET("myTarget", "mytarget"),
    OGURY("Ogury", "ogury"),
    PANGLE("Pangle", "pangle"),
    UNITYADS("Unity Ads", "unityads"),
    VERVE("Verve", "verve"),
    VUNGLE("Vungle", "vungle");
    
    @NotNull
    private final String canonicalName;
    @NotNull
    private final String tpnName;

    MediationNetwork(String str, String str2) {
        this.tpnName = str;
        this.canonicalName = str2;
    }

    @NotNull
    public final String getCanonicalName() {
        return this.canonicalName;
    }

    @NotNull
    public final String getTpnName() {
        return this.tpnName;
    }
}
