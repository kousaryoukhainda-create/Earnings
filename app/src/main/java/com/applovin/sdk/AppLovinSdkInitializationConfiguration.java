package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class AppLovinSdkInitializationConfiguration {

    /* loaded from: classes.dex */
    public interface Builder {
        AppLovinSdkInitializationConfiguration build();

        List<String> getAdUnitIds();

        String getMediationProvider();

        String getPluginVersion();

        String getSdkKey();

        MaxSegmentCollection getSegmentCollection();

        List<String> getTestDeviceAdvertisingIds();

        boolean isExceptionHandlerEnabled();

        Builder setAdUnitIds(List<String> list);

        Builder setExceptionHandlerEnabled(boolean z);

        Builder setMediationProvider(String str);

        Builder setPluginVersion(String str);

        Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection);

        Builder setTestDeviceAdvertisingIds(List<String> list);
    }

    public static Builder builder(String str, Context context) {
        return new AppLovinSdkInitializationConfigurationImpl.BuilderImpl(str, context);
    }

    public abstract List<String> getAdUnitIds();

    public abstract String getMediationProvider();

    public abstract String getPluginVersion();

    public abstract String getSdkKey();

    public abstract MaxSegmentCollection getSegmentCollection();

    public abstract List<String> getTestDeviceAdvertisingIds();

    public abstract boolean isExceptionHandlerEnabled();
}
