package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafo  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzafo {
    public static zzaiy zza(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.g)) {
            return zzaiy.zzb(phoneAuthCredential.d, phoneAuthCredential.g, phoneAuthCredential.f);
        }
        return zzaiy.zza(phoneAuthCredential.b, phoneAuthCredential.c, phoneAuthCredential.f);
    }
}
