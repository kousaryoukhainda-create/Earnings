package com.fyber.fairbid.mediation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public enum Network {
    ADCOLONY("AdColony", "adcolony"),
    ADMOB("AdMob", "admob"),
    AMAZON("Amazon Publisher Services", "amazon"),
    BIGO_ADS("BIGO Ads", "bigoads"),
    APPLOVIN("AppLovin", "applovin"),
    CHARTBOOST("Chartboost", "chartboost"),
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
    VUNGLE("Liftoff Monetize", "vungle");
    
    @NotNull
    public final String a;
    @NotNull
    public final String b;

    Network(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @NotNull
    public final String getCanonicalName() {
        return this.b;
    }

    @NotNull
    public final String getMarketingName() {
        return this.a;
    }
}
