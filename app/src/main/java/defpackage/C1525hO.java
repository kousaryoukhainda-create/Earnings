package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* renamed from: hO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525hO extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C1611iO a;

    public C1525hO(C1611iO c1611iO) {
        this.a = c1611iO;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z = false;
        } else {
            z = true;
        }
        C1611iO c1611iO = this.a;
        if (z) {
            i = 10;
        }
        C1611iO.a(i, c1611iO);
    }
}
