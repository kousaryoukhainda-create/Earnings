package com.huawei.hms.flutter.iap.listeners;

import android.app.Activity;
import com.huawei.hms.flutter.iap.logger.HMSLogger;
import com.huawei.hms.iap.entity.StartIapActivityResult;
/* loaded from: classes2.dex */
public class IapActivitySuccessListener implements InterfaceC1613iQ {
    private final HMSLogger hmsLogger;
    private final Activity mActivity;

    public IapActivitySuccessListener(Activity activity, HMSLogger hMSLogger) {
        this.mActivity = activity;
        this.hmsLogger = hMSLogger;
    }

    @Override // defpackage.InterfaceC1613iQ
    public void onSuccess(StartIapActivityResult startIapActivityResult) {
        if (startIapActivityResult != null) {
            this.hmsLogger.sendSingleEvent("startIapActivity");
            startIapActivityResult.startActivity(this.mActivity);
        }
    }
}
