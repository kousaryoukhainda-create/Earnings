package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {
    private final JSONObject a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.a, Constants.CLASS, "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.a, "version", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getName() {
        return JsonUtils.getString(this.a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getSdkVersion() {
        return JsonUtils.getString(this.a, HianalyticsBaseData.SDK_VERSION, "");
    }

    @NonNull
    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + '}';
    }
}
