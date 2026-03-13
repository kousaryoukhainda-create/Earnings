package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeu  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaeu {
    private final int zza;

    private zzaeu(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzv.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() >= 3) {
                return (Integer.parseInt(zza.get(1)) * 1000) + (Integer.parseInt(zza.get(0)) * 1000000) + Integer.parseInt(zza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e));
                return -1;
            }
            return -1;
        }
    }

    public final String zzb() {
        return AbstractC2437ph.g("X", Integer.toString(this.zza));
    }

    public static zzaeu zza() {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        return new zzaeu((TextUtils.isEmpty(version) || version.equals(GrsBaseInfo.CountryCodeSource.UNKNOWN)) ? "-1" : "-1");
    }
}
