package com.huawei.hms.flutter.iap.listeners;

import com.huawei.hms.flutter.iap.logger.HMSLogger;
import com.huawei.hms.iap.IapApiException;
import io.flutter.plugin.common.MethodChannel;
/* loaded from: classes2.dex */
public class DefaultFailureListener implements InterfaceC0846aQ {
    private final HMSLogger hmsLogger;
    private final String mErrorCode;
    private final MethodChannel.Result mResult;
    private final String methodName;

    public DefaultFailureListener(MethodChannel.Result result, String str, HMSLogger hMSLogger, String str2) {
        this.mResult = result;
        this.mErrorCode = str;
        this.hmsLogger = hMSLogger;
        this.methodName = str2;
    }

    @Override // defpackage.InterfaceC0846aQ
    public void onFailure(Exception exc) {
        if (exc instanceof IapApiException) {
            IapApiException iapApiException = (IapApiException) exc;
            int statusCode = iapApiException.getStatusCode();
            this.hmsLogger.sendSingleEvent(this.methodName, Integer.toString(statusCode));
            this.mResult.error(Integer.toString(statusCode), iapApiException.getMessage(), null);
            return;
        }
        this.hmsLogger.sendSingleEvent(this.methodName, this.mErrorCode);
        this.mResult.error(this.mErrorCode, exc.getMessage(), null);
    }
}
