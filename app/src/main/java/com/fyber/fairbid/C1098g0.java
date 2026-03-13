package com.fyber.fairbid;

import com.fyber.fairbid.C1096f0;
import com.fyber.fairbid.internal.Constants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
/* renamed from: com.fyber.fairbid.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1098g0 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "BAN";
        }
        if (i == 2) {
            return "INT";
        }
        if (i == 3) {
            return "RW";
        }
        if (i == 4) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        if (i == 5) {
            return "OFW";
        }
        throw null;
    }

    public static int a(Constants.AdType adType) {
        int i = C1096f0.a.a[adType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 4 : 3;
            }
            return 1;
        }
        return 2;
    }
}
