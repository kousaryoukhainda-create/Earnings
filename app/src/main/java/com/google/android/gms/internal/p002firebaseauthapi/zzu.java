package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzu  reason: invalid package */
/* loaded from: classes3.dex */
final class zzu implements zzs {
    private zzu() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzs
    public final zzl zza(String str) {
        return new zzn(Pattern.compile(str));
    }
}
