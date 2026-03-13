package com.fyber.fairbid.plugin;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class TpnMappings {
    @NotNull
    public static final TpnMappings INSTANCE = new TpnMappings();
    @NotNull
    private static final List<JQ> packageToTpn;

    static {
        JQ jq = new JQ("com.adcolony:sdk", MediationNetwork.ADCOLONY);
        JQ jq2 = new JQ("com.google.android.gms:play-services-ads", MediationNetwork.ADMOB);
        JQ jq3 = new JQ("com.amazon.android:aps-sdk", MediationNetwork.AMAZON);
        JQ jq4 = new JQ("com.applovin:applovin-sdk", MediationNetwork.APPLOVIN);
        JQ jq5 = new JQ("com.bigossp:bigo-ads", MediationNetwork.BIGO_ADS);
        JQ jq6 = new JQ("com.chartboost:chartboost-sdk", MediationNetwork.CHARTBOOST);
        JQ jq7 = new JQ("com.fyber:marketplace-sdk", MediationNetwork.FYBERMARKETPLACE);
        JQ jq8 = new JQ("com.hyprmx.android:HyprMX-SDK", MediationNetwork.HYPRMX);
        JQ jq9 = new JQ("com.inmobi.monetization:inmobi-ads-kotlin", MediationNetwork.INMOBI);
        JQ jq10 = new JQ("com.ironsource.sdk:mediationsdk", MediationNetwork.IRONSOURCE);
        JQ jq11 = new JQ("com.facebook.android:audience-network-sdk", MediationNetwork.META);
        MediationNetwork mediationNetwork = MediationNetwork.MINTEGRAL;
        packageToTpn = C0346Ie.c(jq, jq2, jq3, jq4, jq5, jq6, jq7, jq8, jq9, jq10, jq11, new JQ("com.mbridge.msdk.oversea:same", mediationNetwork), new JQ("com.mbridge.msdk.oversea:reward", mediationNetwork), new JQ("com.my.target:mytarget-sdk", MediationNetwork.MYTARGET), new JQ("co.ogury:ogury-sdk", MediationNetwork.OGURY), new JQ("com.pangle.global:ads-sdk", MediationNetwork.PANGLE), new JQ("com.unity3d.ads:unity-ads", MediationNetwork.UNITYADS), new JQ("net.pubnative:hybid.sdk", MediationNetwork.VERVE), new JQ("com.vungle:vungle-ads", MediationNetwork.VUNGLE));
    }

    private TpnMappings() {
    }

    @NotNull
    public final List<JQ> getPackageToTpn() {
        return packageToTpn;
    }
}
