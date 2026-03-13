package com.fyber.fairbid;

import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class bj implements kh {
    public static final String[] b = {"MPI", "VPL", "JUD", "BLE", "INV", "IVE"};
    public final a a = new a();

    /* loaded from: classes.dex */
    public class a extends HashMap<String, String> {
        public a() {
            put(HianalyticsBaseData.SDK_VERSION, com.fyber.d.d);
            put("platform", "android");
            put("client", "sdk");
            put("sdk_features", TextUtils.join(",", bj.b));
        }
    }

    @Override // com.fyber.fairbid.kh
    public final synchronized Map<String, String> getParameters() {
        return this.a;
    }
}
