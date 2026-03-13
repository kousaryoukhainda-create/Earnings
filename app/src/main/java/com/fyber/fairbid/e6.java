package com.fyber.fairbid;

import android.os.Build;
import java.util.Locale;
/* loaded from: classes.dex */
public final class e6 {
    public static final String a;

    static {
        Locale locale = Locale.ENGLISH;
        a = AbstractC2437ph.c(Build.VERSION.SDK_INT, "SDK version ", " is not supported, disabling FairBid Ads.");
    }
}
