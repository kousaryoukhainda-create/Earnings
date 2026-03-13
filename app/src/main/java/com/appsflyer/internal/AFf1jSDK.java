package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1pSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class AFf1jSDK extends AFf1uSDK {
    public AFf1jSDK(Runnable runnable) {
        super("store", "xiaomi", runnable);
    }

    private static boolean AFKeystoreWrapper() {
        if (!AFf1uSDK.valueOf()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.afDebugLog("Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final void valueOf(final Context context) {
        if (!AFKeystoreWrapper()) {
            return;
        }
        this.afInfoLog = System.currentTimeMillis();
        this.afDebugLog = AFf1pSDK.AFa1zSDK.STARTED;
        addObserver(new AFf1pSDK.AnonymousClass1());
        final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
        build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFf1jSDK.2
            public final void onGetAppsReferrerSetupFinished(int i) {
                AFf1jSDK.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFa1fSDK.AFInAppEventType(context, "com.xiaomi.mipicks")));
                AFf1jSDK.this.AFInAppEventParameterName.put("api_ver_name", AFa1fSDK.AFKeystoreWrapper(context, "com.xiaomi.mipicks"));
                if (i != -1) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        AFLogger.afWarnLog("responseCode not found.");
                                    } else {
                                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                        AFf1jSDK.this.AFInAppEventParameterName.put("response", "PERMISSION_ERROR");
                                    }
                                } else {
                                    AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                    AFf1jSDK.this.AFInAppEventParameterName.put("response", "DEVELOPER_ERROR");
                                }
                            } else {
                                AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                                AFf1jSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            AFf1jSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.afWarnLog("XiaomiInstallReferrer not supported");
                        }
                    } else {
                        AFf1jSDK aFf1jSDK = AFf1jSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFf1jSDK.AFInAppEventParameterName.put("response", "OK");
                        try {
                            AFLogger.afDebugLog("XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFf1jSDK.AFInAppEventParameterName.put("referrer", installReferrer2);
                                }
                                aFf1jSDK.AFInAppEventParameterName.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFf1jSDK.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFf1jSDK.AFInAppEventParameterName.put("xiaomi_custom", hashMap);
                            } else {
                                AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb.append(th.getMessage());
                            AFLogger.afWarnLog(sb.toString());
                        }
                    }
                } else {
                    AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
                    AFf1jSDK.this.AFInAppEventParameterName.put("response", "SERVICE_DISCONNECTED");
                }
                AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
                AFf1jSDK.this.values();
                build.endConnection();
            }

            public final void onGetAppsServiceDisconnected() {
            }
        });
    }
}
