package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.flutter.plugin.common.MethodChannel;
/* renamed from: QI  reason: default package */
/* loaded from: classes2.dex */
public final class QI implements InstallReferrerStateListener {
    public final /* synthetic */ InstallReferrerClient b;
    public final /* synthetic */ MethodChannel.Result c;

    public QI(InstallReferrerClient installReferrerClient, MethodChannel.Result result) {
        this.b = installReferrerClient;
        this.c = result;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        InstallReferrerClient installReferrerClient = this.b;
        MethodChannel.Result result = this.c;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                result.error("UNKNOWN_ERROR", "InstallReferrerClient returned unknown response code.", null);
                            } else {
                                result.error("PERMISSION_ERROR", "App is not allowed to bind to the Service.", null);
                            }
                        } else {
                            result.error("DEVELOPER_ERROR", "General errors caused by incorrect usage.", null);
                        }
                    } else {
                        result.error("FEATURE_NOT_SUPPORTED", "API not available on the current Play Store app.", null);
                    }
                } else {
                    result.error("SERVICE_UNAVAILABLE", "Connection couldn't be established.", null);
                }
            } else {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    result.success(C2148mJ.e(new JQ("installReferrer", installReferrer.getInstallReferrer()), new JQ("referrerClickTimestampSeconds", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds())), new JQ("installBeginTimestampSeconds", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds())), new JQ("referrerClickTimestampServerSeconds", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds())), new JQ("installBeginTimestampServerSeconds", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds())), new JQ("installVersion", installReferrer.getInstallVersion()), new JQ("googlePlayInstantParam", Boolean.valueOf(installReferrer.getGooglePlayInstantParam()))));
                } catch (Throwable unused) {
                    result.error("FETCHING_REFERRER_THREW", "Fetching referrer threw. Most likely DeadObjectException?", null);
                }
            }
        } else {
            result.error("SERVICE_DISCONNECTED", "Play Store service is not connected now - potentially transient state.", null);
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
