package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.analytics.Logger;
/* loaded from: classes3.dex */
final class zzfq implements Logger {
    @Override // com.google.android.gms.analytics.Logger
    public final void error(Exception exc) {
        Log.e("GoogleTagManager", "", exc);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final int getLogLevel() {
        int i = zzdg.zza;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return 1;
            }
            return i != 5 ? 3 : 2;
        }
        return 0;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void info(String str) {
        zzdg.zzb.zzb(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void setLogLevel(int i) {
        Log.w("GoogleTagManager", "GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void verbose(String str) {
        zzdg.zzb.zzd(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void warn(String str) {
        Log.w("GoogleTagManager", str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(String str) {
        Log.e("GoogleTagManager", str);
    }
}
