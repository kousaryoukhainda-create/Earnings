package com.huawei.hms.iap;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
/* loaded from: classes2.dex */
public class p extends AbstractClientBuilder<g, i> {

    /* loaded from: classes2.dex */
    public static class a extends g {
        public a(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
            super(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient
        public int getMinApkVersion() {
            return 40004200;
        }
    }

    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    /* renamed from: a */
    public g buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new a(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
