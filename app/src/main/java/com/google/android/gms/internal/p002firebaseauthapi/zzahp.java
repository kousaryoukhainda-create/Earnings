package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.io.UnsupportedEncodingException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahp  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzahp {
    public static long zza(String str) {
        zzaho zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    @NonNull
    private static zzaho zzb(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            try {
                return zzaho.zza(new String(Base64Utils.decodeUrlSafeNoPadding(zza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unable to decode token", e);
            }
        }
        throw new RuntimeException(AbstractC2437ph.g("Invalid idToken ", str));
    }
}
