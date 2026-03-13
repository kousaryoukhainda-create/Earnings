package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class AFf1oSDK {
    private final List<AFf1pSDK> AFInAppEventType = new ArrayList();

    public final synchronized void AFKeystoreWrapper(AFf1pSDK aFf1pSDK) {
        this.AFInAppEventType.add(aFf1pSDK);
    }

    @NonNull
    public final synchronized AFf1pSDK[] valueOf() {
        return (AFf1pSDK[]) this.AFInAppEventType.toArray(new AFf1pSDK[0]);
    }

    public final void values(Context context, Runnable runnable, AFc1xSDK aFc1xSDK) {
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentContentProviders) {
                ProviderInfo providerInfo = resolveInfo.providerInfo;
                if (providerInfo != null) {
                    arrayList.add(new AFf1lSDK(providerInfo, runnable, aFc1xSDK));
                } else {
                    AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                }
            }
            if (!arrayList.isEmpty()) {
                this.AFInAppEventType.addAll(arrayList);
                StringBuilder sb = new StringBuilder("[Preinstall]: Detected ");
                sb.append(arrayList.size());
                sb.append(" valid preinstall provider(s)");
                AFLogger.afDebugLog(sb.toString());
            }
        }
    }
}
