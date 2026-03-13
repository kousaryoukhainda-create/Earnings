package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.applovin.sdk.AppLovinEventTypes;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1eSDK;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
/* loaded from: classes.dex */
public final class AFa1wSDK implements AFb1eSDK {
    private static IntentFilter AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFb1eSDK
    @NonNull
    public final AFb1eSDK.AFa1ySDK AFInAppEventType(@NonNull Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, AFInAppEventParameterName);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra != 4) {
                                str = InneractiveMediationNameConsts.OTHER;
                            } else {
                                str = "wireless";
                            }
                        } else {
                            str = "usb";
                        }
                    } else {
                        str = "ac";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFb1eSDK.AFa1ySDK(f, str);
    }
}
