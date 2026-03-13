package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;
/* loaded from: classes.dex */
public class m3 {
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography a;

    public m3(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.a = consentFlowUserGeography;
    }

    public boolean a(Object obj) {
        return obj instanceof m3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        if (!m3Var.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a2 = m3Var.a();
        if (a != null ? a.equals(a2) : a2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        if (a == null) {
            hashCode = 43;
        } else {
            hashCode = a.hashCode();
        }
        return hashCode + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.a;
    }
}
